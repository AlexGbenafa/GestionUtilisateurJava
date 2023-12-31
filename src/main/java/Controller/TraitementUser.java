/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.ResultSet;
import Models.User;
import Dao.connectDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexk
 */
public class TraitementUser {
    public void addUser(User  u){
        connectDB cdb = new connectDB();
        cdb.connect();
        String req = "INSERT INTO users(prenom, nom, login, password, Telephone) values('"+u.getPrenom()+"', '"+u.getNom()+"', '"+u.getLogin()+"', '"+u.getPassword()+"', '"+u.getTelephone()+"')";
        
        try {
            cdb.st.executeUpdate(req);
            //Difference entre executeUpdate et executeQuerry; pour toutes requetes commencant pas par SELECT on utilise update querry c'est juste si ca commence par SELECT
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateUser(User u){
        connectDB cdb = new connectDB();
        cdb.connect();
        String req = "UPDATE users SET prenom = '"+u.getPrenom()+"', nom = '"+u.getNom()+"', login = '"+u.getLogin()+"', password = '"+u.getPassword()+"', telephone = '"+u.getTelephone()+"' WHERE id = '"+u.getId()+"' ";
        
        try {
            cdb.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void updateUserWelcome(User u){
        connectDB cdb = new connectDB();
        cdb.connect();
        String req = "UPDATE users SET prenom = '"+u.getPrenom()+"', nom = '"+u.getNom()+"', login = '"+u.getLogin()+"' WHERE id = '"+u.getId()+"' ";
        
        try {
            cdb.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void deleteUser(int id){
        connectDB cdb = new connectDB();
        cdb.connect();
        String req = "Delete from users WHERE id = '"+id+"' ";
        
        try {
            cdb.st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User searchUser(int id){
        User u = null;
        
        
        return u;
    }
    
    public ResultSet showUser(){
        connectDB connection = new connectDB();
        connection.connect();
        ResultSet rs = null;
        
        String req = "SELECT * FROM users ORDER BY nom";
        
        try {
            rs = connection.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    //Fonction qui recherche un utilisateur dans la base de donnee et qui renvoie ces infos sous format RS(ResultSet)
    public ResultSet testLogin(String log, String pass){
        //Connection a la base de donnee
        connectDB connection = new connectDB();
        connection.connect();
        
        //Requete SQL
        String req = "SELECT * FROM users WHERE login = '"+log+"' and password = '"+pass+"' ";
        
        //Execution de la requete
        ResultSet rs = null;
        try {
            rs = connection.st.executeQuery(req);
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Retourne le resultat de la requete sous format resultSet
        return rs;
    }
    
    public User findByID(int id){
        connectDB connection = new connectDB();
        connection.connect();
        ResultSet rs = null;
        User searchedUser = new User();
        
        //Requete SQL
        String req = "SELECT * FROM users WHERE id = '"+id+"' ";
        
        try {
            rs = connection.st.executeQuery(req);
            if(rs.next()){
                searchedUser.setId(rs.getInt("id"));
                searchedUser.setPrenom(rs.getString("prenom"));
                searchedUser.setNom(rs.getString("nom"));
                searchedUser.setLogin(rs.getString("login"));
            }else{
                searchedUser  = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TraitementUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return searchedUser; 
    }
}