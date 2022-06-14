package backEnd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import backEnd.ent.Entity2;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface EntRepo extends JpaRepository<Entity2, Integer>{

}
