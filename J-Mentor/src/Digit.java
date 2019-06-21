import java.lang.reflect.Array;
import java.util.Scanner;

public class Digit {
    public static int a;
    public static int b;

    public static void main(String[] args) {
        for (;;) {
            System.out.println("арабские или римские цифры?");
            String romOrArabe = new Scanner(System.in).next();
            if (romOrArabe.equals("Арабские") || romOrArabe.equals("арабские")
                    || romOrArabe.equals("первое")|| romOrArabe.equals("1")){
                try {
                    System.out.println("Ввести операцию для счета,в формате \'a + b\' со всеми пробелами");
                    String compute = new Scanner(System.in).nextLine();

                    String operation = String.valueOf(compute.charAt(2));
                    String operationStrin = operation.equals("+") ? "cложения" :
                            operation.equals("-") ? "вычитания" :
                                    operation.equals("*") ? "произведения" :
                                            operation.equals("/") ? "деления" : "";
                    if (!(operation.equals("+")|| operation.equals("-")|| operation.equals("*")|| operation.equals("/"))){
                        System.out.println("Такой операции не существует");
                        break;
                    }

                    int a = Integer.parseInt(String.valueOf(compute.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(compute.charAt(4)));
                    RomanDigit digit = new RomanDigit(operation, a, b);
                    System.out.println("Результат " + operationStrin + ":" + digit.getResult());
                }
                catch (NumberFormatException e){
                    System.out.println("1)Арабские,а не римские" +
                            "\n2)Результат не должен превышать 10,введите числа меньше");
                }
                }

            else if (romOrArabe.equals("римские") || romOrArabe.equals("Римские")
                    || romOrArabe.equals("второе")|| romOrArabe.equals("2")) {
                try {
                    System.out.println("Ввести операцию в виде:\n\'a\n *\n b\'");
                    String romDigitStringOne = new Scanner(System.in).nextLine();
                    String operationRom = new Scanner(System.in).nextLine();
                    String romDigitStringTwo = new Scanner(System.in).nextLine();

                    try {
                        RomanDigit romanDigit = new RomanDigit(operationRom,romDigitStringOne,romDigitStringTwo);
                        System.out.println("Результат:" + romanDigit.getRomanResult());
                    }
                    catch (MyException e){

                        System.out.println(e.getMessage());
                        break;
                    }




                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("1)Римские,а не арабские" +
                            "\n2)Результат не должен превышать 10,введите числа меньше");
                }

            }
        }
    }
}
