package Tests;

import org.junit.Test;
import project.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void InsertAndSelectCustomer() throws SQLException {
        int id = 99999;

        Service.InsertCustomer(id, "name", "123", "male", "asd@gmail.com", "1", "street", "yes", "100", "2", "ac", "120");
        ResultSet rs = Service.SelectCustomer("100");
        if (rs.next()) {
            assertEquals(rs.getInt("id"), id);
        }
    }


    @Test
    public void CheckOut() throws SQLException {
        String Query;

        Service.InsertCustomer(0, "name", "123", "male", "asd@gmail.com", "1", "street", "yes", "100", "2", "ac", "120");
        Service.AddRoom("100", "100", "AC", "two");

        //Check-In
        Query="update room set Status='Booked' where roomNo='"+"100"+"'";
        InsertUpdateDelete.setData(Query,"");

        Service.CheckOut("10", "1000", "20.11.2022", 0, "100");

        ResultSet rs = Service.SelectRoomByRoomNo("100");
        if (rs.next()) {
            assertEquals(rs.getString("status"), "Not Booked");
        }


    }


}
