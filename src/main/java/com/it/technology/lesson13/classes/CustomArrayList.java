package com.it.technology.lesson13.classes;

import com.it.technology.lesson13.interfaces.CustomList;
import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private T[] data;

    public CustomArrayList() {
        this.data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int size) throws IllegalArgumentException{
        if (size < 0) {
            throw new IllegalArgumentException("Illegal size: " + size);
        }
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index, int length) throws IllegalArgumentException {
        if ((index < 0) || (index >= length)) {
            throw new IllegalArgumentException("Illegal index: " + index);
        }
    }

    private void ensureCapacity(int capacity) {
        if (capacity > size && !(capacity <= DEFAULT_CAPACITY)) {
            increase(capacity);
        }
    }

    private T[] increase(int capacity) {
        int oldSize = size;
        if (oldSize > 0) {
            int newSize = oldSize * 2;
            return data = Arrays.copyOf(data, newSize);
        } else {
            return data = (T[]) new Object[Math.max(DEFAULT_CAPACITY, capacity)];
        }
    }

    private T[] increase() {
        return increase(size + 1);
    }

    @Override
    public int indexOf(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(data[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public void add(T element) {
        add(size(), element);
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index, size + 1);
        ensureCapacity(size + 1);
        for (int i = size() - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = element;
        size++;
    }

    @Override
    public void remove(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    removeByIndex(i);
                    break;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(data[i])) {
                    removeByIndex(i);
                    break;
                }
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size + 1; i++) {
            data[i] = null;
        }
       size = 0;
    }

    @Override
    public T removeByIndex(int index) {
        checkIndex(index, size);
        T value = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return value;
    }

    @Override
    public T get(int index) {
        checkIndex(index, size);
        return data[index];
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index, size);
        T value = data[index];
        data[index] = element;
        return value;
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(data, size);
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
