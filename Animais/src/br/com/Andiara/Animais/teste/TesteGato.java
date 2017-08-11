package br.com.Andiara.Animais.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.Andiara.Animais.model.Gato;
import br.com.Andiara.Animais.service.GatoService;

public class TesteGato {

	public static void main(String[] args) throws SQLException {
		
		/*
		 * Cria a lista de gatos que exitem no banco de dados através da classe GatoService
		 */
		List<Gato> lGatos = new GatoService().listarGatos();
		

		/*
		 * Imprime os dados de todos os gatos que existem no banco de dados
		 */
		for(Gato gato : lGatos) {
			
            System.out.println(gato.toString());
    
        }
		
	}

}