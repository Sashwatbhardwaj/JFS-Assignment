import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class LifecycleTest {
	int a = 5;
    int b = 5;
    @BeforeAll
    static void printd(){
        System.out.println("started test case");
    }
    @AfterEach
    void printc(){
        System.out.println("completed test case");
    }
    @AfterAll
    static void printall(){
        System.out.println("Finished printing");
    }
    @BeforeEach
    void setUp() {
        System.out.println("Executing all");
    }
    @Test
  public  void multi() {
        assertEquals(25,Lifecycle.multi(a,b));
    }

    @Test
  public  void div() {
        assertEquals(1,Lifecycle.div(a,b));

	}

}