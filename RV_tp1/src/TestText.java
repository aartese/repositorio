import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestText {

	PlayList list;
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
	
	@Before
	public void setUp() throws Exception {
		list = new PlayList(10);	
		
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
	}
	@After
	public void tearDown() throws Exception {
		
	}
	@Test
	public void agregarCanciontest() {
		
		list.agregarCancion(song1);
		Cancion actual = list.getMisCanciones()[0];
		Cancion esperado = song1;
		assertEquals(esperado, actual);
			
	}
	@Test
	public void cantidadCancionesTest() {
				
		int actual = list.cantidadCanciones();
		int esperado = 10;
		assertEquals(esperado, actual);	
	}
	@Test
	public void consultarDuracionTemaTest(){
		
		int actual = list.consultarDuracionTema("por dos");
		int esperado = 1517;
		assertEquals(esperado, actual);
	}
	@Test
	public void quitarCancionTest() {
		
		boolean actual = list.quitarCancion("catriel");
		boolean esperado = true; 
		assertEquals(esperado, actual);
		boolean act =  list.quitarCancion(3600);
		boolean esp = true;
		assertEquals(esp, act);
	}
	@Test
	public void duracionTotalPlayListTest() {
		
		int actual = list.duracionTotalPlayList();
		int esperado = 25410;
		assertEquals(esperado, actual);
	}
	@Test
	public void mayorYmenorDuracionTest() {
		boolean actual = list.mayorYmenorDuracion();
		boolean esperado = true; 
		assertEquals(esperado, actual);
	}
	@Test
	public void mostrarListaOrdenadaPorTituloTest() {
		
		boolean actual = list.mostrarListaOrdenadaPorTitulo();
		boolean esperado = true;
		assertEquals(esperado, actual);
	}
	@Test
	public void mostrarListaOrdenadaPorArtistaTest(){
		boolean actual = list.mostrarListaOrdenadaPorArtista();
		boolean esperado = true;
		assertEquals(esperado, actual);	
	}
	@Test
	public void randomCancionTest() {
		list.randomCancion();
	}
}