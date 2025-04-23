package academy.javapro.lab10;

public class Lab10 {

    /**
     * Exercise 1: Factorial
     * Returns the factorial of n (n!)
     *
     * @param n - A positive integer
     * @return The factorial of n
     */
    public static int factorial(int n) {
      
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
     
    

    /**
     * Exercise 2: Counting Ears
     * Counts the total number of ears for n rabbits
     *
     * @param n - Number of rabbits
     * @return Total number of ears
     */
    public static int countEars(int n) {
  
     
            if (n == 0) {
                return 0;
            }
            return 2 + countEars(n - 1);
        }
    
      
    

    /**
     * Exercise 3: Fibonacci Sequence
     * Returns the nth Fibonacci number
     *
     * @param n - Position in the sequence (0-indexed)
     * @return The nth Fibonacci number
     */
    public static int fibonacci(int n) {
   
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
       
      

    // Level 2: Recursive Number Processing

    /**
     * Exercise 4: Special Ear Count
     * Counts ears with a special pattern: odd-numbered rabbits have 2 ears,
     * even-numbered rabbits have 3 ears
     *
     * @param n - Number of rabbits
     * @return Total number of ears
     */
    public static int specialEars(int n) {
       
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 1) { // odd rabbit
            return 2 + specialEars(n - 1);
        } else { // even rabbit
            return 3 + specialEars(n - 1);
        }
    }

    

    /**
     * Exercise 5: Triangle Blocks
     * Calculates the total number of blocks in a triangle with n rows
     *
     * @param n - Number of rows
     * @return Total number of blocks
     */
    public static int triangleBlocks(int n) {
       
        if (n == 0) {
            return 0;
        }
        return n + triangleBlocks(n - 1);
    }

    /**
     * Exercise 6: Digital Sum
     * Calculates the sum of all digits in a non-negative integer
     *
     * @param n - A non-negative integer
     * @return Sum of all digits
     */
    public static int sumDigits(int n) {
 
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumDigits(n / 10);
    }


    // Level 3: Digit Counting Recursively

    /**
     * Exercise 7: Counting Sevens
     * Counts occurrences of the digit 7 in a number
     *
     * @param n - A non-negative integer
     * @return Count of digit 7
     */
    public static int countSevens(int n) {
       
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + countSevens(n / 10);
        }
        return countSevens(n / 10);
    }


    /**
     * Exercise 8: Complex Digit Counting
     * Counts occurrences of 8 with special rule: an 8 with another 8 to its left counts double
     *
     * @param n - A non-negative integer
     * @return Weighted count of digit 8
     */
    public static int countEights(int n) {
    
        if (n == 0) {
            return 0;
        }
        int rightDigit = n % 10;
        int secondRightDigit = (n / 10) % 10;
        
        if (rightDigit == 8 && secondRightDigit == 8) {
            return 2 + countEights(n / 10);
        } else if (rightDigit == 8) {
            return 1 + countEights(n / 10);
        } else {
            return countEights(n / 10);
        }
    }
     

    // Level 4: String Recursion Basics

    /**
     * Exercise 9: Substring Counting
     * Counts occurrences of "hi" in a string
     *
     * @param str - Input string
     * @return Count of "hi" occurrences
     */
    public static int countHi(String str) {
   
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }


    /**
     * Exercise 10: Character Replacement
     * Replaces all 'x' with 'y' in a string
     *
     * @param str - Input string
     * @return String with 'x' replaced by 'y'
     */
    public static String replaceChar(String str) {
      

        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return "y" + replaceChar(str.substring(1));
        }
        return str.charAt(0) + replaceChar(str.substring(1));
    

    /**
     * Exercise 11: Character Removal
     * Removes all occurrences of 'x' from a string
     *
     * @param str - Input string
     * @return String with 'x' removed
     */
    public static String removeChar(String str) {
     
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return removeChar(str.substring(1));
        }
        return str.charAt(0) + removeChar(str.substring(1));
    }


    // Level 5: Advanced String Recursion

    /**
     * Exercise 12: Adjacent Character Marking
     * Places '*' between identical adjacent characters
     *
     * @param str - Input string
     * @return String with '*' between identical adjacent chars
     */
    public static String markPairs(String str) {
     
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + markPairs(str.substring(1));
        }
        return str.charAt(0) + markPairs(str.substring(1));
    }


    /**
     * Exercise 13: String Deduplication
     * Removes duplicate adjacent characters
     *
     * @param str - Input string
     * @return String with duplicates removed
     */
    public static String deduplicate(String str) {
   
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return deduplicate(str.substring(1));
        }
        return str.charAt(0) + deduplicate(str.substring(1));
    }

    // Level 6: Complex Recursive Problems

    /**
     * Exercise 14: Conditional Substring Counting
     * Counts "hi" occurrences, but not when preceded by 'x'
     *
     * @param str - Input string
     * @return Count of valid "hi" occurrences
     */
    public static int countHiSpecial(String str) {
     
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHiSpecial(str.substring(2));
        }
        if (str.length() >= 3 && str.charAt(0) == 'x' && str.startsWith("hi", 1)) {
            return countHiSpecial(str.substring(3));
        }
        return countHiSpecial(str.substring(1));
    }

    /**
     * Exercise 15: Substring with Boundaries
     * Finds length of largest substring that starts and ends with a given substring
     *
     * @param str - Input string
     * @param sub - Substring to look for
     * @return Length of largest substring
     */
    public static int substringLength(String str, String sub) {
       

     
        if (str.length() < sub.length()) {
            return 0;
        }
        boolean startsWith = str.startsWith(sub);
        boolean endsWith = str.endsWith(sub);
        
        if (startsWith && endsWith) {
            return str.length();
        }
        
        int removeFirst = substringLength(str.substring(1), sub);
        int removeLast = substringLength(str.substring(0, str.length() - 1), sub);
        
        return Math.max(removeFirst, removeLast);
    }

    /**
     * Bonus Challenge: Tower of Hanoi
     * Solves the Tower of Hanoi puzzle with n disks
     *
     * @param n         - Number of disks
     * @param source    - Source peg
     * @param auxiliary - Auxiliary peg
     * @param target    - Target peg
     */
    public static void towerOfHanoi(int n, char source, char auxiliary, char target) {
      
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        towerOfHanoi(n - 1, source, target, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, auxiliary, source, target);
    }
    // Main method with test cases
    public static void main(String[] args) {
        // Test factorial
        System.out.println("Testing factorial:");
        System.out.println(factorial(1));  // 1
        System.out.println(factorial(2));  // 2
        System.out.println(factorial(3));  // 6

        // Test countEars
        System.out.println("\nTesting countEars:");
        System.out.println(countEars(0));  // 0
        System.out.println(countEars(1));  // 2
        System.out.println(countEars(2));  // 4

        // Test fibonacci
        System.out.println("\nTesting fibonacci:");
        System.out.println(fibonacci(0));  // 0
        System.out.println(fibonacci(1));  // 1
        System.out.println(fibonacci(2));  // 1
        System.out.println(fibonacci(3));  // 2
        System.out.println(fibonacci(4));  // 3
        System.out.println(fibonacci(5));  // 5

        // Test specialEars
        System.out.println("\nTesting specialEars:");
        System.out.println(specialEars(0));  // 0
        System.out.println(specialEars(1));  // 2
        System.out.println(specialEars(2));  // 5
        System.out.println(specialEars(3));  // 7

        // Test triangleBlocks
        System.out.println("\nTesting triangleBlocks:");
        System.out.println(triangleBlocks(0));  // 0
        System.out.println(triangleBlocks(1));  // 1
        System.out.println(triangleBlocks(2));  // 3
        System.out.println(triangleBlocks(3));  // 6

        // Test sumDigits
        System.out.println("\nTesting sumDigits:");
        System.out.println(sumDigits(126));  // 9 (1+2+6)
        System.out.println(sumDigits(49));   // 13 (4+9)
        System.out.println(sumDigits(12));   // 3 (1+2)

        // Test countSevens
        System.out.println("\nTesting countSevens:");
        System.out.println(countSevens(717));  // 2
        System.out.println(countSevens(7));    // 1
        System.out.println(countSevens(123));  // 0

        // Test countEights
        System.out.println("\nTesting countEights:");
        System.out.println(countEights(8));     // 1
        System.out.println(countEights(818));   // 2
        System.out.println(countEights(8818));  // 4 (second 8 counts double)

        // Test countHi
        System.out.println("\nTesting countHi:");
        System.out.println(countHi("xxhixx"));   // 1
        System.out.println(countHi("xhixhix"));  // 2
        System.out.println(countHi("hi"));       // 1

        // Test replaceChar
        System.out.println("\nTesting replaceChar:");
        System.out.println(replaceChar("codex"));   // "codey"
        System.out.println(replaceChar("xxhixx"));  // "yyhiyy"
        System.out.println(replaceChar("xhixhix")); // "yhiyhiy"

        // Test removeChar
        System.out.println("\nTesting removeChar:");
        System.out.println(removeChar("xaxb"));  // "ab"
        System.out.println(removeChar("abc"));   // "abc"
        System.out.println(removeChar("xx"));    // ""

        // Test markPairs
        System.out.println("\nTesting markPairs:");
        System.out.println(markPairs("hello"));  // "hel*lo"
        System.out.println(markPairs("xxyy"));   // "x*xy*y"
        System.out.println(markPairs("aaaa"));   // "a*a*a*a"

        // Test deduplicate
        System.out.println("\nTesting deduplicate:");
        System.out.println(deduplicate("yyzzza"));  // "yza"
        System.out.println(deduplicate("abbbcdd")); // "abcd"
        System.out.println(deduplicate("Hello"));   // "Helo"

        // Test countHiSpecial
        System.out.println("\nTesting countHiSpecial:");
        System.out.println(countHiSpecial("ahixhi"));  // 1
        System.out.println(countHiSpecial("ahibhi"));  // 2
        System.out.println(countHiSpecial("xhixhi"));  // 0

        // Test substringLength
        System.out.println("\nTesting substringLength:");
        System.out.println(substringLength("catcowcat", "cat"));     // 9
        System.out.println(substringLength("catcowcat", "cow"));     // 3
        System.out.println(substringLength("cccatcowcatxx", "cat")); // 9

        // Test Tower of Hanoi
        System.out.println("\nTesting Tower of Hanoi (3 disks):");
        towerOfHanoi(3, 'A', 'B', 'C');
    }
}
