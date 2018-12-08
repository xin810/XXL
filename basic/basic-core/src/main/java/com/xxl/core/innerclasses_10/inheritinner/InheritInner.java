
package com.xxl.core.innerclasses_10.inheritinner;

import com.xxl.util.Print;

class WithInner
{
    class Inner
    {
        public Inner(String s)
        {
            Print.print(s + " : Inner.class");
        }
    }
}

public class InheritInner extends WithInner.Inner
{
    //! public InheritInner() {}
    public InheritInner(WithInner wi)
    {
        wi.super(InheritInner.class.getSimpleName());
    }

    public static void main(String[] args)
    {
        WithInner wi = new WithInner();
        wi.new Inner(WithInner.class.getSimpleName());

        InheritInner ii = new InheritInner(wi);
    }
}

