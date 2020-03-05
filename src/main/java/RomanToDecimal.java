public class RomanToDecimal {

    // ConvertRomanToDecimal
    // Alex driving
    // Jonathan navigating

    public Double ConvertRomanToDecimal(String string) {
        if(string.equals("I")){
            return 1.0;
        }else if(string.equals("V")){
            return 5.0;
        }else if(string.equals("X")){
            return 10.0;
        }else if(string.equals("L")){
            return 50.0;
        }else if(string.equals("C")){
            return 100.0;
        }else if(string.equals("D")){
            return 500.0;
        }else if(string.equals("M")){
            return 1000.0;
        }

        return null;
    }



    // SumOfSymbols and sortStringDesc
    // Jonathan driving
    // Alex navigating

    public Double SumOfSymbols(String string) {
        Double year = 0.0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            String symbolString = Character.toString(symbol);
            year += this.ConvertRomanToDecimal(symbolString);
        }
        return year;
    }

    public Double sortStringDesc(String string) {
        Double num = 0.0;
        String sortedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            char symbol = string.charAt(i);
            String symbolString = Character.toString(symbol);
            sortedString = symbolString + sortedString;
        }
        for (int i = 0; i < sortedString.length(); i++) {
            char symbol = sortedString.charAt(i);
            String symbolString = Character.toString(symbol);
            if (i % 2 == 0) {
                num += this.ConvertRomanToDecimal(symbolString);
            } else {
                num -= this.ConvertRomanToDecimal(symbolString);
            }
        }
        return num;
    }
}
