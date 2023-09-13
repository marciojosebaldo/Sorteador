package DesenvolvimentoSistemas.Sorteador.Model;

import org.springframework.stereotype.Component;

@Component
public class M_Sorteador {

    private int qtdeNumero;
    private int iniNumero;
    private int fimNumero;
    private boolean crescente;
    private boolean semRepeticao;

    public int getQtdeNumero() {
        return qtdeNumero;
    }

    public void setQtdeNumero(int qtdeNumero) {
        this.qtdeNumero = qtdeNumero;
    }

    public int getIniNumero() {
        return iniNumero;
    }

    public void setIniNumero(int iniNumero) {
        this.iniNumero = iniNumero;
    }

    public int getFimNumero() {
        return fimNumero;
    }

    public void setFimNumero(int fimNumero) {
        this.fimNumero = fimNumero;
    }

    public boolean isCrescente() {
        return crescente;
    }

    public void setCrescente(boolean crescente) {
        this.crescente = crescente;
    }

    public boolean isSemRepeticao() {
        return semRepeticao;
    }

    public void setSemRepeticao(boolean semRepeticao) {
        this.semRepeticao = semRepeticao;
    }
}