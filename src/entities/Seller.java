package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Seller implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private LocalDate birthDate;
	private Double salary;
	
	private Department deprtament;
	
	public Seller() {
	}

	public Seller(Integer id, String name, String email, LocalDate birthDate, Double salary, Department deprtament) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.salary = salary;
		this.deprtament = deprtament;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDeprtament() {
		return deprtament;
	}

	public void setDeprtament(Department deprtament) {
		this.deprtament = deprtament;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", salary="
				+ salary + ", deprtament=" + deprtament + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDate, deprtament, email, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(deprtament, other.deprtament)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
	
}
