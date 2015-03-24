/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.bongani.tp3_designpattern_test.DesignPatters.builderpattern.Meal;
import com.bongani.tp3_designpattern_test.DesignPatters.builderpattern.MealBuilder;
import com.bongani.tp3_designpattern_test.DesignPatters.builderpattern.MealDirector;
import com.bongani.tp3_designpattern_test.DesignPatters.builderpattern.ItalianMealBuilder;
import com.bongani.tp3_designpattern_test.DesignPatters.builderpattern.JapaneseMealBuilder;
import org.junit.*;

/**
 *
 * @author Bongani klaas
 */
public class BuilderPatternJUnitTest {
    
    public BuilderPatternJUnitTest() {
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
    public void testBuilderPattern() 
    {
        MealBuilder mealBuilder = new ItalianMealBuilder ();
        
        MealDirector mealDirector = new MealDirector(mealBuilder);
        
        mealDirector .constructMeal () ;
        Meal meal = mealDirector .getMeal() ;
        System .out.println("Meal is : " + meal);
        mealBuilder = new JapaneseMealBuilder () ;
        mealDirector = new MealDirector(mealBuilder);
        mealDirector .constructMeal () ;
        meal = mealDirector .getMeal() ;
        System .out.println("Meal is : " + meal);

    }
}
