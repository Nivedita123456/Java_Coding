package com.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

class QueueLinkedList<T>
{
    Node<T> head ;
    Node<T> rear ;
    int size ;
    public QueueLinkedList()
    {
        size=0;
        head=null;
        rear=null;
    }
    int size()
    {
        return size ;
    }
    void push( T data )
    {
        Node newNode = new Node( data ) ;
       if( head == null ){
           head = newNode ;
           rear= newNode ;
       }
       rear.next=newNode ;
       size++;
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

public class QueueLinkedListImpl {
    public static int get_Node(HashMap<Integer,ArrayList<Integer>> graph , int[] visited , int src )
    {
        int last_ele=src;
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src,0));
        while(queue.size()>0)
        {
            int front = queue.peekFirst().node;
            int dist = queue.peekFirst().dist;
            queue.remove();
            if( visited[front]==1)
                continue;
            visited[front]=1;
            last_ele=front;
            for( int i=0;i<graph.get(src).size();i++)
            {
                queue.add(new Pair( graph.get(src).get(i) , dist+1));

            }
        }
        return last_ele;
    }
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>() ;
        QueueLinkedList<Integer> q = new QueueLinkedList<>();
        q.push(1);
        q.push(2);
        System.out.println(q.size);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.size);
        System.out.println(q.pop());
    int E=5;
    for( int i=0;i<E;i++)
    {
        int src=0,dest=0;
        if( graph.containsKey(src)){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(dest);
            graph.put(src,temp);
        }
        else{
            graph.get(src).add(dest);
        }
        if( graph.containsKey(dest)){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(src);
            graph.put(dest,temp);
        }
        else{
            graph.get(dest).add(src);
        }

    }
    }
}
