/**
 * Project Name:X01
 * File Name:DotThis.java
 * Package Name:innerclasses_10
 * Date:2018年1月24日下午5:08:34
 * Copyright (c) 2018, Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;
/**
 * ClassName:DotThis <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午5:08:34 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class DotThis
{
    void f()
    {
        System.out.println("DotThis.f()");
    }

    private class Inner
    {
        public DotThis outer()
        {
            return DotThis.this;
        }
    }

    public Inner inner()
    {
        return new Inner();
    }

    public static void main(String[] args)
    {
        // 生成外部对象的引用
        DotThis dt = new DotThis();

        dt.f();

        // 通过内部类生成外部对象的引用
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}

