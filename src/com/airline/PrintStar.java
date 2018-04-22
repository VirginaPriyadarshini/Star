package com.airline;

/**
 * @author vpriyada
 *
 */
public class PrintStar {

  public static void main(String args[]) {

    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j < i; j++) {
        if (i == 1) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
