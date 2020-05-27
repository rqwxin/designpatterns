package com.cgx.decorator;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description: 水果蛋糕装饰类
 * @author: cgx
 * @create: 2020-04-18 19:38
 **/
@Data
public class CreamCakeDecorator extends Decorator {

    private  SweetCompoent sweetCompoent;

    public CreamCakeDecorator(SweetCompoent sweetCompoent) {
        this.sweetCompoent = sweetCompoent;
    }


    @Override
    public String getDesc() {
        String desc = sweetCompoent.getDesc();
        return desc +" 加奶油";
    }

    @Override
    public double cost() {
        return sweetCompoent.cost()+20;
    }


    public String myselfDesc(){
        return  "非常美味的奶油蛋糕";
    }
    public String toString(){
        return getDesc()+",价格总："+cost()+","+myselfDesc();
    }
}
