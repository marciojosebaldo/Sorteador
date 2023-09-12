package DesenvolvimentoSistemas.Sorteador.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class S_Sorteador {

    public S_Sorteador() {

    }

    public List Sorteador(int qtdeNumero, int iniNumero, int fimNumero, String crescente, String semRepeticao) {

        List<Integer>listaSorteio = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < qtdeNumero; i++) {
            int valor = random.nextInt(fimNumero) + iniNumero;
            listaSorteio.add(valor);

//            if (semRepeticao) {
//                return (List) new TreeSet<Integer>(listaSorteio.subList(0, qtdeNumero));
//            }
//
//            if (crescente) {
//                Collections.sort(listaSorteio);
//            }
        }

        return listaSorteio;
    }
}
