package br.fatec.di;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.fatec.di.acoes.Acoes;
import br.fatec.di.dependenciaconfig.FabricaPessoas;
import br.fatec.di.templates.PessoaBrasil;
import br.fatec.di.templates.PessoaJapao;
import br.fatec.di.templates.PessoaMestico;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext fabricaContexto = new AnnotationConfigApplicationContext(
				FabricaPessoas.class);

		PessoaMestico pessoaMestico = (PessoaMestico) fabricaContexto.getBean("mauricio");
		PessoaBrasil pessoaBrasil = (PessoaBrasil) fabricaContexto.getBean("carlos");
		PessoaJapao pessoaJapones = (PessoaJapao) fabricaContexto.getBean("kagawa");

		Acoes acoes = new Acoes(pessoaMestico, pessoaBrasil, pessoaJapones);
		
		acoes.comoJogamBola();
		acoes.comoFalamJapones();
		acoes.comoFalamPortugues();
		acoes.comoTraduz();

		fabricaContexto.close();

	}

}
