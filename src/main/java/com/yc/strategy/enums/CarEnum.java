package com.yc.strategy.enums;

import com.yc.strategy.service.CarService;
import com.yc.strategy.service.ZhuancheServiceImpl;
import com.yc.strategy.service.ZucheServiceImpl;

/**
 * Description:
 * @author : 闫晨 (chen.yan@ucarinc.com)
 * @since : 2019/3/14 10:06
 **/
public enum CarEnum implements CarService{
    ZUCHE("ZUCHE"){
        @Override
        public void work(){
            new ZucheServiceImpl().work();
        }
    },
    ZHUANCHE("ZHUANCHE"){
        @Override
        public void work(){
            new ZhuancheServiceImpl().work();
        }
    };

    String code="";

    CarEnum(String code) {
        this.code=code;

    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
