package com;

public class ConsumoEnergia {


	private String Jugando;
	private String MirandoVideo;
	private String ModoEspera;
	
	public ConsumoEnergia() {}

	public ConsumoEnergia(String jugando, String mirandoVideo, String modoEspera) {
		super();
		Jugando = jugando;
		MirandoVideo = mirandoVideo;
		ModoEspera = modoEspera;
	}

	public String getJugando() {
		return Jugando;
	}

	public void setJugando(String jugando) {
		Jugando = jugando;
	}

	public String getMirandoVideo() {
		return MirandoVideo;
	}

	public void setMirandoVideo(String mirandoVideo) {
		MirandoVideo = mirandoVideo;
	}

	public String getModoEspera() {
		return ModoEspera;
	}

	public void setModoEspera(String modoEspera) {
		ModoEspera = modoEspera;
	}
	
	
	
}
