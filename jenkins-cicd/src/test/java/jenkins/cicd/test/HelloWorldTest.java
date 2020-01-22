package jenkins.cicd.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jenkins.cicd.HelloWorld;

public class HelloWorldTest {
    @Test
    public void test() {
        assertEquals("Hai Sanni", HelloWorld.main("Hai Sanni"));
    }
}
