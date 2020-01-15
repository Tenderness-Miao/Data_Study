package HDFS_01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFS_02 {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://data111:9000"), conf, "root");
        fs.copyToLocalFile(false, new Path("hdfs://data111:9000/data/22524688.jpg"), new Path("E:\\"), true);
        fs.close();
        System.out.println("下载成功");
    }
}
