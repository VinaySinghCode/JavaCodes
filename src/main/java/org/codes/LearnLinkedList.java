package org.codes;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {
    public static void main(String[] args) {
        List<Integer> numberList = new LinkedList<>();
        numberList.add(12);
        numberList.add(14);
        numberList.add(56);
        numberList.add(48);
        System.out.println(numberList);
        numberList.add(2,434);
        System.out.println(numberList);
        numberList.set(2,34);
        System.out.println(numberList.size());
        for(Integer element:numberList);
        {
            System.out.println(numberList);
        }

    }
}
