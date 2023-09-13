package DesenvolvimentoSistemas.Sorteador.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class S_Sorteador {

    public static int[] Sorteador(int qtdeNumero, int iniNumero, int fimNumero, Boolean crescente, Boolean semRepeticao) {

        int[] listaSorteio = new int[qtdeNumero];
        Random random = new Random();

        for (int i = 0; i < listaSorteio.length; i++) {
            Integer valor = random.nextInt(fimNumero) + iniNumero;
            listaSorteio[i] = valor;
        }

        if (semRepeticao) {
            for (int i = 0; i < listaSorteio.length; i++) {
                for (int j = 0; j < listaSorteio.length; j++) {

                }
            }
        }

        if (crescente) {
        }

        return listaSorteio;

    }

}