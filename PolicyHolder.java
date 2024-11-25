public class PolicyHolder{

   private int policyNum, age;
   private double height, weight, bmi; 
   private String firstName, lastName, smoker;
   
   public Policy(){
      policyNum = 0; age = 0;
      height = 0; weight = 0; bmi = 0; 
      firstName = ""; lastName = ""; smoker = "";
   }
   public Policy(int pN, String fN, String lN, int a, String s, double h, double w){
      policyNum =pN;
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
         return smoker;
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

}
