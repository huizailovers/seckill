package resp;

/**
 * @author zhangchunhui
 * @date 2021/10/10
 */
public enum ReturnCode {


    RC100(100, "操作成功"),
    /**
     * 操作失败
     **/
    RC999(999, "操作失败"),

    RC001(001,"具体业务异常"),

    ;

    private final int code;
    private final String message;

    ReturnCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
