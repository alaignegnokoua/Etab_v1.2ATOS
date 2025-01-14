package models;

import dao.IEleveDAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Classe représentant un élève.
 * Elle hérite de la classe models.Personne et implémente l'interface dao.ICRUDEleve.
 */
public class Eleve extends Personne implements IEleveDAO {
    private String classe;
    private String matricule;

    /**
     * Constructeur par défaut de la classe models.Eleve.
     */
    public Eleve() {
    }

    /**
     * Constructeur avec paramètres.
     *
     * @param id            Identifiant de l'élève.
     * @param dateNaissance Date de naissance de l'élève.
     * @param ville         Ville de résidence.
     * @param nom           Nom de l'élève.
     * @param prenom        Prénom de l'élève.
     * @param classe        Classe de l'élève.
     * @param matricule     Matricule de l'élève.
     */
    public Eleve(int id, Date dateNaissance, String ville, String nom, String prenom, String classe, String matricule) {
        super(id, dateNaissance, ville, nom, prenom);
        this.classe = classe;
        this.matricule = matricule;
    }

    public String getClasse() {
        return classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Méthode pour ajouter un élève.
     *
     * @param eleve Élève à ajouter.
     * @return Élève ajouté.
     */
    @Override
    public Eleve Ajouter(Eleve eleve) {
        // Implémentation de l'ajout d'un élève (par exemple, dans une base de données)
        return eleve;
    }

    /**
     * Méthode pour modifier un élève.
     *
     * @param eleve Élève à modifier.
     * @return Élève modifié.
     */
    @Override
    public Eleve modifier(Eleve eleve) {
        // Implémentation de la modification d'un élève
        return eleve;
    }

    /**
     * Méthode pour supprimer un élève.
     *
     * @param identifiant Identifiant de l'élève à supprimer.
     */
    @Override
    public void supprimer(int identifiant) {
        // Implémentation de la suppression d'un élève
    }

    /**
     * Méthode pour obtenir un élève par identifiant.
     *
     * @param identifiant Identifiant de l'élève.
     * @return Élève trouvé.
     */
    @Override
    public Eleve Obtenir(int identifiant) {
        // Implémentation pour obtenir un élève
        return new Eleve(); // Exemple de retour fictif
    }

    /**
     * Méthode pour obtenir une liste de tous les élèves.
     *
     * @return Liste d'élèves.
     */
    @Override
    public List<Eleve> obtenirProfesseur() {
        // Implémentation pour obtenir une liste d'élèves
        return List.of();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Élève ID: " + getId() +
                ", Nom: " + getNom() +
                ", Prénom: " + getPrenom() +
                ", Ville: " + getVille() +
                ", Date de Naissance: " + sdf.format(getDateNaissance()) +
                ", Classe: " + getClasse() +
                ", Matricule: " + getMatricule();
    }
}
