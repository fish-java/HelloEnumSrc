package enums.imitation;

import org.junit.Test;

import static org.junit.Assert.*;

public class RabbitEnumImitationTest {
    @Test
    public void enumValues(){
        System.out.println(RabbitEnumImitation.WhiteRabbit);
        // WhiteRabbit

        System.out.println(RabbitEnumImitation.BlackRabbit.name());
        // BlackRabbit

        System.out.println(RabbitEnumImitation.YellowRabbit.ordinal());
        // 3
    }

    @Test
    public void loop(){
        for (RabbitEnumImitation rabbitEnumImitation :
                RabbitEnumImitation.values()) {
            System.out.println(rabbitEnumImitation);
        }
        // WhiteRabbit
        // BlackRabbit
        // YellowRabbit
    }
}