package com.cgx.staticproxy;

/**********
 * @program: java-high-level
 * @description:
 * @author: cgx
 * @create: 2018-11-30 15:47
 **/
public class HelloProxy implements HelloApi {
    HelloApi hello ;

    public HelloProxy() {
        this.hello = new HelloImpl();
    }


    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before() {
        System.out.println("before hello say");
    }

    private void after() {
        System.out.println("after hello say");
    }


}
