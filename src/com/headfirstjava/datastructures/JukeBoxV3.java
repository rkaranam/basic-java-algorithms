package com.headfirstjava.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.headfirstjava.datastructures.Song;

public class JukeBoxV3 {

	// store song titles in array list of strings
	ArrayList<Song> songsList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		JukeBoxV3 jukebox = new JukeBoxV3();
		jukebox.go();
	}
	
	// inner class that implements Comparator
	class ArtistCompare implements Comparator<Song> {

		@Override
		public int compare(Song songOne, Song songTwo) {			
			return songOne.getArtist().compareTo(songTwo.getArtist());
		}
		
	}
	
	// load the file and print the contents in songList ArrayList
	public void go() {
		getSongs();
		System.out.println(songsList);
		Collections.sort(songsList);
		System.out.println(songsList);
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songsList, artistCompare);
		System.out.println(songsList);
	}
	
	// read file and call addSong method for each line
	public void getSongs() {
		
		File file;
		BufferedReader fileReader;
		
		try {
			file = new File(System.getProperty("user.dir") + "/SongList.txt");
			fileReader = new BufferedReader(new FileReader(file));
			
			String line = null;
			while (null != (line = fileReader.readLine())) {
				addSong(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	// break line into two tokens and store song name in array list
	public void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song song = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songsList.add(song);
	}

}
