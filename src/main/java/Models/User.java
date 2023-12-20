/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author alexk
 */
public class User {
    private int id;
    private String prenom;
    private String nom;
    private String login;
    private String password;
    private String telephone;

    public User() {
    }

    public User(int id, String prenom, String nom, String login, String password, String telephone) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
    }
    
        public User( String prenom, String nom, String login, String password, String telephone) {
        this.prenom = prenom;
        this.nom = nom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        }
        public User( int id, String prenom, String nom, String login) {
            this.id = id;
            this.prenom = prenom;
            this.nom = nom;
            this.login = login;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
    
}
