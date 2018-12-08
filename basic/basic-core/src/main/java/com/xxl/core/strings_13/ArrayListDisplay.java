
package com.xxl.core.strings_13;

import java.util.ArrayList;

import com.xxl.core.strings_13.coffee.Coffee;
import com.xxl.core.strings_13.coffee.CoffeeGenerator;
import com.xxl.util.Print;

public class ArrayListDisplay
{
    public static void main(String[] args)
    {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new  CoffeeGenerator(10))
        {
            coffees.add(c);
        }
        Print.print(coffees);
    }
}

