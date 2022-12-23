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
    @Test
    public void AddRoom(){
        String roomNo="505";
        String price="800";
        String roomType="AC";
        String bed="Double";
        Service.AddRoom(roomNo,price,roomType,bed);

    }

}
