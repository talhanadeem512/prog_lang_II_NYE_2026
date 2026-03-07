class Calculator {
    public static void main(String[] args) {
        String operation = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);
        double result = 0;

        if (operation.equals("add")) {
            result = num1 + num2;
        } 
        else if (operation.equals("subtract")) {
            result = num1 - num2;
        } 
        else if (operation.equals("multiply")) {
            result = num1 * num2;
        } 
        else if (operation.equals("divide")) {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero!");
                return;
            }
            result = num1 / num2;
        } 
        else {
            System.out.println("Unknown operation: " + operation);
            return;
        }
        System.out.println("Result: " + result);
    }
}