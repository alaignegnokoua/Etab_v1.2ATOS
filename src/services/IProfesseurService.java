package services;

import models.Professeur;

import java.util.List;

public interface IProfesseurService {
    public Professeur Ajouter(Professeur professeur);
    public  Professeur modifier(Professeur professeur);
    public void supprimer(int identifiant);
    public List obtenirProfesseur();
    public void Obtenir(int identifiant);
}
