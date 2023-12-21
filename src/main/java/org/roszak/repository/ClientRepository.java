package org.roszak.repository;

import org.roszak.service.Client;
import org.roszak.service.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
