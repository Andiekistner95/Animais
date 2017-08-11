package br.com.Andiara.Animais.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Animais.dao.CachorroDAO;
import br.com.Andiara.Animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.Andiara.Animais.model.Cachorro;

public class CachorroService {

	/*public void inserirBanda(String nomeBanda, Date dataCriacao, Pais pais){
		if(dataCriacao.after(new Date())){
			throw new IllegalArgumentException("A data de criação deve ser menor que a data atual");
		}
		
		Banda banda = new Banda();
		banda.setNome(nome);
		
		BandaDAO dao = new BandaDAO(con);
		dao.inserir(banda);
	}*/
	
	
	/*
	 * O método listarCachorros() vai passar a conexão como parametro para 
	 * a classe CachorroDAO e executar o metodo lista() da classe CachorroDAO
	 * e vai retornar a lista de cachorros encontradas no banco de dados
	 */
	public List<Cachorro> listarCachorros() throws SQLException{
		
		// usa o try para tentar executar os comandos abaixo, conectando no banco e retornando a lista
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CachorroDAO(con).lista();
		}
		
	}
}
