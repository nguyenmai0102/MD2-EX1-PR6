package rekkei_Academy;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("you weight (in kg): ");
        weight = scanner.nextDouble();

        System.out.println("you height (in meter):" );
        height = scanner.nextDouble();
        bmi = weight/ Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "interpretation\n");
        if (bmi<18){
            System.out.printf("%-20*2f%s", bmi , "Underweight");
        }else if(bmi<25.0){
            System.out.printf("%-20*2f%s", bmi , "Normal");
        }else if (bmi<30.0){
            System.out.printf("%-20*2f%s", bmi , "Overweight");
        }else {
            System.out.printf("%-20*2f%s", bmi , "Obese");
        }
    }
}

