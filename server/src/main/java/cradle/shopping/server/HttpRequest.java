package cradle.shopping.server;

import com.alibaba.fastjson.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class HttpRequest {
    private final static String FORM_TYPE = "application/x-www-form-urlencoded";

    public static String parseBody(HttpServletRequest request) {
        String body = null;

        try {
            BufferedReader reader = request.getReader();
            String line;
            while (null != (line = reader.readLine())) {
                body = null == body ? line : body + line;
            }

            if (null != body && FORM_TYPE.equals(request.getHeader("Content-Type"))) {
                body = URL.decode(body);
                JSONObject obj = new JSONObject();
                List<String> fields = Arrays.asList(body.split("&"));
                for (String field : fields) {
                    String [] nameValuePair = field.split("=");
                    if (2 == nameValuePair.length) {
                        obj.put(nameValuePair[0], nameValuePair[1]);
                    } else if (1 == nameValuePair.length) {
                        obj.put(nameValuePair[0], null);
                    }
                }

                body = obj.toJSONString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return body;
    }
}
