/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1opc.bien;

/**
 *
 * @author Administrador
 */
public class AtaqueAgua extends Ataque {

    @Override
    public void atacar(Pokemon pokemon) {
        pokemon.setPorcentajeVida(pokemon.getPorcentajeVida()*0.70);
    }
    
}
