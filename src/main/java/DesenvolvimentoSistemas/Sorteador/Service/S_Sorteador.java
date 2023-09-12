package DesenvolvimentoSistemas.Sorteador.Service;

import DesenvolvimentoSistemas.Sorteador.Model.M_Sorteador;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class S_Sorteador {

    private static M_Sorteador m_sorteador;

    public S_Sorteador(M_Sorteador m_sorteador) {
        this.m_sorteador = m_sorteador;
    }

    public static List Sorteador(int qtdeNumero, int iniNumero, int fimNumero, Boolean crescente, Boolean semRepeticao) {

        List<Integer> listaSorteio = new ArrayList<>();
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
