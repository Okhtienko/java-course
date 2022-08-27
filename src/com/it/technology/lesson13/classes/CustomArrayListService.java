package com.it.technology.lesson13.classes;

import com.it.technology.lesson13.classes.CustomArrayList;

public final class CustomArrayListService<T> {
    public void displayArrayList(CustomArrayList<T> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
