package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    static ArrayList<Jogo> jogos = new ArrayList<>();

    public static void main(String[] args) {
        var data = LocalDateTime.now();
        Placar placar1 = new Placar(1, 0);
        Jogo jogo1 = new Jogo("Coreia do Sul", "Portugal", data, placar1);
        Placar placar2 = new Placar(0, 2);
        Jogo jogo2 = new Jogo("Gana", "Uruguai", data, placar2);
        Placar placar3 = new Placar(2, 3);
        Jogo jogo3 = new Jogo("Sérvia", "Suíça", data, placar3);
        Placar placar4 = new Placar(1, 0);
        Jogo jogo4 = new Jogo("Camarões", "Brasil", data, placar4);
        // TODO - perguntar ao usuario os jogos !
        jogos.add(jogo4);
        jogos.add(jogo1);
        jogos.add(jogo2);
        jogos.add(jogo3);
//        max(jogos.stream());
//        min(jogos.stream());
//        soma(jogos.stream());
//        ordenar(jogos.stream());
//        System.out.println("\n _____________________________ \n");
//        ordenarNome(jogos.stream());
        filtro(jogos.stream());
    }

    private static void filtro(Stream<Jogo> streamJogos) {
        // Filtrar os jogos que foram empate
        Jogo jogo = streamJogos
                .filter(item -> item.getPlacar().getPlacarTime1() == item.getPlacar().getPlacarTime2())
                .findAny()
                .orElse(null);
        System.out.println(jogo);

    }

    private static void filtroLetraA(Stream<Jogo> streamJogos) {
        streamJogos.filter(item -> item.getTime1().contains("A") || item.getTime2().contains("A"))
                .forEach(System.out::println);
    }

    private static void ordenar(Stream<Jogo> streamJogos) {
        streamJogos.sorted(Comparator.comparingInt(Jogo::getTotalGols).reversed())
                .forEach(System.out::println);
    }

    private static void ordenarNome(Stream<Jogo> streamJogos) {
        streamJogos.sorted(Comparator.comparing(Jogo::getTime1))
                .forEach(System.out::println);

    }
    
    private static void soma(Stream<Jogo> streamJogos) {
        streamJogos.reduce(0, (s, jogo) -> s + jogo.getTotalGols(), Integer::sum);
    }

    private static void min(Stream<Jogo> streamJogos) {
        var value = streamJogos.min(Comparator.comparingInt(Jogo::getTotalGols));
        if(value.isPresent()) {
            System.out.println("Menor - " + value.get().toString());
        } else {
            System.out.println("Nao exite maior jogo");
        }
    }

    private static void max(Stream<Jogo> streamJogos) {
        var value = streamJogos.max(Comparator.comparingInt(Jogo::getTotalGols));
        if(value.isPresent()) {
            System.out.println("Maior - " + value.get().toString());
        } else {
            System.out.println("Nao exite maior jogo");
        }
    }
}