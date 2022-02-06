package com.xyz.app1.model;

import java.util.concurrent.locks.ReentrantLock; 
public class C24 { 
public static void main(String[] args) { 
ReentrantLock m = new ReentrantLock(); 
m.lock(); 
m.lock(); 
System.out.println(m.isLocked()); 
System.out.println(m.isHeldByCurrentThread()); 
System.out.println(m.getQueueLength()); 
System.out.println(m.getHoldCount()); 
m.unlock(); 
System.out.println(m.getHoldCount()); 
System.out.println(m.isLocked()); 
m.unlock(); 
System.out.println(m.getHoldCount()); 
System.out.println(m.isLocked()); 
System.out.println(m.isFair()); 
} 
}

