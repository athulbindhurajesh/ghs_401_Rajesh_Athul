import javax.swing.JOptionPane;
public class goat
{
    public static void main()
    {
       int Num =Integer.parseInt(JOptionPane.showInputDialog("Give me an integer between 10 and 20 inclusive."));
       int[] a = new int [Num];
       int r = 0;
       int j = 10;
       int k = 100;
       while(Num < 10 || Num > 100)
       {
           Num =Integer.parseInt(JOptionPane.showInputDialog("No fo real though. Give me an integer between 10 and 20 inclusive."));
       }
       for(int i = 0; i < Num ; i++)
       {
           r = (int) ((Math.random()*(100-10+1))+10);
           a[i] = r;
       }
       for(int i = 0; i < Num ; i++)
       {
           System.out.print(a[i] + " ");
       }
       for (int i = 0; i < Num; i++)
       {
            if (a[i] > j )
           {
               j = a[i];
           }
           if (a[i] < k)
           {
               k = a[i];
           }
       }
      System.out.println("\n" + "The greatest is " + j + " and the smallest is " + k );
    }
}
