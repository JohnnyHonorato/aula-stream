package org.example;

public class Placar {
    private Integer placarTime1;
    private Integer placarTime2;

    public Integer getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public Integer getPlacarTime2() {
        return placarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    public void mostrarPlacar(Placar placar1, Placar placar2){
        System.out.println("__");
        System.out.println("       time 1 : "+ placar1);
        System.out.println("       time 2 : "+ placar2);
        System.out.println("__");
    }

    public Placar(Integer placarTime1, Integer placarTime2) {
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
    }

}
