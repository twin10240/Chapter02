public class SongTest {
	public static void main(String[] args) {
		Song song = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		
//		song.setArtist("아이유");
//		song.setTitle("좋은날");
//		song.setAlbum("Real");
//		song.setYear(2010);
//		song.setTrack(3);
//		song.setComposer("이민수");
		
		song.show();
		
		Song song2 = new Song("혁오", "TOMBOY");
		song2.show();
	}

}
