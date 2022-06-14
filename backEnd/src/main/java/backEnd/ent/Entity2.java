package backEnd.ent;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "entity2")
public class Entity2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private String title;
	private int age;
	
	@OneToMany(mappedBy = "entity2", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Quantity> quantities;
	
	
	public Entity2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entity2(int id, String title, int age) {
		super();
		this.id = id;
		this.title = title;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"title\": \""+title+"\", \"age\": " + age + "}";
	}
	
}
