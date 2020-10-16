package model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiculeRepository extends CrudRepository<Vehicule, Integer> {
    List<Vehicule> findByPlate(int plateNumber);
}