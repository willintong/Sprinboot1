package com.javarevolutions.springboot1.vo;

import java.io.Serializable;

public class VOSofkiano implements Serializable {
 /**
  * 
  */
 private static final long serialVersionUID = 1L;
 private String user;
 private String password;
 private String proyecto;
 private String direccion;
 private boolean find;
public String getUser() {
	return user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getProyecto() {
	return proyecto;
}
public void setProyecto(String proyecto) {
	this.proyecto = proyecto;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public boolean isFind() {
	return find;
}
public void setFind(boolean find) {
	this.find = find;
}
public void setUser(String user) {
	this.user = user;
}

}
