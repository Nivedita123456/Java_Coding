package com.example;

class StackLinkedList<T>{
    Node<T> head ;
    int size ;
    public StackLinkedList()
    {
        size=0;
        head=null;
    }
    int size()
    {
        return size ;
    }
    void push( T data )
    {
        Node newNode = new Node( data ) ;
        newNode.next=head;
        head=newNode;
        size++;
        return ;
    }
    T peek()
    {
        return head.data ;
    }
    T pop()
    {
        if( head == null ){
            System.out.println("No element ");
            return null ;
        }
        T data = head.data ;
        head=head.next ;
        size--;
        return data ;
    }
}
public class StackLinkedListImpl
{
    public static void main(String[] args) {
        StackLinkedList<Integer> s = new StackLinkedList<>();
        s.push( 1) ;
        s.push(2) ;
        System.out.println(s.peek());
     System.out.println(s.pop());
     System.out.println(s.pop());
     System.out.println(s.pop());
    }
}
