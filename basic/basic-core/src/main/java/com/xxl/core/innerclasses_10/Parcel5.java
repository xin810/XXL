/**
 * Project Name:X01
 * File Name:Parcel5.java
 * Package Name:innerclasses_10
 * Date:2018年1月27日下午8:50:52
 * Copyright (c) 2018, Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;

import com.xxl.core.innerclasses_10.innerinterface.Destination;

/**
 * ClassName:Parcel5 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月27日 下午8:50:52 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel5
{
    public Destination destination(String s)
    {
        class PDestination implements Destination
        {
            private String label;

            private PDestination(String whereTo)
            {
                label = whereTo;
            }

            public String readLabel()
            {
                return label;
            }
        }

        return new PDestination(s);
    }

    public static void main(String[] args)
    {
        Parcel5 p5 = new Parcel5();
        Destination d = p5.destination("Tasmania");

        System.out.println(d.readLabel());
    }
}

