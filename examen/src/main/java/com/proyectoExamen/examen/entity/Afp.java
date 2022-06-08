package com.proyectoExamen.examen.entity;

import com.proyectoExamen.examen.enumerator.tipeAFP;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Type;

@Document("afp")
@Data
@NoArgsConstructor
public class Afp {

    @Id
    private Long id;
    private tipeAFP afp;

    public Afp(Long id, tipeAFP afp) {
        this.id = id;
        this.afp = afp;
    }
}
