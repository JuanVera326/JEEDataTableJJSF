import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TablaBean {
	
	private static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	private Persona miPersona;
	
	public TablaBean() {
		miPersona = new Persona();
	}
	
	public void agregarPersona() {
		listaPersonas.add(miPersona);
		miPersona = new Persona();
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
