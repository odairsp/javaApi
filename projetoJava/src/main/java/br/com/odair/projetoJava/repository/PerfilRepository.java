package br.com.odair.projetoJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.odair.projetoJava.entity.PerfilEntity;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

}
