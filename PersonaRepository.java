
package com.miaplicacion.primerproyecto4.repository;

import com.miaplicacion.primerproyecto4.Controler.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{

    public void save(Persona per);

    public List<Persona> findAll();

    public void deleteById(Long id);

    public Persona findById(Long id);
    
}
