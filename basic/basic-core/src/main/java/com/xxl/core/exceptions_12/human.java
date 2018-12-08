
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

/**
 * 异常匹配
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author Administrator
 * @version [1.0.0, Administrator]
 */
public class human
{
    public static void main(String[] args)
    {
        // Catch the exact type:
        try
        {
            throw new Sneeze();
        }
        catch (Sneeze e)
        {
            Print.print("Caught Sneeze");
        }
        catch (Annoyance e)
        {
            Print.print("Caught Annoyance");
        }

        // Catch the base type:
        try
        {
            throw new Sneeze();
        }
        catch (Annoyance e)
        {
            Print.print("Caught Annoyance");
        }
    }
}

