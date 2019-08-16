package com.cgx.builder;

import com.cgx.builder.builder.IdeaBookBuilder;
import com.cgx.builder.builder.MacBookBuilder;
import com.cgx.builder.diretor.ComputerDiretor;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 10:56
 **/
public class BuilderDemo {
    public static void main(String[] args) {
        MacBookBuilder macBookBuilder = new MacBookBuilder();
        ComputerDiretor computerDiretor = new ComputerDiretor(macBookBuilder);
        computerDiretor.buildComputer();
        System.out.println(macBookBuilder.getComputer().toString());

        IdeaBookBuilder ideaBookBuilder = new IdeaBookBuilder();
        computerDiretor.setBuilder(ideaBookBuilder);
        computerDiretor.buildComputer();
        System.out.println(ideaBookBuilder.getComputer().toString());
    }
}
