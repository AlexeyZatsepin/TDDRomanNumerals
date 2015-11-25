/**
 * Created by Alex on 11/25/15.
 */
public class Converter {
    public String toRoman(int number){
        String answer = "";
        while (number >= 1000){
            answer += "M";
            number -=1000;
        }
        while (number >= 900){
            answer += "CM";
            number -=900;
        }
        while (number >= 500){
            answer += "D";
            number -= 500;
        }
        while (number >=400){
            answer +="CD";
            number -=400;
        }
        while (number >=100){
            answer +="C";
            number -=100;
        }
        while (number >=90){
            answer +="XC";
            number -=90;
        }
        while (number >=50){
            answer +="L";
            number -=50;
        }
        while (number >=40){
            answer +="XL";
            number -=40;
        }
        while (number >=10){
            answer +="X";
            number -=10;
        }
        while (number >=9){
            answer +="IX";
            number -=9;
        }
        while(number >=5){
            answer +="V";
            number -=5;
        }
        while(number >=4){
            answer += "IV";
            number -=4;
        }
        while (number >=1){
            answer+="I";
            number-=1;
        }
        return answer;
    }

    public int toArabic(String s){
            int Arabic = 0;
            int last_digit = 0;
            int current_digit = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'I') {
                    current_digit = 1;
                }
                if (s.charAt(i) == 'V') {
                    current_digit = 5;
                }
                if (s.charAt(i) == 'X') {
                    current_digit = 10;
                }
                if (s.charAt(i) == 'L') {
                    current_digit = 50;
                }
                if (s.charAt(i) == 'C') {
                    current_digit = 100;
                }
                if (s.charAt(i) == 'D') {
                    current_digit = 500;
                }
                if (s.charAt(i) == 'M') {
                    current_digit = 1000;
                }

                if (last_digit < current_digit && last_digit != 0) {
                    current_digit -= last_digit;
                    Arabic -= last_digit;
                    Arabic += current_digit;
                    last_digit = current_digit;
                    current_digit = 0;
                } else {
                    last_digit = current_digit;
                    Arabic += current_digit;
                    current_digit = 0;
                }
            }
            return Arabic;
    }
}

