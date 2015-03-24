/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import com.bongani.tp3_designpattern_test.DesignPatters.factorypattern.Animal;
import com.bongani.tp3_designpattern_test.DesignPatters.factorypattern.AnimalFactory;
import org.junit.*;

/**
 *
 * @author Rhulani Steff Baloyi
 */
public class FactoryJUnitTest {
    
    public FactoryJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFactoryPattern()
    {
        
            AnimalFactory animalFactory = new AnimalFactory ();
           
            /*Animal a1 = animalFactory.getAnimal("Feline");
            assertEquals("Meow", a1.makeSound());
            Animal a2 = animalFactory .getAnimal("Canine");
            assertEquals("Woof", a2.makeSound());*/
            
            Animal a1 = animalFactory .getAnimal("feline");
            System .out.println("a1 sound: " + a1.makeSound());
            Animal a2 = animalFactory.getAnimal("canine");
            System .out.println("a2 sound: " + a2.makeSound());

 
    }
}
