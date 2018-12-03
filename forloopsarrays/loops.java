
public class loops
{
  
  public static void side()
  {
       String[] names = new String [4];
       int[] age = new int [4];
       
       age[0]=16;
       age[1]=13;
       age[2]=41;
       age[3]=41;
       names[0] = "athul" ;
       names[1]="Ahalya";
       names[2]="mom";
       names[3]="dad";
       
       
       
       for (int i=0;i<names.length;i++)
       {
         System.out.println(age[i] + "" + names[i]); 
       }
  }
}
