package exception;

import lombok.Data;

/**
 * @author zhangchunhui
 * @date 2021/10/10
 */
@Data
public class BusinessException extends  RuntimeException {

    private int error;
    private String message;

    public BusinessException(int error, String message) {
        super(message);
        this.error = error;
        this.message = message;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable throwable) {
        super(throwable);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
