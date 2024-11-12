import java.util.*;
import java.io.*;

public class Project_Sadik_Karout
{
   public static void main(String[] args) throws IOException
   {
      try{
      
         int policyNum, age, totalSmokers = 0, totalNonSmokers = 0;
         double height, weight, bmi; 
         String providerName, firstName, lastName, smoker;
         
         ArrayList<Policy> policyList = new ArrayList<>();
         
         Scanner policyFile = new Scanner(new File("PolicyInformation.txt"));
         
         while(policyFile.hasNext())
         {
               policyNum = policyFile.nextInt();
               policyFile.nextLine();
               providerName = policyFile.nextLine();
               firstName = policyFile.nextLine();
               lastName = policyFile.nextLine();
               age = policyFile.nextInt();
               policyFile.nextLine();
               smoker = policyFile.nextLine();
               height = policyFile.nextDouble();
               policyFile.nextLine();
               weight = policyFile.nextDouble();
               
               if(policyFile.hasNext())
               {
                  policyFile.nextLine();
                  policyFile.nextLine();
               }
   
               
               Policy p = new Policy(policyNum, providerName, firstName, lastName, age, smoker, height, weight);
               
               policyList.add(p);
         }
         
         policyFile.close();
            
         //Policy insure = new Policy(policyNum, providerName, firstName, lastName, age, smoker, height, weight);
         for(int i=0; i < policyList.size(); i++)
         {   
            System.out.println("Policy Number: " + policyList.get(i).getPolicyNum());
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policyList.get(i).getAge()); 
            System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getSmoker());
            System.out.println("Policyholder's Height: " + policyList.get(i).getHeight());
            System.out.println("Policyholder's Weight: " + policyList.get(i).getWeight());
            System.out.printf("Policyholder's BMI: %.2f", policyList.get(i).getBmi());
            System.out.printf("\nPolicy Price: $%.2f", policyList.get(i).calcTotal());
            System.out.println("\n");
            if(policyList.get(i).getSmoker().equalsIgnoreCase("smoker"))
            {
              totalSmokers ++; 
            }
            else
            {
               totalNonSmokers ++;
            } 
            
         }
         
         System.out.println("The total number of smokers is: " + totalSmokers);
         System.out.println("The total number of non smokers is: " + totalNonSmokers);
         
      }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

      
   }
}