package com.example.spring.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project LucaTicketUsuarioService
 *
 * @ClassName Usuario
 *
 * @author Jennifer Pérez y Sara Silvo
 *
 * @date 7 jul. 2021
 * 
 * @version 1.0
 */



@Data 
@AllArgsConstructor 
@NoArgsConstructor

public class Usuario {
	
	/**
	 * Atributo serialVersionUID
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private String apellido;
	private String mail;
	private String contrasenia;
	private String fecha_alta;
	private String rol;
/*
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<String> roles = new ArrayList();
		roles.add(rol);
		return roles.stream().map(ur -> new SimpleGrantedAuthority("ROLE_" + rol)).collect(Collectors.toList());
		//Collection<SimpleGrantedAuthority> roles = new HashSet<SimpleGrantedAuthority>();
		//roles.add(new SimpleGrantedAuthority(rol));
		//return roles;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}


	@Override
	public boolean isAccountNonLocked() {
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return this.contrasenia;
	}

	@Override
	public String getUsername() {
		return this.mail;
	}
*/	
}
