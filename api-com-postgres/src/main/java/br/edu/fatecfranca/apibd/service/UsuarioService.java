package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    // Injeção de dependência
    @Autowired // Permite utilizar os métodos da classe sem instânciá-la (Semelhante ao STATIC)
    UsuarioRepository usuarioRepository;

    // Salvar um usuário --> CREATE
    public Usuario save(UsuarioDTO usuario){ // Quando estamos lidando com dados que vieram de um usuário, precisamos usar o DTO.
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(usuario.getNome());
        novoUsuario.setPassword(usuario.getPassword()); // TODO: CONSERTAR ERRO DE TIPAGEM
        novoUsuario.setUsername(usuario.getUsername());
        return usuarioRepository.save(novoUsuario);
    }

    // SELECT * --> READ
    public List<Usuario> listAll(){
        return usuarioRepository.findAll();
    }

    // Busca por ID --> READ
    public Optional<Usuario> findById(Long id){
        return usuarioRepository.findById(id);
    }

    // Atualizando --> UPDATE
    public void update(Long id, UsuarioDTO usuario){
        if(usuarioRepository.findById(id).isPresent()){
            Usuario novoUsuario = new Usuario();
            novoUsuario.setId(usuario.getId());
            novoUsuario.setNome(usuario.getNome());
            novoUsuario.setPassword(usuario.getPassword());
            novoUsuario.setUsername(usuario.getUsername());
            usuarioRepository.save(novoUsuario); // Save também serve para atualizar, DESDE QUE ele tenha a chave primária (Nesse caso, ID)
        }
    }

    // Exclusão --> DELETE
    public void delete(Long id){
        if(usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Usuário não encontrado!");
        }
    }
}
