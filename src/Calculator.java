import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter 2nd number :");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        Operations ops = new Operations(num1,num2);
        do
        {
            System.out.println("""
                    Choose your operation :
                    +
                    -
                    *
                    /""");
            choice = scanner.next();
        }
        while(!choice.equals("+")&&!choice.equals("-")&&!choice.equals("*")&&!choice.equals("/"));
        switch (choice) {
            case "+" -> ops.add();
            case "-" -> ops.subtract();
            case "*" -> ops.multiply();
            case "/" -> ops.divide();
        }
        scanner.close();
    }
}
class Operations{
    double num1,num2;
    Operations(double num1,double num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    void add(){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    void subtract(){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    void multiply(){
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    void divide(){
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
}
