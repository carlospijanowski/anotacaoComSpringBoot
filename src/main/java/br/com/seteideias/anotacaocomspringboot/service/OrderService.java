package br.com.seteideias.anotacaocomspringboot.service;

import br.com.seteideias.anotacaocomspringboot.model.OrderPedido;
import br.com.seteideias.anotacaocomspringboot.model.OrderPedidoVo;
import br.com.seteideias.anotacaocomspringboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderPedidoVo save(@Validated OrderPedido orderPedido) {
        orderRepository.save(orderPedido);
        OrderPedidoVo orderPedidoVo = new OrderPedidoVo();
        orderPedidoVo.setOrdergravada(orderPedido.getOrderNumber());
        return orderPedidoVo;
    }

}
