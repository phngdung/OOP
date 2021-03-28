package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class DiskTest {

	public static void main(String args[]) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Weathering with you", "Anime", "Shinkai Makoto", 1, 19.95f);
		
		System.out.println(dvd1.search("Weathering You"));
		System.out.println(dvd1.search("The You"));
	}
}
