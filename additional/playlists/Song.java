package additional.playlists;



import java.io.Serializable;



public class Song implements Serializable {

    private String artist;
    private String title;
    private String genre;
    private String mood;
    private int lenght;


    public Song(String artist, String title, String genre, String mood, int lenght) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
        this.mood = mood;
        this.lenght = lenght;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }


}
