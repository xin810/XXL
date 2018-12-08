package com.xxl.core.interfaces_9.random;

import java.util.Random;

public class RandomDoubles {
	private static Random random = new Random(47);

	public double next() {
		return random.nextDouble();
	}

	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 20; i++)
		{
			System.out.print(rd.next() + " ");
			if ((i+1)%2 == 0)
				System.out.println("");
		}
	}
}
