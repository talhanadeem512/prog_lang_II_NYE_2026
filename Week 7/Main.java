interface Message {
    void greet();
}

public class Main {

    static void printGreeting() {
        Message msg = new Message() {
            @Override
            public void greet() {
                System.out.println("Hello from the inner world!");
            }
        };
        msg.greet();
    }

    public static void main(String[] args) {
        printGreeting();
    }
}