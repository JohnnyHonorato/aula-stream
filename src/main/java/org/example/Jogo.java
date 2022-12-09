package org.example;
import java.time.LocalDateTime;

public class Jogo {
    private String time1;
    private String time2;
    private LocalDateTime dataHora;
    private Placar placar;

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Placar getPlacar() {
        return placar;
    }

    public void setPlacar(Placar placar) {
        this.placar = placar;
    }

    public Jogo(String time1, String time2, LocalDateTime dataHora, Placar placar) {
        this.time1 = time1;
        this.time2 = time2;
        this.dataHora = dataHora;
        this.placar = placar;
    }

    public Integer getTotalGols() {
        return placar.getPlacarTime1() + placar.getPlacarTime2();
    }

    @Override
    public String toString() {
        return "Jogo{" + "time1='" + time1 + "time2='" + time2 +
        ", dataHora=" + dataHora +
                ", placar=" + placar +
                '}';
    }
}
