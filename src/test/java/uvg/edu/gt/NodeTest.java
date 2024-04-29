package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void testNode() {
        Node node = new Node("key", "value");
        assertEquals("key", node.key);
        assertEquals("value", node.value);
        assertNull(node.left);
        assertNull(node.right);
    }
}