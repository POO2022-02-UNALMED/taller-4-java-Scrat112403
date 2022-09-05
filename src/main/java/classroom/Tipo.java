package classroom;

public class Tipo {
	int DISCIPLINAR= 50;
	int FUNDAMENTACION= 0;
	int ELECTIVA=1;
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
