package classroom;

public class Tipo {
	DISCIPLINAR(50), FUNDAMENTACION(0),ELECTIVA(1)
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
