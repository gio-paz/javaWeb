package modelo;

public class login {
	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String ciudad;
	private String pais;
	
	public String getApellido() {
		return apellido;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public String getEmail() {
		return email;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getPais() {
		return pais;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}

