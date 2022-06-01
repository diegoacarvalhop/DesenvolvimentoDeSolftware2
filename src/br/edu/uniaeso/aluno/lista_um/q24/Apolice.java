package br.edu.uniaeso.aluno.lista_um.q24;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Apolice {
    private String nome_segurado;
    private int idade_segurado;
    private double valor_premio;

    public Apolice() {
        setNome_segurado("");
        setIdade_segurado(0);
        setValor_premio(0);
    }

    public Apolice(String nome_segurado, int idade_segurado, double valor_premio) {
        setNome_segurado(nome_segurado);
        setIdade_segurado(idade_segurado);
        setValor_premio(valor_premio);
    }

    public String toString() {
        List<Field> atributos = Arrays.asList(Apolice.class.getDeclaredFields());
        for(Field f : atributos) {
            System.out.println(f.getName());
        }
        return "";
    }

    public void calcularPremioApolice() {
        if(getIdade_segurado() >= 18 && getIdade_segurado() <= 25) {
            setValor_premio(getValor_premio() + ((getValor_premio()*20)/100));
        } else if( getIdade_segurado() > 25 && getIdade_segurado() <= 26) {
            setValor_premio(getValor_premio() + ((getValor_premio()*15)/100));
        } else if (getIdade_segurado() > 36) {
            setValor_premio(getValor_premio() + ((getValor_premio()*10)/100));
        }
    }

    public void oferecerDesconto(String cidade) {
        if( cidade.toUpperCase().equals("Curitiba".toUpperCase())) {
            setValor_premio(getValor_premio() - ((getValor_premio()*20)/100));
        } else if(cidade.toUpperCase().equals("Rio de Janeiro".toUpperCase())) {
            setValor_premio(getValor_premio() - ((getValor_premio()*15)/100));
        } else if(cidade.toUpperCase().equals("São Paulo".toUpperCase())) {
            setValor_premio(getValor_premio() - ((getValor_premio()*10)/100));
        } else if(cidade.toUpperCase().equals("Belo Horizonte".toUpperCase())) {
            setValor_premio(getValor_premio() - ((getValor_premio()*5)/100));
        }
    }

    public String getNome_segurado() {
        return nome_segurado;
    }

    public void setNome_segurado(String nome_segurado) {
        this.nome_segurado = nome_segurado;
    }

    public int getIdade_segurado() {
        return idade_segurado;
    }

    public void setIdade_segurado(int idade_segurado) {
        this.idade_segurado = idade_segurado;
    }

    public double getValor_premio() {
        return valor_premio;
    }

    public void setValor_premio(double valor_premio) {
        this.valor_premio = valor_premio;
    }
}
