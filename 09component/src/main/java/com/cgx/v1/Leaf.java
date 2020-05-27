package com.cgx.v1;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 16:20
 **/
public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println(getClass()+"->name:"+getName());
        System.out.println("我是子节点，业务方法");
    }

    public Leaf(String name) {
        super(name);
    }
}
