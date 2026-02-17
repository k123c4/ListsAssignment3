public class Song{

private String title;
private String artist;
private double length;

//constructor
    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

//setters and getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public String toString() {
        return "Title: " + title +
                "\nArtist: " + artist +
                "\nLength: " + length + " minutes";
    }
}