
package com.xxl.core.innerclasses_10.innerfactory;

import com.xxl.util.Print;

interface Service
{
    void method1();
    void method2();
}

/**
 * 工厂为服务的不同具体实现而工作
 * ClassName: ServiceFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月28日 下午6:16:51 <br/>
 *
 * @author l
 * @version
 * @since JDK 1.8
 */
interface ServiceFactory
{
    Service getService();
}

class Implementation1 implements Service
{
    private Implementation1()
    {
    }

    public void method1()
    {
        Print.print("Implementation1 method1()");
    }

    public void method2()
    {
        Print.print("Implementation1 method2()");
    }

    public static ServiceFactory factory =
        new ServiceFactory()
        {
            public Service getService()
            {
                return new Implementation1();
            }
        };
}

class Implementation2 implements Service
{
    private Implementation2()
    {
    }

    public void method1()
    {
        Print.print("Implementation2 method1()");
    }

    public void method2()
    {
        Print.print("Implementation2 method2()");
    }

    public static ServiceFactory factory =
        new ServiceFactory()
        {
            public Service getService()
            {
                return new Implementation2();
            }
        };
}

/**
 * ClassName:Factories <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:   TODO ADD REASON. <br/>
 * Date:     2018年1月28日 下午6:08:46 <br/>
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
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

