
public class TetPlayList {

	public static void main(String[] args) {

		
		PlayList list = new PlayList(10);
		Cancion song1 = new Cancion ("Como hacer", "Riquesa", "Los piyu", 3600);
		Cancion song2 = new Cancion ("hola que tal", "sur", "manbu", 2670);
		Cancion song3 = new Cancion ("zonda", "Casa", "catriel", 1653);
		Cancion song4 = new Cancion ("ahora estas", "Casa", "catriel",600);
		Cancion song5 = new Cancion ("llora", "volver", "siru", 2546);
		Cancion song6 = new Cancion ("LOS QUERANDIE", "Gardeliando", "los gardeles", 1652);
		Cancion song7 = new Cancion ("Polvo", "sombra", "catriel", 4310);
		Cancion song8 = new Cancion ("vamos de nuevo", "polvo", "catriel", 4630);
		Cancion song9 = new Cancion ("Es la hora", "sombra", "Casa", 2232);
		Cancion song10 = new Cancion ("por dos", "sombra", "catriel", 1517);
		
		list.agregarCancion(song1);
		list.agregarCancion(song2);
		list.agregarCancion(song3);
		list.agregarCancion(song4);
		list.agregarCancion(song5);
		list.agregarCancion(song6);
		list.agregarCancion(song7);
		list.agregarCancion(song8);
		list.agregarCancion(song9);
		list.agregarCancion(song10);
		
		list.cantidadCanciones();
		list.mostrarListaOrdenadaPorTitulo();
		list.mostrarListaOrdenadaPorArtista();
		list.consultarDuracionTema("por dos");
		list.quitarCancion("catriel");
		list.mostrarListaOrdenadaPorArtista();
		list.quitarCancion("catriel");
		list.mostrarListaOrdenadaPorArtista();
		
		list.randomCancion();
	}

}
