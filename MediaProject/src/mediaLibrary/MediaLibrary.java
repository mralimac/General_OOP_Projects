package mediaLibrary;

import java.util.ArrayList;
import java.util.Collections;

public class MediaLibrary {
	ArrayList<Media> mediaArray = new ArrayList<Media>();
	
	public static void main(String[] args) {
		MediaLibrary medLib = new MediaLibrary();
		MediaLibraryTest_w3.acceptanceTest(medLib);
	}
	
	public MediaLibrary()
	{
		
	}
	
	public void addMedia(Media newMedia)
	{
		mediaArray.add(newMedia);
		Collections.sort(mediaArray, new MediaCompartor());
	}
	
	public void printMedia()
	{
		for(int i = 0; i < mediaArray.size(); i++)
		{
			System.out.println("Name: " + mediaArray.get(i).getName());
			System.out.println("Desc: " + mediaArray.get(i).getDesc());
		}		
	}
	
	public Media findMedia(String mName)
	{
		for(int i = 0; i < mediaArray.size(); i++)
		{
			if(mediaArray.get(i).getName().equals(mName))
			{
				return mediaArray.get(i);
			}
		}
		return null;
	}
}
