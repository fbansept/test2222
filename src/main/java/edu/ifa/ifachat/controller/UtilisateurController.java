package edu.ifa.ifachat.controller;

import edu.ifa.ifachat.dao.UtilisateurDao;
import edu.ifa.ifachat.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class UtilisateurController {

    private UtilisateurDao utilisateurDao;

    @Autowired
    public UtilisateurController(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable int id) {

        return utilisateurDao.findById(id).orElse(null);
    }

    @GetMapping("/liste-utilisateur")
    public List<Utilisateur> getListeUtilisateurs() {

        List<Utilisateur> listeUtilisateur = utilisateurDao.findAll();

        return listeUtilisateur;
    }
}
