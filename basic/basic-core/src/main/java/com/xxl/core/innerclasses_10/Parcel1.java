/**
 * Project Name:X01
 * File Name:Parcell.java
 * Package Name:innerclasses_10
 * Date:2018年1月23日下午9:27:07
 * Copyright (c) 2018, All Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;
/**
 * ClassName:Parcell <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月23日 下午9:27:07 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel1
{
    class Contents
    {
        private int i = 11;
        //! private static int x = 10;
        public int value()
        {
            return i;
        }
    }

    class Destination
    {
        private String label;

        Destination(String whereTo)
        {
            label = whereTo;
        }

        String readLabel()
        {
            return label;
        }
    }

    public void ship(String dest)
    {
        Contents c = new Contents();
        Destination d = new Destination(dest);

        System.out.println(d.readLabel());
    }

    public static void main(String[] args)
    {
        Parcel1 p = new Parcel1();

        p.ship("Tasmania");
    }
}

