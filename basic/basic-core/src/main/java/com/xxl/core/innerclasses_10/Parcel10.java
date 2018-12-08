
package com.xxl.core.innerclasses_10;

import com.xxl.core.innerclasses_10.innerinterface.Destination;
import com.xxl.util.Print;

/**
 * ClassName:Parcel10 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午3:56:20 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel10
{
    public Destination destination(final String dest, final float price) // final 在1.8 JDK中可省略
    {
        return new Destination()
        {
            private int cost;
            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if (cost > 100)
                {
                    Print.print("cost = " + cost + "; Over budget!");
                }
            }

            private String label = dest;

            public String readLabel()
            {
                return label;
            }
        };
    }

    public static void main(String[] args)
    {
        Parcel10 p10 = new Parcel10();
        Destination d = p10.destination("Tasmania", 101.895F);
        Print.print(d.readLabel());
    }
}

