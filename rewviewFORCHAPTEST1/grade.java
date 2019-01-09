import javax.swing.JOptionPane;
public class grade
{
   public static void main()
   {
       int g =Integer.parseInt(JOptionPane.showInputDialog("What's your grade?"));
       while(g < 0 || g > 100)
       {
           g =Integer.parseInt(JOptionPane.showInputDialog("No. What's your actual grade?"));
       }
       if(g <= 59)
       {
           System.out.println("You have an f. git gud");
       }
        else if (g <= 69)
       {
           System.out.println("You have a D");
       }
        else if (g <=79)
       {
           System.out.println("You have a c");
       }
         else if (g <= 89)
       {
           System.out.println("You have a b");
       }
        else if (g <= 100)
       {
           System.out.println("You have an A");
       }
   }
}
