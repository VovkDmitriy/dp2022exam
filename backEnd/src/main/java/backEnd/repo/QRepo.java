package backEnd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import backEnd.ent.Quantity;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface QRepo extends JpaRepository<Quantity, Integer>{

}
