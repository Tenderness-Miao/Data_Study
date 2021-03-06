package HDFS_01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFS_03 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://data111:9000"), conf, "root");
        FileInputStream fis = new FileInputStream(new File("H:\\ss\\22524688.jpg"));
        Path path = new Path("hdfs://data111:9000/data/1.jpg");
        FSDataOutputStream fos = fs.create(path);
        IOUtils.copyBytes(fis, fos, 4 * 1024, false);
        IOUtils.closeStream(fis);
        IOUtils.closeStream(fos);
        System.out.println("流上传成功");
    }
}
