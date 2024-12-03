package org.example.raffplasticjava;

public interface Item {
    int getID();
    String getType();
    double getHoeveelheid();
    String toString(); // Zorg ervoor dat elke implementatie een goede string representatie heeft
}
