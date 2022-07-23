package CityRandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Vector;

public class CityRandomAccessFile {
    //what is population of Hanawa?
    public static void main(String[] args) {
        /*"city_ascii" : 150 bytes
        latitude : double
        longitude : double
        country : 50 bytes
        ISO2 : 2 bytes
        ISO3 : 3 bytes
        admin_name : 150 bytes
        capital : 10 bytes
        population : int
        id : ???
        150+8+8+50+2+3+150+10+4=385

        population is at 381th byte from the beginning of the record
        * */
        try{
            RandomAccessFile fPointer = new RandomAccessFile("city.dat","rw");
            byte [] city = new byte[150]; // city
            fPointer.read(city,0,150);
            System.out.println(new String(city));


            fPointer.seek(381);
            int population =fPointer.readInt();
            System.out.println(population);

            boolean notFound = true;
            int record = 0;

            while(notFound) {
//            while(fPointer.getFilePointer() < fPointer.length()){
                fPointer.seek(record*385);
                fPointer.read(city,0,150);
//                System.out.println(new String(city));
                String c = new String(city);
                c = c.trim(); // remove empty space before and after the String out
                if(c.equalsIgnoreCase("Hanawa")){
                    System.out.println("Hanawa is at the record number "+record+".");
                    fPointer.seek(record*385+381);
                    System.out.println("Ther population of Hanawa is "+fPointer.readInt()+".");
                    notFound=false;
                    //what is world population?
                    //show two cities that have the same name;
                    //how many pairs of cities have the same name

                }

                record++;

            }
            record =0;
            Vector cityList = new Vector();
            while(record*385 < fPointer.length()) {
                fPointer.seek(record*385);
                fPointer.read(city,0,150);
                String c = new String(city);
                c = c.trim();
                cityList.add(c);
                record++;
            }
            for(int i=0;i<10;i++){ // testing the vector cityList
                System.out.print(cityList.get(i)+" ");
            }
            System.out.println();
            Collections.sort(cityList);
            for(int i=0;i<10;i++){
                System.out.print(cityList.get(i)+" ");
            }
            // to find two identical city name
            int count=0;
            System.out.println();
            for(int i=0;i<cityList.size()-1;i++){
                if(cityList.get(i).equals(cityList.get(i+1))){
                    System.out.println(cityList.get(i)+" = "+cityList.get(i+1));
                    count++;
                }
            }
            System.out.println(count);










        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
