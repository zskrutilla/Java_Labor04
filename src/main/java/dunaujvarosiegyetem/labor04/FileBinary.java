/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dunaujvarosiegyetem.labor04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author KRUTILLAZS
 */
public class FileBinary {

    public ArrayList<Integer> fajlMuveletek(ArrayList<Integer> szamok, boolean isBeolvas) throws Exception {
        ArrayList<Integer> eredmeny = new ArrayList<Integer>();
        try {
            if (!isBeolvas) {
                FileOutputStream fos = new FileOutputStream("D:\\Tanítás\\Programozás III\\test2.bin");
                ObjectOutputStream out = new ObjectOutputStream(fos);
                out.writeObject(szamok);
                out.close();
                fos.close();
                eredmeny = szamok;
            } else {
                FileInputStream fis = new FileInputStream("D:\\Tanítás\\Programozás III\\test2.bin");
                ObjectInputStream beolvas = new ObjectInputStream(fis);
                eredmeny = (ArrayList<Integer>) beolvas.readObject();
                beolvas.close();
                fis.close();
            }
            return eredmeny;

        } catch (Exception e) {
            throw e;
        }
    }

    public void fajlMuveletek() throws Exception {
        //DataInputStream d = new DataInputStream(new FileInputStream("test.txt"));
//        DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\Tanítás\\Programozás III\\test1.bin"));

        FileOutputStream fos = new FileOutputStream("D:\\Tanítás\\Programozás III\\test1.bin");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        ArrayList<Integer> szamok = new ArrayList<Integer>();
        szamok.add(1);
        szamok.add(5);
        szamok.add(16);
        szamok.add(21);
        szamok.add(4);
//            while ((szoveg = d.readUTF()) != null) {
//                String u = szoveg.toUpperCase();
//                System.out.println(u);
//                out.writeBytes(u + "  ,");
//            }
        out.writeObject(szamok);
        out.close();
        fos.close();

        FileInputStream fis = new FileInputStream("D:\\Tanítás\\Programozás III\\test1.bin");
        ObjectInputStream beolvas = new ObjectInputStream(fis);
        ArrayList<Integer> eredmeny = new ArrayList<Integer>();
        eredmeny = (ArrayList<Integer>) beolvas.readObject();

        beolvas.close();
        fis.close();
        System.out.println("Beolvasott elemek:");
        for (Integer item : eredmeny) {
            System.out.println(item);
        }
    }
}
