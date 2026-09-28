package com.exemplo.atividademvc.repository;

import com.exemplo.atividademvc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
