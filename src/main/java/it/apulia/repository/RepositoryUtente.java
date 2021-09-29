package it.apulia.repository;


import it.apulia.domain.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUtente extends JpaRepository<Utente, Long> {
    Utente findByUsername(String username);



}
