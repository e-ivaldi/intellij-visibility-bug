public class MainTest {

    public MainTest(){

        TestOne testOne = new TestOne();

        // We shouldn't have TestTwo in the classpath, but TestTwo is there regardless
        // It's seems like that intellij resolves what classes to put in the classpath
        // not from what's in the test jar but from the module itself

        //TestTwo testTwo = new TestTwo();
    }
}
