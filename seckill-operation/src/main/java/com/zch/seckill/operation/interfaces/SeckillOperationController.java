package com.zch.seckill.operation.interfaces;

import com.zch.seckill.operation.application.SeckillOperationService;
import com.zch.seckill.operation.domain.SeckillSession;
import com.zch.seckill.operation.domain.SeckillSessionFactory;
import com.zch.seckill.operation.interfaces.req.SeckillSessionReq;
import handler.FunctionHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangchunhui
 * @date 2021/10/11
 * 秒杀运营配置服务
 */
@Controller
@RequestMapping("/operation")
@AllArgsConstructor
public class SeckillOperationController {


    private SeckillOperationService seckillOperationService;

    @RequestMapping("/addSession")
    public Object addSeckillSession(SeckillSessionReq seckillSessionReq) {

        SeckillSession seckillSession = SeckillSessionFactory.createSeckillSession(seckillSessionReq.getStartTime(),
                seckillSessionReq.getEndTime(), seckillSessionReq.getSessionName(), seckillSessionReq.getCreator());

        return FunctionHandler.handle(() -> {
            return seckillOperationService.addSeckillSession(seckillSession);
        });
    }
}
