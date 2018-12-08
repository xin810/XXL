/**
 * Project Name:X01
 * File Name:Parcel3.java
 * Package Name:innerclasses_10
 * Date:2018年1月24日下午5:28:33
 * Copyright (c) 2018, Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;
/**
 * ClassName:Parcel3 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午5:28:33 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel3
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

    public static void main(String[] args)
    {
        Parcel3 p3 = new Parcel3();

        // Must use instance of outer class to create an instance of the inner class:
        Parcel3.Contents c = p3.new Contents();
        Parcel3.Destination d = p3.new Destination("Tasmania");

        System.out.println(d.readLabel());
    }
}

