

public class object
{
        //this is a class called hamburger
        //we can make as many hamburger instances from this classes. 
        //instance variables
        private boolean hasCheese;
        private int numPatties;
        private String cheeseType;
        //zero arguement constructor
        //this runs every time a zero arg hamburger is made
        // always named public classname
        public object()
        {
            this.hasCheese=true;
            this.numPatties= 4;
            this.cheeseType= null;
        }
        public String toString()
        {
            String output="Has Lettuce:"+ this.hasCheese+"\n"+ this.numPatties+"\n"+this.cheeseType;
            return output;
        }
        public object(boolean hasCheese, int numPatties, String cheeseType)
        {
            this.hasCheese = hasCheese;
            this.numPatties = numPatties;
            this.cheeseType= cheeseType;
        }
}

