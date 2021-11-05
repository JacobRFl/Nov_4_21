/**
 * 
 */
package com.ss.a2;

/**
 * @author Jacob
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        final ThreadSample thread1 =
                new ThreadSample();
            final ThreadSample thread2 =
                new ThreadSample();
            new Thread(new Runnable() {
                public void run() { thread1.lock(thread2); }
            }).start();
            new Thread(new Runnable() {
                public void run() { thread2.lock(thread1); }
            }).start();
        }
	}

//both objects are locked to the thread they are in so action 2 can never be performed

	
    class ThreadSample {
       
        
        public synchronized void lock(ThreadSample alt) {
     System.out.println("action1");
            alt.action2();
        }
        public synchronized void action2() {
            System.out.println("action2");
        }
    }
