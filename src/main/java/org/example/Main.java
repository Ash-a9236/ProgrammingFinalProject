package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1, 8, 3, 10};
        int[] nums2 = {5, 6, 7, 8};

        System.out.println(Arrays.toString(remplaceToMax(nums1, nums2)));

    }

//TODO : create documentation for all methods
//TODO : Change method names
//TODO : Test :,)

/*----------------------------------------------------------------------------------------------------------------------
Task 1 :
Create a method that takes two integer arrays, finds the maximum values in each position between
the two arrays and returns them in a new array.

Note that the input arrays can be null or empty, and the sizes can be different
e.g.: {1, 5, 9} {2, 3, 7, 8, 10} -> {2, 5, 9, 8, 10}

Create Unit tests for the task to make sure your method is robust.
*/
    public static int[] remplaceToMax(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
            return nums2;
        }
        if (nums2 == null || nums2.length == 0) {
            return nums1;
        }

        int maxLength = Math.max(nums1.length, nums2.length); //3
        int minLength = Math.min(nums1.length, nums2.length); //2
        int[] nums3 = new int[maxLength]; //3


        if (nums1.length != nums2.length) {
            for (int i = minLength; i < nums3.length; i++) {
                nums3[i] = (nums1.length > nums2.length) ? nums1[i] : nums2[i];
            }
        } else {
            for (int i = 0; i < nums3.length; i++) {
                nums3[i] = Math.max(nums1[i], nums2[i]);
            }
        }
        return nums3;
    }

/*----------------------------------------------------------------------------------------------------------------------
Task 2 :
Create a method that takes one integer array with digital scores in the range [0, 100], and creates a
new char array that holds the letter score of the input scores.

Note that the input array can be null or empty, and the sizes can be different
e.g.: {92, 84, 43, 77} -> {'A', 'B', 'F', 'C'}

Create Unit tests for the task to make sure your method is robust.
    public static char[] convertToLetterScores(int[] scores) {
        if (scores == null || scores.length == 0) {
            return new char[0];
        }

        char[] result = new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if (score >= 90 && score <= 100) {
                result[i] = 'A';
            } else if (score >= 80 && score <= 90) {
                result[i] = 'B';
            } else if (score >= 70 && score <= 80) {
                result[i] = 'C';
            } else if (score >= 60 && score <= 70) {
                result[i] = 'D';
            } else if (score >= 0 && score <= 60) {
                result[i] = 'F';
            } else {
                result[i] = 'F';
            }
        }
        return result;
    }



*/

    public static char[] toLetterScore(int[] digitScore) {
        char[] letterScore = new char[digitScore.length];

        if (digitScore == null || digitScore.length == 0) {
            letterScore[0] = 'X';
        }

        for (int i = 0; i < digitScore.length; i++) {
            if (digitScore[i] > 100 || digitScore[i] < 0 ) {
                letterScore[0] = 'Z';
            } else if (digitScore[i] >= 90) {
                letterScore[i] = 'A';
            } else if (digitScore[i] >= 80 && digitScore[i] < 90) {
                letterScore[i] = 'B';
            } else if (digitScore[i] > 70 && digitScore[i] < 80) {
                letterScore[i] = 'C';
            } else if (digitScore[i] > 60 && digitScore[i] < 70) {
                letterScore[i] = 'D';
            }
            letterScore[i] = 'F';
        }
        return letterScore;
    }



/*----------------------------------------------------------------------------------------------------------------------
Task 3 :
Create a method that takes two integer arrays, and merges the two arrays into one, with no 0 in it.

Note that the input array can be null or empty, and the sizes can be different
e.g.: {1, 0, 7, 0, 5} {0, 0, 4, 9, 2, 0} -> {1, 7, 5, 4, 9, 2}

Create Unit tests for the task to make sure your method is robust.

*/

    public static int[] join(int[] nums1, int[] nums2) {
        int lenght1 = nums1.length;
        int lenght2 = nums2.length;
        int[] result = new int[lenght1 + lenght2];

        for (int i = 0; i < lenght1; i++) {

            if (nums1[i] == 0) {
                i++;
                result[i] = nums1[i];
            }
//result[i] = (nums1[i] == 0) ? i++ : nums1[i];
//result[i] = nums1[i];
        }
        for (int i = 0; i < lenght2; i++) {

            if (nums2[i] == 0) {
                i++;
                result[lenght1 + i] = nums2[i];
            }
//result[lenght1 + i] = (nums2[i] == 0) ? i++ : nums2[i];
//result[lenght1 + i] = nums2[i];
        }

        return result;
    }

/*----------------------------------------------------------------------------------------------------------------------
Task 4 :
Create a method that takes one integer array, and then splits it into two arrays, one with odd
numbers and the other with even numbers.

Note that the input array can be null or empty, and the sizes can be different You need to return a 2D array,
which is an array and each element is a 1D array, such as
int[][] numss = new int[2][]; where numss[0] can be {1,2,3} and numss[1] can be {4,5,6}
e.g.: {5, 1, 0, 6, 2, 1, 7, 8, 8} -> {5, 1, 1, 7} {0, 6, 2, 8, 8}

Create Unit tests for the task to make sure your method is robust.

*/

    public static int[][] splitsEvenAndOdd(int[] nums) {
        int[] nums1 = new int[nums.length];
        int[] nums2 = new int[nums.length];
        int[][] numss = new int[nums1.length][nums2.length];
        int j = 0;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums1[j] = nums[i];
                j++;
            } else {
                nums2[k] = nums[i];
                k++;
            }
        }

        return numss;
    }




    public static void randomLoop() {
        int age = 15;
        do {
            System.out.println("Child!");
            age++;
        } while(age < 18);

    }


    /* _____________________________________________________________________________________________________________________
    write a method that takes a num (int), and a target (int), and generates all numbers in range [1, num]
    IF the number cannot be divided by target and does not contain target ELSE print 'x'
    The result should look like this if num = 4 and target = 3:
    1 2 x 4
    5 x 7 8
    x 10 11 x
    x 14 x 16
    */

    public static void generateNums1(int num, int target) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                int value = i * num + j;
                if ((value % target == 0) && ("" + value).contains("" + target)) {
                    System.out.print("X ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }



























}
