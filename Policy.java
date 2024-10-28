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

   public int getPolicyNum(){
      return policyNum;}
   public String getProviderName(){
      return providerName;}
   public String getFirstName(){
      return firstName;}
   public String getLastName(){
      return lastName;}
   public int getAge(){
      return age;}
   public String getSmoker(){
      if(smoker.equalsIgnoreCase("smoker")) 
         return "smoker";
      else
         return "non-smoker";}  
   public double getHeight(){
      return height;}
   public double getWeight(){
      return weight;}
   public double getBmi(){
      return ((weight*703) / (height * height));}
   public double getAgeFee(){
      if(getAge() > 50)
         return 75;
      else
         return 0;}
   public double getSmokerFee(){
      if(getSmoker().equalsIgnoreCase("smoker")) 
         return 100;
      else
         return 0;}
   public double getBmiFee(){
      if(getBmi() > 35)
         return ((getBmi() - 35) * 20);
      else
         return 0;}
   public double calcTotal(){
      return (600 + getBmiFee() + getSmokerFee() + getAgeFee()); 
      }     
}