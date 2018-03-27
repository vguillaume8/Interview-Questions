public class amountRepresentation{
   
    //int[] sinval = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static String[] sin = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        public static String englishrep(int amount) {
            

             int[] hundval = new int[]{0, 100, 200, 300, 400, 500, 600, 700, 800, 900};
 String[] hunds = new String[]{"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
 int[] tensval = new int[]{0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
    String[] tenss = new String[]{"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            // 878
           
            int temp;
            int value;
            String rep = "";
            // Hundreds place
            if(amount / 100 > 0) {
                 
                temp = amount / 100;
                value = hundval[temp];
                //System.out.println(temp);
                rep = rep + " " + hunds[temp];
            
                amount = amount - value;
           }
        
            // Tens Place
             if(amount / 10 > 0) {
                temp = amount / 10;
                System.out.println(amount);
                value = tensval[temp];
                rep = rep + " " + tenss[temp];
              //  System.out.println(rep);
                amount = amount - value;
            }
            // Single
            
               rep = rep + " "  + sin[amount];

        
            return rep;
        }
        public static void main(String[] args) {
                int number = 878;
                System.out.println(englishrep(223));
                System.out.println(213 % 10);
        }
 
}

