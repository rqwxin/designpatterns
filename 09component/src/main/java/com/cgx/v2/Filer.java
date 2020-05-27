package com.cgx.v2;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 16:49
 **/
public class Filer extends AbstractNode {
    public Filer(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("文件名："+name);
    }

}
