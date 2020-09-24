import java.util.Random;
public class PlayList {
	private Cancion[] misCanciones;
	public int tamano;

	public PlayList(int capacidad) { //testeado
		this.setTamano(0);
		this.setMisCanciones(new Cancion[capacidad] );

	}
	// getter & setter//////////////////////////////////////////////////////////////////////////////////////////////////
	public Cancion[] getMisCanciones() {//testeado
		return misCanciones;
	}

	public void setMisCanciones(Cancion[] misCanciones) {//testeado
		this.misCanciones = misCanciones;
	}

	public int getTamano() {
		return tamano;
	}

	private void setTamano(int tamano) {
		this.tamano = tamano;
	}
	/* metod oss*///////////////////////////////////////////////////////////////////////////////////////////////////////
	public void agregarCancion(Cancion nuevaCancion) {//testeado
		if(this.getTamano() == this.getMisCanciones().length) {
			System.out.println(this.toString(1));
		}
		else { this.getMisCanciones()[this.getTamano()] = nuevaCancion;
		this.setTamano(this.getTamano()+1);
		System.out.println(this.toString(2));
		}
	}

	public int consultarDuracionTema (String tituloCancion) {
		boolean encontrado=false;
		int duracion=0;
		for(int i=0; i<this.getTamano(); i++) {
			if(this.getMisCanciones()[i].getTitulo().equalsIgnoreCase(tituloCancion)) {
				duracion = this.getMisCanciones()[i].getDuracion();
				encontrado=true;
				this.calcularTiempoDuracion(duracion);

			}
		}
		if (!encontrado) System.out.println( this.toString(3) + tituloCancion);
	return duracion;
}
	

	public boolean quitarCancion(String dato) {
		boolean borrado=false;
		int cancionNum=0;

		for(int i=0; i<this.getTamano(); i++) {
			if(this.getMisCanciones()[i].getTitulo().equalsIgnoreCase(dato)) {
				this.getMisCanciones()[i]=null;
				this.setTamano(this.getTamano()-1);

				borrado=true;

				for(cancionNum=i; cancionNum<this.getTamano(); cancionNum++) {
					this.getMisCanciones()[cancionNum]=this.getMisCanciones()[cancionNum+1];
				}
			}
		}
		for(int i=0; i<this.getTamano(); i++) {
			if (this.getMisCanciones()[i].getAlbum().equalsIgnoreCase(dato)) {
				this.getMisCanciones()[i]=null;
				this.setTamano(this.getTamano()-1);

				borrado=true;

				for(cancionNum=i; cancionNum<this.getTamano(); cancionNum++) {
					this.getMisCanciones()[cancionNum]=this.getMisCanciones()[cancionNum+1];
				}
			}
		}
		for(int i=0; i<this.getTamano(); i++) {
			if(this.getMisCanciones()[i].getArtista().equalsIgnoreCase(dato)) {
				this.getMisCanciones()[i]=null;
				this.setTamano(this.getTamano()-1);

				borrado=true;

				for(cancionNum=i; cancionNum<this.getTamano(); cancionNum++) {
					this.getMisCanciones()[cancionNum]=this.getMisCanciones()[cancionNum+1];
				}
			}
		}
		if(!borrado) System.out.println(this.toString(3));
		return borrado;
	}

	public boolean quitarCancion(int duracion) {
		boolean borrado=false;
		int cancionNum=0;

		for(int i=0; i<this.getTamano(); i++) {
			if(this.getMisCanciones()[i].getDuracion() == duracion) {
				this.getMisCanciones()[i]=null;
				this.setTamano(this.getTamano()-1);

				borrado=true;

				for(cancionNum=i; cancionNum<this.getTamano(); cancionNum++) {
					this.getMisCanciones()[cancionNum]=this.getMisCanciones()[cancionNum+1];
				}
			}
		}

		if(!borrado) System.out.println(this.toString(3));
	return borrado;
	}

	public int duracionTotalPlayList() {
		int total=0;

		for(int i=0; i<this.getTamano();i++) {
			total+=this.getMisCanciones()[i].getDuracion();
		}

		this.calcularTiempoDuracion(total);
	return total;
	}

	public int cantidadCanciones() {
		System.out.println(this.toString(4) + this.getTamano());
		return this.getTamano();
	}

	public boolean mayorYmenorDuracion() {
		boolean ban=false;
		int mayor=this.getMisCanciones()[0].getDuracion();
		int posicionMayor=0;
		int menor=this.getMisCanciones()[0].getDuracion();
		int posicionMenor=0;

		for(int i=1; i<this.getTamano();i++) {
			if(mayor<this.getMisCanciones()[i].getDuracion()) {
				mayor=this.getMisCanciones()[i].getDuracion();
				posicionMayor=i;
				ban =true;

			}
			if(menor>this.getMisCanciones()[i].getDuracion()) {
				menor=this.getMisCanciones()[i].getDuracion();
				posicionMenor=i;
				ban=true;
			}
		}

		System.out.println( this.toString(5) + this.getMisCanciones()[posicionMayor].getTitulo());
		System.out.println(this.toString(6) + this.getMisCanciones()[posicionMenor].getTitulo());
		return ban;
	}

	public boolean mostrarListaOrdenadaPorTitulo() {
		boolean ordenado = false;
		Cancion aux;//declaramos la variable aux de tipo Cancion para almacenar un dato
		//se recorre el tamano del array con dos for, evaluando los titulos con compareTo
		for(int i=0; i<this.getTamano();i++) {
			for(int j=0; j<this.getTamano();j++ ) {
				if(this.getMisCanciones()[i].getTitulo().compareToIgnoreCase(this.getMisCanciones()[j].getTitulo()) <0) {
					aux=this.getMisCanciones()[i];
					this.getMisCanciones()[i]=this.getMisCanciones()[j];
					this.getMisCanciones()[j]=aux;
					ordenado = true;
				}
			}
		}

		for(int i=0; i<this.getTamano();i++) {
			System.out.println((i+1) + "_	" + this.getMisCanciones()[i].getTitulo() + "[" + this.toString(7) + this.getMisCanciones()[i].getArtista() + "]");
		}
		return ordenado;
	}

	public boolean mostrarListaOrdenadaPorArtista() {
		boolean ordenado = false;
		Cancion aux;

		for(int i=0; i<this.getTamano(); i++) {
			for(int j=0; j<this.getTamano(); j++) {
				if(this.getMisCanciones()[i].getArtista().compareToIgnoreCase(this.getMisCanciones()[j].getArtista()) <=0 ) {
					aux=this.getMisCanciones()[i];
					this.getMisCanciones()[i]=this.getMisCanciones()[j];
					this.getMisCanciones()[j]=aux;
					ordenado = true;
				}
			}
		}

		for(int i=0; i<this.getTamano();i++) {
			System.out.println("[" + (i+1) + "] " + this.toString(7) + this.getMisCanciones()[i].getArtista() + this.toString(8) + this.getMisCanciones()[i].getTitulo());
		}
		return ordenado;
	}
	//metodo para pasar los segundo a horas, minutos y seguros
	private void calcularTiempoDuracion(int segundos) {
		int seg = segundos % 60; 
		int min = segundos % 3600/60; 
		int hs = segundos % 86400/3600; 

		System.out.println("["+hs+":"+min+":"+seg+"]");
	}

	public void randomCancion() {
		Random MiAleatorio = new Random();
		int n =MiAleatorio.nextInt(this.getTamano());
		System.out.println(this.toString(9) + this.getMisCanciones()[n].getTitulo() 
							+ this.toString(10) +this.getMisCanciones()[n].getDuracion());	
	}
	
	public String toString(int cm) {
		String m="";
		switch (cm){	
			case 1: m = "Lista llena"; break;
			case 2: m= "Carga existosa";break;
			case 3: m= "No se encontro el tema: ";break;
			case 4: m= "La cantidad de canciones de la lista es de: ";break;
			case 5: m= "La cancion de mayor duracion es: ";break;
			case 6: m= "La cancion de menor duracion es: ";break;
			case 7: m=  "Artista: "; break;
			case 8: m= ", Titulo: ";break;
			case 9: m= "La Cancion Aleatoria es:";break;
			case 10: m= "\nDuracion:";break;
			case 11: m= ">";break;
		}
		return m;		
	}
	
}
