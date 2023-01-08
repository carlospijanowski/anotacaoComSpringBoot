package br.com.seteideias.anotacaocomspringboot.repository;

import br.com.seteideias.anotacaocomspringboot.model.OrderPedido;
import org.springframework.stereotype.Service;

@Service
public class OrderRepository {

    public void save(OrderPedido orderPedido){
        System.out.println("SALVO NO BANCO.: "+getClass().getSimpleName());
    }

}
