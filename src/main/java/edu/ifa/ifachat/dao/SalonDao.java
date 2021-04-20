package edu.ifa.ifachat.dao;

import edu.ifa.ifachat.model.Salon;
import edu.ifa.ifachat.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonDao extends JpaRepository<Salon,Integer> {
}
