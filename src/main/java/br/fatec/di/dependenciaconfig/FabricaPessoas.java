package br.fatec.di.dependenciaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.fatec.di.templates.Pessoa;
import br.fatec.di.templates.PessoaBrasil;
import br.fatec.di.templates.PessoaJapao;
import br.fatec.di.templates.PessoaMestico;

@Configuration
@ComponentScan("br.fatec.di.dependenciaconfig")
public class FabricaPessoas {

	@Bean(name = { "mauricio" })
	public Pessoa getMauricio() {
		PessoaMestico pessoa = new PessoaMestico();

		pessoa.setIdade(41);
		pessoa.setNome("Mauricio");
		return pessoa;
	}

	@Bean(name = { "kagawa" })
	public Pessoa getShinjiKagawa() {
		PessoaJapao pessoa = new PessoaJapao();

		pessoa.setIdade(29);
		pessoa.setNome("Shinji Kagawa");

		return pessoa;
	}

	@Bean(name = "carlos")
	public Pessoa getCarlos() {
		PessoaBrasil pessoa = new PessoaBrasil();

		pessoa.setIdade(21);
		pessoa.setNome("Carlos");

		return pessoa;
	}

}
