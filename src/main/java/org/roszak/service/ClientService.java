package org.roszak.service;


import lombok.RequiredArgsConstructor;
import org.roszak.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository repository;

    public void createAccount(Client client){
    if (client==null){
    throw new IllegalArgumentException("Client cannot be a null!");
    }
    repository.save(client);
    }


}
