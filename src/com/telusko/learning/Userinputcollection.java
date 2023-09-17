package com.telusko.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Userinputcollection {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        ArrayList <Integer>ar=new ArrayList<>();
        System.out.println("enter number of el");
        int input=sc.nextInt();
        for(int i=1;i<=input;i++){
            System.out.println("enter elem");
            int user=sc.nextInt();
            ar.add(user);
        }
        CopyOnWriteArrayList c=new CopyOnWriteArrayList();
       Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            c.add(3333);
        }


    }
}
