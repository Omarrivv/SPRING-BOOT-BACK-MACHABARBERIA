package pe.edu.vallegrande.barberia_macha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.barberia_macha.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {

}
