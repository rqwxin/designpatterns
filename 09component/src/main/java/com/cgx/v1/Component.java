package com.cgx.v1;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description: 抽象构件
 * @author: cgx
 * @create: 2020-05-27 16:08
 **/
@Data
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public  void addComposite(Component c) throws IllegalAccessException {
          throw new IllegalAccessException("不支持此方法");
      }

    public  void removeComposite(Component c) throws IllegalAccessException {
        throw new IllegalAccessException("不支持此方法");
    }

    public Component getComposite(int i) throws IllegalAccessException {
        throw new IllegalAccessException("不支持此方法");
    }

    public abstract   void operation();
}
