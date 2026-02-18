public class test {
    public static void main (String [] args){
        AList aList = new AList();
        aList.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));

        System.out.println("---- Initial Playlist Array based list ----");
        System.out.println(aList);

        aList.removy(0);

        aList.addy(new Song("Lose Yourself", "Eminem", 5.26));

        System.out.println("\n---- After Adding More Songs ----");
        System.out.println(aList);

        //SLList Testing
        SLList slList = new SLList();

        slList.addy(new Song("Rainy days","Wave to earth",3.20));
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


    }
}
