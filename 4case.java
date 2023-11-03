public class 4case 
{
    public static void main (string args[])
    {
        int Murenzi =3000;
        int Kagabo=2000;
        int Muhire=5000;
        int Gashumba=7300;

        if (Murenzi > Kagabo) 
        {
            System.out.println("Murenzi get more cash than Kagabo");
        }
        else if (Murenzi < Muhire) 
        {
            System.out.println("Muhireget more cash than Murenzi");
        }
        else if (Murenzi == Kagabo) 
        {
            System.out.println("they got the same cash");
        }
        else if (Murenzi  < Gashumba) 
        {
            System.out.println("gashumba got more cash than muhire");
        }
        else 
        {
            System.out.println("they did not paid");
        }
    }
    
}
