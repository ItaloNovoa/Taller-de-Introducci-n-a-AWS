package arem.Clases_pruebas;

import arem.proyecto.*;


/**
 * clase prueba utilizada para probar el modelo a travez de las funciones especificadas dentro de la clase en un browser
 */
public class prueba2 {
    /**
     * metodo basico que da un saludo con el parametro nombre ingresado
     * @param name
     * @return
     */
    @Web("Nombre")
    public static String Saludo(String name) {
        return "hola -->"+name;
    }

    /**
     * metodo basico que da el cuadrado del numero ingresado
     * @param n1
     * @return
     */
    @Web("Cuadrado")
    public static String Cuadrado(String n1) {
        int a=Integer.parseInt(n1);
        return "el cuadrado de "+n1+" es "+Integer.toString(a*a);
    }
}