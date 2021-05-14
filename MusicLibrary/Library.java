class Library
{
  private Album[] albums = new Album[20];
  private int length = 0;

  public boolean AddAlbum(Album album)
  {
    if (length < 20)
    {
      albums[length] = album;
      length++;
      return true;
    }
    
    return false;
  }

  public boolean RemoveAlbum(int index)
  {
    if (length > 0)
    {
      if (albums[index] == null)
        return false;

      for (int i = index; i < 19; i++)
      {
        albums[i] = albums[i+1];
      }

      length--;
      return true;
    }

    return false;
  }

  public Album GetAlbum(int index)
  {
    if (index >= 0 && index < length)
      return albums[index];
    return null;
  }

  public Album GetAlbumByTitle(String title)
  {
    for (int i = 0; i < length; i++)
    {
      if (albums[i].GetTitle().equalsIgnoreCase(title))
        return albums[i];
    }
    return null;
  }

  public Album GetAlbumByArtist(String artist)
  {
    for (int i = 0; i < length; i++)
    {
      if (albums[i].GetArtist().equalsIgnoreCase(artist))
        return albums[i];
    }
    return null;
  }

  public Album GetAlbumByTitleFromSorted(String title)
  {
    int low = 0, high = length-1, middle = (low + high)/2;
  
    while (!albums[middle].GetTitle().equalsIgnoreCase(title) && low <= high)
    {
      if (title.compareToIgnoreCase(albums[middle].GetTitle()) < 0)
        high = middle - 1;
      else
        low = middle + 1;
      middle = (low + high)/2;
    }

    if (albums[middle].GetTitle().equalsIgnoreCase(title))
        return albums[middle];
    else
        return null;
  }

  public Album GetAlbumByArtistFromSorted(String artist)
  {
    int low = 0, high = length-1, middle = (low + high)/2;
  
    while (!albums[middle].GetArtist().equalsIgnoreCase(artist) && low <= high)
    {
      if (artist.compareToIgnoreCase(albums[middle].GetArtist()) < 0)
        high = middle - 1;
      else
        low = middle + 1;
      middle = (low + high)/2;
    }

    if (albums[middle].GetArtist().equalsIgnoreCase(artist))
        return albums[middle];
    else
        return null;
  }

  public int GetCount()
  {
    return length;
  }

  public int GetPlayTime()
  {
    int x = 0;
    for (int i = 0; i < length; i++)
    {
      x += albums[i].GetPlayTime();
    }
    return x;
  }

  // Selection Sort
  public void SortByTitle()
  {
    for (int i = 0; i < length; i++)
    {
      Album temp = albums[i];
      int pos = i;

      for (int j = i; j < length; j++)
      {
        if (temp.GetTitle().compareToIgnoreCase(albums[j].GetTitle()) > 0)
        {
          temp = albums[j];
          pos = j;
        }
      }
      albums[pos] = albums[i];
      albums[i] = temp;
    }
  }

  // Insertion Sort
  public void SortByArtist()
  {
    for (int i = 1; i < length; i++)
    {
      Album key = albums[i];
      int pos = i;

      while (pos > 0 && albums[pos-1].GetArtist().compareToIgnoreCase(key.GetArtist()) > 0)
      {
        albums[pos] = albums[pos-1];
        pos--;
      }

      albums[pos] = key;
    }
  }

  public String toString()
  {
    int time = GetPlayTime();
    return "Albums: " + length + "\nPlay time: " + (time / 60) + ":" + (time % 60);
  }
}