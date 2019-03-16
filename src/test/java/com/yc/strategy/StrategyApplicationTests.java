package com.yc.strategy;

import com.yc.strategy.enums.CarEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApplicationTests {

    @Test
    public void contextLoads() {
        String parameter="ZUCHE";
        for (CarEnum carEnum : CarEnum.values()) {
            if(parameter.equals(carEnum.getCode())){
                carEnum.work();
                break;
            }
        }

    }

}
