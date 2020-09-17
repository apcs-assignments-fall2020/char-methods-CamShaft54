import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testToLower() {
        assertEquals('a', MyMain.toLower('A'), "Calling toLower on the char \'A\' should output: a");
        assertEquals('b', MyMain.toLower('B'), "Calling toLower on the char \'B\' should output: b");
        assertEquals('c', MyMain.toLower('C'), "Calling toLower on the char \'C\' should output: c");
        assertEquals('z', MyMain.toLower('Z'), "Calling toLower on the char \'Z\' should output: z");
        assertEquals('a', MyMain.toLower('a'), "Calling toLower on the char \'a\' should output: a");
        assertEquals('d', MyMain.toLower('d'), "Calling toLower on the char \'d\' should output: d");
        assertEquals('f', MyMain.toLower('f'), "Calling toLower on the char \'f\' should output: f");
        assertEquals('z', MyMain.toLower('z'), "Calling toLower on the char \'z\' should output: z");
        assertEquals('*', MyMain.toLower('*'), "Calling toLower on the char \'*\' should output: *");
        assertEquals('1', MyMain.toLower('1'), "Calling toLower on the char \'1\' should output: 1");
        assertEquals('\\', MyMain.toLower('\\'), "Calling toLower on the char \'\\\' should output: \\");
    }

    @Test
    public void testToUpper() {
        assertEquals('A', MyMain.toUpper('A'), "Calling toUpper on the char \'A\' should output: A");
        assertEquals('B', MyMain.toUpper('B'), "Calling toUpper on the char \'B\' should output: B");
        assertEquals('C', MyMain.toUpper('C'), "Calling toUpper on the char \'C\' should output: C");
        assertEquals('Z', MyMain.toUpper('Z'), "Calling toUpper on the char \'Z\' should output: Z");
        assertEquals('A', MyMain.toUpper('a'), "Calling toUpper on the char \'a\' should output: A");
        assertEquals('D', MyMain.toUpper('d'), "Calling toUpper on the char \'d\' should output: D");
        assertEquals('F', MyMain.toUpper('f'), "Calling toUpper on the char \'f\' should output: F");
        assertEquals('Z', MyMain.toUpper('z'), "Calling toUpper on the char \'z\' should output: Z");
        assertEquals('*', MyMain.toUpper('*'), "Calling toUpper on the char \'*\' should output: *");
        assertEquals('1', MyMain.toUpper('1'), "Calling toUpper on the char \'1\' should output: 1");
        assertEquals('\\', MyMain.toUpper('\\'), "Calling toUpper on the char \'\\\' should output: \\");
    }

    @Test
    public void testMyToLowerCase() {
        assertEquals("hello world", MyMain.myToLowerCase("HELLO WORLD"), "Calling myToLowerCase on the string \"HELLO WORLD\" should output: hello world");
        assertEquals("hello world", MyMain.myToLowerCase("hELLo wORlD"), "Calling myToLowerCase on the string \"hELLo wORlD\" should output: hello world");
        assertEquals("hello world!", MyMain.myToLowerCase("hello world!"), "Calling myToLowerCase on the string \"hello world!\" should output: hello world!");
        assertEquals("abcdefghijklmnopqrstuvwxyz", MyMain.myToLowerCase("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "Calling myToLowerCase on the string ABCDEFGHIJKLMNOPQRSTUVWXYZ\" should output: abcdefghijklmnopqrstuvwxyz");
        assertEquals("abcdefghijklmnopqrstuvwxyz", MyMain.myToLowerCase("abcdefghijklmnopqrstuvwxyz"), "Calling myToLowerCase on the string abcdefghijklmnopqrstuvwxyz\" should output: abcdefghijklmnopqrstuvwxyz");
        assertEquals("1234567890", MyMain.myToLowerCase("1234567890"), "Calling myToLowerCase on the string \"1234567890\" should output: 1234567890");
        assertEquals("1 plus 2 = five", MyMain.myToLowerCase("1 PLUS 2 = fivE"), "Calling myToLowerCase on the string \"1 PLUS 2 = fivE\" should output: 1 plus 2 = five");
    }

    @Test
    public void testMyToUpperCase() {
        assertEquals("HELLO WORLD", MyMain.myToUpperCase("HELLO WORLD"), "Calling myToUpperCase on the string \"HELLO WORLD\" should output: HELLO WORLD");
        assertEquals("HELLO WORLD", MyMain.myToUpperCase("hELLo wORlD"), "Calling myToUpperCase on the string \"hELLo wORlD\" should output: HELLO WORLD");
        assertEquals("HELLO WORLD!", MyMain.myToUpperCase("hello world!"), "Calling myToUpperCase on the string \"hello world!\" should output: HELLO WORLD!");
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", MyMain.myToUpperCase("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "Calling myToUpperCase on the string ABCDEFGHIJKLMNOPQRSTUVWXYZ\" should output: ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", MyMain.myToUpperCase("abcdefghijklmnopqrstuvwxyz"), "Calling myToUpperCase on the string abcdefghijklmnopqrstuvwxyz\" should output: ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals("1234567890", MyMain.myToUpperCase("1234567890"), "Calling myToUpperCase on the string \"1234567890\" should output: 1234567890");
        assertEquals("1 PLUS 2 = FIVE", MyMain.myToUpperCase("1 PLUS 2 = fivE"), "Calling myToUpperCase on the string \"1 PLUS 2 = fivE\" should output: 1 PLUS 2 = FIVE");
    }
}
