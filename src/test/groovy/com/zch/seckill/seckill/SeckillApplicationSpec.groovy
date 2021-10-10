package com.zch.seckill.seckill

import spock.lang.Specification
import spock.lang.Subject

@Subject
class SeckillApplicationSpec extends Specification{



    def "test demo"(){
        given:
        String str = 'seckill';

        expect: str.length() ==  7
    }
}
