package com.xyz.app1.service;
final class Cust {
private final String name;
public Cust(String name) {
this.name=name;
}
public Cust modify(String name){
if(this.name==name)
return this;
else
return new Cust(name);
}
public String toString(){
return name;
}
}
public class customer {
public static void main(String[] args){
Cust s1=new Cust ("rane");
Cust s2=s1.modify("builder");
Cust s3=s1.modify("raj");
System.out.println(s1==s2);
System.out.println(s1==s3);
}
}
