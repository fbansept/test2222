package edu.ifa.ifachat.controller;

import edu.ifa.ifachat.dao.SalonDao;
import edu.ifa.ifachat.model.Salon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SalonController {

    private SalonDao salonDao;

    @Autowired
    public SalonController(SalonDao salonDao) {
        this.salonDao = salonDao;
    }

    @GetMapping("/salon/{id}")
    public Salon getSalon(@PathVariable int id) {

        return salonDao.findById(id).orElse(null);
    }

    @GetMapping("/liste-salon")
    public List<Salon> getListeSalons() {

        List<Salon> listeSalon = salonDao.findAll();

        return listeSalon;
    }
}
