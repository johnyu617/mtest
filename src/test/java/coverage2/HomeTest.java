package coverage2;


import org.testng.annotations.Test;

import coverage2.Home;
    
public class HomeTest {
    
    @Test(groups={"function"})
    public void testHome() {
        Home home = new Home("my home", "619");
}

}