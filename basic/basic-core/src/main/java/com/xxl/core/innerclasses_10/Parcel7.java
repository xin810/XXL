package com.xxl.core.innerclasses_10;

import com.xxl.core.innerclasses_10.innerinterface.Contents;

/**
 * ClassName:Parcel7 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月27日 下午9:11:05 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel7
{
    public Contents contents()
    {
        return new Contents()
        {
            private int i = 11;

            public int value()
            {
                return i;
            }
        };
    }

    public static void main(String[] args)
    {
        Parcel7 p7 = new Parcel7();
        Contents c = p7.contents();

        System.out.println(c.value());
    }
}

