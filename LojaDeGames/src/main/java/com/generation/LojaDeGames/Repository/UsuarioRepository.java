package com.generation.LojaDeGames.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaDeGames.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);

}