package com.xxl.core.interfaces_9.filters;

public class HighPass extends Filter {
	double cutoff;

	public HighPass(double cotuff) {
		this.cutoff = cotuff;
	}

	@Override
    public Waveform process(Waveform input) {
		return input;
	}
}
