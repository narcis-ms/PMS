package ro.nca.web.controler;

import javax.annotation.Resource;
import javax.ws.rs.Path;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ro.nca.domain.entities.Pacient;
import ro.nca.service.PacientService;

@Controller
@RequestMapping ("/pacient")
public class PacientsControler {

    @Resource
    private PacientService pacientService;

    @RequestMapping ( method =  RequestMethod.GET)
    public @ResponseBody List<Pacient> getAll(){
        return pacientService.getAll();
    }

    @RequestMapping (value = "{id}", method =  RequestMethod.GET)
    public @ResponseBody Pacient findById(@PathVariable Long id){
        return pacientService.findById(id);
    }

    @RequestMapping (method =  RequestMethod.PUT)
    public ResponseEntity<Pacient> addPacient(@RequestBody Pacient pacient){
        Pacient persistedPacient = pacientService.save(pacient);
        return new ResponseEntity<>(persistedPacient, HttpStatus.OK);
    }
}
