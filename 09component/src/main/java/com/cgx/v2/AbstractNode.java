package com.cgx.v2;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 15:44
 **/
@Data
public abstract   class AbstractNode {

    protected String name;

    public AbstractNode(String name) {
        this.name = name;
    }

    public void addNode(AbstractNode node){
        throw new UnsupportedOperationException("不支持此方法");
    }

    public abstract void display();
}
