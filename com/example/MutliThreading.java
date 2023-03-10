package com.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread1 extends Thread
{
    public void run()
    {
for( int i=0;i<10;i++)
{
    System.out.println("Thread with higher priority " + i ) ;
}

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }


    }
}

class Thread2 implements Runnable
{
    public void run()
    {

        for( int i=0;i<10;i++)
        {
            System.out.println("Thread with lower priority " + i ) ;
        }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

    }
}

public class MutliThreading {
    public static void main(String [] args)
    {
//        System.out.println("In main Thread Execution ");
        Thread t1 = new Thread1();
//
        Thread2 runnable = new Thread2();
        Thread t2 = new Thread(runnable) ;
//        t2.setPriority(1);
//        t2.start();
////        System.out.println( "In child Thread1 ") ;
//        t1.setPriority(10);
//        t1.start() ;
////        System.out.println( "In child Thread2 ") ;

/*
Async Programming in Java
Thread
Executor Service
CompletableFuture Concept
 */
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //Number of Threads that can execute at particular time in System
        //If same number of Threads all execute
        //If number of Threads are more so until one of them completes then remaining start executing
        executorService.execute(t1);
        executorService.execute(t2);
        //Keeps Running for other also as well until explicitly shutdown
        executorService.shutdown();

    }
}
