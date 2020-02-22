package SogouQ;

import org.apache.directory.shared.kerberos.codec.actions.AbstractReadKerberosTime;

public class LogParser {
    /**
     *      00:00:14	508106156634581	[封杀莎朗斯通]	1 1	www.17tech.com/news/20080531107274.shtml
     *      日志字段分析:    access_time     :  访问时间
     *                      user_id         :   用户id
     *                      query_word      :   查询的关键词
     *                      result_ranked   :   该URL在返回结果中的排名
     *                      result_click_ranked :   用户点击的顺序号
     *                      url             :   用户点击的URL
     *
     */
    public String[] parse(String line){
        //将字段按"/t切分"分为一个字符串数组
        String[] INFO = line.split("\t");

        //六个方法分别是截取对应六个字段的方法
        if (INFO.length<6){
            String access_time = parseTime(INFO[0]);
            String user_id = parseId(INFO[1]);
            String query_word = parseWord(INFO[2]);
            String result_ranked = parseRanked(INFO[3]);
            String result_click_ranked = parseClickRanked(INFO[3]);
            String URL = parseUrl(INFO[4]);
            return new String[]{access_time,user_id,query_word,result_ranked,result_click_ranked,URL};
        }else {
            return new String[]{null,null,null,null,null,null};
        }

    }

    private String parseUrl(String s) {
        String url = s.trim();
        return url;
    }

    private String parseClickRanked(String s) {
        String[] twins = s.trim().split(" ");
        return twins[1];

    }

    private String parseRanked(String s) {
        String[] twins = s.trim().split(" ");
        return  twins[0];
    }

    private String parseWord(String s) {
        String word = s.substring(0 + 1, s.length()-1);
        return word;
    }

    private String parseId(String s) {
        String id = s.trim();
        return id;
    }

    private String parseTime(String s) {
        String time = s.trim();
        return time;
    }

}
