package io.github.springcloud.mscartoes.domain.clienteCartao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository clienteCartaoRepository;

    public List<ClienteCartao> listarCartoesPorCpf(String cpf){
        return clienteCartaoRepository.findByCpf(cpf);
    }
}
