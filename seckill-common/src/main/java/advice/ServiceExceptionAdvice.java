package advice;

import exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import resp.ResultData;
import resp.ReturnCode;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangchunhui
 * @date 2021/10/10
 */
@RestControllerAdvice
public class ServiceExceptionAdvice {

    private static Logger logger = LoggerFactory.getLogger(BusinessException.class);

    @ExceptionHandler(Exception.class)
    public ResultData handleException(HttpServletRequest request, Exception exception) {
        logger.error("exception occurred while processing request, {} ", request, exception.getMessage(), exception);
        return ResultData.fail(ReturnCode.RC999.getCode(), exception.getMessage());
    }
}
