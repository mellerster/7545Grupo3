package com.ropaapp.modelo.talles;

/**
 * Talle expresado en numeros.
 */
public enum TalleNumerico implements Talle { CERO, UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO,
    NUEVE, DIEZ, ONCE, DOCE, TRECE, CATORCE, QUINCE, DIECISEIS, DIECISIETE, DIECIOCHO, DIECINUEVE,
    VEINTE, VEINTIUNO, VEINTIDOS, VEINTITRES, VEINTICUATRO, VEINTICINCO, VEINTISEIS, VEINTISIETE,
    VEINTIOCHO, VEINTINUEVE, TREINTA, TREINTA_Y_UNO, TREINTA_Y_DOS, TREINTA_Y_TRES,
    TREINTA_Y_CUATRO, TREINTA_Y_CINCO, TREINTA_Y_SEIS, TREINTA_Y_SIETE, TREINTA_Y_OCHO,
    TREINTA_Y_NUEVE, CUARENTA, CUARENTA_Y_UNO, CUARENTA_Y_DOS, CUARENTA_Y_TRES, CUARENTA_Y_CUATRO,
    CUARENTA_Y_CINCO, CUARENTA_Y_SEIS, CUARENTA_Y_SIETE, CUARENTA_Y_OCHO, CUARENTA_Y_NUEVE;

    private String nombre;

    static {
        CERO.nombre = "0";
        UNO.nombre = "1";
        DOS.nombre = "2";
        TRES.nombre = "3";
        CUATRO.nombre = "4";
        CINCO.nombre = "5";
        SEIS.nombre = "6";
        SIETE.nombre = "7";
        OCHO.nombre = "8";
        NUEVE.nombre = "9";
        DIEZ.nombre = "10";
        ONCE.nombre = "11";
        DOCE.nombre = "12";
        TRECE.nombre = "13";
        CATORCE.nombre = "14";
        QUINCE.nombre = "15";
        DIECISEIS.nombre = "16";
        DIECISIETE.nombre = "17";
        DIECIOCHO.nombre = "18";
        DIECINUEVE.nombre = "19";
        VEINTE.nombre = "20";
        VEINTIUNO.nombre = "21";
        VEINTIDOS.nombre = "22";
        VEINTITRES.nombre = "23";
        VEINTICUATRO.nombre = "24";
        VEINTICINCO.nombre = "25";
        VEINTISEIS.nombre = "26";
        VEINTISIETE.nombre = "27";
        VEINTIOCHO.nombre = "28";
        VEINTINUEVE.nombre = "29";
        TREINTA.nombre = "30";
        TREINTA_Y_UNO.nombre = "31";
        TREINTA_Y_DOS.nombre = "32";
        TREINTA_Y_TRES.nombre = "33";
        TREINTA_Y_CUATRO.nombre = "34";
        TREINTA_Y_CINCO.nombre = "35";
        TREINTA_Y_SEIS.nombre = "36";
        TREINTA_Y_SIETE.nombre = "37";
        TREINTA_Y_OCHO.nombre = "38";
        TREINTA_Y_NUEVE.nombre = "39";
        CUARENTA.nombre = "40";
        CUARENTA_Y_UNO.nombre = "41";
        CUARENTA_Y_DOS.nombre = "42";
        CUARENTA_Y_TRES.nombre = "43";
        CUARENTA_Y_CUATRO.nombre = "44";
        CUARENTA_Y_CINCO.nombre = "45";
        CUARENTA_Y_SEIS.nombre = "46";
        CUARENTA_Y_SIETE.nombre = "47";
        CUARENTA_Y_OCHO.nombre = "48";
        CUARENTA_Y_NUEVE.nombre = "49";
    }

    @Override
    public String toString() {
         return nombre;
     }

}
