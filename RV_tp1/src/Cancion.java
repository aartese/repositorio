
public class Cancion {

	private String titulo;
	private String album;
	private String artista;
	private int duracion;
	
	public Cancion(String titulo, String album, String artista, int duracion) {
		this.setTitulo(titulo);
		this.setAlbum(album);
		this.setArtista(artista);
		this.setDuracion(duracion);
	}
	
	public Cancion(String titulo, String album, int duracion) {
		this.setTitulo(titulo);
		this.setAlbum(album);
		this.setDuracion(duracion);
	}
	
	public Cancion(String titulo, int duracion) {
		this.setTitulo(titulo);
		this.setDuracion(duracion);
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	

}
