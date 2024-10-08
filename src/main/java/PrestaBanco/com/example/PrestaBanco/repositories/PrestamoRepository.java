package PrestaBanco.com.example.PrestaBanco.repositories;

import PrestaBanco.com.example.PrestaBanco.entities.PrestamoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<PrestamoEntity, Long> {
}
