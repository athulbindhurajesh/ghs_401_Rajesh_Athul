import javax.swing.JOptionPane;
public class WhereIsMJ
{
   public static void main()
   {
       String school = JOptionPane.showInputDialog("What is your school?");
       String mascot ="";
       while(!mascot.equals("matadors"))
       {
       if (school.equals("granada"))
       {
           mascot = JOptionPane.showInputDialog("What is your mascot?");
         
          
           if (mascot.equals("matadors"))
           {
               System.out.println("Acces granted");
              
               String[]Names={"Michael Jackson","John Denver","Elvis Presley","Halsey","Beatles",null};
               
               
               for (int mj=0; mj<(Names.length); mj++)
               {
                   if (Names[mj] == null)
                   {
                       System.out.println("We did not find him. Element " + mj + " is Empty.");
                   }
                   else if (Names[mj].equals("Michael Jackson"))
                   {
                       System.out.println("We found Him. Element " + mj + " is Michael Jackson");
                   }
                   else
                   {
                       System.out.println("He ain't here. Element " + mj + " is " + Names[mj]);
                   }
               }
               String favArtist = JOptionPane.showInputDialog ("Who is your Fav Artist?");
               if (favArtist.toUpperCase().equals("MICHAEL JACKSON"))
               {
                   System.out.println("Come join me brother");
               }
               else
               {
                   System.out.println("Get gud Scrub");
               }
           }
           else
           {
               System.out.println("Wrong Mascot!!");
           }
       } 
       else
       {
           System.out.println("Wrong School!!");
       }
    }
    }
}

