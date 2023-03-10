package com.example;
import java.util.ArrayDeque;
import java.util.Stack;
public class Main {
    public static String change_str( StringBuffer str )
    {
        if( str.length()==0)
            return "" ;
//System.out.println(str);
        str.delete(0,1) ;
        System.out.println(str+" Before calling Recursion ");
        String rec = change_str( str);

        return rec ;
    }
    public static  void main( String[] args)
    {
        StringBuffer str= new StringBuffer("Hello") ;
//        System.out.println(str);
      change_str(str);
//        System.out.println(str);
// String pass by Value because of common pool generated Reference is passed by Value
        //StringBuffer and StringBuilder are passed by Reference changes reflected in main
        //Objects are passed by Reference
        //Primitive Types are passed by Reference


/*
Arrays
Char Arrays
Strings
LinkedList
Stack
Queue
PriorityQueue
Recursion Questions
Graphs
Trees
Bit Manipulation
Tries
DP
BackTracking
 */


StringBuilder sb = new StringBuilder(2) ;
sb.append("Hello") ;
System.out.println(sb);


//String temp = "Hello" ;
//temp="Hi" ;
//System.out.println(temp);
//ArrayList<User> users = new ArrayList<>() ;
//users.add( new User(1));
//users.add( new User(2));
//users.forEach(u->{
//    u= new User(3);
//});
//for( int i=0;i<users.size();i++)
//{
//    System.out.println(users.get(i).age);
//}
//
        NewList<User> new_list = new NewList(5) ;
        new_list.add(new User(1)) ;
        new_list.add(new User(2));
//        new_list.forEach(curr -> System.out.println(curr));
     System.out.println( new_list.getList_value().size());
for( User curr : new_list.getList_value())
{
    System.out.println(curr.age);
}
Stack<Integer> s = new Stack<>() ;
s.push(1);
        System.out.println(s.peek());
        System.out.println(s.size()) ;
//        ArrayDeque<Integer> q = new ArrayDeque<>() ;

}

}
