public class Adder {
    // add is method name
    public static int add(int num1,int num2){
    return num1+num2;
    }
}
//public class main {

    public static void main(String[]args){
        Adder myadder = new Adder();
        //is classname and object name=new class name
        //int number1=5;
        //int number2=10;
        int result= myadder.add(5,3);
        //is object.methods
        System.out.println("Result is "+ result);
    }
//}
    

