public class RomanToDecimal {
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
}
