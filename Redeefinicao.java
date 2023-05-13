package com.mycompany.redeefinicao;

/**
 *
 * @author vsemp
 */
public class Redeefinicao {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazerBarulho();

        animal = new Cachorro();
        animal.fazerBarulho();

        animal = new Gato();
        animal.fazerBarulho();
    }
}
