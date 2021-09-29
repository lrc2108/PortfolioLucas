package com.sep.senac.br.demo.DAO;

import com.sep.senac.br.demo.model.RepositorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDAO extends JpaRepository<RepositorioEntity, Integer> {
}
