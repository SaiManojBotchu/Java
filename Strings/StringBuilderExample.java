public class StringBuilderExample {
  public static void main(String[] args) {

    // 1. StringBuilder constructor
    StringBuilder str = new StringBuilder("Sai");
    System.out.println("1) str  -- " + str);
    // 2. capacity - returns the capacity of the string
    System.out.println("2) str capacity -- " + str.capacity());
    StringBuilder str1 = new StringBuilder(); // initial capacity 16
    System.out.println("2) str1 capacity -- " + str1.capacity());
    StringBuilder str2 = new StringBuilder(10);
    System.out.println("2) str2 capacity -- " + str2.capacity());
    System.out.println();

    // 3. charAt
    System.out.println("3) str.charAt(0) -- " + str.charAt(0));

    // 4. length()
    System.out.println("4) str.length() -- " + str.length());

    // 5. toString()
    System.out.println("5) str.toString() -- " + str.toString());
    System.out.println();

    // 6. append() - appends the string representation of the X type argument to
    // the sequence.
    System.out.println("6) str -- " + str.append(" Manoj"));
    System.out.println("6) str1 -- " + str1.append('A'));
    char[] charArray = { 'G', 'E', 'E', 'K', 'S' };
    System.out.println("6) str1 -- " + str1.append(charArray));
    System.out.println("6) str1 -- " + str1.append(charArray, 1, 2));
    System.out.println("6) str1 -- " + str1.append(10));
    System.out.println("6) str1 -- " + str1.append(12.36));
    System.out.println("6) str1 -- " + str1.append(1.2f));
    System.out.println("6) str1 -- " + str1.append(182L));
    System.out.println("6) str1 -- " + str1.append(true));
    System.out.println();

    // 7. insert
    System.out.println("7) insert -- " + str.insert(1, " HELLO "));

    // 8. delete
    System.out.println("8) str.delete(1,8) -- " + str.delete(1, 7));
    System.out.println("8) str.deleteCharAt(2) -- " + str.deleteCharAt(1));

    // 9. setCharAt
    str.setCharAt(2, 'I');
    System.out.println("9) str -- " + str);

    // 10. setLength - This method sets the length of the character sequence.
    str.setLength(7);
    System.out.println("10) str -- " + str);
    System.out.println();

    // 11. replace - replaces the characters in a substring of this sequence with
    // characters in the specified String.
    System.out.println("11) str.replace -- " + str.replace(0, 3, "Iron"));

    // 12. reverse
    System.out.println("12) str.reverse() -- " + str.reverse());

    // 13. subSequence - need both start and end Index
    System.out.println("13) subSequence -- " + str.subSequence(0, 3));

    // 14. substring
    System.out.println("14) strsubstring(0) = " + str.substring(0));
    System.out.println("14) str.substring(0,2) = " + str.substring(0, 2));
    System.out.println();

    // 15. indexOf()
    System.out.println("15) str.indexOf M -- " + str.indexOf("M"));
    System.out.println("15) str.indexOf M fromIndex 5 -- " + str.indexOf("M", 5));

    // 16. lastIndexOf
    System.out.println("16) str.lastIndexOf n -- " + str.lastIndexOf("n"));
    // get index of last occurrence of substring till 5th position of original
    // String
    System.out.println("16) str.lastIndexOf n fromIndex 5 -- " + str.lastIndexOf("n", 3));
    System.out.println();

    // 17. appendCodePoint() - appends respective Ascii character to the sequence
    System.out.println("17) str2.appendCodePoint(65) -- " + str2.appendCodePoint(65));
    // 17. codePointAt - to get the Ascii value of a character
    System.out.println("17) str2.codePointAt(0) -- " + str2.codePointAt(0));
    // 17. codePointBefore - to get the Ascii value of before character
    System.out.println("17) str2.codePointBefore(1) -- " + str2.codePointBefore(1));

    // 18. getchars - stores the chars from begin to end in the given array from
    // startIndex
    char[] array = new char[7];
    str1.getChars(0, 7, array, 0);
    System.out.println("18) array -- " + String.valueOf(array));

    // 19. trimToSize - removes unused capacity(reduces storage)
    System.out.println("19) str capacity before trim -- " + str.capacity());
    str.trimToSize();
    System.out.println("19) str capacity after trim -- " + str.capacity());

  }
}

/*
 * 1) new StringBuilder()
 * 2) str.capacity()
 * 3) str.charAt(0)
 * 4) str.length()
 * 5) str.toString()
 * 6) str.append("Manoj")
 * 7) str.insert(1, "HELLO")
 * 8) str.delete(1, 7)
 * 9) str.deleteCharAt(1)
 * 10) str.setLength(7)
 * 11) str.replace(0, 3, "Iron")
 * 12) str.reverse()
 * 13) str.subSequence(0, 3)
 * 14) str.substring(0)
 * 14) str.substring(0, 2)
 * 15) str.indexOf("M")
 * 15) str.indexOf("M", 5)
 * 16) str.lastIndexOf("n")
 * 16) str.lastIndexOf("n", 3)
 * 17) str2.appendCodePoint(65)
 * 17) str2.codePointAt(0)
 * 17) str2.codePointBefore(1)
 * 18) str1.getChars(0, 7, array, 0);
 * 19) str.trimToSize();
 */
