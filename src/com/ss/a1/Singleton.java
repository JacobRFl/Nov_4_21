package com.ss.a1;

/**
 * @author Jacob
 *
 */
public class Singleton {

	//need volatile to prevent caching
	private static volatile Singleton instance;
	
	public static Singleton getInstance() {
		//check if the synchronized before using resources
        if (instance == null) {
            synchronized (Singleton .class) {
                if (instance == null) {
                    instance = new Singleton();
                    System.out.println("singleton created");
                }
            }
        }
        else {
        	System.out.println("using existing");
        }
        return instance;
    }

}
