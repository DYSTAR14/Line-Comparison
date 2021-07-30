package com.blz.linecomparison;

public class StartLineComparison {

	public static void main(String[] args) {
		int x1=3,y1=7;
		int x2=-2,y2=15;
		int length=(int) ((Math.pow((x2-x1),2) + (Math.pow((y2-y1),2))));
		System.out.println(Math.sqrt(length));
	}

}
