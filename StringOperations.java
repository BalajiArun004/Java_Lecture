public class StringOperations {
    public static void main(String[] args) {

        // create a string
        String greet = "Hello! World";
        System.out.println("String: " + greet);

        // get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);

        // create first string
        String first = "Java ";
        System.out.println("First String: " + first);

        // create second
        String second = "Programming";
        System.out.println("Second String: " + second);

        // join two strings
        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        // create 3 strings
        String firstStr = "java programming";
        String secondStr = "java programming";
        String thirdStr = "python programming";

        // compare first and second strings
        boolean result1 = firstStr.equals(secondStr);
        System.out.println("Strings first and second are equal: " + result1);

        // compare first and third strings
        boolean result2 = firstStr.equals(thirdStr);
        System.out.println("Strings first and third are equal: " + result2);

        String text = "Java is a programming language";

        // split string from space
        String[] result = text.split(" ");

        System.out.print("result = ");
        for (String str : result) {
            System.out.print(str + ", ");
        }

        String strToReplace = "java programming";
        strToReplace.replace("programming", strToReplace);

    }
}
