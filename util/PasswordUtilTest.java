public class PasswordUtil {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }
//si un password tiene menos de 8 letras es weak, debil
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }
//esto es un rango de letras en minusculas y en mayusculas, y con el + indicamos que puede mas de una ves
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }
//esto es en caso de que tenga numeros y letras, sera medium, 
    @Test
    public void strong_when_has_letters_numebers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abc123!"));
    }
//Si el password tiene Letras Numeros y signos, el password sera fuerte, strong!
}        