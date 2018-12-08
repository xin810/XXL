/**
 * Project Name:X01
 * File Name:Sequence.java
 * Package Name:innerclasses_10
 * Date:2018年1月23日下午10:08:38
 * Copyright (c) 2018, All Rights Reserved.
 *
*/

package com.xxl.core.innerclasses_10;

interface Selector
{
    boolean end();
    Object current();
    void next();
}

/**
 * ClassName:Sequence <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月23日 下午10:08:38 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Sequence
{
    private Object[] items;
    private int next = 0;

    public Sequence(int size)
    {
        items = new Object[size];
    }

    public void add(Object x)
    {
        if (next < items.length)
        {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector
    {
        private int i = 0;

        public boolean end()
        {
            return i == items.length;
        }

        public Object current()
        {

            return items[i];
        }

        public void next()
        {
            if (i < items.length)
            {
                i++;
            }
        }
    }

    public Selector selector()
    {
        return new SequenceSelector();
    }

    public static void main(String[] args)
    {
        Sequence sequence = new Sequence(10);

        for (int i = 0; i < 10; i++)
        {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        while (!selector.end())
        {
            System.out.print(selector.current() + " ");

            selector.next();
        }
    }
}

