package com.headfirstjava.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBoxV1 {

	// store song titles in array list of strings
	ArrayList<String> songsList = new ArrayList<String>();
	
	public static void main(String[] args) {
		JukeBoxV1 jukebox = new JukeBoxV1();
		jukebox.go();
	}
	
	// load the file and print the contents in songList ArrayList
	public void go() {
		getSongs();
		System.out.println(songsList);
		Collections.sort(songsList);
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
		songsList.add(tokens[0]);
	}

}
