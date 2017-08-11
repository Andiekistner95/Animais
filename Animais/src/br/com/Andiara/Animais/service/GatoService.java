package br.com.Andiara.Animais.service;

	import java.sql.Connection;
	import java.sql.SQLException;
	import java.util.List;

import br.com.Andiara.Animais.dao.GatoDAO;
import br.com.Andiara.Animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.Andiara.Animais.model.Gato;

	public class GatoService {
			
		/*
		 * O método listarCachorros() vai passar a conexão como parametro para 
		 * a classe CachorroDAO e executar o metodo lista() da classe CachorroDAO
		 * e vai retornar a lista de cachorros encontradas no banco de dados
		 */
		public List<Gato> listarGatos() throws SQLException{
			
			// usa o try para tentar executar os comandos abaixo, conectando no banco e retornando a lista
			try (Connection con = new ConnectionPoolOracle().getConnection()) {
	            return new GatoDAO(con).lista();
			}
		}
	}
