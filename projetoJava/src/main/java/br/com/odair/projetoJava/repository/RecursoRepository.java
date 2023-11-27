package br.com.odair.projetoJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.odair.projetoJava.entity.RecursoEntity;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

}
