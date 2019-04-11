package enums;

public enum TechClasses {
    Spring("Java", 3), Koa("node", 2);

    // If we want each enum value container field
    // we can do like this
    public String pl;
    public Integer level;
    private TechClasses(String pl, Integer level){
        this.pl = pl;
        this.level = level;
    }
}
