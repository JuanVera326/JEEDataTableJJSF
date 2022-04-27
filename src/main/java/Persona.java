
public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String profesion;
	private double salario;
	private String sexo;
	private boolean editar;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apellido, int edad, String profesion, double salario, String sexo, boolean editar) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.profesion = profesion;
		this.salario = salario;
		this.sexo = sexo;
		this.editar = editar;
	}

	public boolean isEditar() {
		return editar;
	}

	public void setEditar(boolean editar) {
		this.editar = editar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
