package PrestaBanco.com.example.PrestaBanco.repositories;

import PrestaBanco.com.example.PrestaBanco.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
