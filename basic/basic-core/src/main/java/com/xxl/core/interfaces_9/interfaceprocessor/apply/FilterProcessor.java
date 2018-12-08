package com.xxl.core.interfaces_9.interfaceprocessor.apply;

import com.xxl.core.interfaces_9.classprocessor.Apply;
import com.xxl.core.interfaces_9.filters.BandPass;
import com.xxl.core.interfaces_9.filters.Filter;
import com.xxl.core.interfaces_9.filters.HighPass;
import com.xxl.core.interfaces_9.filters.LowPass;
import com.xxl.core.interfaces_9.filters.Waveform;
import com.xxl.core.interfaces_9.interfaceprocessor.Processor;

class FilterAdapter implements Processor
{
	Filter filter;

	public FilterAdapter(Filter filter)
	{
		this.filter = filter;
	}

	public String name() {
		return filter.name();
	}

	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}

}

/**
 * 适配器设计模式 --- 完全解耦
 * @author xxl
 *
 */
public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();

		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
