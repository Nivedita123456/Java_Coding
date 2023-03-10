package com.example;

import java.util.Scanner;

class Node<T>{
    public T data ;
    public Node next ;
    Node( T data )
    {
        this.data=data;
        next = null ;
    }
}
public class LinkedListImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Reference to Node not actual Node
        Node<Integer> head = null;
        Node<Integer> curr = null ;
        int val = sc.nextInt();
      while( val !=- 1 )
      {

          Node<Integer> new_node = new Node( val) ;
          if( head == null ){
              head=new_node;
              curr= head ;
          }
          else{
            curr.next = new_node;
            curr = curr.next ;
          }
        val = sc.nextInt();
      }
      Node<Integer> temp = head ;
      while( temp != null )
      {
          System.out.println(temp.data);
          temp=temp.next;
      }

    }
}
