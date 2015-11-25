import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 11/25/15.
 */
public class ConverterTest {
    @Test
    public void ConvertToRoman(){
        Converter converter= new Converter();
        assertEquals(converter.toRoman(1),"I");
        assertEquals(converter.toRoman(3),"III");
        assertEquals(converter.toRoman(9),"IX");
        assertEquals(converter.toRoman(1066),"MLXVI");
        assertEquals(converter.toRoman(1989),"MCMLXXXIX");
        assertEquals(converter.toRoman(641),"DCXLI");
        assertEquals(converter.toRoman(494),"CDXCIV");
    }
    @Test
    public void ConvertToArabic(){
        Converter converter= new Converter();
        assertEquals(converter.toArabic("I"),1);
        assertEquals(converter.toArabic("III"),3);
        assertEquals(converter.toArabic("IX"),9);
        assertEquals(converter.toArabic("D"),500);
        assertEquals(converter.toArabic("MLXVI"),1066);
        assertEquals(converter.toArabic("MCMLXXXIX"),1989);
    }
}
