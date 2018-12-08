/**
 * Project Name:X01
 * File Name:Parcel2.java
 * Package Name:innerclasses_10
 * Date:2018年1月23日下午9:36:56
 * Copyright (c) 2018, All Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;
/**
 * ClassName:Parcel2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月23日 下午9:36:56 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel2
{
    class Contents
    {
        private int i = 11;

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

    public Destination to(String s)
    {
        return new Destination(s);
    }

    public Contents contents()
    {
        return new Contents();
    }

    public void ship(String dest)
    {
        Contents c = contents();
        Destination d = to(dest);

        System.out.println(d.readLabel());
    }

    public static void main(String[] args)
    {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");

        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");

        System.out.println(d.readLabel());
    }
}

