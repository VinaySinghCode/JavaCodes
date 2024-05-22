package org.codes;
import java .util.*;
public class ReverseString {
    public static void main(String[] args) {
        String str = "StringNeedToReverse";
        String revStr= "";
        for (int i = str.length()-1;i>=0;i--)
        {
            revStr= revStr+str.charAt(i);
        }
        System.out.println("reverse string is ="+revStr);
    }
}
