
public class HolidayCharacter
{
    private String Char;
    private int pG; 
    private boolean nice;
    public HolidayCharacter()
    {
        this.Char = null;
        this.pG  =    0;
        this.nice =false;
    }
    public HolidayCharacter(String Char ,  boolean nice , int age)
    {
        this.Char = Char;
        this.pG  =  pG;
        this.nice = nice;
    }
    public String toString()
    {
        
       String type =  "He is " + this.Char + "\nIt is " + this.nice + " that he has cheer \nHe has given "+ this.pG + " presents"; 
       return type;
    }
}
