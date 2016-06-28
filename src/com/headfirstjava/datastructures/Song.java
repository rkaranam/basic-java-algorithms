package com.headfirstjava.datastructures;

public class Song implements Comparable<Song> {
	
	private String title;
	private String artist;
	private String rating;
	private String bpm;
	
	public Song(String title, String artist, String rating, String bpm) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getRating() {
		return rating;
	}
	public String getBpm() {
		return bpm;
	}
	
	@Override
	public String toString() {
		return title + ": " + artist;
	}

	@Override
	public int compareTo(Song o) {
		return title.compareTo(o.title);
	}

}
