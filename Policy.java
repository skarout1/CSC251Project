/**
   This program is a class to store and return the data for each imdividual policy  
*/
public class Policy{
   
   private String providerName;
   
   public Policy(){
      providerName = ""; 
   }
   public Policy(String pNum){
      providerName = pNum;
      
   }
   /**
      Method getProviderName gets an returns the prvider name from the document
      @return provider name  
   */
   public String getProviderName(){
      return providerName;}
      public double getBmi(){
      return ((weight*703) / (height * height));}
   /**
      Method getAgeFee gets the age fee for the policy holder if necessary
      @param determines if the age of the policy holder is high enough to warrent a fee
      @returns necessary age fee
   */
   public double getAgeFee(){
      if(getAge() > 50)
         return 75;
      else
         return 0;}
   /**
      Method getSmokerFee determines and returns the necessary fee if the policy holder is a smoker
      @param determines the necessary fee if smoker or not
      @returns necessary smoking fee
   */
   public double getSmokerFee(){
      if(getSmoker().equalsIgnoreCase("smoker")) 
         return 100;
      else
         return 0;}
   /**
      Method getBmiFee determines and returns the necessary fee based on the BMI of the policy holder
      @param determines the necessary fee if the BMI is high enough
      @returns necessary BMI fee
   */
   public double getBmiFee(){
      if(getBmi() > 35)
         return ((getBmi() - 35) * 20);
      else
         return 0;}
   /**
      Method calcTotal calulates the total amount due for the given policy 
      @param calculates the total amount due for a policy
      @retun the total fees
   */
   public double calcTotal(){
      return (600 + getBmiFee() + getSmokerFee() + getAgeFee()); 
      }     
}