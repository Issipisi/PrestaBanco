package PrestaBanco.com.example.PrestaBanco.repositories;

import PrestaBanco.com.example.PrestaBanco.entities.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<DocumentoEntity, Long> {
}
