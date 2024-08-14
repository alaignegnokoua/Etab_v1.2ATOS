package services;

import models.Eleve;

import java.util.List;

public interface IEleveService {

    Eleve Ajouter(Eleve eleve);
    Eleve modifier(Eleve eleve);
    void supprimer(int identifiant);
    Eleve Obtenir(int identifiant);
}
