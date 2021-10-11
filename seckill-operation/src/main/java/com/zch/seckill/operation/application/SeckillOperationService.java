package com.zch.seckill.operation.application;

import com.zch.seckill.operation.domain.SeckillSession;
import com.zch.seckill.operation.infrastructure.SeckillOperationDao;
import org.springframework.stereotype.Service;

/**
 * @author zhangchunhui
 * @date 2021/10/11
 */
@Service
public class SeckillOperationService {

    private SeckillOperationDao seckillOperationDao;

    public String addSeckillSession(SeckillSession seckillSession) {

        // seckillOperationDao.addSeckillSession(seckillSession);

        return "SUCCESS";
    }
}
