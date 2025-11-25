

/* Complete methods: copyFrontAndBack and maxWordLength. 
 * DO NOT MODIFY THE MAIN METHOD!
 *
 *Array task: Complete the method copyFrontAndBack. 
 *
 * This method:
 *  -takes in an array of integers that will have a length of at least 1. 
 *  -If the original array was length 2 or more, return a new array of 
 *  length 2 that contains the first and last elements from the original 
 *  array. 
 *  -If the original array was length 1, return an array of length 2 where both 
 *  elements are equal to the contents of the original array
 * 
 * An example of this method working is included in the main method
 * 
 * 
 *Split task: Complete the method maxWordLength
 * 
 * This method:
 *  -takes in a sentence stored in a String  
 *  -returns the length of the longest word in that String
 *  
 * Remember that you can use .length() to find the length of a word
 * 
 * An example of this method working is included in the main method
 * 
 * 
 * 
 * 
 * 
*/

import java.util.*;

public class App {
    public static void main(String[] args)  {

        //copyFrontAndBack example
        System.out.println("With input [1, 2, 3], you should get: [1, 3]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3})));
        System.out.println("With input [1, 2, 3, 4], you should get: [1, 4]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{1,2,3,4})));
        System.out.println("With input [7], you should get: [7, 7]. You got: " + Arrays.toString(copyFrontAndBack(new int[]{7})));
        
        //wordLength example
        System.out.println("With input \"Java is fun\" you should return 4. You got: " + maxWordLength("Java is fun"));
        System.out.println("With input \"Java is scary\" you should return 5. You got: " + maxWordLength("Java is scary"));
        System.out.println("With input \"I can do this\" you should return 4. You got: " + maxWordLength("I can do this"));
    }

    public static int[] copyFrontAndBack(int[] nums){
        if (nums.length > 2) {
            int[] numbers = new int[2];
            numbers[0] = nums[0];
            numbers[1] = nums[nums.length-1];
            return numbers;
        } else {
            int[] numbers = new int[2];
            numbers[0] = nums[0];
            numbers[1] = nums[0];
            return numbers;
        }
        
        //this is a placeholder

    }

    public static int maxWordLength(String sentence){
        int count = 0;
        String[] parts = sentence.split(" ");
           
        
         for (String i : parts ) {
            if (sentence.length() > count) {
                count++;}
         }
            // instead of printing the value of the longest word (as it says in the prompt) it prints out the amount of words in the input.
            // how can i fix it?
       
        return count; //this is a placeholder
    }



}
