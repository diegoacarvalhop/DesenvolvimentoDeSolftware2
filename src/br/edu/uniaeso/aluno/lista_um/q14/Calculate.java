package br.edu.uniaeso.aluno.lista_um.q14;

import java.util.List;

public class Calculate {
    public String getMaiorMenorAltura(List<Pessoa> pessoas) {
        double maior_altura = pessoas.get(0).getAltura();;
        for (int i = 0; i < pessoas.size(); i ++){
            if (pessoas.get(i).getAltura() > maior_altura){
                maior_altura = pessoas.get(i).getAltura();
            }
        }
        double menor_altura = pessoas.get(0).getAltura();
        for (int i = 0; i < pessoas.size(); i ++){
            if (pessoas.get(i).getAltura() < menor_altura){
                menor_altura = pessoas.get(i).getAltura();
            }
        }
        return "A maior altura é: " + maior_altura + ". A menor altura é: " + menor_altura;
    }

    public String getMediaAlturaHomens(List<Pessoa> pessoas) {
        double sum = 0, media;
        int cont = 0;
        for(int x = 0; x < pessoas.size(); x++) {
            if(pessoas.get(x).getSexo().equals("M")) {
                sum += pessoas.get(x).getAltura();
                cont++;
            }
        }
        media = sum / cont;

        return "A média de altura é de: " + media;
    }

    public String getNumberWoman(List<Pessoa> pessoas) {
        int cont = 0;
        for(int x = 0; x < pessoas.size(); x++) {
            if(pessoas.get(x).getSexo().equals("F")) {
                cont++;
            }
        }

        return "O número de mulheres é de: " + cont;
    }

}
