

public class test {
    public static void main(String[] args) {
        AList aList = new AList();
        aList.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));

        System.out.println("---- Initial Playlist Array based list ----");
        System.out.println(aList);

        aList.removy(0);

        aList.addy(new Song("Lose Yourself", "Eminem", 5.26));

        System.out.println("\n---- After Adding More Songs ----");
        System.out.println(aList);

        //GenSLList Testing
        SLList slList = new SLList();

        slList.addy(new Song("Rainy days", "Wave to earth", 3.20));
        slList.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));

        System.out.println("---- Initial Playlist Singly linked list----");
        System.out.println(slList);

        slList.removy(1);

        System.out.println("---- After Removing Index 1 ----");
        System.out.println(slList);

        //DLList testing
        DLList dlList = new DLList();
        dlList.addy(new Song("Bohemian Rhapsody", "Queen", 5.55));
        dlList.addy(new Song("HUMBLE.", "Kendrick Lamar", 2.57));
        dlList.addy(new Song("Blinding Lights", "The Weeknd", 3.20));

        System.out.println("---- Initial List Doubly linked list----");
        System.out.println(dlList);

        dlList.removy(2);
        System.out.println("---- After Removing Index 2 ----");
        System.out.println(dlList);

// GENERIC TESTING
        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("EL Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 4.00);

        // Swap this one line between GenAList<>(), GenSLList<>(), GenDLList<>()
        GenSLList<Song> songsList = new GenSLList<>();

        System.out.println(songsList.toString()); // Empty List

        songsList.addy(song1);
        songsList.addy(song3);
        songsList.addy(song2);
        songsList.addy(song1);

        System.out.println(songsList.toString());

        songsList.removy(1); // removes element at index 1

        System.out.println(songsList.toString());
    }
}