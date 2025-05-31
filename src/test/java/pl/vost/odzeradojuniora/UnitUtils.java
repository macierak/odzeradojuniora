package pl.vost.odzeradojuniora;

import java.util.Arrays;

public class UnitUtils{

    /*
        KYSZ! Nie zaglądaj mi tu!
     */

    public static final int[] TAB_TO_SORT = {
            123123,
            33213,
            55213213,
            568456,
            34523424,
            74553124,
            72422453,
            1364,
            7845377,
            353423457,
            423244
    };

    public static final int[] SORTED_TAB = Arrays.stream(TAB_TO_SORT).sorted().toArray();

    public static final Long ADD_TO_MAX_EXPECTED = Integer.MAX_VALUE + 10L;
}
