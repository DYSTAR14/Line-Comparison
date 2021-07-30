package com.blz.linecomparison;

public class StartLineComparison {

	public static void main(String[] args) {
		int x1 = 3, y1 = 6, x2 = -2, y2 = 15;
		int x3 = 3, y3 = 6, x4 = -2, y4 = 15;
		Integer length1 = (int) ((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
		length1 = (int) Math.sqrt(length1);
		System.out.println(length1);
		Integer length2 = (int) ((Math.pow((x4 - x3), 2) + (Math.pow((y4 - y3), 2))));
		length2 = (int) Math.sqrt(length2);
		System.out.println(length2);
		System.out.println(length1.compareTo(length2));
	}

}
