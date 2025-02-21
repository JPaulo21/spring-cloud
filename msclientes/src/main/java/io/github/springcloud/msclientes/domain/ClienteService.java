package io.github.springcloud.msclientes.domain;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> getByCpf(String cpf){
        return clienteRepository.findByCpf(cpf);
    }
}
