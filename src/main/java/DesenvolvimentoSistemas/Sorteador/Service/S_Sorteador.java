package DesenvolvimentoSistemas.Sorteador.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class S_Sorteador {

    public static ArrayList<Integer> Sorteador(int qtdeNumero, int iniNumero, int fimNumero, Boolean crescente, Boolean semRepeticao) {

        ArrayList<Integer> listaSorteio = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < qtdeNumero; i++) {
            Integer valor = random.nextInt(fimNumero) + iniNumero;
            listaSorteio.add(valor);

//            if (semRepeticao) {
//                new TreeSet<Integer>(listaSorteio.subList(0, qtdeNumero));
//            }

            if (crescente) {
                Collections.sort(listaSorteio);
            }
        }

        return listaSorteio;
    }
}
