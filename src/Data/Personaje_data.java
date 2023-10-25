/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import Entidades.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Personaje_data {
    
    private Connection conexion = null;
    
    
    public Personaje_data(Conexion con) {

        this.conexion = con.buscarConexion();

    }
    
    
    public void crearPersonaje(String jugador, String nombre, Raza raza, Clase clase, int vida, int nivel, String alineamiento, String trasfondo, Armadura armadura, Arma arma1, Arma arma2, Armadura escudo){
        String sql = "INSERT INTO personaje (jugador, nombre, raza, clase, vida, exp, nivel, alineamiento, trasfondo, armadura, arma1, arma2, escudo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
        try {
            PreparedStatement ps = conexion.prepareCall(sql);
            ps.setString(1, jugador);
            ps.setString(2, nombre);
            ps.setString(3, raza.getRaza());
            ps.setString(4, clase.getClase());
            ps.setInt(5, vida);
            ps.setInt(6, 0);
            ps.setInt(7, nivel);
            ps.setString(8, alineamiento);
            ps.setString(9, trasfondo);
            ps.setString(10, armadura.getArmadura());
            ps.setString(11, arma1.getArma());
            ps.setString(12, arma2.getArma());
            ps.setString(13, armadura.getEscudo());
            
            ResultSet rs = ps.executeQuery();            
            ps.close();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de sentencia");
        }
    }    
    
    
    public List listarPJ(){
        List pjlist = new ArrayList<>();
        
        String sql = "SELECT * FROM personaje";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Personaje pj = new Personaje();
                pj.setJugador(rs.getString("jugador"));
                pj.setNombre(rs.getString("nombre"));
                pj.getRaza().setRaza(rs.getString("raza"));
                pj.setVida(rs.getInt("vida"));
                pj.setExp(rs.getInt("exp"));
                pj.setNivel(rs.getInt("nivel"));
                pjlist.add(pj);                
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de sentencia");
        }        
        
        return pjlist;
    }
    
}
