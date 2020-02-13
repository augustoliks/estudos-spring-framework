package br.fatec.di.templates;

import br.fatec.di.caracteristicas.Brasileiro;

public class PessoaBrasil extends Pessoa implements Brasileiro {

	private String RGBrasil;

	public String getRGBrasil() {
		return RGBrasil;
	}

	public void setRGBrasil(String rGBrasil) {
		RGBrasil = rGBrasil;
	}

	@Override
	public String falarPortugues(String nivelQualidade) {
		return "Fala portugues: " + nivelQualidade;
	}

	@Override
	public String jogarBola(String nivelQualidade) {
		return "Joga Bola: " + nivelQualidade;
	}

}
