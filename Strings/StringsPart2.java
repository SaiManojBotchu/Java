public class StringsPart2 {
  public static void main(String[] args) {
    String str1 = "JAVA";
    String str2 = "programming";

    // 1. toLowerCase()
    System.out.println("1) str1.toLowerCase() -- " + str1.toLowerCase());
    // 2. toUpperCase()
    System.out.println("2) str2.toUpperCase() -- " + str2.toUpperCase());

    // 3. concat
    System.out.println("3) str1.concat(str2) -- " + str1.concat(str2));
    System.out.println("3) str1 + str2 -- " + str1 + str2);

    // 4. startsWith
    System.out.println("4) str1 startsWith JA -- " + str1.startsWith("JA"));
    System.out.println("4) str1 startsWith A after offset 1 -- " + str1.startsWith("A", 1));
    // 5. endsWith
    System.out.println("5) str1 endsWith VA -- " + str1.endsWith("VA"));

    // 6. join
    String joinedStr = String.join(" ", str1, str2);
    System.out.println("6) joinedStr -- " + joinedStr);
    String[] arr = { "A", "B", "C" };
    String joinedArr = String.join("$", arr);
    System.out.println("6) joinedArr -- " + joinedArr);

    // 7. intern
    String str3 = new String("xyz");
    String str4 = new String("xyz");
    // str1 and str2 doesn't share the same memory pool
    System.out.println("7) str3 == str4 -- " + (str3 == str4));
    // using the intern() method
    // now both str1 and str2 share the same memory pool
    str3 = str3.intern();
    str4 = str4.intern();
    System.out.println("7) after intern, str3 == str4 -- " + (str3 == str4));

    // 8. valueOf - converts to String value
    System.out.println("8) valueOf interest -- " + String.valueOf(923.234d)); // convert double to string
    char[] charArray = {'A', 'B', 'C', 'D', 'E'};
    System.out.println("8) String.valueOf(charArray) -- " + String.valueOf(charArray)); 

    // 9. matches
    // a regex pattern for
    // four letter string that starts with 'J' and end with 'a'
    String regex = "^J..a$";
    System.out.println("9) Java matches regex -- " + "Java".matches(regex));

  }
}

/*

1) str1.toLowerCase()
2) str2.toUpperCase()
3) str1.concat(str2)
3) str1 + str2
4) str1.startsWith("JA")
5) str1.endsWith("VA")
6) String.join(" ", str1, str2);
6) String.join("$", arr);
7) str3.intern()
8) String.valueOf(923.234d)
8) String.valueOf(charArray)
9) "Java".matches(regex)

*/
