public class FuzzBuzz {

    public String say(int  number) {
        String res="";
        if(String.valueOf(number).contains("3")&&!String.valueOf(number).contains("5")){
            return "Fizz";
        }if(isDivided(number,3)&&!String.valueOf(number).contains("5")){
            res+="Fizz";
        } if(isDivided(number,5)){
            res+="Buzz";
        } if(isDivided(number,7)){
            res+="Whizz";
        }if(!isDivided(number,3) && !isDivided(number,5)&& !isDivided(number,7)){
            return String.valueOf(number);
        }return res;
    }

    private Boolean isDivided (int number1 ,int number2){
        return (number1 % number2 ==0);
    }
}
