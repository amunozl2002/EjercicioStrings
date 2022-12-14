//     Create a new string array with 10,000 elements, and initialize each element with a random alphanumeric string
//     of length 20.
//
//    Use a for-loop to process the elements of the array, and apply the following transformations to each element:
//        Remove all whitespace characters from the string.
//        Convert the string to uppercase.
//        Reverse the order of the characters in the string.
//
//    Use the Arrays.sort() method to sort the transformed strings in ascending order based on the length of each string.
//
//    Use a Map object to store the number of occurrences of each string in the original array. Use the forEach() method to iterate over
//    the sorted array and add each string to the map, incrementing its count if it already exists in the map.
//
//    Use the forEach() method to iterate over the entries in the map, and print out each string, along with its length and the
//    number of occurrences in the original array.

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuilder[] arr = new StringBuilder[1];
        arr = crearArray(50);
        aplicarTransformaciones(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static StringBuilder[] crearArray(int tamaño) {
        StringBuilder[] arr = new StringBuilder[tamaño];
        Random random = new Random();
        StringBuilder sb = new StringBuilder();


        // Recorre los valores del array del 0 al array.length
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generarString(20);
        }
        return arr;
    }

    public static StringBuilder[] aplicarTransformaciones(StringBuilder[] arr) {
        StringBuilder[] arrTransformado = new StringBuilder[arr.length];
        return arrTransformado;
    }

    public static StringBuilder generarString(int tamaño) {
        Random random = new Random();
        StringBuilder res = new StringBuilder();

        for (int i=1; i < tamaño; i++) {
            int rnd = random.nextInt(3);

            switch (rnd) {
                case 0:
                    res.append(random.nextInt(9));
                    break;
                case 1:
                    res.append(" ");
                    break;
                case 2:
                    res.append((char)(random.nextInt(26) + 'a'));
                    break;
            }
        }
        return res;
    }
}