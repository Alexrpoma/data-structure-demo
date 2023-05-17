package com.demo.arrays_demo;

import java.util.Arrays;

/**
 * Fixed in size
 * Fast for data retrievals
 * Compact memory usage if size is known
 * Delete operation is very hard
 * 2D arrays
 */
public class TheArrays {
  public static void main(String[] args) {
    //basic();

    //BinarySearch only can use with a sort array!
    int[] numbers = {20, 50, 10, 6, 100, 60, 90, 45};
    Arrays.sort(numbers); //We sort the array
    System.out.println(Arrays.toString(numbers));
    int result = binarySearch(numbers, 45);
    System.out.println(numbers[result]);

    //Original BinarySearch method!
    int index = Arrays.binarySearch(numbers, 45);
    System.out.println(numbers[index]);
  }

  public static void basic() {

    String[] colors = new String[5];
    colors[0] = "red";
    colors[1] = "blue";
    colors[2] = "white";
    colors[3] = "black";
    colors[4] = "orange";

    System.out.println(Arrays.toString(colors));
    Arrays.stream(colors).forEach(System.out::println);

    int[] nums = {120, 500, 30, 90, 10, 50};
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    int[] tmp = Arrays.copyOf(nums, 6);
    System.out.println(Arrays.toString(tmp));
  }

  private static int binarySearch(int[] numbers, int numberToFind) {
    int low = 0;
    int high = numbers.length - 1;
    while (low <= high) {
      int middlePosition = (low + high) / 2;
      int middleNumber = numbers[middlePosition];
      if (numberToFind == middleNumber) return middlePosition;
      if (numberToFind < middleNumber) high = middlePosition - 1;
      else low = middlePosition + 1;
    }
    return -1;
  }
}
