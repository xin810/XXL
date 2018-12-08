package com.xxl.core.interfaces_9.interfaceprocessor;

import static com.xxl.util.Print.print;

public class Apply {
	public static void process(Processor p, Object s)
	{
		print("Using Processor " + p.name());
		print(p.process(s));
	}
}
