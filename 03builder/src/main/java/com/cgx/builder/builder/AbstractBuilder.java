package com.cgx.builder.builder;

import com.cgx.builder.model.Computer;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 10:26
 **/
public abstract class AbstractBuilder {

   public abstract void buildCpu();
    public abstract void buildBoard();
    public abstract void buildMemory();
    public abstract void buildDisk();
    public abstract void buildOs();

    public abstract Computer getComputer();

}
