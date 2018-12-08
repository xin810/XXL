/**
 * Project Name:X01
 * File Name:Factories.java
 * Package Name:interfaces_9.factory
 * Date:2018年1月22日下午10:03:04
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.xxl.core.interfaces_9.factory;

import com.xxl.util.Print;

interface Service
{
    void method1();
    void method2();
}

interface ServiceFactory
{
    Service getService();
}

class Implementation1 implements Service
{
    public Implementation1()
    {
    }

    public void method1()
    {
        Print.print("Implementation1 method1");
    }

    public void method2()
    {
        Print.print("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory
{
    public Service getService()
    {
        return new Implementation1();
    }
}

class Implementation2 implements Service
{
    public Implementation2()
    {
    }

    public void method1()
    {
        Print.print("Implementation2 method1");
    }

    public void method2()
    {
        Print.print("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory
{
    public Service getService()
    {
        return new Implementation2();
    }
}

/**
 * ClassName:Factories <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月22日 下午10:03:04 <br/>
 * @author   l
 * @version
 * @since    JDK 1.8
 * @see
 */
public class Factories
{
    public static void serviceConsumer(ServiceFactory factory)
    {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args)
    {
        serviceConsumer(new Implementation1Factory());

        serviceConsumer(new Implementation2Factory());
    }
}

