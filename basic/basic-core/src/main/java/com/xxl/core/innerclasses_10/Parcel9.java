
package com.xxl.core.innerclasses_10;

import com.xxl.core.innerclasses_10.innerinterface.Destination;

/**
 * ClassName:Parcel9 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午3:23:01 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel9
{
    public Destination destination(final String dest) // final 在1.8 JDK中可省略
    {
        return new Destination()
        {
            private String label = dest;
            public String readLabel()
            {
                return label;
            }
        };
    }

    public static void main(String[] args)
    {
        Parcel9 p9 = new Parcel9();
        Destination d = p9.destination("Tasmania");

        System.out.println(d.readLabel());
    }
}

