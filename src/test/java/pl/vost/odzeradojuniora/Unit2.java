package pl.vost.odzeradojuniora;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
    Unit2 - Unit poświęcony podstawom w Javie
 */
public class Unit2{

    @Test
    public void kolekcje(){

        /*
        Java oferuje nam wachlarz kolekcji z czego najpopularniejsze to:
        * Lista
        * * ArrayList
        * Set
        * * HashSet
        * Mapa
        * * HashMap
        I mniej używane to:
        * Vector
        * Collection
         */

        var list = new ArrayList<Integer>();
        //Chwila moment, co to za <> w tym
        //Diamentowe operatory pozwalają nam na zadeklarowanie co trzyma dana kolekcja, o nich później
        list.add(10);
        list.add(20);
        list.add(10);

        list.forEach(System.out::println);
        System.out.println("---------------------------------------");

        var set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(10);

        set.forEach(item -> System.out.println(item));

        System.out.println("---------------------------------------");

        var map = new HashMap<Integer, String>();
        map.put(10, "Dziesięć");
        map.put(20, "Dwadzieścia");

        map.forEach( (key, value) -> System.out.println(key + " : " + value));

        System.out.println("---------------------------------------");
        /*
        Lista pozwala nam na trzymanie danych w kolejności dodania (Lub późniejszego sortowania)

        Set pozwala na trzymanie danych w losowej kolejności, ale za to szybko sprawdzamy czy dany element jest
        Oraz nie pozwala nam na duplikaty w kolekcji

        Mapa pozwala nam na trzymanie wartości Klucz:wartość z praktycznie natychmiastowym odczytem i zapisem
         */


        //Od javy 11 możemy tworzyć kolekcje od razu z wartościami:
        var listaOdRazu = List.of(
                10, 20, 30, 40, 50
        );

        listaOdRazu.forEach(item -> System.out.println(item));
        System.out.println("---------------------------------------");

        /*
            A co to za strzałki?
            Lambdy pozwalają na wywołanie danego elementu z kolekcji bez potrzeby zapisywania nazwy każdego
            Dla każdego item z tej kolekcji - drukuj w konsoli item
            Albo można też użyć odwołania do metody (Metoda musi przyjmować jeden parametr)
         */

        /*
            Z listy możemy wybierać po indeksie
            Z mapy możemy po kluczu
            Z seta nie mamy tak prostej możliwości...
         */

        System.out.println();
    }

}
