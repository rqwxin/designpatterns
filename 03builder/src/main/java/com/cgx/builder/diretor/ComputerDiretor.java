package com.cgx.builder.diretor;

import com.cgx.builder.builder.AbstractBuilder;
import lombok.Data;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 10:51
 **/
@Data
public class ComputerDiretor {

   private  AbstractBuilder builder;

    public ComputerDiretor(AbstractBuilder builder) {
        this.builder = builder;
    }


    public void buildComputer(){
        builder.buildCpu();
        builder.buildBoard();
        builder.buildDisk();
        builder.buildMemory();
        builder.buildOs();
    }


}
