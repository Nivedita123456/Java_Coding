package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class NewList<T> implements Iterable<T>{
    private ArrayList<T> list_value ;
    private int size ;
    public NewList(int size)
    {
        this.size = size ;
        list_value = new ArrayList<>(size);

    }

    public int getSize() {
        return size;
    }

    public ArrayList<T> getList_value() {
        return list_value;
    }

    public void setList_value(ArrayList<T> list_value) {
        this.list_value = list_value;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int count = 0 ;
            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                System.out.println(size);
               T curr = list_value.get(count) ;
               count++;
               return curr ;
            }
        };
    }

    public void add( T obj ) {
        list_value.add(obj);
     }
}
