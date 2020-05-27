package com.cgx.decorator;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description: 具体组件类
 * @author: cgx
 * @create: 2020-04-18 19:32
 **/
@Data
public class Cake extends SweetCompoent {


    @Override
    public String getDesc() {
        return "原始蛋糕";
    }

    @Override
    public double cost() {
        return 66.6;
    }
}
