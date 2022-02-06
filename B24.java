package com.xyz.app1.model;
import java.util.Iterator; 
import java.util.concurrent.ConcurrentSkipListSet; 
class B24 extends Thread { 
static ConcurrentSkipListSet<String> al = new ConcurrentSkipListSet<>(); public void run() 
{ 
try { 
Thread.sleep(1000); 
} 
catch (InterruptedException e) { 
System.out.println("Child Thread going to add element"); 
} 
System.out.println("Child thread updating list"); 
al.add("Angular"); 
} 
public static void main(String[] args)throws InterruptedException { 
al.add("Python"); 
al.add("Java"); 
al.add("JDBC"); 
B24 t = new B24(); 
t.start(); 
Iterator<String> itr = al.iterator(); 
while (itr.hasNext()) { 
String s = itr.next(); 
System.out.println("Main thread iterating list and current object:  "+s); 
Thread.sleep(6000); 
} 
System.out.println(al); 
} 
}

