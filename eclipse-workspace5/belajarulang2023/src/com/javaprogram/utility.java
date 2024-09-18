package com.javaprogram;

public class utility {

	public static void hardWait (int second) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000*second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
