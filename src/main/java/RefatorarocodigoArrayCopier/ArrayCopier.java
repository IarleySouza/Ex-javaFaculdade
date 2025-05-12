package RefatorarocodigoArrayCopier;

class ArrayCopier {
    public static void main(String[] args) {
        int[] array1 = {7, 4, 8, 1, 4, 1, 4};
        float[] array2 = new float[array1.length];

        System.out.print("array1: [ ");
        for (int elemento : array1) {
            System.out.print(elemento + " ");
        }
        System.out.println("]");

        System.out.print("array2: [ ");
        for (int indice = 0; indice < array1.length && array1[indice] != 1; indice++) {
            array2[indice] = array1[indice];
            System.out.print(array2[indice] + " ");
        }
        System.out.println("]");
    }
}
