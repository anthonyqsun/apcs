/**
Ivina Wang
APCS
HW28 -- PPMP
2021-10-31
time spent: 2 hours
*/

public class String1{
/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/
  public static String helloName(String name) {
    String greeting;
    greeting = "Hello "+name+"!";
    return greeting;
  }

/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/
  public static String makeAbba(String a, String b) {
    String greeting;
    greeting = a+b+b+a;
    return greeting;
  }

  public static void main(String[] args){
    //helloName
    System.out.println(helloName("Bob"));
    System.out.println(helloName("Alice"));
    System.out.println(helloName("X"));
    System.out.println();
    //makeAbba
    System.out.println(makeAbba("Hi", "Bye"));
    System.out.println(makeAbba("Yo", "Alice"));
    System.out.println(makeAbba("What", "Up"));
  }
}
