public class StringConstructor {
  public static void main(String[] args) {

    // String() empty string constructor
    String s = new String();
    s = new String("Hello World");
    System.out.println(s);

    // String(char[]) constructor
    char chars[] = { 'h', 'e', 'l', 'l', 'o' };
    String s2 = new String(chars);
    System.out.println(s2);

    // String(char chars[ ], int startIndex, int count) constructor
    char chars2[] = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
    String s3 = new String(chars2, 6, 5);
    System.out.println(s3);

    // String(byte byteArr[ ])
    byte byteArr[] = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33 };
    String s4 = new String(byteArr);
    System.out.println(s4);

    // String(byte byteArr[ ], int startIndex, int count)
    String s5 = new String(byteArr, 0, 5);
    System.out.println(s5);
  }
}