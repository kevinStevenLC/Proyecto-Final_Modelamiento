package project.model;

public class Producto {
	private int idProducto;
	private String descripcionP;
	private float precio;
	private int inv;
	private int categoria;

	public Producto(String descripcionP, float precio, int inv, int categoria) {
		this.descripcionP = descripcionP;
		this.precio = precio;
		this.inv = inv;
		this.categoria = categoria;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcionP() {
		return descripcionP;
	}

	public void setDescripcionP(String descripcionP) {
		this.descripcionP = descripcionP;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getInv() {
		return inv;
	}

	public void setInv(int inv) {
		this.inv = inv;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
}
