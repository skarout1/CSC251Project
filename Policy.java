/**
   This program is a class to store and return the data for each imdividual policy  
*/
public class Policy{
   
   private String providerName;
   private int policyNum;
   private static int policyObjects = 0;
   private PolicyHolder policyHolder;
   
   public Policy(){
      policyNum = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
   }

   public Policy(String providerName, int policyNum, PolicyHolder policyHolder){
      this.providerName = providerName;
      this.policyNum = policyNum;
      this.policyHolder = new PolicyHolder(policyHolder);
      policyObjects++;
   }
   
   public Policy(Policy obj){
      providerName = obj.providerName;
      policyNum = obj.policyNum;
      policyHolder = new PolicyHolder(obj.policyHolder);
   }
   /**
      Method getProviderName gets an returns the prvider name from the document
      @return provider name  
   */
   public PolicyHolder getPolicyHolder(){
      return policyHolder;
   }
   public String getProviderName(){
      return providerName;
   }
   /**
      Method getPolicyNum gets an returns the policy number from the document
      @return policy number
   */
   public int getPolicyNum(){
      return policyNum;}
   public static int getPolicyObjects(){
      return policyObjects;
   }
      
   public String toString(){
      return   "\n\tPolicy Number: " + policyNum +
               "\n\tProvider Name: " + providerName +
               policyHolder.toString();
   }
}