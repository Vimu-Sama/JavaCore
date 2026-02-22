public class StringBuilderIntro {

    public static void main(String[] args) {

        // Initialization
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // append() → adds string at end
        stringBuilder.append(" World!");
        System.out.println("After append: " + stringBuilder);
        // Output: Hello World!


        // delete(start, end) → deletes characters in range (end exclusive)
        stringBuilder.delete(0, 3);
        System.out.println("After delete(0,3): " + stringBuilder);
        // Output: lo World!


        // charAt(index) → returns character at given index
        System.out.println("Character at index 4: " + stringBuilder.charAt(4));
        // Output: r


        // indexOf(String str) → returns FIRST occurrence index
        int firstIndex = stringBuilder.indexOf("o");
        System.out.println("First index of 'o': " + firstIndex);
        // Output: 1


        // lastIndexOf(String str) → returns LAST occurrence index
        int lastIndex = stringBuilder.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex);
        // Output: 4


        // insert(index, value) → inserts at given index
        stringBuilder.insert(2, "ABC");
        System.out.println("After insert at index 2: " + stringBuilder);
        // Output: loABC World!


        // replace(start, end, str) → replaces characters in range
        stringBuilder.replace(2, 5, "XYZ");
        System.out.println("After replace(2,5,\"XYZ\"): " + stringBuilder);
        // Output: loXYZ World!


        // setCharAt(index, char) → changes character at index
        stringBuilder.setCharAt(0, 'L');
        System.out.println("After setCharAt(0,'L'): " + stringBuilder);
        // Output: LoXYZ World!


        // reverse() → reverses the string
        stringBuilder.reverse();
        System.out.println("After reverse: " + stringBuilder);
        // Output: !dlroW ZYXoL


        // length() → returns length of string
        System.out.println("Length: " + stringBuilder.length());
        // Output: length of string


        // toString() → converts StringBuilder to String
        String normalString = stringBuilder.toString();
        System.out.println("Converted to String: " + normalString);

    }
}