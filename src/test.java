public class test {
    public static void main (String [] args){
        AList playlist = new AList();
        playlist.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        playlist.addy(new Song("Viva La Vida", "Coldplay", 4.02));
        playlist.addy(new Song("Bohemian Rhapsody", "Queen", 5.55));
        playlist.addy(new Song("HUMBLE.", "Kendrick Lamar", 2.57));
        playlist.addy(new Song("Blinding Lights", "The Weeknd", 3.20));

        System.out.println("---- Initial Playlist ----");
        System.out.println(playlist);

        playlist.removy(4);

        playlist.addy(new Song("Lose Yourself", "Eminem", 5.26));

        System.out.println("\n---- After Adding More Songs ----");
        System.out.println(playlist);

    }
}
