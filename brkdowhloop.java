public class brkdowhloop {
    public static void main(String[] args) {  
          
        int num=5;  
        //do-while loop  
        do{  
            if(num>6){  
               //using break statement  
               num++;  
               break;//it will break the loop  
            }  
            System.out.println(num);  
            num++;  
        }while(num<=10);  
    }  
}
