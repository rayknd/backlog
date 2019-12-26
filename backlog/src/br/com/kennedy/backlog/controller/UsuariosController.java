package br.com.kennedy.backlog.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.kennedy.backlog.dao.UsuariosDao;
import br.com.kennedy.backlog.model.Usuarios;

@Controller
public class UsuariosController {
	
	UsuariosDao dao = new UsuariosDao();
	
	@RequestMapping("/home")
	public String execute() {
		return "publico/login";
	}
	
	@RequestMapping("/loginForm")
	public String login() {
		return "publico/login";
	}

	@RequestMapping("/efetuaLogin")
	public String efetuaLogin(Usuarios usuario, HttpSession session, Model model){
		Usuarios usr = new UsuariosDao().getUsuarioLogin(usuario); 
		if(usr != null && usr.getAtivo() == true) {
			/* Validar se é um usuário ativo */
			session.setAttribute("usuarioLogado", usr);
			model.addAttribute("usuario", usr);
			return "publico/index";
		}else {
			return "redirect:loginForm";
		}
	}
	
	@RequestMapping("/verPerfil")
	public String verPerfil(Usuarios usuario, Model model) {
		
		model.addAttribute("usuario", dao.getUsuario(usuario));
		return "usuario/perfil";
	}
	
	@RequestMapping("/cadastro")
	public String form() {
		return "publico/cadastrar"; 
	}
	
	@RequestMapping("/adicionarUsuario")
	public String cadastrarUsuario(@Valid Usuarios usuario, BindingResult result) {
		
		if(result.hasFieldErrors("nome") || result.hasFieldErrors("sobrenome")) {
			return "redirect:cadastro";
		}
		
		dao.adicionaUsuario(usuario);
		
		return "redirect:home";
	}
	
	@RequestMapping("/alterarUsuario")
	public String alterarUsuario(Usuarios usuario) {
		if(usuario.getSenha() != null) {
			dao.alterarUsuario(usuario);
			return "redirect:verPerfil";
		}
		return "redirect:verPerfil";
	}
	
	@RequestMapping("/desativaUsuario")
	public String desativaUsuario(Usuarios usr) throws SQLException {
			
			dao.desativarUsuario(usr);
			return "redirect:efetuaLogin";
	}
}
