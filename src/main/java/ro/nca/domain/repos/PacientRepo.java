package ro.nca.domain.repos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.Repository;
import ro.nca.domain.entities.Pacient;

public interface PacientRepo extends Repository<Pacient, Long> {

    List<Pacient> findAll();

    Pacient save(Pacient pacient);

    Pacient findById(Long id);
}
