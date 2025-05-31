package pl.vost.odzeradojuniora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.parameters.P;

/*
    Unit poświęcony podstawom programowania niezależnie od języka
 */

public class Unit1{

    /* <- Komentarze do kodu, pozwalają na zamieszczanie informacji, które kompilator pomija
        No to zacznijmy od początku...
     */

    /*

        Słowem wstępu zaznaczę, że input użytkownika powinien przychodzić z zewnątrz, i nie bawię się w odczytywanie
        z konsoli...

     */

    @Test
    public void podstawyPodstaw(){
        /*
                To co tutaj jest to jest metoda klasy, dla uproszczenia, na ten moment, piszmy w teście
                Co to jest test? Zostawmy to na potem, na razie potrzeba nam tylko możliwość odpalenia kodu
         */

        int zmienna = 10; // <- Tak wygląda zadeklarowanie zmiennej, którą widzi tylko dana metoda
        // Do naszej zmiennej odwołujemy się używając jej nazwy

        zmienna = zmienna + 5;// Wykorzystaliśmy zmienną, aby podnieść jej wartość o 5
        System.out.print("Zmienna to: "); // Drukowanie tekstu na konsoli bez przerwania linii
        System.out.println(zmienna); // Drukowanie wartości zmiennej na konsoli i wstawienie końca linii



        Assertions.assertEquals(15, zmienna); // Porównanie czy zmienna ma wartość oczekiwaną

        // Typy "prymitywne"
        int i = 10; // Wartości całkowite od -2^31 do 2^31-1 (Z potęgami mogę się mylić akurat, ale warto wiedzieć, że int jest mniejszy od longa
        long l = 10; // Wartości całkowite od -2^63 do 2^63-1
        double d = 10.5; // Wartości zmiennoprzecinkowe
        boolean b = true; // Wartość logiczna - Prawda/fałsz
        char c = 'a'; // Znak



        //Przykłady typów "opakowanych"
        String s = "Hello World!"; // Ciąg znaków
        Long lon = 152L; // Opakowany Long pozwala na wbudowane operacje na nich
        Integer in = lon.intValue(); // Konwersja Long na Integer

        Long max = Long.MAX_VALUE; // odczytanie maksymalnej wartości Long z całego typu

        System.out.println("Maksymalna wartość Longa to: " + max);
        System.out.println("Przykład konwersji Long na Integer wykraczający poza skalę: " + max.intValue());

        /*
            Istnieje możliwość "siłowego" przeniesienia z typu a na typ b (Castowanie)
         */
        int zmiennaInt = 10;
        long zmiennaLong = (long) zmiennaInt;

        // Od Javy 11 można używać słowa var - to jest nowa forma zmiennej, której typ jest odczytywany z kontekstu
        var zmiennaVar = 10;
        var zmiennaVar2 = "Hello World!";
    }

    @Test
    public void dodawanieZmiennych(){
        // ZADANIE
        // Napisz metodę, która zadeklaruje 3 zmienne, doda je do siebie, wynik zapisze do osobnej zmiennej i
        // wydrukuje wynik na konsoli.

    }

    @Test
    public void dodawanieDoMaksa() {
        //Zadanie: Dodaj te wartości :)
        //Autentyczne zadanie z mojej rozmowy rekrutacyjnej xD


        int i = Integer.MAX_VALUE;
        int j = 10;

        var suma = i + j;


        Assertions.assertEquals(UnitUtils.ADD_TO_MAX_EXPECTED, suma);
    }

    @Test
    public void warunkiIf(){
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("Zmienna a to prawda!");
        }else {
            System.out.println("Zmienna a to fałsz...");
        }


        if (b) {
            System.out.println("Zmienna b to prawda!");
        }else {
            System.out.println("Zmienna b to fałsz...");
        }

        if (a || b) {
            System.out.println("Zmienna a lub b to prawda!");
        } else {
            System.out.println("Ani a ani b nie są prawdą");
        }

        if (a && b) {
            System.out.println("Zmienna a i b to prawda!");
        } else {
            System.out.println("Zmienna a lub zmienna b to fałsz...");
        }

        if (!a) { //Negacja
            System.out.println("zmienna a NIE jest prawdą!");
        } else if (!b) {
            System.out.println("zmienna b NIE jest prawdą!");
        } else {
            System.out.println("Zmienna a i zmienna b to prawda");
        }

        /*
            Jak widzisz, if sprawdza, czy parametr podany do niego to prawda.
            Można matematyką boolową liczyć bardziej skomplikowane warunki jak OR / AND / XOR,
            Jak i oczekiwać fałszu poprzez zanegowanie zmiennej "!"
         */

        if (5 < 10) {
            System.out.println("5 jest mniejsze od 10");
        }

    }

    @Test
    public void petlaFor(){

        int suma = 0;

        //  Wartość startowa
        //    |        Warunek powtórzenia
        //    V        V       v--Akcja po powtórzeniu
        for(int i = 0; i < 10; i++){
            suma += i;
        }

        /*
            Przekładając tą pętlę na ludzki xD
            Zaczynając od wartości 0, powtarzamy ciało FORa
            do momentu aż wartość i nie będzie mniejsza od 10
            Za każdym powtórzeniem podnosząc wartość i o 1

            i++ to jest to samo co i = i + 1
            suma += i to jest to samo co suma = suma + i

         */

        System.out.println("Suma liczb od 0 do 9 to: " + suma);
    }

    @Test
    public void drzewko(){
        //ZADANIE
        // Napisz metodę, która wydrukuje na konsoli jednostronne drzewko o wysokości jako zmienna i znaku jako zmienna.
        /*
         *   Przykład dla wysykości 5 i znaku a:
         *   a
         *   a a
         *   a a a
         *   a a a a
         *   a a a a a
         *
         *  Jak chcesz się pobawić to możesz dorobić pień i drzweko zrobić symetyryczne
         */
    }

    @Test
    public void uzywanieMetod() {

        /*
        Java pozwala na wyniesienie powtarzalnych operacji do metod (Funkcji)
        Pozwala to również na zminimalizowanie kodu w głównej metodzie, oraz używanie tego samego bloczku kodu w
        innych miejscach bez deklarowania ich na nowo.
         */

        int i = 10;
        int j = 5;

        int wynik = dodaj(i, j);

        System.out.println("Wynik dodawania " + i + " i " + j + " to: " + wynik);

    }

    private Integer dodaj(Integer a, Integer b) {
        //Metoda, jak widać, przyjmuje 2 parametry i zwraca inta z ich wartością
        return a + b;
    }

    @Test
    public void operacjeMatematyczne() {

        String operacja = "^";
        Integer a = 12;
        Integer b = 3;

        Integer result = operuj(a, b, operacja);

        System.out.println(result);
        Assertions.assertEquals(1728, result);
    }

    private Integer operuj(Integer a, Integer b, String operacja){
        //Switch pozwala na płynny przeskok między opcjami zależnie od przypadku
        switch(operacja){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "^":
                //TODO: Stwórz metodę, która wykona operację potęgowania i zaimplementuj ją tutaj
            default:
                System.out.println("Operacja nie jest zdefiniowana!");
                //null - brak inicjalizacji danej zmiennej
                return null;
        }
    }

    private Integer poteguj(Integer a, Integer b){
        //Zadanie: Stwórz metodę, która będzie potęgować a do potęgi b

        return 0;
    }

    /*
        Zauważ, że niektóre metody zwracają void - Znaczy to, że metoda nie zwraca żadnej wartości!
        Dodatkowo na początku deklaracji, używamy private / public / protected w celu enkapsulacji metody - Opowiem o
         tym później
     */

    @Test
    public void tablice(){

        int[] tablica = new int[10];
        // Tablica to miejsce, gdzie grupuje się dane zmienne;

        for (int i = 0; i < tablica.length; i++) { //tablica.length oznacza długość tablicy
            //Możemy zadeklarować zmienne w tablicy uzywając indeksów
            //WAŻNE! Indeksy w programowaniu zaczynają się od 0!
            tablica[i] = i;
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

        /*
            Taką tablicę można rozrysować w następujący sposób:
            [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] - Komórki tablicy
             0   1   2   3   4   5   6   7   8   9  - Indeksy
         */

        /*
            Tablice mogą być też wielowymiarowe!
         */

        int[][][] tablica3d = new int[10][10][10];
        // Ta tablica zachowuje się jak kostka 3d, ma ona 1000 pól w sobie 10x10x10

        int[][][][][] tablica5d = new int[10][10][10][10][10];
        tablica5d[9][2][5][6][8] = 10;
        // Do komórki o indeksie 9; 2; 5; 6; 8; wrzucamy wartość 10

        // Z tego, co się orientuję nie ma limitu ilości wymiarów tablicy

    }

    @Test
    public void sortuj(){
        //Zadanie: posortuj tablicę od najwyższej do najniższej

        int[] tablica = UnitUtils.TAB_TO_SORT;



        Assertions.assertArrayEquals(UnitUtils.SORTED_TAB, tablica);
    }


}
