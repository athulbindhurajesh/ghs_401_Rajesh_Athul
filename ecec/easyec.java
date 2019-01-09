import javax.swing.JOptionPane;
public class easyec
{
    public static void main()
    {
        /*The Index*/
        int fiblength = Integer.parseInt(JOptionPane.showInputDialog("How many fibonacci number do you need?"));
        int fibNum[] = new int[fiblength];
        int fibEnd[] = new int [fiblength];
        int fibTotal[] = new int [fiblength];
        int fibNew = 1;
        int fibOld = 0;
        int fibFin = 0;
        System.out.println("Index FibSequence Total");
        for (int i = 1; i<fiblength; i++)
        {
            fibNum[i]= i;
            fibFin = fibNew + fibOld;
            fibEnd[i]=fibFin;
            fibTotal[i] = fibEnd[i]+fibTotal[i-1];
            System.out.println(fibNum[i] + "\t" + fibEnd[i-1] + "\t" + fibTotal[i-1]);
            fibNew = fibOld;
            fibOld = fibFin;
            
        }
        
         System.out.println(fiblength + "\t" + fibEnd[fiblength-1] + "\t" + fibTotal[fiblength-1]);
        
    }
}
