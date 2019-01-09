import javax.swing.JOptionPane;

public class whileLoops
{
    public static void main()
    {
        int age = Integer.parseInt( JOptionPane.showInputDialog("How old are you?")); 
        while(age < 0 || age > 120)
        {
            age =Integer.parseInt( JOptionPane.showInputDialog("That is crazy. I'm laughing too. Now, for real though, How old are you?"));
        }
        System.out.println("Thank You");
    }
}
