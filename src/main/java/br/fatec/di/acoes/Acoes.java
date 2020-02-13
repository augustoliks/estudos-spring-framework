package br.fatec.di.acoes;

import org.springframework.stereotype.Component;

import br.fatec.di.caracteristicas.Brasileiro;
import br.fatec.di.caracteristicas.Japones;
import br.fatec.di.caracteristicas.Mestico;
import br.fatec.di.templates.PessoaJapao;

@Component
public class Acoes {

	private Mestico mauricioMestico;
	private Brasileiro mauricioBrasileiro;
	private Japones mauricioJapones;
	private Brasileiro carlosBrasileiro;
	private PessoaJapao shinjiKagawaJapones;

	public Acoes(Mestico mauricioMestico, Brasileiro carlosBrasileiro, PessoaJapao shinjiKagawaJapones) {
		super();
		this.mauricioMestico = mauricioMestico;
		this.mauricioBrasileiro = mauricioMestico;
		this.mauricioJapones = mauricioMestico;
		this.carlosBrasileiro = carlosBrasileiro;
		this.shinjiKagawaJapones = shinjiKagawaJapones;
	}

	public void comoJogamBola() {
		System.out.println("Carlos: ");
		System.out.println(this.carlosBrasileiro.jogarBola("excelente"));

		System.out.println("Mauricio: ");
		System.out.println(this.mauricioBrasileiro.jogarBola("muito bem"));

		System.out.println("Shinja Kagawa NAO JOGA BOLA porque eh Japones");
	}

	public void comoFalamPortugues() {
		System.out.println("Mauricio: ");
		System.out.println(this.mauricioBrasileiro.falarPortugues("muito bem"));
		
		System.out.println("Carlos: ");
		System.out.println(this.mauricioBrasileiro.falarPortugues("excelente"));

		System.out.println("Shinja Kagawa NAO FALA PORTUGUES porque eh Japones");
	}

	public void comoFalamJapones() {
		System.out.println("Mauricio: ");
		System.out.println(this.mauricioJapones.falarJapones("muito bem"));

		System.out.println("Kagawa: ");
		System.out.println(this.shinjiKagawaJapones.falarJapones("excelente"));

		System.out.println("Carlos NAO FALA JAPONES porque eh Brasileiros");
	}

	public void comoTraduz() {
		System.out.println("Mauricio: ");
		System.out.println(this.mauricioMestico.falarJapones("Muito bem"));
		System.out.println(this.mauricioMestico.falarPortugues("Muito bem"));
		System.out.println(this.mauricioMestico.traduzir("Muito bem"));

		System.out.println("Carlos NAO FALA JAPONES, logo nao traduz");
		System.out.println("Shinji Kagawa NAO FALA PORTUGUES, logo nao traduz");
	}
}
