/**
   This program is a class to store and return the data for each imdividual policy  
*/
public class Policy{
   private int policyNum, age;
   private double height, weight, bmi; 
   private String providerName, firstName, lastName, smoker;
   
   public Policy(){
      policyNum = 0; age = 0;
      height = 0; weight = 0; bmi = 0; 
      providerName = ""; firstName = ""; lastName = ""; smoker = "";
   }
   public Policy(int pN, String pNum, String fN, String lN, int a, String s, double h, double w){
      policyNum =pN;
      providerName = pNum;
      firstName = fN;
      lastName = lN;
      age = a;
      smoker = s;
      height = h;
      weight = w;
   }

   /**
      Method getPolicyNum gets an returns the policy number from the document
      @return policy number
   */
   public int getPolicyNum(){
      return policyNum;}
   /**
      Method getProviderName gets an returns the prvider name from the document
      @return provider name  
   */
   public String getProviderName(){
      return providerName;}
   /**
      Method getFirstName gets an returns the first name of the policy holder from the document
      @return first name of policy holder
   */
   public String getFirstName(){
      return firstName;}
   /**
      Method getLastName gets an returns the Last name of the policy holder from the document
      @return last name of policy holder
   */
   public String getLastName(){
      return lastName;}
   /**
      Method getAge gets an returns the Last age of the policy holder from the document
      @return age of policy holder
   */
   public int getAge(){
      return age;}
   /**
      Method getSmoker gets as well as checks and returns the smoking status of the policy holder from the document
      @param checks the smoking status of the policy holder
      @return smoking status of policy holder
   */
   public String getSmoker(){
      if(smoker.equalsIgnoreCase("smoker")) 
         return "smoker";
      else
         return "non-smoker";}
   /**
      Method getHeight gets an returns the Last height of the policy holder from the document
      @return height of policy holder
   */
   public double getHeight(){
      return height;}
   /**
      Method getWeight gets an returns the Last weight of the policy holder from the document
      @return weight of policy holder
   */
   public double getWeight(){
      return weight;}
   /**
      Method getBmi takes calculates the BMI of the patient given the data from document
      @param calculates the BMI of policy holder
      @return BMI of policy holder
   */
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