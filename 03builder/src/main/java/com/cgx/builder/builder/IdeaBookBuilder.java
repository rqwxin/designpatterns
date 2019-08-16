package com.cgx.builder.builder;

import com.cgx.builder.model.Computer;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 10:43
 **/
public class IdeaBookBuilder extends AbstractBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("汉芯 i9 9th Gen");
    }

    @Override
    public void buildBoard() {
        computer.setBoard("汉主板");
    }
    @Override
    public void buildMemory() {
        computer.setMemory("汉内存16G");
    }
    @Override
    public void buildDisk() {
        computer.setDisk("大唐固态500G");
    }
    @Override
    public void buildOs() {
        computer.setOs("中华系统 12");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
