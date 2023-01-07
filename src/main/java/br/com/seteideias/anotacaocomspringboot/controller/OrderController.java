package br.com.seteideias.anotacaocomspringboot.controller;

import br.com.seteideias.anotacaocomspringboot.model.OrderPedido;
import br.com.seteideias.anotacaocomspringboot.model.OrderPedidoVo;
import br.com.seteideias.anotacaocomspringboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/v1")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/new-order")
    public ResponseEntity<OrderPedidoVo> inicio(@RequestBody OrderPedido order) throws IOException {
        OrderPedidoVo save = orderService.save(order);
        return ResponseEntity.ok(save);
    }

}
