/**
 * Project Name:X01
 * File Name:Parcel6.java
 * Package Name:innerclasses_10
 * Date:2018年1月27日下午9:01:44
 * Copyright (c) 2018, Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;
/**
 * ClassName:Parcel6 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月27日 下午9:01:44 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel6
{
    private String internalTracking(boolean b)
    {
        String string = null;
        if (b)
        {
            class TrackingSlip
            {
                private String id;

                TrackingSlip(String s)
                {
                    id = s;
                }

                String getSlip()
                {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("slip");
            string = ts.getSlip();
        }
        return string;
    }

    public String track()
    {
        return internalTracking(true);
    }

    public static void main(String[] args)
    {
        Parcel6 p6 = new Parcel6();

        System.out.println(p6.track());
    }
}

