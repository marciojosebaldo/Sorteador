package DesenvolvimentoSistemas.Sorteador.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class S_Sorteador {

    private int qtdeNumero;
    private int iniNumero;
    private int fimNumero;
    private boolean crescente;
    private boolean semRepeticao;

    public S_Sorteador(int qtdeNumero, int iniNumero, int fimNumero, boolean crescente, boolean semRepeticao) {
        this.qtdeNumero = qtdeNumero;
        this.iniNumero = iniNumero;
        this.fimNumero = fimNumero;
        this.crescente = crescente;
        this.semRepeticao = semRepeticao;
    }


    public List Sorteador(int qtdeNumero, int iniNumero, int fimNumero, boolean crescente, boolean semRepeticao) {
        List<Integer>listaSorteio = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < qtdeNumero; i++) {
            int valor = random.nextInt(fimNumero) + iniNumero;
            listaSorteio.add(valor);

            if (crescente == true) {
                
            }

        }

        return listaSorteio;
    }
}
