
//programs runs calculations 
class A extends B implements E{
     int addition(){
        int num1=10;
        int num2=20;
        return num1+num2;
     }//addition
     public int multiply(){
        int num1=10;
        int num2=20;
        return num1*num2;
        
     }
}//multiplication
class B extends C{
    int division(){
        int num1=10;
        int num2=20;
        return num1/num2;
     }
}//division
class C extends D{
    void loop(){
   for(int i=1;i<5;i++){
        System.out.println("increment is "+i);
   }
}
}//lopp
class D {
    int substract(){
        int num1=10;
        int num2=20;
        return num1*num2;
        
        
     }
}//substraction
interface E{
     int multiply();
}

public class inhertanceQUE2 {
    public static void main(String[] args) {
        A var = new A();
        System.out.println("addition is :"+var.addition());
        System.out.println("multiplication is :"+var.multiply());
        System.out.println("division is :"+var.division());
       System.out.println ("substraction is :"+var.substract());
        var.loop();
    }
    
}

/*
 * 
  Output
addition is :30
multiplication is :200
division is :0
substraction is :200
increment is 1
increment is 2
increment is 3
increment is 4
 */ 