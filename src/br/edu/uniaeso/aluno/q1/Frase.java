package br.edu.uniaeso.aluno.q1;

public class Frase {
    private String frase, wordFrase, wordReplace;

    public Frase(String frase, String wordFrase, String wordReplace) {
        setFrase(frase);
        setWordFrase(wordFrase);
        setWordReplace(wordReplace);
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getWordFrase() {
        return wordFrase;
    }

    public void setWordFrase(String wordFrase) {
        this.wordFrase = wordFrase;
    }

    public String getWordReplace() {
        return wordReplace;
    }

    public void setWordReplace(String wordReplace) {
        this.wordReplace = wordReplace;
    }

    public String replaceFrase() {
        setFrase(getFrase().replace(getWordFrase(), getWordReplace()));
        return getFrase();
    }
}
