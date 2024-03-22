package com.proyecto;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class BeanInicio implements Serializable {

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	private String texto;

	public void consultarMensaje() {

		try {

			FacesContext.getCurrentInstance().getExternalContext().redirect("mostrar.xhtml?texto=" + texto);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
