package br.fatec.di.templates;


import br.fatec.di.caracteristicas.Japones;

public class PessoaJapao extends Pessoa implements Japones{

	private String RGJapones;
	
	@Override
	public String falarJapones(String nivelQualidade) {
		return "Fala japones: " + nivelQualidade;
	}

	public String getRGJapones() {
		return RGJapones;
	}

	public void setRGJapones(String rGJapones) {
		RGJapones = rGJapones;
	}

}
