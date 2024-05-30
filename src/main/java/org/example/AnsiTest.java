package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnsiTest {

    @Test
    public void testConvertToAnsi_BoldText() {
        String markdownText = "**This is bold text**";
        String expectedAnsiText = "\u001B[1mThis is bold text\u001B[22";
        assertEquals(expectedAnsiText, Main.convertMarkdownToAnsi(markdownText));
    }

    @Test
    public void testConvertToAnsi_ItalicText() {
        String markdownText = "_This is italic text_";
        String expectedAnsiText = "\u001B[3mThis is italic text\u001B[23m";
        assertEquals(expectedAnsiText, Main.convertMarkdownToAnsi(markdownText));
    }
}
