import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    library.AddAlbum(new Album("C", "Bob", 6, 307));
    library.AddAlbum(new Album("B", "Sallie", 8, 893));
    library.AddAlbum(new Album("A", "Link", 7, 440));

    library.SortByArtist();

    System.out.println(library.GetAlbumByArtistFromSorted("Link"));
  }
}