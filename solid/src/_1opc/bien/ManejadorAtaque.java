/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1opc.bien;

import _1ocp.mal.*;

/**
 *
 * @author Palacios
 */
public class ManejadorAtaque {

    private final Pokemon pokemon;

    public ManejadorAtaque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void manejarAtaque(final Ataque ataque) {
        ataque.atacar(pokemon);
    }
}
