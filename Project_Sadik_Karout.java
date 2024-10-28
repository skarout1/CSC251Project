import java.util.Scanner;

public class Project_Sadik_Karout
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
            
      System.out.print("Please enter the Policy Number: ");
         int policyNum = scan.nextInt();
         scan.nextLine();
      System.out.print("Please enter the Provider Name: ");
         String providerName = scan.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
         String firstName = scan.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
         String lastName = scan.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
         int age = scan.nextInt();
         scan.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         String smoker = scan.nextLine();
         scan.nextLine();
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
         double height = scan.nextDouble();
         scan.nextLine();
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
         double weight = scan.nextDouble();
         System.out.println();
         
      Policy insure = new Policy(policyNum, providerName, firstName, lastName, age, smoker, height, weight);
            
      System.out.println("Policy Number: " + insure.getPolicyNum());
      System.out.println("Provider Name: " + insure.getProviderName());
      System.out.println("Policyholder’s First Name: " + insure.getFirstName());
      System.out.println("Policyholder’s Last Name: " + insure.getLastName());
      System.out.println("Policyholder’s Age: " + insure.getAge()); 
      System.out.println("Policyholder’s Smoking Status: " + insure.getSmoker());
      System.out.println("Policyholder’s Height: " + insure.getHeight());
      System.out.println("Policyholder’s Weight: " + insure.getWeight());
      System.out.printf("Policyholder’s BMI: %.2f", insure.getBmi());
      System.out.printf("\nPolicy Price: $%.2f", insure.calcTotal());
   }
}