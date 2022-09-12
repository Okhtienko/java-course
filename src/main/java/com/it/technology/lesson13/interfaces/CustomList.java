package com.it.technology.lesson13.interfaces;

public interface CustomList<T> {
    boolean isEmpty();
    boolean contains(T element);
    int size();
    int indexOf(T element);
    void add(T element);
    void add(int index, T element);
    void remove(T element);
    void clear();
    T removeByIndex(int index);
    T get(int index);
    T set(int index, T element);
    T[] toArray();
}

