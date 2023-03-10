package com.example;

class Stack<T> {
T[] arr ;
int size;
int index ;
public Stack(int size )
{
   arr = (T[]) new Object[size] ;
   this.size = size ;
   index = -1 ;
}
int size ()
{
    return index+1 ;
}
void push( T data )
{

    if( index +1 == size ){
        System.out.println("Stack full ");
        return ;
    }
    arr[++index]=data ;
}
T peek()
{
    if( index == -1 ){
        System.out.println("Stack empty ");
       return null ;
    }
    return arr[index] ;
}
T pop()
{
    if( index == -1 ){
        System.out.println("Stack empty ");
        return null ;
    }
    T val = arr[index];
    index--;
    return val ;
}
}
public class StackImpl{
    public static void main(String[] args) {
        //O(1) Insertion and Deletion
        Stack<Integer> s= new Stack<>(5) ;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
