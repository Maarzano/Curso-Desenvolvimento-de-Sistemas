package Prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Prova1.model.LivroModel;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Long>{

}
