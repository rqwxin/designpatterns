package com.cgx.builder.builder;

import com.cgx.builder.model.Computer;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 10:43
 **/
public class MacBookBuilder extends AbstractBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("inter core i9 9th Gen");
    }

    @Override
    public void buildBoard() {
        computer.setBoard("方圆主板");
    }
    @Override
    public void buildMemory() {
        computer.setMemory("金士顿内存16G");
    }
    @Override
    public void buildDisk() {
        computer.setDisk("西部数据固态500G");
    }
    @Override
    public void buildOs() {
        computer.setOs("macos 12");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
