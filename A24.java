package com.xyz.app1.model;
import java.util.*; 
import java.util.concurrent.ConcurrentSkipListMap; 
class A24 extends Thread { 
static ConcurrentSkipListMap<Integer,String> m = new 
ConcurrentSkipListMap<>(); 
public void run() 
{ 
try { 
Thread.sleep(2000); 
} 
catch (InterruptedException e) { 
System.out.println("Child Thread going to add element"); 
} 
System.out.println("Child thread updating Map"); 
m.put(104,"Angular"); 
} 
public static void main(String[] args)throws InterruptedException { 
m.put(101,"London"); 
m.put(103,"New Jersey"); 
m.put(102,"varsova"); 
A24 t = new A24(); 
t.start(); 
Set<Integer> s = m.keySet(); 
Iterator<Integer> itr = s.iterator(); 
while(itr.hasNext()) { 
Integer i = itr.next(); 
System.out.println(" current Entry is:  "+i+"..."+m.get(i)); 
Thread.sleep(6000); 
} 
System.out.println(m); 
} 
}

