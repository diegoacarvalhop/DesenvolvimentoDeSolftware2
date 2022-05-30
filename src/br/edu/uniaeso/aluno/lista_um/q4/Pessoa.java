package br.edu.uniaeso.aluno.lista_um.q4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private LocalDate data_nascimento;

    public Pessoa() {
        setData_nascimento(null);
    }

    public Pessoa(LocalDate data_nascimento) {
        setData_nascimento(data_nascimento);
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public long calculaDiasDeVida(LocalDate data_nascimento) {
        return ChronoUnit.DAYS.between(data_nascimento, LocalDate.now());
    }

}
