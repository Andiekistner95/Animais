package br.com.Andiara.Animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.Andiara.Animais.model.Gato;

public class GatoDAO {

private final Connection con;
	
	public GatoDAO(Connection con) {
		this.con = con;
	}
	public List<Gato> lista() throws SQLException {
		List<Gato> Lgatos = new ArrayList<>();

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

					String nome = rs.getString("nome");
					String cor = rs.getString("cor");
					int qnt_patas = rs.getInt("qnt_patas");
					Gato gato = new Gato(nome, cor, qnt_patas);
					Lgatos.add(gato);
				}
			}
		}

		return Lgatos;

	}
}
