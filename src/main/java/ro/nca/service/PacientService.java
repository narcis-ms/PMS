package ro.nca.service;

import javax.annotation.Resource;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import ro.nca.domain.entities.Pacient;
import ro.nca.domain.repos.PacientRepo;

@Service
public class PacientService {

    @Resource
    private PacientRepo pacientRepo;

    public List<Pacient> getAll() {
        return pacientRepo.findAll();
    }


    public Pacient save(Pacient pacient) {
        return pacientRepo.save(pacient);
    }

    public Pacient findById(Long id) {
        return pacientRepo.findById(id);
    }
}
