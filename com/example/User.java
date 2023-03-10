package com.example;
public class User implements Comparable<User>
{
    int age ;
    public User(int age )
    {
        this.age=age;
    }
    public User()
    {

    }


    @Override
    public int compareTo(User o) {
        return 0;
    }
}