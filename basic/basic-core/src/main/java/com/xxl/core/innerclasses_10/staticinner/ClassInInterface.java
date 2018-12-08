
package com.xxl.core.innerclasses_10.staticinner;

import com.xxl.util.Print;

/**
 * ClassName:ClassInInterface <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午8:44:26 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public interface ClassInInterface
{
    void howdy();

    class Test implements ClassInInterface
    {
        public void howdy()
        {
            Print.print("Howdy");
        }
    }
}

