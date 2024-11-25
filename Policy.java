/**
   This program is a class to store and return the data for each imdividual policy  
*/
public class Policy{
   
   private String providerName;
   private int policyNum;
   
   public Policy(){
      policyNum = 0;
      providerName = ""; 
   }
   public Policy(String pNum, int pN){
      providerName = pNum;
      policyNum = pN;
   }
   /**
      Method getProviderName gets an returns the prvider name from the document
      @return provider name  
   */
   public String getProviderName(){
      return providerName;
   }
   /**
      Method getPolicyNum gets an returns the policy number from the document
      @return policy number
   */
   public int getPolicyNum(){
      return policyNum;}
      
   public String toString(){
      return   "Policy Number: " + policyNum +
               "Provider Name: " + providerName;
               //PolicyHolder.toString();
   }
}