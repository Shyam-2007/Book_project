public class TestSuite
{
    // Run a bunch of basic tests on PigLatinTranslator
    public static void run()
    {
        boolean pass = true;
        // "null" :) 
        pass &= basicTest("null", "Ullnay");

        // Test that empty strings don't crash.
        pass &= basicTest("","");
        pass &= basicTest("    ", "    ");

        // Vowel first letter
        pass &= basicTest("eat", "Eatay");
        // Single consonant
        pass &= basicTest("pig", "Igpay");
        // Double consonant
        pass &= basicTest("trash", "Ashtray");

        // Multiple words
        pass &= basicTest("pigs eat trash", "Igspay Eatay Ashtray");

        // Special words
        // M.C. - initials

        // Capitalization
        pass &= basicTest("Trash", "Ashtray");
        pass &= basicTest("TrAsH", "AsHtray");

        // Punctuation
        pass &= basicTest("Trash.", "Ashtray.");
        pass &= basicTest("clean-cut", "Eanclay-Utcay");

        if (pass == true)
        {
            System.out.println("--- TEST PASSED! Congrats! ---");
        }
        else
        {
            System.out.println("--- TEST FAILED! :( ---");
        }
    }

    public static boolean basicTest(String input, String expected)
    {
        String result = PigLatinTranslator.translate(input);
        if (result.equals(expected))
        {
            System.out.println(" PASS: '" + input + "' -> '" + expected + "'");
            return true;
        }
        else
        {
            System.out.println(" FAIL: '" + input + "', '" + result + "' != '" + expected + "'");
            return false;
        }
    }
}