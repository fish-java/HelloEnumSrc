package enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitClassesTest {
    // each value is a String-like type
    @Test
    public void enums(){
        System.out.println(RabbitClasses.BlackRabbit);
        System.out.println(RabbitClasses.YellowRabbit);
        System.out.println(RabbitClasses.WhiteRabbit);
        //        WhiteRabbit
        //        BlackRabbit
        //        YellowRabbit
    }

    // values() method can be used to return
    // all values present inside enum.
    @Test
    public void loop(){
        for (RabbitClasses rabbitClass : RabbitClasses.values()){
            System.out.println(rabbitClass);
        }
        //        WhiteRabbit
        //        BlackRabbit
        //        YellowRabbit
    }

    // returns the enum constant of the
    // specified string value, if exists.
    @Test(expected = IllegalArgumentException.class)
    public void illegalValueOf(){
        // can not convert this string to enums value
        enums.RabbitClasses rabbitClass = RabbitClasses.valueOf("GrayRabbit");
    }
    @Test
    public void valueOf(){
        enums.RabbitClasses yellowRabbitClass =
                RabbitClasses.valueOf("YellowRabbit");
        System.out.println(yellowRabbitClass);
        // YellowRabbit
    }

    // By using ordinal() method, each enum constant
    // index can be found, just like array index.
    @Test
    public void ordinal(){
        for (RabbitClasses rabbitClass : RabbitClasses.values()){
            String value = rabbitClass.toString();
            System.out.println(value + "'s index is: "
                    + rabbitClass.ordinal());
            // WhiteRabbit's index is: 0
            // BlackRabbit's index is: 1
            // YellowRabbit's index is: 2
        }
    }
}