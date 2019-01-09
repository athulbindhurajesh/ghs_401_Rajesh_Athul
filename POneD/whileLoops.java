
import javax.swing.JOptionPane;
public class whileLoops
{
    public static void whileLoops()
    {
       int rand = 0;
       for (int i=1; i<11; i++)
       {
           int range = (i*i)-i;
           rand = (int)(Math.random()*((i*i)-i) + i);
           System.out.println(i+"\t"+(i*i)+"\t" + rand);
       }
    }
}
