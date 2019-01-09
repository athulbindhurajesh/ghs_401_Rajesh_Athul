
public class Songs
{
      private int cost;
      private String artist;
      private String title;
      private boolean good;
      public Songs() 
      {
          this.cost = 12;
          this.artist = "Rick Astley";
          this.title = "never gonna give you up";
          this.good = true;
      }
      public Songs (int cost, String artist, String title, boolean good){
          this.cost = cost;
          this.artist = artist;
          this.title = title;
          this.good = good;
        }
      public String toString()
      {
          String output = "How much : " +this.cost + "\nArtist: " + this.artist + "\nTitle: " + this.title + "\nGood or Bad: " + this.good + "\nEnd of Constructor\n";
          return output;
      }
}
