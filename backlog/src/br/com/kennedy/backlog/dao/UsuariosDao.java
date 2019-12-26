package br.com.kennedy.backlog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.kennedy.backlog.ConnectionFactory;
import br.com.kennedy.backlog.model.Usuarios;

public class UsuariosDao {
	
	private Connection conn; 
	private PreparedStatement stmt;
	private ResultSet rs; 
	
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("backlog");
	EntityManager manager = factory.createEntityManager();

	
	public UsuariosDao() {
		try {
			this.conn = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void adicionaUsuario(Usuarios usuario) {
		/* Novo método utilizando JPA */
				
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
		
		/* Método antigo */
		
		/*String sql = "insert into usuarios " +
				"(nome, sobrenome, cargo, departamento, imediato)" +
				"values(?,?,?,?,?)";
		
		
		
		try {
			//prepara para inserção
		/*	stmt = conn.prepareStatement(sql);

			//seta os valores
			stmt.setString(1, usr.getNome());
			stmt.setString(2, usr.getSobrenome());
			stmt.setString(3, usr.getCargo());
			stmt.setString(4, usr.getDepartamento());
			stmt.setString(5, usr.getImediato());

			//executa e fecha
			stmt.execute();
			stmt.close(); 
			
			
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		} */

	}

	public List<Usuarios> getLista(){
		String sql = "select * from usuarios";
		try {
			List<Usuarios> usr = new ArrayList<Usuarios>();
			stmt = this.conn.prepareStatement(sql);

			//resultset executa a query
			rs = stmt.executeQuery();

			//Varre o banco de dados e popula a lista com o que encontra
			while(rs.next()) {

				//Cria o objeto usuarios
				Usuarios usuario = new Usuarios();
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuario.setDepartamento(rs.getString("departamento"));
				usuario.setCargo(rs.getString("cargo"));
				usuario.setImediato(rs.getString("imediato"));

				//adiciona o objeto na lista
				usr.add(usuario);

				rs.close();
				stmt.close();
			}

			//retorna a lista preenchida com os objetos	
			return usr;
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void desativarUsuario(Usuarios usuario) throws SQLException {
		String sql = "UPDATE usuarios SET ativo = '0'  where usuarios.id = ?";
		
		System.out.println("desativar Usuario, id = " + usuario.getId());
		
		stmt = conn.prepareStatement(sql);
		
		/* Ver uma forma de passar automático se é true ou false e alterar 
		 * o usuario de acordo com a informação recebida */
		
		stmt.setLong(1, usuario.getId());

		//executa e fecha
		stmt.execute();
		stmt.close();

	}

	public void alterarUsuario(Usuarios usuario) {
		try {
			Usuarios usr = usuario; 

			String sql = "UPDATE usuarios SET nome = ?, sobrenome = ?, cargo = ?"
					+ ", departamento = ?, imediato = ? WHERE id = ? ;";

			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, usr.getNome());
			stmt.setString(2, usr.getSobrenome());
			stmt.setString(3, usr.getCargo());
			stmt.setString(4, usr.getDepartamento());
			stmt.setString(5, usr.getImediato());
			stmt.setLong(6, usr.getId());
			
			stmt.execute();
			stmt.close();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Usuarios getUsuarioLogin(Usuarios usr) {
		
		Usuarios usuario = new Usuarios();
		
		System.out.println("loginnnn: " + usr.getLogin());
		System.out.println("senhaaaa: " + usr.getSenha());

		String sql = "select * from usuarios where login = ? and senha = ?;";
		try {

			stmt = conn.prepareStatement(sql);
			stmt.setString(1, usr.getLogin());
			stmt.setString(2, usr.getSenha());
			rs = stmt.executeQuery();

			if(rs.next()) {
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuario.setCargo(rs.getString("cargo"));
				usuario.setDepartamento(rs.getString("departamento"));
				usuario.setImediato(rs.getString("imediato"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setAtivo(rs.getBoolean("ativo"));
			}
	
			rs.close();
			stmt.close();

			return usuario;
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Usuarios getUsuario(Usuarios usr) {
		
		/* Utilizando JPA na busca de objeto pelo ID */
		
		Usuarios usuario = manager.find(Usuarios.class, 1L);
		return usuario;
		
		/* Método antigo utilizando preparedStatement */
		
		/*
		String sql = "select * from usuarios where id = ?;";
		try {

			stmt = conn.prepareStatement(sql);
			stmt.setLong(1, usr.getId());
			rs = stmt.executeQuery();

			if(rs.next()) {
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuario.setCargo(rs.getString("cargo"));
				usuario.setDepartamento(rs.getString("departamento"));
				usuario.setImediato(rs.getString("imediato"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setAtivo(rs.getBoolean("ativo"));
			}
			rs.close();
			stmt.close();

			return usuario;
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		} */
	}

}
