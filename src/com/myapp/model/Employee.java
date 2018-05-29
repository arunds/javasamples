/**
 * 
 */
package com.myapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

/**
 * @author aruns
 *
 */
@Entity
@Table(name = "app_employee")
@Indexed
@XmlRootElement
public class Employee extends BaseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String empCode;
	private String empName;
	private String empDesignation;
	private String empAddress;
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
	public Long getId() {
		return id;
	}

    @Column(nullable = false, length = 50, unique = true)
    @Field
    public String getEmpCode() {
		return empCode;
	}

    @Column(nullable = false, length = 50, unique = true)
    @Field
	public String getEmpName() {
		return empName;
	}

    @Column(nullable = false, length = 50, unique = true)
    @Field
	public String getEmpDesignation() {
		return empDesignation;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCode == null) ? 0 : empCode.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		com.sun.xml.internal.ws.message.stream.StreamMessage stream = null;
		//stream.
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empCode == null) {
			if (other.empCode != null)
				return false;
		} else if (!empCode.equals(other.empCode))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
