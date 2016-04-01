
/**
 * @创建者 ：yqlee
 * @时间 ：2016/3/4  16:48
 * @描述 :响应头过滤器
 */
public class HeaderFilter {

    public static final String RETCODE = "retcode";
    public static void filtHander(cz.msebera.android.httpclient.Header[] handers) throws HeaderException {
        for (cz.msebera.android.httpclient.Header h : handers) {
            if (RETCODE.equals(h.getName().trim())) {
                if (!"0".equals(h.getValue().trim())) {
                    throw new HeaderException(h.getValue());
                }
            }
        }
    }
}
