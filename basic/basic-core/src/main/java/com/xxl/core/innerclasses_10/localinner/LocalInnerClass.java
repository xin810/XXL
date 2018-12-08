
package com.xxl.core.innerclasses_10.localinner;

import com.xxl.util.Print;

public class LocalInnerClass
{
    private int count = 0;

    Counter getCounter(final String name)
    {
        // A local inner class:
        class LocalCounter implements Counter
        {
            public LocalCounter()
            {
                // Local inner class can have a constructor
                Print.print("LocalCounter()");
            }

            public int next()
            {
                Print.printb(name); // access local final ?
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name)
    {
        return new Counter()
        {
            // Anonymous inner class cannot have a named constructor, only an instance initializer:
            {
                Print.print("Counter()");
            }

            public int next()
            {
                Print.printb(name); // Access local final ?
                return count++;
            }
        };
    }

    public static void main(String[] args)
    {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("Local inner ");
        Counter c2 = lic.getCounter2("Anonymous inner ");

        for (int i = 0; i < 5; i++)
        {
            Print.print(c1.next());
            Print.print(c2.next());
        }
    }
}

