public class Principal {
    public static void main(String[] args) {
        BufferExamenes generador = new BufferExamenes();
        //if (args.length == 0) {
        //    System.out.println("Se requiere un argumento");
        //    return;
        //}

        for (int i = 0; i<args.length; i++) {
            new ProductorExamenes(generador);
            new Examinador(args[i], generador);
        }
    }
}