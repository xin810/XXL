
package com.xxl.core.innerclasses_10.staticinner;

import com.xxl.util.Print;

/**
 * ClassName:TestBed <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午8:49:18 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class TestBed implements ClassInInterface
{
    public void howdy()
    {
        Print.print("TestBed()");
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        test.howdy();

        new TestBed().howdy();
    }
}

