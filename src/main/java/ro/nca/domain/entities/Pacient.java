package ro.nca.domain.entities;

import javax.persistence.Entity;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.AbstractPersistable;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"new"})
@Entity
public class Pacient extends AbstractPersistable<Long> {

    @Getter
    @Setter
    private String name;
}
