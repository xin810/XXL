package com.xxl.util;

import java.io.PrintStream;

/**
 *  输出工具类
 * @author xxl
 *
 */
public class Print {

	/**
	 * Print with a newLine
	 * @param obj
	 */
	public static void print(Object obj)
	{
		System.out.println(obj);
	}

	/**
	 * Print a newLine by itself
	 */
	public static void print()
	{
		System.out.println();
	}

	/**
	 * Print with no line break
	 * @param obj
	 */
	public static void printb(Object obj)
	{
		System.out.print(obj);
	}

	/**
	 * new print from C
	 * @param format
	 * @param objects
	 * @return
	 */
	public static PrintStream printf(String format, Object... objects)
	{
		return System.out.printf(format, objects);
	}

	/**
	 * err log print.<br>
	 * <一句话功能简述>
	 * <功能详细描述>
	 * @param obj log msg
	 * @author Administrator
	 */
	public static void printErr(Object obj)
	{
	    System.err.println(obj);
	}
}
