package Prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Prova1.model.BibliotecarioModel;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioModel, Long>{

}
