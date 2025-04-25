package estudos.maratonajava.javacore.Minterfaces.test;

import estudos.maratonajava.javacore.Minterfaces.domain.DataLoader;
import estudos.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import estudos.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remover();
        fileLoader.remover();

        databaseLoader.checking();
        fileLoader.checking();
    }
}
