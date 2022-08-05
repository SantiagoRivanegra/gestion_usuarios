package com.example.demo.dao;

import com.example.demo.models.Usuario;
import java.util.List;

public interface UsuarioDao {
  List<Usuario> getUsuario();

  void eliminar(Long id);

  void registrar(Usuario usuario);

  Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
