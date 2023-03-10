package com.example;

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
    public void print() throws InterruptedException {
        for( int i=0;i<10;i++)
        {
            System.out.println(i);

        }
        Thread.sleep(5000);
    }
    public void run()
    {
        try {
           print();
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
public class MultiThreadingExample {
    public static void main(String[] args) throws InterruptedException {
//        int n = 8; // Number of threads
//        for (int i = 0; i < 2; i++) {
//            MultithreadingDemo object
//                    = new MultithreadingDemo();
//            object.start();
//        }
//EXtending Thread Class or Implementing Runnable Interface

//
            MultithreadingDemo object
                    = new MultithreadingDemo();
            object.start();
            System.out.println("Exceution for waiting");
        System.out.println("Exceution for waiting");
            object.join() ;
        System.out.println("Exceution for wait end ");
//
//


     //One THREAD to take INPUT and other to print on CONSOLE






    }
}
