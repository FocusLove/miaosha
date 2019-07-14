package cradle.shopping.server;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URL {
    public static String encode(String url) {
        if (null == url) {
            return null;
        }

        try {
            url = URLEncoder.encode(url, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return url;
    }

    public static String decode(String url) {
        if (null == url) {
            return null;
        }

        try {
            url = URLDecoder.decode(url, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return url;
    }
}
