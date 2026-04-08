public class Main{
    public static void main(String[] args) {
        MeuArrayDinamico arr = new MeuArrayDinamico(2);
        ListaSimples lista = new ListaSimples();

        // Exercicio 1

        arr.add(10);
        arr.add(20);
        arr.imprimir();
        arr.add(30);
        arr.add(40);
        arr.imprimir();

        // Exercicio 2

        arr.remove(1);
        arr.imprimir();
        arr.remove(0);
        arr.imprimir();
        System.out.println("Tamanho: " + arr.size());

        // Exercicio 3 e 4

        lista.insertFirst("C");
        lista.insertFirst("B");
        lista.insertFirst("A");

        Node B = lista.find("B");

        if(B == null){
            lista.insertAfter(B, "B2");
        }

        lista.imprimir();

        Node Z = lista.find("Z");
        System.out.println("Busca por Z: " + Z);
    }
}
