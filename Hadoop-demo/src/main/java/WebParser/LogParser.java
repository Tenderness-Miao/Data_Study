package WebParser;

import java.util.Arrays;

/**
 * 将web.txt日志文件中无用的脏数据清洗完成掉(字段数少于11个的)
 * 筛选条件1：字段长度大于11
 * <p>
 * 获取日志数据中的部分字段: (注意数据的合法性 有效性)
 * <p>
 * 筛选条件2：如果有浏览器来源就拼接上，看是否大于12
 * <p>
 * 筛选条件3：状态码大于等于400，是非法数据
 */
public class LogParser {

    public String[] parse(String line) {
        String[] INFO = line.split(" ");
        if (INFO.length > 11) {
            String status = parseStatus(INFO[8]);
            if (!status.equals("illegal")) {
                String remote_addr = parseRemoteAddr(INFO[0]);
                String remote_user = parseRemoteUser(INFO[2]);
                String time_local = parseTimeLocal(INFO[3]);
                String request = parseRequest(INFO[6]);
                String body_bytes_sent = parseBodyBytesSent(INFO[9]);
                String http_referer = parseHttpReferer(INFO[10]);
                String http_user_agent = parseHttpUserAgent(INFO);
                return new String[]{remote_addr, remote_user, time_local, request, status, body_bytes_sent, http_referer, http_user_agent};
            } else {
                return new String[]{null,null,null,null,null,null,null,null};
            }
        } else {
            return new String[]{null,null,null,null,null,null,null,null};
        }
    }

    private String parseRemoteAddr(String s) {
        return s;
    }

    private String parseRemoteUser(String s) {
        if (s.equals("-")) {
            return null;
        }
        return s;
    }

    private String parseTimeLocal(String s) {
        return s.replace("[", "");
    }

    private String parseRequest(String s) {
        return s.replace("\"", "");
    }

    private String parseStatus(String s) {
        if (Integer.parseInt(s) >= 400) {
            return "illegal";
        } else {
            return s;
        }
    }

    private String parseBodyBytesSent(String s) {
        return s;
    }

    private String parseHttpReferer(String s) {
        return s.substring(1, s.length() - 1);
    }

    private String parseHttpUserAgent(String[] s) {
        String[] target = Arrays.copyOfRange(s, 11, s.length);
        return Arrays.toString(target)
//                .replace("[", "")
//                .replace("]", "")
                .replace("\"","")
                .replace(",","");
    }

}
