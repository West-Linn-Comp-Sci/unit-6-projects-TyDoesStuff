class Album
{
  private String title;
  private String artist;
  private int length;
  private int playTime; // in seconds

  public Album(String title, String artist, int length, int playTime)
  {
    this.title = title;
    this.artist = artist;
    this.length = length;
    this.playTime = playTime;
  }

  public int GetSongs()
  {
    return length;
  }

  public int GetPlayTime()
  {
    return playTime;
  }

  public String GetTitle()
  {
    return title;
  }

  public String GetArtist()
  {
    return artist;
  }

  public String toString()
  {
    String time = (playTime / 60) + ":" + (playTime % 60);
    return "Title: " + title + "\nArtist: " + artist + "\nPlay time: " + time;
  }
}