package br.com.apiReceitas.model;

public class ErrorModel {
    private String erro;


    public ErrorModel(String erro) {
        this.erro = erro;
    }

    public String getErro() {
        return this.erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

}
