package com.cgx.builder.v2;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-11 22:24
 **/
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().buildCpu("I8 酷睿")
                .buildBoard("INter")
                .buildDisk("西部数据 350G")
                .buildMemory("kingdong 32G")
                .buildOs("WIN10").build();
        System.out.println(computer);
    }
}
