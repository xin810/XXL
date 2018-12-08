package com.xxl.core.interfaces_9.interfaceprocessor.apply;

import java.util.Arrays;

import com.xxl.core.interfaces_9.classprocessor.Apply;
import com.xxl.core.interfaces_9.interfaceprocessor.Processor;

/**
 * 实现接口编写所需要的类
 * @author xxl
 *
 */
public abstract class StringProcessor implements Processor {

	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);

	public static String s = "If she weighs the same as a duckm she's made of wood";

	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}

class Upcase extends StringProcessor
{
	@Override
	public String process(Object input) { // Covariant return
		return ((String) input).toUpperCase();
	}

}

class Downcase extends StringProcessor
{
	@Override
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}

}

class Splitter extends StringProcessor
{
	@Override
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}

}
