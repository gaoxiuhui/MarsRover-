import org.junit.Assert;
import org.junit.Test;

public class FuzzTest {
    private Object asssertThat;

    @Test
    public void  should_return_1_given_number_1(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(1);
        //then
        Assert.assertEquals("1",result);
    }

    @Test
    public void  should_return_Fizz_given_number_3(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(3);
        //then
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void  should_return_Buzz_given_number_5(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(5);
        //then
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void  should_return_Whizz_given_number_7(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(7);
        //then
        Assert.assertEquals("Whizz",result);
    }

    @Test
    public void  should_return_FizzBuzz_given_number_15(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(15);
        //then
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void  should_return_FizzWhizz_given_number_21(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(21);
        //then
        Assert.assertEquals("FizzWhizz",result);
    }

    @Test
    public void  should_return_BuzzWhizz_given_number_35(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(35);
        //then
        Assert.assertEquals("BuzzWhizz",result);
    }

}
