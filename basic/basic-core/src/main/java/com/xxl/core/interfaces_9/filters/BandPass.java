package com.xxl.core.interfaces_9.filters;

public class BandPass extends Filter {
	double lowCutoff, highCotuff;

	public BandPass(double lowCut, double highCut)
	{
		lowCutoff = lowCut;
		highCotuff = highCut;
	}

	@Override
    public Waveform process(Waveform input)
	{
		return input;
	}
}
