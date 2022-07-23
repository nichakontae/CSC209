package RanddomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileLab {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("song.dat","rw");
            Song s1 = new Song(101,"drivers license","Pop",3.20,"Olivia Rodrigo");
            System.out.println(s1.getTitle()+" "+s1.getArtist());
            Song s2 = new Song (102,"Can't Control MySelf","Pop-Rock",4.52,"TAEYEON");
            System.out.println(s2.getTitle()+" "+s2.getArtist());

            raf.writeInt(s1.getId());

            byte[] title = new byte[20];
            title = s1.getTitle().concat("                    ").getBytes(); // make sure empty that is  20 bytes
            raf.write(title,0,20);

            byte[] genre = new byte[10];
            genre = s1.getGenre().concat("          ").getBytes();
            raf.write(genre,0,10);

            raf.writeDouble(s1.getDuration());

            byte[] artist = new byte[20];
            artist = s1.getArtist().concat("                   ").getBytes();
            raf.write(artist,0,20);

            raf.writeInt(s1.getId());
            title = new byte[20];
            title = s2.getTitle().concat("                    ").getBytes(); // make sure empty that is  20 bytes
            raf.write(title,0,20);
            genre = new byte[10];
            genre = s2.getGenre().concat("          ").getBytes();
            raf.write(genre,0,10);
            raf.writeDouble(s2.getDuration());
            artist = new byte[20];
            artist = s2.getArtist().concat("                   ").getBytes();
            raf.write(artist,0,20);

            System.out.println(raf.getFilePointer());
            raf.seek(4);
            raf.read(title,0,20);
            System.out.println(new String(title));
            //duration of the 1st song is at 4+20+10=34 bytes

            raf.seek(34);
            double songDuration=raf.readDouble();
            System.out.println(songDuration);

            //duration of the 2nd song is at  62 + 34 = 96 bytes
            raf.seek(96);
            songDuration=raf.readDouble();
            System.out.println(songDuration);





        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
//            Logger.getLogger(RandomAccessFileLab.class.getName()).log(Level.SEVERE,null,ex);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
