package com.example;

import java.util.*;
import java.io.*;
class Pair{
    int node;
    int dist;

    public Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}
public class Func {
    public static int get_Dist(HashMap<Integer,ArrayList<Integer>> graph , int[] visited , int src )
    {
        int maxi=0;
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
            if( dist > maxi ){
                maxi=dist;
            }
            for( int i=0;i<graph.get(front).size();i++)
            {
                if( visited[graph.get(front).get(i)]==0)
                queue.add(new Pair( graph.get(front).get(i) , dist+1));

            }
        }
        return maxi;
    }
    public static int get_Node(HashMap<Integer,ArrayList<Integer>> graph , int[] visited , int src )
    {
        int last_ele=src;
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src,0));
        while(!queue.isEmpty())
        {
            int front = queue.peekFirst().node;
            int dist = queue.peekFirst().dist;
            queue.remove();
//            System.out.println(front);
            if( visited[front]==1)
                continue;
            visited[front]=1;
            last_ele=front;
            for( int i=0;i<graph.get(front).size();i++)
            {

                if( visited[ graph.get(front).get(i)]==0) {
                    queue.add(new Pair(graph.get(front).get(i), dist + 1));
//                    System.out.println( src + " " + graph.get(src).get(i) );
                }
            }
        }
        return last_ele;
    }
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>() ;
        int t ;
        t=sc.nextInt() ;
        for( int K=0;K<t;K++)
        {
            int V = sc.nextInt() ;
            int E = sc.nextInt() ;
            int[] visited = new int[V];
            for( int i=0;i<V;i++)
            {
                visited[i]=0;
            }
            for( int i=0;i<E;i++)
            {
                int src = sc.nextInt();
                int dest=sc.nextInt();
//                System.out.println( src + " "+dest);
                if( !graph.containsKey(src)){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(dest);
                    graph.put(src,temp);
                }
                else{
                    graph.get(src).add(dest);
                }
                if( !graph.containsKey(dest)){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(src);
                    graph.put(dest,temp);
                }
                else{
                    graph.get(dest).add(src);
                }
            }
//            for( int curr : graph.keySet())
//            {
//                System.out.println( curr +"" + graph.get(curr)) ;
//            }

             int farthest=get_Node(graph,visited,0);
//            System.out.println(farthest);
            for( int i=0;i<V;i++)
            {
                visited[i]=0;
            }
             System.out.println( get_Dist( graph , visited , farthest));
        }

    }
}