public class Intances {

    private static int counterinstance = 0;
    
      public Intances() {
        
            counterinstance++;
        }
    
        public static int getInstanceCount() {
            return counterinstance;
        }
    
            public static void main(String[] args) {
             
                Intances obj1 = new Intances();
                Intances obj2 = new Intances();
                Intances obj3 = new Intances();
                
               
                int counter = Intances.getInstanceCount();
                
                System.out.println("Number of instances: " + counter);
            }
}