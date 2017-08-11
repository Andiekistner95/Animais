package br.com.Andiara.Animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.Andiara.Animais.model.Porquinho_India;

public class Porquinho_IndiaDAO {

private final Connection con;
	
	public Porquinho_IndiaDAO(Connection con) {
		this.con = con;
	}
	public List<Porquinho_India> lista() throws SQLException {
		List<Porquinho_India> LporquinhosDaIndia = new ArrayList<>();

		// traz os registros do banco de dados da tabela "cachorro"
		String sql = "select * from GATO";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
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
					Porquinho_India porquinho = new Porquinho_India(nome, cor, qnt_patas);
					LporquinhosDaIndia.add(porquinho);
				}
			}
		}

		return LporquinhosDaIndia;

	}
}

