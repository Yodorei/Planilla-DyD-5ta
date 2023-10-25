/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.*;
import Data.*;

public class main {

    public static void main(String[] args) {

        Conexion con = new Conexion("jdbc:mariadb://localhost:3306/planilla_dyd_5ta", "root", "");
        Raza_data rzd = new Raza_data(con);
        Personaje_data pjd = new Personaje_data(con);

        int roll = 0;
        int random;

        for (int i = 0; i < 3; i++) {
            random = (int) (Math.random() * 6) + 1;
            System.out.println(random);
            roll += random;
            
        }
        System.out.println(roll);
    }

}
