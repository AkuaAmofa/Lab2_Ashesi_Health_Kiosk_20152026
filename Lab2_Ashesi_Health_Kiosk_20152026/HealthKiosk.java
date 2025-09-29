import java.util.Scanner;
import java.util.Random;

public class HealthKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Task 0
        System.out.println("Welcome To the Ashesi Health Kiosk ");

        // Task 1
        System.out.println("Enter service code (P/L/T/C): ");
        char serviceCode = input.next().toUpperCase().charAt(0);

        String serviceType = "";
        switch (serviceCode) {
            case 'P':
                serviceType = "Pharmacy";
                System.out.println("Pharmacy Desk");
                break;
            case 'L':
                serviceType = "Lab";
                System.out.println("Lab Desk");
                break;
            case 'T':
                serviceType = "Triage";
                System.out.println("Triage Desk");
                break;
            case 'C':
                serviceType = "Counseling";
                System.out.println("Counseling Desk");
                break;
            default:
                System.out.println("Invalid service code");
        }


        //Task 2
        double bmi = 0;
        double finalOptionValue = 0;

        if (serviceCode == 'T') {
            System.out.print("Kindly enter 1 for BMI, 2 for Dosage, 3 for Trig helper ");
            int option = input.nextInt();

            if (option == 1){
                System.out.print("Kindly enter your weight in kg: ");
                double weight = input.nextDouble();
                System.out.print("Kindly enter your height in meters: ");
                double height = input.nextDouble();

                bmi = weight / (height*height);
                double finalBmi = Math.round(bmi * 10) / 10.0;

                System.out.print("BMI: " + finalBmi + "Weight Category: ");
                if (finalBmi < 18.5) System.out.print("Underweight");
                else if (finalBmi < 25) System.out.print("Normal");
                else if (finalBmi < 30) System.out.print("Overweight");
                else System.out.println("Obese");

                finalOptionValue = Math.round(bmi);

            }else if (option == 2){
                System.out.print("Kindly enter the dosage required in mg: ");
                double dosage = input.nextDouble();
                int tablets = (int) Math.ceil(dosage / 250.0);
                System.out.println("Tablets Number: " + tablets);

                finalOptionValue = tablets;
        
            }else if (option == 3){
                System.out.print("Kindly enter an angle in degrees: ");
                double angle = input.nextDouble();
                double radians = Math.toRadians(angle);

                double sinValue = Math.round(Math.sin(radians) * 1000) / 1000.0;
                double cosValue = Math.round(Math.cos(radians) * 1000) / 1000.0;

                System.out.println("sin = " + sinValue + ", cos = " + cosValue);

                finalOptionValue = Math.round(Math.sin(radians) * 100);

            }
            

        }

        //Task 3
        char randomLetter = (char)('A' + rand.nextInt(26));
        String digits = "";
        for (int i = 0; i < 4; i++){
            int a = 3 +rand.nextInt(7);
            digits = digits + a;
        }

        String studentID = randomLetter + digits;

        if (studentID.length() == 5 &&
            Character.isLetter(studentID.charAt(0)) &&
            Character.isDigit(studentID.charAt(1)) &&
            Character.isDigit(studentID.charAt(2)) &&
            Character.isDigit(studentID.charAt(3)) &&
            Character.isDigit(studentID.charAt(4))) {
            System.out.println("ID OK");
        } else {
            System.out.println("Invalid ID");
        }

        //Task 4
        System.out.print("Kindly enter your first name: ");
        String name = input.next();

        char base = Character.toUpperCase(name.charAt(0)); 
        char shifted = (char) ('A' + (base - 'A' + 2) % 26); 

        String lastTwo = studentID.substring(3); 
        String displayCode = shifted + lastTwo + "-" + (int) finalOptionValue;

        System.out.println("Display Code: " + displayCode);

        //Task 5
        if (serviceCode == 'T') {
            double roundedBmi = Math.round(bmi * 10) / 10.0;
            System.out.println(serviceType.toUpperCase() +
                               " | ID=" + studentID +
                               " | BMI=" + roundedBmi +
                               " | Code=" + displayCode);
        } else {
            System.out.println(serviceType.toUpperCase() +
                               " | ID=" + studentID +
                               " | Code=" + displayCode);
        }






        input.close();
    }
}
