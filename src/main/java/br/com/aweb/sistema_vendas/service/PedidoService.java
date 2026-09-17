package br.com.aweb.sistema_vendas.service;

import org.springframework.stereotype.Service;

import br.com.aweb.sistema_vendas.repository.PedidoRepository;

@Service 
public class PedidoService {
    
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }
}
