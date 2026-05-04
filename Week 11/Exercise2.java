public class Exercise2 {

    public static void processData(String input, int index) {
        if (input == null) {
            throw new NullPointerException("The input string is missing.");
        }

        if (index < 0 || index >= input.length()) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is invalid for this string.");
        }

        System.out.println("Character found: " + input.charAt(index));
    }

    public static void main(String[] args) {
        try {
            processData(null, 2);
        } catch (NullPointerException e) {
            System.out.println("Error 1: You forgot to provide text!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2: You tried to access a position that doesn't exist.");
        }
    }
}