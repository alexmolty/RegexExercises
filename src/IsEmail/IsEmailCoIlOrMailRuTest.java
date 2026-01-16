package IsEmail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsEmailCoIlOrMailRuTest {
    @Test
    void emailAddressTest()
    {
// there must be @
// before @ maybe any symbols except whitespace and comma
// after @ may be any letters or digits or dashes
// email address should ended either .co.il or .mail.ru
        // true
        assertTrue(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("t%u@12.co.il"));
        assertTrue(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("t#u@t.mail.ru"));
        assertTrue(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("12_5-6*@y.co.il"));
        assertTrue(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("example@mail.ru"));
        assertTrue(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("example@co.il"));
        //false
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("t,u@12.co.il"));// , - disallowed
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("t u@12.co.il"));// space disallowed
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("ttu@1#2.co.il"));// after @ the symbol # disallowed
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("ttu@12.mail1ru"));// neither .co.il nor mail.ru
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("ttu@12co.il"));// neither .co.il nor mail.ru
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("ttu12.co.il"));// no @
        assertFalse(IsEmailCoIlOrMailRu.isEmailCoIlMailRu("ttu@1_2.co.il"));// after @ the symbol _ disallowed
    }
}