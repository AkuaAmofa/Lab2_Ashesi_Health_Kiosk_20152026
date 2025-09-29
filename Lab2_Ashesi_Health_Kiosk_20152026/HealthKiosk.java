import java.util.Scanner;
import java.util.Random;

public class HealthKiosk{
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        Random rand = new Random();


        //Task 0
        System.out.ptintln("Welcome To the Ashesi Health Kiosk ")


        //Task 1
        System.out.println("Enter service code (P/L/T/C): ");
        char serviceCode = input.next().toUpperCase().charAt(0);

        String serviceType = "";
        switch (erviceCode){
            case 'P':
                serviceType = "Pharmacy";
                System.out.println("Pharmacy Desk")
                break;
            case 'L':
                serviceType = "Lab";
                System.out.println("Lab Desk")
                break;
            case 'T':
                serviceType = "Triage";
                System.out.println("Triage Desk")
                break;
            case 'C':
                serviceType = "Counseling";
                System.out.println("Counseling Desk")
                break;
            default:
            System.out.println("Invalid service code")

        }


    }
}