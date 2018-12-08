/**
 * Project Name:X01
 * File Name:TestParcel.java
 * Package Name:innerclasses_10.uptypeforinner
 * Date:2018年1月24日下午8:33:19
 * Copyright (c) 2018, Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10.uptypeforinner;

import com.xxl.core.innerclasses_10.innerinterface.Contents;
import com.xxl.core.innerclasses_10.innerinterface.Destination;

class Parcel4
{
    private class PContents implements Contents
    {
        private int i = 11;

        public int value()
        {
            return i;
        }
    }

    protected class PDestitation implements Destination
    {
        private String label;

        private PDestitation(String whereTo)
        {
            label = whereTo;
        }

        public String readLabel()
        {
            return label;
        }
    }

    public Destination destination(String s)
    {
        return new PDestitation(s);
    }

    public Contents contents()
    {
        return new PContents();
    }
}

/**
 * ClassName:TestParcel <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月24日 下午8:33:19 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class TestParcel
{
    public static void main(String[] args)
    {
        Parcel4 p4 = new Parcel4();

        Contents c = p4.contents();
        Destination d = p4.destination("Tasmania");

        // Parcel4.PContents pc = p4.new PContents();
        // Parcel4.PDestitation pd = p4.new PDestitation();
    }
}

