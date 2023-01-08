package br.com.seteideias.anotacaocomspringboot.model;

import br.com.seteideias.anotacaocomspringboot.annotations.LivreOpiniaoDesdeQueSejaAMinha;

public class DbzRequest {

    @LivreOpiniaoDesdeQueSejaAMinha
    private String nomePersonagem;

    public String getNomePersonagem() {
        return nomePersonagem;
    }
}
