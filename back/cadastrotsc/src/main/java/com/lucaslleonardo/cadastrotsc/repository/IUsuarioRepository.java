package com.lucaslleonardo.cadastrotsc.repository;

import com.lucaslleonardo.cadastrotsc.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity,Long > {
}
