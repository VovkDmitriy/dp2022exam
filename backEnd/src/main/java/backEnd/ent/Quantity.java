package backEnd.ent;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quantity")
public class Quantity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	private int quantity;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "entity2_id", nullable = false)
	    private Entity2 entity2;

	public Quantity(int id, int quantity, Entity2 entity2) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.entity2 = entity2;
	}

	public Quantity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	 
	
	public Entity2 getEntity2() {
		return entity2;
	}

	public void setEntity2(Entity2 entity2) {
		this.entity2 = entity2;
	}

	@Override
	public String toString() {
		return "{\"id\": " + id + ", \"quantity\": "+quantity+"}";
	}
}
