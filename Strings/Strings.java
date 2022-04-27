import java.util.Arrays;

public class Strings {
  public static void main(String[] args) {
    String s = "Java is a language"; // new String("Java is a language");

    // 1. charAt
    System.out.println("1) s.charAt(0) -- " + s.charAt(0));

    // 2. toCharArray() - converts to char array
    char[] charArray;
    charArray = s.toCharArray();
    System.out.println("2) charArray[0] -- " + charArray[0]);

    // 3. length()
    System.out.println("3) s.length() -- " + s.length());

    // 4. isEmpty()
    System.out.println("4) s.isEmpty() -- " + s.isEmpty());

    // 5. copy one string to other
    String s1 = new String(s);
    System.out.println("5) s1 -- " + s1);

    // 6. compareTo
    String s2 = "java is a language";
    System.out.println("6) s.compareTo(s2) -- " + s.compareTo(s2));
    // 7. compareToIgnoreCase
    System.out.println("7) s.compareToIgnoreCase(s2) -- " + s.compareToIgnoreCase(s2));

    // 8. contains
    System.out.println("8) s.contains -- " + s.contains("Java"));

    // 9. equals
    System.out.println("9) s.equals(s2) -- " + s.equals(s2));
    // 10. equalsIgnoreCase
    System.out.println("10) s.equalsIgnoreCase(s2) -- " + s.equalsIgnoreCase(s2));

    // 11. indexOf
    System.out.println("11) index of a in s -- " + s.indexOf('a'));
    System.out.println("11) index of a in s fromIndex 4 -- " + s.indexOf('a', 4));

    // 12. split()
    String[] result = s.split(" ");
    System.out.println("12) s.split() -- " + Arrays.toString(result));
    result = s.split(" ", 2);
    System.out.println("12) s.split() with limit -- " + Arrays.toString(result));

    // 13. replace
    System.out.println("13) s.replace -- " + s.replace('a', 'z'));
    System.out.println("13) s.replace -- " + s.replace("av", "$$"));
    // 14. replaceAll
    String s3 = "Java123is456fun";
    String regex = "\\d+"; // regex for sequence of digits
    System.out.println("14) s3 -- " + s3.replaceAll(regex, " "));

    // 15. subSequence or substring
    System.out.println("15) s.substring(10) -- " + s.substring(10));
    System.out.println("15) s.substring(10,15) -- " + s.substring(10, 15));
    System.out.println("15) s.subSequence(10,15) -- " + s.subSequence(10, 15));

    // 16. trim() - removes leading andd trailing whitespaces
    String s4 = "     sai   manoj   kumar    botchu     ";
    System.out.println("16) s4.trim() -- " + s4.trim());
    System.out.println("16) s4.replaceAll() -- " + s4.replaceAll("\\s", "")); // removes all whitespaces
  }
}


/*

1) s.charAt(0)
2) s.toCharArray()
3) s.length()
4) s.isEmpty()
5) String s1 = new String(s)
6) s.compareTo(s2)
7) s.compareToIgnoreCase(s2)
8) s.contains("Java")
9) s.equals(s2)
10) s.equalsIgnoreCase(s2)
11) s.indexOf('a')
12) s.split(" ")
12) s.split(" ", 2);
13) s.replace('a', 'z')
14) s3.replaceAll(regex, " ")
15) s.substring(10)
15) s.substring(10, 15)
15) s.subSequence(10, 15)
16) s4.trim()

*/
