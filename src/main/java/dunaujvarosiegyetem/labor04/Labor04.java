/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package dunaujvarosiegyetem.labor04;
//Teszt
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author KRUTILLAZS
 */
public class Labor04 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> tomb = new ArrayList<String>();
        ArrayList<Szemelyek> emberek = new ArrayList<Szemelyek>();

        emberek.add(new Szemelyek("Teszt Elek",
                425,
                "Valami"));

        emberek.add(new Szemelyek("Teszt Elek 2",
                45,
                "Valami 2"));

        System.out.println("Összes Nber:");
        emberek.forEach(n -> {
            System.out.println(n.Eletkor);
        });
        ArrayList<Szemelyek> emberekSzurt = new ArrayList<Szemelyek>();
        emberekSzurt.addAll(emberek.stream().filter(x -> x.Eletkor < 100).toList());
        System.out.println("Szűrt Nber:");
        emberekSzurt.forEach(m -> {
            System.out.println(m.Eletkor);
        });

        FileBinary fajl = new FileBinary();
        try {
            ArrayList<Integer> bemenet = new ArrayList<Integer>();
            ArrayList<Integer> eredmeny = new ArrayList<Integer>();
            bemenet.add(5);
            bemenet.add(8);
            bemenet.add(15);
            bemenet.add(2);
            bemenet.add(150);
            
            fajl.fajlMuveletek();
//            eredmeny = fajl.fajlMuveletek(bemenet, false);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        tomb.add("teszt01");
//        tomb.add("teszt02");
//        tomb.add("teszt03");
//        tomb.add("teszt04");
//
        for (String item : tomb) {
            System.out.println(item);
        }

        tomb.forEach((n) -> {
            System.out.println(n);
        });
        Optional<String> eredmeny = tomb
                .stream()
                .filter(n -> n.contains("03"))
                .findFirst();

        System.out.println(eredmeny);
    }
}
