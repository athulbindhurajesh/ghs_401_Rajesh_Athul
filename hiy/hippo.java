import greenfoot.*;  
public class hippo extends Actor
{
    private int speed;
    private  String name;
   
    public hippo()
    {
        this.speed=1;
        this.name= "harry" ;
    }
    public hippo(String n, int s)
    {
        this.speed = s;
        this.name  = n;
    }
    public String toString()
    {
       String str = "Name is : " + name +"\nSpeed is : "+speed+"\nX cor is: " + getX() + "\ny cor is : "+ getY();
       return str;
    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge())
        {
            
            turn((int)((Math.random()*89)+1));
            
        }
        getWorld().showText(toString(),getWorld().getWidth()/2, getWorld().getHeight()/2);
        
    }   
}
