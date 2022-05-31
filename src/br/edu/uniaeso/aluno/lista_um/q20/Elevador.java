package br.edu.uniaeso.aluno.lista_um.q20;

import java.util.ArrayList;
import java.util.List;

public class Elevador extends Capacidade {
    private int andar_atual;
    private int total_andares;
    private Pessoa pessoa;
    private List<Pessoa> pessoas_presentes;
    int adiciona = 1;

    public Elevador(int max_pessoas, double peso_max, int total_andares) {
        super(max_pessoas, peso_max);
        setTotal_andares(total_andares);
        andar_atual = 0; // Os elevadores sempre começam no térreo.
        setPessoas_presentes(new ArrayList<>()); // Os elevadores sempre começam vazios.
        setPessoa(new Pessoa());
    }

    public void entra(boolean manutencao) throws ManutencaoException {
        if (manutencao) { // Se o elevador estiver em manutenção lança uma exceção.
            throw new ManutencaoException();
        } else {
            if (adiciona < getQtd_pessoas()) { // Para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço).
                getPessoas_presentes().add(getPessoa());
                adiciona++;
            }
        }
    }

    public void sai(boolean manutencao) throws ManutencaoException {
        if (manutencao) { // Se o elevador estiver em manutenção lança uma exceção.
            throw new ManutencaoException();
        } else {
            if (getPessoas_presentes().size() > 0) { // Para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele).
                getPessoas_presentes().remove(getPessoa());
                adiciona--;
            }
        }
    }

    public void sobe() throws PesoMaximoException {
        if(calculaPeso() > getPeso_maximo()) { // Gera exceção quando peso máximo é excedido, mesmo com a quantidade de pessoas adequada.
            throw new PesoMaximoException();
        } else {
            if (getAndar_atual() < getTotal_andares()) { // Para subir um andar (não deve subir se já estiver no último andar).
                setAndar_atual(getAndar_atual() + 1);
            }
        }
    }

    public void desce() throws PesoMaximoException {
        if(calculaPeso() > getPeso_maximo()) { // Gera exceção quando peso máximo é excedido, mesmo com a quantidade de pessoas adequada.
            throw new PesoMaximoException();
        } else {
            if (getAndar_atual() != 0 && getAndar_atual() < getTotal_andares()) { // Para descer um andar (não deve descer se já estiver no térreo).
                setAndar_atual(getAndar_atual() - 1);
            }
        }
    }

    public double calculaPeso() {
        double pesoPessoas = 0;
        for(Pessoa p : getPessoas_presentes()) {
            pesoPessoas += p.getPeso();
        }
        return pesoPessoas;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public int getTotal_andares() {
        return total_andares;
    }

    public void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas_presentes() {
        return pessoas_presentes;
    }

    public void setPessoas_presentes(List<Pessoa> pessoas_presentes) {
        this.pessoas_presentes = pessoas_presentes;
    }
}
