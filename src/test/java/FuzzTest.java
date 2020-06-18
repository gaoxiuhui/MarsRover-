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
    public void  should_return_Buzz_given_number_7(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(7);
        //then
        Assert.assertEquals("Whizz",result);
    }
}
