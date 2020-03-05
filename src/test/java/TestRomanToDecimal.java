import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestRomanToDecimal {
    RomanToDecimal roman;

    @Before
    public void Setup(){
        roman = new RomanToDecimal();
    }

    @Test
    public void TestSymbolIToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("I");
        Double actual = 1.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(1.0));
        //Teardown
    }

    @Test
    public void TestSymbolVToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("V");
        Double actual = 5.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(actual));
        //Teardown
    }

    @Test
    public void TestSymbolXToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("X");
        Double actual = 10.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(actual));
        //Teardown
    }

    @Test
    public void TestSymbolLToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("L");
        Double actual = 50.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(actual));
        //Teardown
    }

    @Test
    public void TestSymbolCToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("C");
        Double actual = 100.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(actual));
        //Teardown
    }

    @Test
    public void TestSymbolDToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("D");
        Double actual = 500.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(actual));
        //Teardown
    }

    @Test
    public void TestSymbolMToDecimal() {
        //Setup
        //Exercise
        Double convertedNumber = roman.ConvertRomanToDecimal("M");
        Double actual = 1000.0;
        //Assert
        assertEquals(java.util.Optional.of(convertedNumber), java.util.Optional.of(actual));
        //Teardown
    }

//    roman-to-decimal-tdd
//    TDD Kata converting roman numeral to decimal
//
//            RomanToDecimal
//    Problem description
//    The Kata says you should write a function to convert from Roman Numerals to decimal numerals. In order to keep the kata light, we will not check for valid Roman Numeral.
//
//    Roman numerals, the numeral system of ancient Rome, uses combinations of letters from the Latin alphabet to signify values. They are based on seven symbols:
//
//    Symbol	Value
//    I	1
//    V	5
//    X	10
//    L	50
//    C	100
//    D	500
//    M	1000
//    Numbers are formed by combining symbols together and adding the values. Generally, symbols are placed in order of value, starting with the largest values. When smaller values precede larger values, the smaller values are subtracted from the larger values, and the result is added to the total.
//
//            Example:
//
//    Roman Number	Computation	Value	Comment
//    MMVI	1000 + 1000 + 5 + 1	2006	only addition
//    MCMXLIV	1000 + (1000 - 100) + (50 - 10) + (5 - 1)	1944	addition and substraction

}
