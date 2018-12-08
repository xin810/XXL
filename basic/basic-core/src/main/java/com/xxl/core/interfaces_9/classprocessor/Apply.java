package com.xxl.core.interfaces_9.classprocessor;

import static com.xxl.util.Print.print;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {return input;}
}

class Upcase extends Processor
{
	@Override
    String process(Object input) { // Covariant return
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor
{
	@Override
    String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor
{
	@Override
    String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

/**
 * 策略设计模式
 * @author xxl
 *
 */
public class Apply {
	public static String s = "Disagreement with beliefs is by definition incorrect";

	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s)); // 根据不同的对象类型 表现出不同的行为
		print("----------------------------------");
	}

	public static void process(com.xxl.core.interfaces_9.interfaceprocessor.Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s)); // 根据不同的对象类型 表现出不同的行为
        print("----------------------------------");
    }

	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);

		process(new Processor(), s);
	}
}
