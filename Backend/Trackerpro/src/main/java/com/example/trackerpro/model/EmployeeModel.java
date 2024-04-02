package com.example.trackerpro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeModel {
	@Id
	private int e_id;
	private String e_name;
	private String e_email;
	private String e_pw;
	private String e_phone;
	private String e_img;

	public int getE_id() {
		return e_id;
	}

	public EmployeeModel() {

	}

	public EmployeeModel(int e_id, String e_name, String e_email, String e_pw, String e_phone, String e_img) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_email = e_email;
		this.e_pw = e_pw;
		this.e_phone = e_phone;
		this.e_img = e_img;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_email() {
		return e_email;
	}

	public void setE_email(String e_email) {
		this.e_email = e_email;
	}

	public String getE_pw() {
		return e_pw;
	}

	public void setE_pw(String e_pw) {
		this.e_pw = e_pw;
	}

	public String getE_phone() {
		return e_phone;
	}

	public void setE_phone(String e_phone) {
		this.e_phone = e_phone;
	}

	public String getE_img() {
		return e_img;
	}

	public void setE_img(String e_img) {
		this.e_img = e_img;
	}

	@Override
	public String toString() {
		return "EmployeeModel [e_id=" + e_id + ", e_name=" + e_name + ", e_email=" + e_email + ", e_pw=" + e_pw
				+ ", e_phone=" + e_phone + ", e_img=" + e_img + "]";
	}

}
