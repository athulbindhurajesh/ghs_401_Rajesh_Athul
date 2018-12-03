
public class RandomStuff
{
    public static void age()
    {
        for(int i=0; i<5; i++)
        {
            double age = (int)(Math.random()*8);
            if (age == 8)
            {
            System.out.println((age)+367);
            }
        }
    }
}