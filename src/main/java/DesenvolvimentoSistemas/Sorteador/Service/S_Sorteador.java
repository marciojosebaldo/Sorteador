package DesenvolvimentoSistemas.Sorteador.Service;

import org.springframework.stereotype.Service;

import java.util.*;

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

            if (semRepeticao) {
                return (List) new TreeSet<Integer>(listaSorteio.subList(0, qtdeNumero));
            }

            if (crescente) {
                Collections.sort(listaSorteio);
            }

        }

        return listaSorteio;
    }
}
