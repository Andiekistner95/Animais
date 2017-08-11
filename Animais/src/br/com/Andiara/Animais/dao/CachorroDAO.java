package br.com.Andiara.Animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.Andiara.Animais.model.Cachorro;

public class CachorroDAO {

	private final Connection con;

	public CachorroDAO(Connection con) {
		this.con = con;

	}

	public List<Cachorro> lista() throws SQLException {
		List<Cachorro> Lcachorros = new ArrayList<>();

		// traz os registros do banco de dados da tabela "cachorro"
		String sql = "select * from CACHORRO";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			
			// executa  a query definida na variavel sql no banco de dados
			stmt.execute();

			// se tiver resultado (encontra dados na tabela ) ele executa o
			// codigo abaixo
			
			try (ResultSet rs = stmt.getResultSet()) {
				// faz um loop usando while para pegar os dados e criar os
				// objetos do tipo cachorro
				while (rs.next()) {

					String nome = rs.getString("NOME");
					String cor = rs.getString("COR");
					int qnt_patas = rs.getInt("QNT_PATAS");
					Cachorro cachorro = new Cachorro(nome, cor, qnt_patas);
					Lcachorros.add(cachorro);
				}
			}
		}

		return Lcachorros;

	}
}
