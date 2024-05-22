import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    /*----------------------------------------------------------------------------------------------------------------------
Task 1 :
Create a method that takes two integer arrays, finds the maximum values in each position between
the two arrays and returns them in a new array.

Note that the input arrays can be null or empty, and the sizes can be different
e.g.: {1, 5, 9} {2, 3, 7, 8, 10} -> {2, 5, 9, 8, 10}
*/
    @Test
    public void testRemplaceToMax1() {
        int[] nums1 = {1, 8, 3, 10};
        int[] nums2 = {5, 6, 7, 8};
        int[] expectedResult = {5, 8, 7, 10};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemplaceToMax2() {
        int[] nums1 = {1, 8, 3};
        int[] nums2 = {5, 6, 7, 8};
        int[] expectedResult = {5, 8, 7, 8};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemplaceToMax3() {
        int[] nums1 = {1, 8, 3, 10};
        int[] nums2 = {5, 6, 7};
        int[] expectedResult = {5, 8, 7, 10};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemplaceToMax4() {
        int[] nums1 = null;
        int[] nums2 = {5, 6, 7, 8};
        int[] expectedResult = {5, 6, 7, 8};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemplaceToMax5() {
        int[] nums1 = {1, 8, 3, 10};
        int[] nums2 = null;
        int[] expectedResult = {1, 8, 3, 10};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemplaceToMax6() {
        int[] nums1 = {1, 8, 3, 10};
        int[] nums2 = {};
        int[] expectedResult = {1, 8, 3, 10};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testRemplaceToMax7() {
        int[] nums1 = {1, 8, 3, 10};
        int[] nums2 = {};
        int[] expectedResult = {1, 8, 3, 10};
        int[] result = Main.remplaceToMax(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    /*----------------------------------------------------------------------------------------------------------------------
    Task 2 :
    Create a method that takes one integer array with digital scores in the range [0, 100], and creates a
    new char array that holds the letter score of the input scores.

    Note that the input array can be null or empty, and the sizes can be different
    e.g.: {92, 84, 43, 77} -> {'A', 'B', 'F', 'C'}
    */
    @Test
    public void testToLetterScore1() {
        int[] digitScore = {92, 84, 43, 77};
        char[] expectedResult = {'A', 'B', 'F', 'C'};
        char[] result = Main.toLetterScore(digitScore);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testToLetterScore2() {
        int[] digitScore = {100, 101, -1};
        char[] expectedResult = {'A', 'X', 'X'};
        char[] result = Main.toLetterScore(digitScore);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testToLetterScore3() {
        int[] digitScore = null;
        char[] expectedResult = {'X'};
        char[] result = Main.toLetterScore(digitScore);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testToLetterScore4() {
        int[] digitScore = {};
        char[] expectedResult = {};
        char[] result = Main.toLetterScore(digitScore);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testToLetterScore5() {
        int[] digitScore = {92, 84, 43, 77};
        char[] expectedResult = {'A', 'B', 'F', 'C'};
        char[] result = Main.toLetterScore(digitScore);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testToLetterScore6() {
        int[] digitScore = {92, 84, 43, 77};
        char[] expectedResult = {'A', 'B', 'F', 'C'};
        char[] result = Main.toLetterScore(digitScore);

        Assertions.assertArrayEquals(expectedResult, result);
    }






    /*----------------------------------------------------------------------------------------------------------------------
    Task 3 :
    Create a method that takes two integer arrays, and merges the two arrays into one, with no 0 in it.

    Note that the input array can be null or empty, and the sizes can be different
    e.g.: {1, 0, 7, 0, 5} {0, 0, 4, 9, 2, 0} -> {1, 7, 5, 4, 9, 2}
    */
    @Test
    public void testJoin1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4};
        int[] expectedResult = {1, 2, 3, 4};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin3() {
        int[] nums1 = {};
        int[] nums2 = {4, 5, 6};
        int[] expectedResult = {4, 5, 6};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin4() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expectedResult = {1, 2, 3};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin5() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] expectedResult = {};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin6() {
        int[] nums1 = null;
        int[] nums2 = {4, 5, 6};
        int[] expectedResult = {4, 5, 6};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin7() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = null;
        int[] expectedResult = {1, 2, 3};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin8() {
        int[] nums1 = null;
        int[] nums2 = null;
        int[] expectedResult = null;
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testJoin9() {
        int[] nums1 = {1, 0, 7, 0, 5};
        int[] nums2 = {0, 0, 4, 9, 2, 0};
        int[] expectedResult = {1, 7, 5, 4, 9, 2};
        int[] result = Main.join(nums1, nums2);

        Assertions.assertArrayEquals(expectedResult, result);
    }



/*----------------------------------------------------------------------------------------------------------------------
Task 4 :
Create a method that takes one integer array, and then splits it into two arrays, one with odd
numbers and the other with even numbers.

Note that the input array can be null or empty, and the sizes can be different You need to return a 2D array,
which is an array and each element is a 1D array, such as
int[][] numss = new int[2][]; where numss[0] can be {1,2,3} and numss[1] can be {4,5,6}
e.g.: {5, 1, 0, 6, 2, 1, 7, 8, 8} -> {5, 1, 1, 7} {0, 6, 2, 8, 8}
*/

}
