
/**
 * @创建者 ：yqlee
 * @时间 ：2016/3/4  16:45
 * @描述 :异常类
 */
public class HeaderException extends Exception {

    private String retValue;
    private String errorMsg;

    public HeaderException(String retValue) {
        this.retValue = retValue;
    }

    public String getErrorCode() {
        return retValue;
    }

    public String getErrorMsg() {
        int identifier = BaseApp.getGlobleContext().getResources().getIdentifier("retcode_" + retValue,
                "string", BaseApp.getGlobleContext().getPackageName());
        if (0 == identifier) {
            errorMsg = BaseApp.getGlobleContext().getResources().getString(R.string.retcode_default);
        } else {
            errorMsg = BaseApp.getGlobleContext().getResources().getString(identifier);
        }
        return errorMsg;
    }
}
