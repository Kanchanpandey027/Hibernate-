package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//pojo class




@Entity
@Table(name="user_tbl")

public class Myuser {

	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int uid;
	
	
	String name;
	String upass;
	public Myuser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public Myuser(int uid, String name, String upass) {
		super();
		this.uid = uid;
		this.name = name;
		this.upass = upass;
	}
	
	public Myuser(String name, String upass) {
		super();
		this.name = name;
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "Myuser [uid=" + uid + ", name=" + name + ", upass=" + upass + "]";
	}
	
}
