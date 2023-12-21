package org.roszak.service;


import org.roszak.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    ClientRepository repository;
@Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void createAccount(Client client){
    if (client==null){
    throw new IllegalArgumentException("Client cannot be a null!");
    }
    repository.save(client);
    }


}
