package com.xxl.core.interfaces_9.random;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * 适配接口
 * @author xxl
 *
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable
{
	private int count;

	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0)
			return -1;

		//String result = Double.toString(next()) + " "; // extends RandomDoubles
		String result = Double.toString(new Random(47).nextDouble()) + " ";
		cb.append(result);
		System.out.println(count);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(10));

		while (s.hasNextDouble()) {
			System.out.println(s.nextDouble());
		}

		s.close();
	}

}
