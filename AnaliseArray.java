public class AnaliseArray {
    public static void main(String[] args) {
        int[] array = {4, 8, 15, 7, 20, 3, 6, 25, 10, 12};
        int x = 10;
        int maiorDiferenca = 0;
        int pos1 = 0;
        int pos2 = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int diferenca = Math.abs(array[i] - array[i + 1]);
            if (diferenca > maiorDiferenca) {
                maiorDiferenca = diferenca;
                pos1 = i;
                pos2 = i + 1;
            }
        }

        System.out.println("Par de posições consecutivas com a maior diferença:");
        System.out.println("Posição " + pos1 + " (valor: " + array[pos1] + ") e Posição " + pos2 + " (valor: " + array[pos2] + ")");
        System.out.println("Maior diferença: " + maiorDiferenca);

        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                decrescente = false;
            } else if (array[i] > array[i + 1]) {
                crescente = false;
            }
        }

        if (crescente) {
            System.out.println("O array está em ordem crescente.");
        } else if (decrescente) {
            System.out.println("O array está em ordem decrescente.");
        } else {
            System.out.println("O array não está ordenado.");
        }

        int maiores = 0;
        int menores = 0;
        int iguais = 0;

        for (int num : array) {
            if (num > x) {
                maiores++;
            } else if (num < x) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Números maiores que " + x + ": " + maiores);
        System.out.println("Números menores que " + x + ": " + menores);
        System.out.println("Números iguais a " + x + ": " + iguais);
    }
}
