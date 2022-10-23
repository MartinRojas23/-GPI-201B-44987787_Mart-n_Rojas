


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class BuscarConsonantes {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine();
        int cont1 = 0;
        int cont2 = 0;
        Object consonantes;

        String caracteres[] = cad.split("");
        for (int x = 0; x < cad.length(); x++) {
            cont1++;
        }

        //iteramos mientras el indice sea menor al tamanio total de la cadena
        char car = 0;
        for (int i = 0; i < cad.length(); i++) {
            car = cad.charAt(i);
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
                cont2++;

            }

        }
        int contVocales = 0;
        char letraArray[] = cad.toCharArray();
        char letra;
        int contLetraRepetida = 0;

        for (int i = 0; i < cad.length(); i++) {
            switch (cad.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contVocales++;
                    break;
            }
        }
        String letraMasRepetida = "";
        int cantRepetida = 0;

        //Transformamos la frase a una lista,
        //así podremos buscar las letras duplicadas con Collections
        List<String> textoList = Arrays.asList(cad.split(""));
        for (String item : textoList) {
            //pasamos como primer parámetro la lista
            // y como segundo la letra que queremos contar
            int cant = Collections.frequency(textoList, item);
            // con esto comprobamos que no sea un espacio en blanco
            if (cantidadRepetida < cantidad && !item.equals(" ")) {
                letraMasRepetida = item;
                cantRepetida = cant;
            }
        }

        consonantes = cont1 - cont2;
        System.out.printf("La cadena " + cad + " contiene " + cont2 + " vocales \n");
        System.out.printf("La cadena " + cad + " contiene " + consonantes + " consonantes \n");
        System.out.println(String.format("La letra %s es la que mayor se repite, con %o veces", letraMasRepetida, cantRepetida));

    }
}