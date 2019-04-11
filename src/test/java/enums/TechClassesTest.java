package enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class TechClassesTest {
    @Test
    public void multiValue(){
        for (TechClasses techClasses : TechClasses.values()){
            System.out.println("tech is: " + techClasses);
            System.out.println("pl is: " + techClasses.pl);
            System.out.println("level is: " + techClasses.level);
            System.out.println();
        }
        // tech is: Spring
        // pl is: Java
        // level is: 3

        // tech is: Koa
        // pl is: node
        // level is: 2
    }
}