package org.codes;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue
{
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        number.offer(12);
        number.offer(13);
        number.offer(14);
        System.out.println(number);
        number.poll();
        System.out.println(number);
        System.out.println(number.peek());
    }
}
