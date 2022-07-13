// Classes Pattern and Matcher.

/*
Character classes
[abc]	a, b, or c (simple class)
[^abc]	Any character except a, b, or c (negation)
[a-zA-Z]	a through z or A through Z, inclusive (range)
[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
[a-z&&[def]]	d, e, or f (intersection)
[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
*/
/* ----------------------------------------------------------
Predefined character classes
.	Any character (may or may not match line terminators)
\d	A digit: [0-9]
\D	A non-digit: [^0-9]
\s	A whitespace character: [ \t\n\x0B\f\r]
\S	A non-whitespace character: [^\s]
\w	A word character: [a-zA-Z_0-9]
\W	A non-word character: [^\w]
*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternMatcher {
   public static void main(String[] args) {
  
    String s = "when an ice creamer screams ice cream i scream ice cream!";
    
    // create regular expression
    //	Pattern expression = Pattern.compile("ice"); // 
	
	Pattern expression = Pattern.compile("s....m"); //  .  :  matches any single character
		
    // match regular expression to string and print matches
    Matcher matcher = expression.matcher(s);
      
    while (matcher.find()) {
       System.out.println(matcher.group());
    }

    /////////////////////////////////////////////////////////////////    
    // Info: If a regular expression will be used more than once, 
    // it’s more efficient to use static Pattern method compile 
    // to create a specific Pattern object for that regular expression. 
 
/*
    Pattern expression2 = Pattern.compile("c."); //  .  :  matches any single character
	
    // match regular expression to string and print matches
    Matcher matcher2 = expression2.matcher(s);
    int count = 0;
    while (matcher2.find()) {
       System.out.println(matcher2.group());
       count ++;
    }
    System.out.println("count: " + count); // 
*/    


    /////////////////////////////////////////////////////////////////
    // Pattern.matches method
    // Info: If a regular expression will be used only once, 
    // static Pattern method matches can be used. 

    System.out.println(Pattern.matches(".b.","abz"));  // true
    
    System.out.println(Pattern.matches("[b]","abz"));  // false
    
    System.out.println(Pattern.matches("...b","abcd"));  // false
    
    System.out.println(Pattern.matches("[bs]","abcd"));  // false
    
    System.out.println(Pattern.matches("[bs]","b"));  // true
    
    System.out.println(Pattern.matches("[azn]+","a"));  // true
    
    System.out.println(Pattern.matches("[azn]+","aaa"));  // true 
    
    System.out.println(Pattern.matches("[azn]*","azzna"));  // true


    System.out.println(Pattern.matches("\\d","1"));  // true
    
    System.out.println(Pattern.matches("\\d","135"));  // false 
    
    System.out.println(Pattern.matches("\\d","132ab"));  // false
   
   } 
}




