package com.example;
class Queue<T>{
    private T[] arr ;
    private int size ;
    private int index ;
    private int sindex  ;
    private int count ;
    public Queue(int size ){
        arr = (T[]) new Object[size] ;
        this.size = size;
        index = -1;
        sindex=-1;
        count =0 ;
    }
    void enqueue( T data )
    {
        int flag=0;
        if( index+1 ==size){
System.out.println("Queue full");
            index = ( index + 1 )% size ;
            flag=1;
if( index == sindex ){
    return ;
}
        }
        if( flag == 0 )
            index = ( index + 1 )% size ;
        arr[index]=data ;
        if( sindex==-1)
            sindex++;
        count++;
    }
    T top()
    {
        if( sindex == -1 ){
            System.out.println("Queue Empty");
            return null ;
        }
        if( count == 0 ){
            System.out.println("Queue Empty");
            return null ;
        }
        return arr[sindex] ;
    }
    T pop()
    {
        if( sindex == -1 ){
            System.out.println("Queue Empty");
            return null ;
        }
        if( count == 0 ){
            System.out.println("Queue Empty");
            return null ;
        }
        T val =arr[sindex] ;
        sindex = (sindex+1)%size ;
        count--;
        return val;
    }
    int getSize()
    {
        return count;
    }
}
public class QueueImpl {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.top());
    }
}
