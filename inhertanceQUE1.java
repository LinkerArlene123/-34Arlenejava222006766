//programs run location details 
class A extends B implements E{
     void country(){
        System.out.println(" Country is RWANDA");
     }
     public void cell(){
        System.out.println(" cell is Mburabuturo");
     }
}
class B extends C{
    void province(){
        System.out.println(" Province is kigali city");
     }
}
class C extends D{
    void district(){
        System.out.println(" district is kicukiro");
     }
}
class D {
    void sector(){
        System.out.println(" sector is Gikondo");
     }
}
interface E{
     void cell();
}

public class inhertanceQUE1 {
    public static void main(String[] args) {
        A var = new A();
        var.country();
        var.province();
        var.district();
        var.sector();
        var.cell();
    }
    
}

/*
 * 
  Output
Country is RWANDA
 Province is kigali city
 district is kicukiro
 sector is Gikondo
 cell is Mburabuturo
 */ 