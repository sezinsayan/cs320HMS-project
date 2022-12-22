package Tests;

import org.junit.jupiter.api.Test;
import project.*;

public class ApplicationTests {
    @Test
    public void UnsuccessLogin(){
        String email="resat";
        char[] password={'3','1'};
        Service.LoginPageData(email,password);

    }

}
