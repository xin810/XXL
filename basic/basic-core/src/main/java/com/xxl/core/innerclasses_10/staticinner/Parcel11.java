
package com.xxl.core.innerclasses_10.staticinner;

import com.xxl.core.innerclasses_10.innerinterface.Contents;
import com.xxl.core.innerclasses_10.innerinterface.Destination;
import com.xxl.util.Print;

/**
 * ClassName:Parcel11 <嵌套类>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午6:55:41 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Parcel11
{
    private static class ParcelContents implements Contents
    {
        private int i = 11;

        public int value()
        {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination
    {
        private String label;

        private ParcelDestination(String whereTo)
        {
            label = whereTo;
        }

        public String readLabel()
        {
            return label;
        }

        // Nested classes can contain other static element:
        public static void f()
        {
        }
        static int x = 10;
        static class AnotherLevel
        {
            static int x = 10;
            public static void f()
            {
            }
        }
    }

    public static Destination destination(String s)
    {
        return new ParcelDestination(s);
    }

    public static Contents contents()
    {
        return new ParcelContents();
    }

    interface Factory
    {
        Contents getContents();
        Destination getDestination(String s);
    }

    static class ImplFactory implements Factory
    {
        public Contents getContents()
        {
            return new ParcelContents();
        }

        public Destination getDestination(String s)
        {
            return new ParcelDestination(s);
        }
    }

    public static void main(String[] args)
    {
        Contents contents = contents();
        Destination destination = destination("Tasmania");

        System.out.println(contents.value());
        Print.print(destination.readLabel());

        ImplFactory factory = new ImplFactory();
        Print.print(factory.getContents().value());
        Print.print(factory.getDestination("Tasmania").readLabel());
    }
}

