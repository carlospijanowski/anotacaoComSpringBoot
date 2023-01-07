package br.com.seteideias.anotacaocomspringboot.model;

import br.com.seteideias.anotacaocomspringboot.annotations.AnotacaoField;
import lombok.Data;

@Data
public class OrderPedido {
    @AnotacaoField
    private String orderNumber;
    private String cliente;
}
