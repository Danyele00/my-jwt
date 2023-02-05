package com.danyele.myjwt.repositories;

import com.danyele.myjwt.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Utente,Long> {
    Optional<Utente> findUserModelByEmail(String email);
}
