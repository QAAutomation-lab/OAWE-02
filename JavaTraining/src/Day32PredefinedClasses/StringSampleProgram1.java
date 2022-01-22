package Day32PredefinedClasses;

public class StringSampleProgram1
{
    public static void main (String[] args)
    {
    	/**
    	 * inside string class following methods are overrided
    	 *  toString()---> gives ------------>fullyqualifiedclassname@hexadecimaladdress 
    	 *  		  ---> overrided behaiour-> gives object value
    	 *  equals()--> compare two objects based on there address
    	 *  		--> compared two objects based on object values
    	 */
        String s1= "CoreJavaBasics";
                  // or 
        //String s1= new String ("CoreJavaBasics");
  
        // Returns the number of characters in the String.
        System.out.println("String length = " + s1.length());//14 -->0-13
  
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "+ s1.charAt(2));
  
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring from index 3:" + s1.substring(3));//eJavaBasics
        // Returns the substring from i to j-1 index.
        System.out.println("Substring from 2 to 5: " + s1.substring(2,5));//reJ
        System.out.println("Substring from 4 to 8: " + s1.substring(4,8));//Java
        // Concatenates string2 to the end of string1.
        String s2 = "Core";
        String s3 = "JavaBasic";
        System.out.println("First value of s2: "+s2);//Core
        System.out.println("First value of s3: "+s3);//JavaBasic
        System.out.println("Concatenated string  = "+s2.concat(s3));//CoreJavaBasic
        System.out.println("after Concatenated value of s2: "+s2);//Core
        System.out.println("after Concatenated value of s3: "+s3);//JavaBasic

        
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s5 = "Learn Share Learn Share";
        System.out.println("s5 size: "+s5.length());
        System.out.println("Index of 'Share' starts from: " + s5.indexOf("Share"));
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s5.indexOf('a',3));
        System.out.println("Index of e = " + s5.indexOf('e',11));
        
        System.out.println("last Index of 'Learn'  = " + s5.lastIndexOf("Learn",18));
        System.out.println("last Index of e = " + s5.lastIndexOf('e',11));
        
        
 
        // Checking equality of Strings
        String s6="Selenium";
        String s7="selenium";
        String s8="Selenium";
        System.out.println("Checking Equality of s6 & s7: " + s6.equals(s7));//false
        System.out.println("Checking Equality of s6 & s8: " + s6.equals(s8));//true
        System.out.println("Checking Equality of s6 & s7 with Ignore case: " + s6.equalsIgnoreCase(s7));//true
        System.out.println(s6==s7);//false
        System.out.println(s6==s8);//true
        // Converting cases
        String word1 = "CoreJava";
        System.out.println("Changing to lower Case " +word1.toLowerCase());//corejava
  
        // Converting cases
        String word2 = "CoreJava";
        System.out.println("Changing to UPPER Case " + word2.toUpperCase());//COREJAVA
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word:" + word4.trim());//Learn Share Learn
  
        // Replacing characters
        String str1 = "CoreJavaBasic";
        System.out.println("Original String: " + str1);//CoreJavaBasic
        String str2 = str1.replace('a' ,'x') ;
        System.out.println("Replaced a with x -> " + str2);//CoreJxvxBxsic
       
        String str3=str1.replace("Java", "Net");
        System.out.println("Replaced 'Java' with 'Net' -> " + str3);//CoreNetBasic
        
        String str4=str1.replaceFirst("a", "W");
        System.out.println("Replaced first 'a' with 'W' -> " + str4);//CoreJWvaBasic
        String str5=" ";
        System.out.println("str5 is empty or not: "+str5.isEmpty()); 
    } 
}

/**
 * String: 
 * 	reverse String---> 1. using iteration 2. using recursive method
 *  Palindrome string --> ANA, NAYAN, KARAN
 *  Anagram ---> Brag --- Grab
 *  Duplicate char count
 *  Print unique char
 *  Duplicate word count ---> 
 *  Print unique word--> 
 *  Print char, number, special symbol count----> I am from pune, lives in Dhanori 411015. A-1#1003
 */


