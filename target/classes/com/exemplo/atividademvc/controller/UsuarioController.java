package com.exemplo.atividademvc.controller;

import com.exemplo.atividademvc.dto.UsuarioCadastroDTO;
import com.exemplo.atividademvc.dto.UsuarioRespostaDTO;
import com.exemplo.atividademvc.model.Usuario;
import com.exemplo.atividademvc.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Void> criarUsuario(@RequestBody @Valid UsuarioCadastroDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());

        repository.save(usuario);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<UsuarioRespostaDTO> listarUsuarios() {
        return repository.findAll()
                .stream()
                .map(usuario -> new UsuarioRespostaDTO(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))
                .toList();
    }
}
