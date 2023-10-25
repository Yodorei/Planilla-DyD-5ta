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


public class Raza_data {
    
    private Connection conexion = null;
    
    
    public Raza_data(Conexion con) {

        this.conexion = con.buscarConexion();

    }
    
    public List listarRazas(){
        List razalist = new ArrayList<>();
        
        String sql = "SELECT * FROM raza";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Raza raza = new Raza();
                raza.setRaza(rs.getString("raza"));
                raza.setTamanio(rs.getDouble("tamanio"));
                raza.setVelocidad(rs.getInt("velocidad"));
                raza.setModstats(rs.getInt("modstats"));
                raza.setComparma(rs.getString("comparma"));
                razalist.add(raza);
                
            }
            
            
        } catch (Exception e) {
            
        }        
        
        return razalist;
    }
    
}
