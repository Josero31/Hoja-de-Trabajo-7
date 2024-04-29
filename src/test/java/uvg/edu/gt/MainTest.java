package uvg.edu.gt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        BinaryTree tree = new BinaryTree();

        tree.insert("hola", "hello");
        tree.insert("adios", "goodbye");
        tree.insert("casa", "house");
        tree.insert("perro", "dog");
        tree.insert("gato", "cat");
        tree.insert("rojo", "red");
        tree.insert("azul", "blue");
        tree.insert("verde", "green");
        tree.insert("amarillo", "yellow");
        tree.insert("blanco", "white");
    }
}