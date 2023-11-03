public class compoundinterest {
    public static double given(double principal,double rate,int time){
    
         double monthlyRate = rate / 12 / 100; 
       int totalMonths = time * 12; 
        double totalAmountPaid = principal * Math.pow(1 + monthlyRate, totalMonths);
        return totalAmountPaid;
    }


    
    
    public static void main(String[] args) {
        
compoundinterest loan=new compoundinterest();
        double p = 500000.0;  // Initial loan amount in Rwandan Francs (RWF)
        double R = 18.0;  // Annual interest rate in percent
        int t = 3;  // Number of years
 double result=loan.given(p,R,t);

 System.out.println("the compound interst of Mrbob is"+result);
    }

    }
    

