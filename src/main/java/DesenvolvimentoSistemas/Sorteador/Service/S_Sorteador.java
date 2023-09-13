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
                int auxiliar = listaSorteio[i];
                for (int j = 0; j < listaSorteio.length; j++) {
                    if (auxiliar == listaSorteio[j] & j != i) {
                        auxiliar = random.nextInt(fimNumero) + iniNumero;
                    } else {
                        listaSorteio[i] = auxiliar;
                    }

                }
            }
        }

        if (crescente) {
            for (int i = 0; i < listaSorteio.length; i++) {
                for (int j = 0; j < listaSorteio.length; j++) {
                    if (listaSorteio[j] < listaSorteio[i]) {
                        int auxiliar = listaSorteio[j];
                        listaSorteio[j] = listaSorteio[i];
                        listaSorteio[i] = auxiliar;
                    }
                }
            }
        }

        return listaSorteio;

    }

}