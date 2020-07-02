package com.aws.bms.useraccountservice.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "BMS_Users")
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4495494364954892602L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;

	@Column(name = "Name", nullable = false)
	private String Name;

	@Column(name = "Password", nullable = false)
	private String Password;

	@Column(name = "Email", nullable = false)
	private String Email;

	@Column(name = "PAN", nullable = false)
	private String PAN;

	@Column(name = "Address", nullable = false)
	private String Address;

	@Column(name = "DOB", nullable = false)
	private Date DOB;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	public Date CreatedAt;

	@Column(name = "created_by", nullable = false)
	@CreatedBy
	public String CreatedBy;

	@Column(name = "updated_at", nullable = false)
	@LastModifiedDate
	public Date UpdatedAt;
	
	@Column(name = "updated_by", nullable = false)
	@LastModifiedBy
	public String UpdatedBy;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Date getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Date getUpdatedAt() {
		return UpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		UpdatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((CreatedAt == null) ? 0 : CreatedAt.hashCode());
		result = prime * result + ((CreatedBy == null) ? 0 : CreatedBy.hashCode());
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ID;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((PAN == null) ? 0 : PAN.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + ((UpdatedAt == null) ? 0 : UpdatedAt.hashCode());
		result = prime * result + ((UpdatedBy == null) ? 0 : UpdatedBy.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (CreatedAt == null) {
			if (other.CreatedAt != null)
				return false;
		} else if (!CreatedAt.equals(other.CreatedAt))
			return false;
		if (CreatedBy == null) {
			if (other.CreatedBy != null)
				return false;
		} else if (!CreatedBy.equals(other.CreatedBy))
			return false;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (ID != other.ID)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (PAN == null) {
			if (other.PAN != null)
				return false;
		} else if (!PAN.equals(other.PAN))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (UpdatedAt == null) {
			if (other.UpdatedAt != null)
				return false;
		} else if (!UpdatedAt.equals(other.UpdatedAt))
			return false;
		if (UpdatedBy == null) {
			if (other.UpdatedBy != null)
				return false;
		} else if (!UpdatedBy.equals(other.UpdatedBy))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", Name=" + Name + ", Password=" + Password + ", Email=" + Email + ", PAN=" + PAN
				+ ", Address=" + Address + ", DOB=" + DOB + ", CreatedAt=" + CreatedAt + ", CreatedBy=" + CreatedBy
				+ ", UpdatedAt=" + UpdatedAt + ", UpdatedBy=" + UpdatedBy + "]";
	}
	
	

}
