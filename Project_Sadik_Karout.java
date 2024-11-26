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
               weight = policyFile.nextDouble();
               
               if(policyFile.hasNext())
               {
                  policyFile.nextLine();
               }
               if(policyFile.hasNext())
               {
                  policyFile.nextLine();
               }
   
               
               Policy p = new Policy(providerName, policyNum, new PolicyHolder(firstName, lastName, age, smoker, height, weight));
               
               policyList.add(p);
         }
         
         policyFile.close();
         Policy policy = new Policy();
            
         //Policy insure = new Policy(policyNum, providerName, firstName, lastName, age, smoker, height, weight);
         for(int i=0; i < policyList.size(); i++)
         {   
            System.out.println(policyList.get(i));
            if(policyList.get(i).getPolicyHolder().getSmoker().equalsIgnoreCase("smoker"))
            {
              totalSmokers ++; 
            }
            else
            {
               totalNonSmokers ++;
            } 
            System.out.println();
         }
         
         System.out.println("There were " + (Policy.getPolicyObjects()) + " Policy objects created");
         System.out.println("The total number of smokers is: " + totalSmokers);
         System.out.println("The total number of non smokers is: " + totalNonSmokers);
         
      }
      
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

      
   }
}