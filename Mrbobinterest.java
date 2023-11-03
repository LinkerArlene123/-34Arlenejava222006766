public class Mrbobinterest {
    public static double data(int principal,double rate,int time)
    {
        return(principal*(rate/100)*time);
    }
    public static void main(String[]args){
        Mrbobinterest gain=new Mrbobinterest();
        int p=100000;
        double r=5;
        int t=5;
        double result=gain.data(p,r,t);
        System.out.println("the simple interst of Mrbob is"+result);

    }
    
}
