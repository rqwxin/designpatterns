package com.cgx.staticproxy;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-07-11 18:46
 **/
public class Test {

    public static void main(String[] args) {
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.say("肾哥");
    }
}
