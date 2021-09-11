/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 7
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);

  System.out.println("What is the length of the room in feet? ");
  int length = scanner.nextInt();

  System.out.println("What is the width of the room in feet? ");
  int width = scanner.nextInt();

  int fArea = length*width;
  double calc = 0.09290304;
  double mArea = fArea*calc;

  System.out.println("You entered dimensions of" + " " + length + " " + "feet by" + " " + width + " " +"feet.");

  System.out.println("The area is " + fArea + " square feet");
  System.out.println("The area is " + mArea + " square meters");

  }
}