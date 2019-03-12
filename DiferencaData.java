/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;

/**
 *
 * @authorLUIZ LAURO SILVA GOMÇALVES
 */
public class DiferencaData {

    public static void main(String[] args) {

        System.out.println("Faltão Java 8 " + teste() + " Dias ");
        System.out.println("Faltão " + diasEntreDatas(
                Date.valueOf("2019-03-10"),
                Date.valueOf("2019-03-12")
        ) + " Dias ");

    }

    //caso esteja usando o java 8
    public static String teste() {
        // Cria um Objeto LocalDate com a data atual.
        LocalDate hoje = LocalDate.now();
        // Cria um Objeto LocalDate com a data final
        LocalDate outraData = LocalDate.of(2019, 03, 10);
        // Calcula a diferença de dias entre as duas datas
        long faltaEmDias = ChronoUnit.DAYS.between(hoje, outraData);
        // Calcula a diferença de meses entre as duas datas
        long faltaEmMes = ChronoUnit.MONTHS.between(hoje, outraData);
        // Calcula a diferença de anos entre as duas datas
        long faltaEmAnos = ChronoUnit.YEARS.between(hoje, outraData);

        // Exibe a diferença em dias entre as datas
        System.out.println("Faltão dias " + hoje + " e " + outraData + " = " + faltaEmDias);
        // Exibe a diferença em meses entre as datas
        System.out.println("Faltão meses " + hoje + " e " + outraData + " = " + faltaEmMes);
        // Exibe a diferença em anos entre as datas
        System.out.println("Faltão anos " + hoje + " e " + outraData + " = " + faltaEmAnos);

        return "" + faltaEmDias;

    }

    //OUTRAS VERSOES
    public static int diasEntreDatas(Date pDataInicio, Date pDataFim) {
        GregorianCalendar ini = new GregorianCalendar();
        GregorianCalendar fim = new GregorianCalendar();
        ini.setTime(pDataInicio);
        fim.setTime(pDataFim);
        long dt1 = ini.getTimeInMillis();
        long dt2 = fim.getTimeInMillis();
        return (int) (((dt2 - dt1) / 86400000) + 1);
    }
}
