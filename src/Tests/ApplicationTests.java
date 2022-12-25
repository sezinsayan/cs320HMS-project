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
    public void SuccessLogin(){
        String email="eren";
        char[] password={'e','r','e','n','1','2','3','4'};
        Service.LoginPageData(email,password);
    }
    @Test
    public void AddRoom(){
        String roomNo="111";
        String price="300";
        String roomType="AC";
        String bed="Triple";
        Service.AddRoom(roomNo,price,roomType,bed);

    }

    @Test
    public void InsertAndSelectCustomer() throws SQLException {
        int id = 99999;

        Service.InsertCustomer(id, "name", "123", "Male", "asd@gmail.com", "1", "street", "2022/12/22", "100", "Double", "AC", "120");
        ResultSet rs = Service.SelectCustomer("100");
        if (rs.next()) {
            assertEquals(rs.getInt("id"), id);
        }
    }


    @Test
    public void CheckOut() throws SQLException {
        String Query;

        Service.InsertCustomer(0, "name", "123", "Male", "asd@gmail.com", "1", "street", "2022/12/22", "100", "Double", "AC", "120");
        Service.AddRoom("100", "120", "AC", "Double");

        //Check-In
        Query="update room set Status='Booked' where roomNo='"+"100"+"'";
        InsertUpdateDelete.setData(Query,"");

        Service.CheckOut("10", "1000", "2022/12/26", 0, "100");

        ResultSet rs = Service.SelectRoomByRoomNo("100");
        if (rs.next()) {
            assertEquals(rs.getString("status"), "Not Booked");
        }


    }
    @Test
    public void CheckIn() throws SQLException {

        Service.AddRoom("200", "100", "AC", "Double");
        Service.CheckIn(0,"checkintest","1234","Female","name@gmail.com","1","street","2022/12/22","Double","AC","200","100");

        ResultSet rs = Service.SelectRoomByRoomNo("200");
        if (rs.next()) {
            assertEquals(rs.getString("status"), "Booked");
        }
    }


}
