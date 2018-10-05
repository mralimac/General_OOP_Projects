package mediaLibrary;

import java.util.Comparator;

public class MediaCompartor implements Comparator<Media>
{
	public int compare(Media media1, Media media2)
	{
		return media1.getName().compareTo(media2.getName());
	}
}
