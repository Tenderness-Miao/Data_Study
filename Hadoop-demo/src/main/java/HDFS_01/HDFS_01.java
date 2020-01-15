package HDFS_01;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HDFS_01 {
    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException {
        Configuration conf = new Configuration();
        conf.set("dfs.replication", "2");
        FileSystem fs = FileSystem.get(new URI("hdfs://data111:9000"), conf, "root");
        Path src = new Path("H:\\ss\\22524688.jpg");
        Path dest = new Path("hdfs://data111:9000/test/");
        fs.copyFromLocalFile(src, dest);
        fs.close();
        System.out.println("上传成功");
    }
}
