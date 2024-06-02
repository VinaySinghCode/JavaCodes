package org.codes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList
{
    public static void main(String[] args)
    {
        List<String> studentName= new ArrayList<>();
        studentName.add("Vinay");
        studentName.add("Vasu");

        studentName.add(1,"Shruti");
        System.out.println(studentName);

        List<String> newList=new ArrayList<>();
        newList.add("Vardh");
        newList.add("Vishal");

        studentName.addAll(newList);
        System.out.println(studentName);

        studentName.add(3,"John");
        System.out.println(studentName.get(3));
//
//        studentName.remove(3);
//        System.out.println(studentName);

//        studentName.remove("Vardh");
//        System.out.println(studentName);
/*
        studentName.clear();
        System.out.println(studentName);*/

        studentName.set(3,"Talha Anjum");
        System.out.println(studentName);

//        System.out.println(studentName.contains("Vardh"));

       /* for(int i=0;i<studentName.size();i++)
        {
            System.out.println(studentName.get(i));
        }*/
//        for(String i:studentName)
//            System.out.println(i);

        Iterator<String> it =studentName.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
