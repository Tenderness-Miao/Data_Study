package HDFS_01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFS_04 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://data111:9000"), conf, "root");
        OutputStream fos = new FileOutputStream(new File("E:\\123.jpg"));
        Path path = new Path("hdfs://data111:9000/data/1.jpg");
        FSDataInputStream fis=fs.open(path);
        IOUtils.copyBytes(fis,fos,2*1024,false);
        IOUtils.closeStream(fis);
        IOUtils.closeStream(fos);
        System.out.println("下载成功");

    }
}
