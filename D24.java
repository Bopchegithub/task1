package com.xyz.app1.model;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 
class Print implements Runnable{ 
String name; 
Print(String name){ 
this.name = name; 
} 
public void run() { 
System.out.println(name+"... job started by Thread "+Thread.currentThread().getName()); try { 
Thread.sleep(5000); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
System.out.println(name+"... job completed by Thread "+Thread.currentThread().getName()); } 
} 
class D24 { 
public static void main(String args[]) { 
Print[] jobs = { 
new Print("Ramesh"), 
new Print("Rakesh"), 
new Print("Suresh"), 
new Print("Kamesh"), 
new Print("Prakash"), 
new Print("Naresh") 
}; 
ExecutorService serivice = Executors.newFixedThreadPool(2); 
for(Print job:jobs) { 
serivice.submit(job); 
} 
serivice.shutdown(); 
} 
}

