package com.cgx.v1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**********
 * @program: designpatterns
 * @description: 子容器类
 * @author: cgx
 * @create: 2020-05-27 16:13
 **/
@Data
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    public Composite(String name){
       super(name);
    }
    @Override
    public void addComposite(Component c) throws IllegalAccessException {
       list.add(c);
    }

    @Override
    public void removeComposite(Component c) throws IllegalAccessException {
        list.remove(c);
    }

    @Override
    public Component getComposite(int i) throws IllegalAccessException {
       return  list.get(i);
    }

    @Override
    public void operation() {
        System.out.println(getClass()+"->name:"+getName());
        list.forEach(l->{
            l.operation();
        });
    }
}
