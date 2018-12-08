
package com.xxl.core.exceptions_12;

import com.xxl.util.Print;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning
{
    public Inning() throws BaseballException {}

    public void event() throws BaseballException
    {
        // Don't actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {} // Throws no checked exceptions
}

class StrormException extends Exception {}
class RainedOut extends StrormException {}
class PopFoul extends Foul {}

interface Strom
{
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Strom
{
    // OK to add new exceptions for constructors,
    // but you must deal with the base constructor exception:
    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}

    // Regular methods must conform to base class:
    //! void walk()  throws PopFoul {} //Compile error
    @Override
    public void walk()
    {
        super.walk();
    }

    // Interface CANNOT add exceptions to existing methods from the base class:
    //! public void event() throws RainedOut {}
//    @Override
//    public void event() throws BaseballException
//    {
//        super.event();
//    }
    // You can choose t not throw any exceptions, even if the base version does:
    @Override
    public void event() {}

    // If the method doesn't already exist in the base class, the exception is OK:
    public void rainHard() throws RainedOut {}

    // Overridden methods can throw inherited exception:
    @Override
    public void atBat() throws PopFoul {}

    public static void main(String[] args)
    {
        try
        {
            StormyInning si = new StormyInning();
            si.atBat();
        }
        catch (PopFoul e)
        {
            Print.print("Pop foul");
        }
        catch (RainedOut e)
        {
            Print.print("Rained out");
        }
        catch (BaseballException e)
        {
            Print.print("Generic baseball exception");
        }

        // Strike not throw in derived version.
        try
        {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the base-class version of the method:
        }
        catch (Strike e)
        {
            Print.print("Strike");
        }
        catch (Foul e)
        {
            Print.print("Foul");
        }
        catch (RainedOut e)
        {
            Print.print("Rained out");
        }
        catch (BaseballException e)
        {
            Print.print("Generic baseball exception");
        }
    }
}

