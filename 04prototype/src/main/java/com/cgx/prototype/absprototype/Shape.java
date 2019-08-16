package com.cgx.prototype.absprototype;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2019-08-15 15:28
 **/
@Data
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    public abstract void draw();

    /**
     * @return a clone of this instance.
     * @throws CloneNotSupportedException if the object's class does not
     *                                    support the {@code Cloneable} interface. Subclasses
     *                                    that override the {@code clone} method can also
     *                                    throw this exception to indicate that an instance cannot
     *                                    be cloned.
     * @see Cloneable
     */
    @Override
    public Object clone()  {
        Object object = null;
        try {
            object =  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  object;
    }
}
