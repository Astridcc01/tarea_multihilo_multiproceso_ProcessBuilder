import java.io.IOException;
import java.io.File;

public class Lanzador {
    public static void main(String[] args) throws InterruptedException {
        ProcessBuilder proceso1 = new ProcessBuilder("java","Principal", "Pepe","Juan","Luis");
        ProcessBuilder proceso2 = new ProcessBuilder("java","Principal", "Rosa","Miguel","Pedro");

        proceso1.redirectOutput(new File("examenes1.txt"));
        proceso2.redirectOutput(new File("examenes2.txt"));
        try {
            proceso1.start();
            proceso2.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}