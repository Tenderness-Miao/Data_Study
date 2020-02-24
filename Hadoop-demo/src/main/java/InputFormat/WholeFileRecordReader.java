package InputFormat;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;

public class WholeFileRecordReader extends RecordReader<Text, BytesWritable> {
    private FileSplit split;
    private Configuration configuration;
    private Text k = new Text();
    private BytesWritable v = new BytesWritable();
    boolean isProgress = true;

    public WholeFileRecordReader() {
        super();
    }

    @Override
    public void initialize(InputSplit inputSplit, TaskAttemptContext taskAttemptContext) throws IOException, InterruptedException {
        this.split = (FileSplit) inputSplit;
        configuration = taskAttemptContext.getConfiguration();
    }

    @Override
    public boolean nextKeyValue() throws IOException, InterruptedException {
        if (isProgress) {
            // 逻辑
            byte[] buff = new byte[(int) split.getLength()];
            // 获取文件对象
            Path path = split.getPath();
            FileSystem fs = path.getFileSystem(configuration);
            // 获取输入流
            FSDataInputStream fis = fs.open(path);
            // 拷贝
            IOUtils.readFully(fis, buff, 0, buff.length);
            // 封装 v k
            k.set(path.toString());
            v.set(buff, 0, buff.length);
            // 关闭资源
            IOUtils.closeStream(fis);
            isProgress = false;
            return true;
        }
        return false;
    }

    @Override
    public Text getCurrentKey() throws IOException, InterruptedException {
        return k;
    }

    @Override
    public BytesWritable getCurrentValue() throws IOException, InterruptedException {
        return v;
    }

    @Override
    public float getProgress() throws IOException, InterruptedException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
