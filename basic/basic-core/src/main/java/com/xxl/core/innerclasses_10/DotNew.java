/**
 * Project Name:X01
 * File Name:DotNew.java
 * Package Name:innerclasses_10
 * Date:2018年1月24日下午5:19:33
 * Copyright (c) 2018, Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;
/**
 * ClassName:DotNew <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午5:19:33 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class DotNew
{
    public class Inner
    {
    }

    public static void main(String[] args)
    {
        DotNew dn = new DotNew();

        DotNew.Inner dni = dn.new Inner();
    }
}

