
package com.xxl.core.innerclasses_10;
/**
 * ClassName:Parcel8 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午3:12:46 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel8
{
    public Wrapping wrapping(int x)
    {
        return new Wrapping(x)
        {
            @Override
            public int value()
            {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args)
    {
        Parcel8 p8 = new Parcel8();

        Wrapping w = p8.wrapping(10);

        System.out.println(w.value());
    }
}

