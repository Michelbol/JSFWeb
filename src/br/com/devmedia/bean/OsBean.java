package br.com.devmedia.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="osI")
@RequestScoped
public class OsBean {
 
	private String texto;
	
	public String getTexto(){
		return texto;		
	}
	public void setTexto(String texto){
		this.texto = texto;
	}
	
	
}
