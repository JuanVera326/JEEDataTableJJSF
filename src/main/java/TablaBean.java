import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TablaBean {
	
	private static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	private Persona miPersona;
	private String mensaje;
	
	public TablaBean() {
		miPersona = new Persona();
	}
	
	public void agregarPersona() {
		boolean valid = validar();
		if (valid == true) {
			listaPersonas.add(miPersona);
			miPersona = new Persona();
		}else {
			System.out.println("No va a entrar");
		}
	}
	
	public boolean validar() {
		if (miPersona.getNombre().equals("")) {
			setMensaje("Por Favor Ingrese un Nombre!!!");
			return false;
		}else if (miPersona.getApellido().equals("")) {
			setMensaje("Por Favor Ingrese un Apellido!!!");
			return false;
		}else if (miPersona.getEdad() <= 0 || miPersona.getEdad() >= 120) {
			setMensaje("Por Favor Ingrese un Edad Valida!!!");
			return false;
		}else if (miPersona.getProfesion().equals("")) {
			setMensaje("Por Favor Ingrese un Profesion!!!");
			return false;
		}else if (miPersona.getSalario() <= 0) {
			setMensaje("Por Favor Ingrese un Salario!!!");
			return false;
		}else {
			setMensaje("");
			return true;
		}
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String msj) {
		this.mensaje = msj;
	}

	public void eliminarPersona(Persona miPersona) {
		listaPersonas.remove(miPersona);
	}
	
	public void editarPersona(Persona miPersona) {
		miPersona.setEditar(true);
	}
	
	public void guardarPersona() {
		for (Persona persona : listaPersonas) {
			persona.setEditar(false);
		}
	}
	
	public Persona getMiPersona() {
		return miPersona;
	}

	public void setMiPersona(Persona miPersona) {
		this.miPersona = miPersona;
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}
}
