//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JavaVariables{
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 2;
        int intOperandC = 3;
        int intSum = intOperandA + intOperandB + intOperandC;
        int intProduct = intOperandA * intOperandB * intOperandC;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;
        double doubleOperandA = 3.50;
        double doubleOperandB = 6.9;
        double doubleOperandC = 9.3;
        double doubleSum = doubleOperandA + doubleOperandB + doubleOperandC;
        double doubleProduct = doubleOperandA * doubleOperandB * doubleOperandC;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The product of ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The difference of ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product of doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference of doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient of doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The modulo of doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);

    }
}