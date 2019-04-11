package enums.imitation;

public class RabbitEnumImitation {
    private String name;
    private Integer ordinal;

    private RabbitEnumImitation(){}

    private void setName(String name) {
        this.name = name;
    }
    public String name(){
        return name;
    }
    public Integer ordinal() {
        return ordinal;
    }
    private void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public static RabbitEnumImitation WhiteRabbit;
    public static RabbitEnumImitation BlackRabbit;
    public static RabbitEnumImitation YellowRabbit;

    static {
        WhiteRabbit = new RabbitEnumImitation();
        WhiteRabbit.setName("WhiteRabbit");
        WhiteRabbit.setOrdinal(1);
        BlackRabbit = new RabbitEnumImitation();
        BlackRabbit.setName("BlackRabbit");
        BlackRabbit.setOrdinal(2);
        YellowRabbit = new RabbitEnumImitation();
        YellowRabbit.setName("YellowRabbit");
        YellowRabbit.setOrdinal(3);
    }

    public static RabbitEnumImitation[] values(){
        RabbitEnumImitation[] array = new RabbitEnumImitation[3];
        array[0] = WhiteRabbit;
        array[1] = BlackRabbit;
        array[2] = YellowRabbit;
        return array;
    }
}
