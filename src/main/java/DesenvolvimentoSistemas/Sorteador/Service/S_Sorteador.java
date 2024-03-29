package DesenvolvimentoSistemas.Sorteador.Service;

import DesenvolvimentoSistemas.Sorteador.Controller.C_CondicaoNaoAtendida;
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
        if (semRepeticao == true && ((fimNumero - iniNumero + 1) < qtdeNumero)) {
            throw new C_CondicaoNaoAtendida("A quantidade de números é menor do que o intervalo. Você pode permitir a repetição");
        } else {
            if (semRepeticao) {
                for (int i = 0; i < listaSorteio.length; i++) {
                    int auxiliar = listaSorteio[i];
                    for (int j = 0; j < listaSorteio.length; j++) {
                        if (auxiliar == listaSorteio[j] && j != i) {
                            auxiliar = random.nextInt(fimNumero) + iniNumero;
                            j = -1;
                        }
                    }
                    listaSorteio[i] = auxiliar;
                }
            }
            if (crescente) {
                listaSorteio = Arrays.stream(listaSorteio).sorted().toArray();
            }
        }
        return listaSorteio;
    }
}