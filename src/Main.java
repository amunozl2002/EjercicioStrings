//     Create a new string array with 10,000 elements, and initialize each element with a random alphanumeric string
//     of length 20.
//
//    Use a for-loop to process the elements of the array, and apply the following transformations to each element:
//        Remove all whitespace characters from the string.
//        Convert the string to uppercase.
//        Reverse the order of the characters in the string.
//
//    Sort the transformed strings in ascending order based on the length of each string.


import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
         String[] arr = new String[1];
         arr = crearArray(50);
        System.out.println(Arrays.toString(arr));
         aplicarTransformaciones(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static String[] crearArray(int tamaño) {
        String[] arr = new String[tamaño];
        Random random = new Random();
        String sb = new String();


        // Recorre los valores del array del 0 al array.length
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(generarString(20));
        }
        return arr;
    }

    public static String[] aplicarTransformaciones(String[] arr) {


        // Recorre todos los elementos del array de uno en uno
        for (int i = 0; i < arr.length; i++) {
            // Si hay algún espacio, lo elimina
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == ' ') {
                    arr[i] = arr[i].replaceAll(" ", "");
                }
            }
            // Cambia todo a mayusculas
            arr[i] = arr[i].toUpperCase();

            // Invierte el orden de los caracteres

            arr [i] = invertirOrden(arr[i]);


        }
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
      return arr;
    }

    public static String invertirOrden(String str) {
        StringBuilder res = new StringBuilder();

        char[] arrayChars = str.toCharArray();
        char[] nuevoArrayChars = new char[arrayChars.length];

        for (int i = 0; i < arrayChars.length; i++) {
            nuevoArrayChars[arrayChars.length - i - 1] = arrayChars[i];
        }

        String invertida = new String(nuevoArrayChars);

        return invertida;
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
