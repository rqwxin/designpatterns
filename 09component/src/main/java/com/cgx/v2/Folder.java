package com.cgx.v2;

import java.util.ArrayList;
import java.util.List;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 16:40
 **/
public class Folder extends AbstractNode{
    private List<AbstractNode> list = new ArrayList<>();

    @Override
    public void display() {
        System.out.println("文件夹："+name);
      for (AbstractNode node: list){
          node.display();
      }
    }

    @Override
    public void addNode(AbstractNode node) {
        list.add(node);
    }

    public Folder(String name) {
        super(name);
    }
}
