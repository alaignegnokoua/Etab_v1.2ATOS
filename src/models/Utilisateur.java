package models;

import java.sql.*;

public class Utilisateur {
    private int id;
    private String identifiant;
    private String motDePass;
    private Date dateCreation;

    public Utilisateur() {
    }

    public Utilisateur(int id, String identifiant, String motDePass) {
        this.id = id;
        this.identifiant = identifiant;
        this.motDePass = motDePass;
    }

    public boolean Authentification(String identifiant, String motDePasse) {
        boolean isAuthenticated = false;
        String url = "jdbc:mysql://localhost:3306/etab_db";
        String username = "root"; // Remplacez par votre utilisateur MySQL
        String password = ""; // Remplacez par votre mot de passe MySQL

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM models.Utilisateur WHERE pseudo = ? AND motDePasse = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, identifiant);
            statement.setString(2, motDePasse);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                isAuthenticated = true;
                this.id = resultSet.getInt("id");
                this.identifiant = resultSet.getString("pseudo");
                this.motDePass = resultSet.getString("motDePasse");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isAuthenticated;
    }

    public void ajouterUtilisateurDefaut() {
        String url = "jdbc:mysql://localhost:3306/etab_db";
        String username = "root"; // Remplacez par votre utilisateur MySQL
        String password = ""; // Remplacez par votre mot de passe MySQL

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO utilusateur (id,pseudo, motDePasse, dateCreation) VALUES (?, ?, CURDATE())";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, "1");
            statement.setString(2, "admin");
            statement.setString(2, "admin");
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Getters and setters can be added if needed

    public int getId() {
        return id;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    @Override
    public String toString() {
        return "models.Utilisateur{" +
                "id=" + id +
                ", identifiant='" + identifiant + '\'' +
                ", motDePass='" + motDePass + '\'' +
                '}';
    }
}