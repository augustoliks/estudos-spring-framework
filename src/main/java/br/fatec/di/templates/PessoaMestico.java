package br.fatec.di.templates;

import br.fatec.di.caracteristicas.Mestico;

public class PessoaMestico extends Pessoa implements Mestico {

	private String RGJapones;
	private String RGBrasileiro;

	public String getRGJapones() {
		return RGJapones;
	}

	public void setRGJapones(String rGJapones) {
		RGJapones = rGJapones;
	}

	public String getRGBrasileiro() {
		return RGBrasileiro;
	}

	public void setRGBrasileiro(String rGBrasileiro) {
		RGBrasileiro = rGBrasileiro;
	}

	@Override
	public String falarPortugues(String nivelQualidade) {
		return "Fala portugues: " + nivelQualidade;
	}

	@Override
	public String jogarBola(String nivelQualidade) {
		return "Joga bola " + nivelQualidade;
	}

	@Override
	public String falarJapones(String nivelQualidade) {
		return "Fala japones: " + nivelQualidade;
	}

	@Override
	public String traduzir(String nivelQualidade) {
		return "Traduz: " + nivelQualidade;
	}

}
