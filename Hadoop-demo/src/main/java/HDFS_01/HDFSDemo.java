package HDFS_01;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.log.Log4Json;
import org.apache.log4j.Logger;

import java.io.IOException;

public class HDFSDemo {
    public static void main(String[] args) throws IOException {
        // 1.获取到文件系统
        Configuration conf = new Configuration();
        // 2.配置在集群上运行
        conf.set("fs.defaultFS", "hdfs://data111:9000");
        FileSystem fileSystem = FileSystem.get(conf);
        // 3.把文件上传到hdfs文件系统
        fileSystem.copyFromLocalFile(new Path("H:\\ss\\0844275.jpg"), new Path("/test/ss.jpg"));
        // 4.关闭资源
        fileSystem.close();
    }
}
