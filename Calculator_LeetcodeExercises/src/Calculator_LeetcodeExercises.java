import org.w3c.dom.Node;

import java.util.*;

public class Calculator_LeetcodeExercises {

    public static void main(String[] args) {

        Calculator_LeetcodeExercises calculator = new Calculator_LeetcodeExercises(); // create a new calculator object
        //     System.out.println("Resultatet er: " + calculator.CalculateTwoNum());


        // Leetcode exercises
       /* int[] nums = {1, 2, 3, 4};
        int[] result = calculator.runningSum(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(calculator.maximumWealth(accounts));

        List<String> result2 = calculator.fizzBuzz(15);
        for (int i = 0; i < result2.size(); i++) {
            System.out.println(result2.get(i));
        }

        System.out.println(calculator.numberOfSteps(14));

        System.out.println(calculator.isPalindrome(121));

        System.out.println(calculator.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));

        System.out.println(calculator.lengthOfLastWord("Hello World"));

        int[] digits = {9, 9, 9};
        int[] result3 = calculator.plusOne(digits);
        for (int i = 0; i < result3.length; i++) {
            System.out.println(result3[i]);
        }

        System.out.println(calculator.climbStairs(4));

        int[] nums = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(calculator.singleNumber(nums));

        System.out.println(solution("abc", "bc"));


        System.out.println(digitize(5));


        Object[] haystack = {"kadkd", "needle", "ldld"};
        System.out.println(findNeedle(haystack));


        System.out.println(abbrevName("Kristina Cortsen"));


        System.out.println(fakeBinSolution2("2347863"));


        System.out.println(getCount("skdourjs"));


        int[] nums = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(findIt(nums));


        int[] date = {10, 2, 2023};
        System.out.println(toDayOfYear(date));


        int[] nums = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(solve(nums));


        int[] numbers = {1, 2, 3};
        System.out.println(sum3(numbers));


        String inputString = "hello";
        Map<Character, Integer> result = Calculator_LeetcodeExercises.countCharacters(inputString);
        System.out.println(result);

     */

        System.out.println(isValid("({{{{}}}))"));

    }


    public int CalculateTwoNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast et tal: ");
        int num1 = scanner.nextInt();
        System.out.print("Indtast en operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Indtast endnu et tal: ");
        int num2 = scanner.nextInt();
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }


    // two sum - Leetcode
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; // create a new array with the length of 2
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            num1 = nums[i]; // set num1 to the value of the current index
            for (int j = 0; j < nums.length; j++) {
                num2 = nums[j]; // set num2 to the value of the current index
                if (num1 + num2 == target) { // if num1 + num2 is equal to target
                    if (i != j) { // if i is not equal to j
                        result[0] = i; // set the first element in the array to i
                        result[1] = j; // set the second element in the array to j

                    }
                }
            }
        }
        return result;
    }


    // running sum of 1d array - Leetcode
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }


    // maximum wealth - Leetcode
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) { // loop through the rows
            sum = 0; // reset sum
            for (int j = 0; j < accounts[i].length; j++) { // loop through the columns
                sum += accounts[i][j]; // add the value of the current column to sum
            }
            if (sum > maxWealth) { // if sum is greater than maxWealth
                maxWealth = sum; // set maxWealth to sum
            }
        }
        return maxWealth;
    }


    // shuffle the array - Leetcode
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i < n + 1; i++) {
            if (i % 15 == 0) { // if i is divisible by 3 and 5
                result.add("FizzBuzz");
            } else if (i % 5 == 0) { // if i is divisible by 5
                result.add("Buzz");
            } else if (i % 3 == 0) { // if i is divisible by 3
                result.add("Fizz");
            } else { // if i is not divisible by 3 or 5
                result.add(Integer.toString(i)); // convert int to string and add it to the list
            }
        }
        return result;
    }


    // number of steps to reduce a number to zero - Leetcode
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) { // if num is even
                steps++;
                num = num / 2; // divide num by 2
            } else { // if num is odd
                steps++;
                num = num - 1; // subtract 1 from num
            }
        }
        return steps;
    }


    // reverse string - Leetcode
   /* public class ListNode {
        int val; // value of the node
        ListNode next; // pointer to the next node

        ListNode() { // default constructor
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }*/

    class Leetcode {
        public ListNode middleNode(ListNode head) {

            ListNode current = head; // set current to head
            int count = 0; // count the number of nodes

            while (current != null) { // while current is not null (while current is not the last node)
                count++; // increment count
                current = current.next; // set current to the next node in the list
            }

            current = head; // set current to head
            for (int i = 0; i < count / 2; i++) { // loop through the list until the middle node
                current = current.next; // set current to the next node in the list
            }
            return current; // return the middle node
        }
    }


    // palindrome number - Leetcode
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x); // convert int to string
        StringBuilder numReversed = new StringBuilder(); // create a new stringbuilder

        numReversed.append(num); // add num to numReversed
        numReversed.reverse(); // reverse numReversed

        if (num.equals(numReversed.toString())) { // if num is equal to numReversed
            return true;
        }
        return false;
    }


    /* public String longestCommonPrefix(String[] strs) {
         String prefix = "";
         int count = 0; // count the number of characters in the prefix
         for (int i = 0; i < strs.length; i++) { // loop through the array
             if (strs[i].charAt(count) == strs[i + 1].charAt(count)) {  // if the character at the current index is equal to the character at the next index
                 prefix += strs[i].charAt(count); // add the character to prefix
                 count++;
             }
         }
         return prefix;
     }*/
    // longest common prefix - Leetcode
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs); // sort the array
        String first = strs[0]; // set first to the first element in the array
        String last = strs[strs.length - 1]; // set last to the last element in the array
        int count = 0; // count the number of characters in the prefix
        for (int i = 0; i < first.length(); i++) { // loop through the characters in first
            if (first.charAt(i) == last.charAt(i)) { // if the character at the current index in first is equal to the character at the current index in last
                count++;
            } else { // if the characters are not equal
                break;
            }
        }
        return first.substring(0, count); // return the substring of first from index 0 to count
    }


    /* public int lengthOfLastWord(String s) {
        int wordLength = 0; // wordLength of the last word
        String[] words = s.split(" "); // split the string into an array of words separated by a space character


        if (words.length == 0) { // if the string is empty
            return 0;
        }
        return words[words.length - 1].length(); // return the length of the last word
    }*/

    // length of last word - Leetcode
    public int lengthOfLastWord(String s) {
        int wordLength = 0; // wordLength of the last word

        String improvedS = s.trim(); // remove whitespace from the beginning and end of the string

        for (int i = 0; i < improvedS.length(); i++) { // loop through the string
            if (improvedS.charAt(i) == ' ') { // if the character at the current index is a space
                wordLength = 0; // reset wordLength
            } else { // if the character at the current index is not a space
                wordLength++; // increment wordLength
            }
        }
        return wordLength;
    }


    // plus one - Leetcode
    public int[] plusOne(int[] digits) {
        int length = digits.length; // length of the array

        for (int i = digits.length - 1; i >= 0; i--) { // loop through the array backwards
            if (digits[i] < 9) { // if the value of the current index is less than 9 (if the array is {1, 2, 3} the value of the current index is 3)
                digits[i]++; // increment the value of the current index by 1 (if the array is {1, 2, 3} the value of the current index is 4)
                return digits; // return the array
            } else {
                digits[i] = 0; // set the value of the current index to 0
            }
        }
        int[] newArray = new int[length + 1]; // create a new array with the length of the original array + 1 (if the array is {9, 9, 9} the new array will be {1, 0, 0, 0})
        newArray[0] = 1; // set the first element in the new array to 1 (if the array is {9, 9, 9} the new array will be {1, 0, 0, 0})

        return newArray;
    }


    public int climbStairs(int n) {
        if (n == 1) {
            return 1; // if n is 1 return 1
        }
        if (n == 2) { // if n is 2 return 2
            return 2;
        }
        int[] steps = new int[n]; // create steps new array with the length of n
        steps[0] = 1; // set the first element in the array to 1
        steps[1] = 2; // set the second element in the array to 2

        for (int i = 2; i < n; i++) { // loop through the array
            steps[i] = steps[i - 1] + steps[i - 2]; // For trin 3: steps[3] = steps[2] + steps[1]. Dette betyder, at antallet af måder at nå trin 3 er lig med antallet af måder at nå trin 2 plus antallet af måder at nå trin 1.
        }
        return steps[n - 1]; // return the last element in the array (if the array is {1, 2, 3} the last element is 3)
    }
    // The Fibonacci sequence is a sequence of numbers where each number is the sum of the two previous numbers.
    // The first two numbers of the Fibonacci sequence are 0 and 1.
    // The nth number of the sequence is the sum of the (n-1)th and (n-2)th numbers.


    // single number - Leetcode
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) { // loop through the array
            result ^= nums[i]; // XOR the result with the value of the current index in the array (if the array is {1, 2, 3} the value of the current index is 3)
        }
        return result;
    }
    // XOR is a bitwise operator that returns 1 if both bits are different and 0 if both bits are the same. For example, 1 XOR 1 = 0 and 1 XOR 0 = 1.


    /* CodeWars
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument
    (also a string).*/
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static boolean solution2(String str, String ending) {
        if (str.length() < ending.length()) {
            return false;
        }
        for (int i = 0; i < ending.length(); i++) {
            if (str.charAt(str.length() - ending.length() + i) != ending.charAt(i)) {  // The i is added to this index to move through the characters from right to left, comparing them one by one.
                return false;
            }
        }
        return true;
    }


    public static String even_or_odd(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }


    public static int[] digitize(long n) {
        int[] newArray = new int[Long.toString(n).length()];
        for (int i = 0; i < n; i++) {
            newArray[i] = (int) n;

            int[] result = new int[Long.toString(n).length()];
            long j = n;
            for (int k = 0; k < n; k++) {
                result[(int) (j - 1)] = newArray[i];
                j = j - 1;
            }
        }

        return newArray;
    }


    /*
        In this Kata, you will be given a string that has lowercase letters and numbers.
        Your task is to compare the number groupings and return the largest number.
        Numbers will not have leading zeros.
    */
    public static int solve(String s) {
        String[] numbers = s.split("\\D+");
        int maxNumber = Integer.MIN_VALUE;

        for (String numberStr : numbers) {
            if (!numberStr.isEmpty()) {
                int currentNumber = Integer.parseInt(numberStr);
                maxNumber = Math.max(maxNumber, currentNumber);
            }
        }
        return maxNumber;
    }


    // Reverse String
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    public static String findNeedle(Object[] haystack) {
        int result = Arrays.asList(haystack).indexOf("needle");

        return "found the needle at position " + result;
    }


    public static String abbrevName(String name) {
        char first = name.charAt(0);
        char last = 0;
        String[] parts = name.split(" ");
        if (parts.length > 1) {
            char letterAfterSpace = parts[1].charAt(0);
            last = letterAfterSpace;
            name = first + "." + last;
        }
        return name.toUpperCase();
    }


    public static String fakeBinSolution1(String numberString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            char digit = numberString.charAt(i);
            int numericValue = Character.getNumericValue(digit);
            if (numericValue < 5) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }


    public static String fakeBinSolution2(String numberString) {

        return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");
    }


    public static int getCount(String str) {
        int numberOfVowels = 0;
        String str2 = str.trim();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u') {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }


    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int oddInt = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    oddInt++;
                }
            }
            if (oddInt % 2 == 1)
                oddInt++;
            return a[i];
        }
        return -1;
    }


    /*The year can be evenly divided by 4;
    If the year can be evenly divided by 100, it is NOT a leap year, unless;
    The year is also evenly divisible by 400. Then it is a leap year.*/
    public static int toDayOfYear(int[] date) {
        int day = date[0];
        int month = date[1];
        int year = date[2];

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29;
        }

        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        return dayOfYear;
    }


    public static int[] solve(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> checkedNums = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!checkedNums.contains(arr[i])) {
                checkedNums.add(arr[i]);
                result.add(arr[i]);
            }
        }
        Collections.reverse(result);

        int[] newArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newArray[i] = result.get(i);

        }
        return newArray;
    }


    public int[] twoSumSolution2(int[] nums, int target) {

        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int element = target - nums[i];
            if (result.containsKey(element)) {
                return new int[]{result.get(element), i};
            }
            result.put(nums[i], i);

        }
        return new int[0];
    }


    public static int mostFrequentItemCount(int[] collection) {
        if (collection == null || collection.length == 0) {
            return 0;
        }
        int mostFrequentItem = collection[0];
        int maxCount = 0;
        for (int i = 0; i < collection.length; i++) {
            int currentItem = collection[i];
            int currentCount = 1;
            for (int j = i + 1; j < collection.length; j++) {
                if (currentItem == collection[j]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                mostFrequentItem = currentItem;
                maxCount = currentCount;
            }
        }
        return maxCount;
    }


    // Given an array of ints length 3, return the sum of all the elements.
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }


    // Example: mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String aValue = map.get("a");

            map.put("b", aValue);
            map.put("a", "");
        }
        return map;
    }


    // Example: topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }


    // Example: word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], 0);
        }
        return result;
    }

    // Example: wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String s : strings) {
            result.put(s, s.length());
        }
        return result;
    }


    // Example: pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            result.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }
        return result;
    }


    // Example: wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String s : strings) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }


    // Example: "hello" -> {'h': 1, 'e': 1, 'l': 2, 'o': 1}
    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        return charCount;
    }


    // Example: firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String firstChar = String.valueOf(s.charAt(0));
            if (result.containsKey(firstChar)) {
                result.put(firstChar, result.get(firstChar) + s);
            } else {
                result.put(firstChar, s);
            }
        }
        return result;
    }


    public static boolean isValid(String s) {
        Stack<Character> karakterer = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                karakterer.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (karakterer.isEmpty()) {
                    return false;
                }
                char top = karakterer.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return karakterer.isEmpty();
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {


    }


    // Reverse LinkedList
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode previous = null;
            ListNode next;

            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;

            return head;
        }
    }


    // Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
    public int firstUniqCharSolution1(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < s.length(); j++) {
            if (map.get(s.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;
    }

    public int firstUniqCharSolution2(String s) {
        int index = -1;
        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return s.indexOf(ch);
            }
        }
        return index;
    }


    // Given an array nums of size n, return the majority element.
    // The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    public int majorityElement(int[] nums) {
        int result = 0;

        int halfNums = nums.length / 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > halfNums) {
                result = n;
            }
        }
        return result;
    }


    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) >= 2) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateSolution2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}




