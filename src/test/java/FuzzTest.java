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
}
