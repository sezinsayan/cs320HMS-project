package project;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
public class Service {
    public static boolean LoginPageData(String email, char[] password) {
        boolean check = false;
        char[] adminPassword = {'1', '2', '3', '4'};
        char[] erenPassword = {'e', 'r', 'e', 'n', '1', '2', '3', '4'};
        char[] ismailPassword = {'i', 's', 'm', 'a', 'i', 'l', '1', '2', '3', '4'};
        char[] dogaPassword = {'d', 'o', 'g', 'a', '1', '2', '3', '4'};
        char[] sezinPassword = {'s', 'e', 'z', 'i', 'n', '1', '2', '3', '4'};
        char[] pasanPassword = {'p', 'a', 's', 'a', 'n', '1', '2', '3', '4'};
        char[] emircanPassword = {'e', 'm', 'i', 'r', 'c', 'a', 'n', '1', '2', '3', '4'};


        if (email.equals("") || password.length == 0) {
            JOptionPane.showMessageDialog(null, "Every Field Is Required!");
        } else if (email.equals("hms") && Arrays.equals(password, adminPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "ADMIN LOGIN");
        } else if (email.equals("eren") && Arrays.equals(password, erenPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "WELCOME EREN");
        } else if (email.equals("ismail") && Arrays.equals(password, ismailPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "WELCOME İSMAİL");
        } else if (email.equals("doga") && Arrays.equals(password, dogaPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "WELCOME DOĞA");
        } else if (email.equals("sezin") && Arrays.equals(password, sezinPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "WELCOME SEZİN");
        } else if (email.equals("pasan") && Arrays.equals(password, pasanPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "WELCOME PAŞAN");
        } else if (email.equals("emircan") && Arrays.equals(password, emircanPassword)) {
            // admin login
            check = true;
            JOptionPane.showMessageDialog(null, "WELCOME EMIRCAN");
        } else {
            ResultSet rs = Select.getData("Select * from users where email='" + email + "' and password ='" + Arrays.toString(password) + "'");
            try {
                if (rs == null) {
                    JOptionPane.showMessageDialog(null, "Such User Doesn't Exist!");
                } else if (rs.next()) {
                    if (rs.getString(4).equals("true")) {
                        check = true;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return check;
    }

    public static int AddRoom(String roomNo, String price,String roomType,String bed) {
        int sin = 0;

        if (roomNo.equals("")) {
            JOptionPane.showMessageDialog(null, "All Field is Required");
            sin =1;
        } else if (price.equals("")) {
            JOptionPane.showMessageDialog(null, "All Field is Required");
            sin=2;
        } else {

            PreparedStatement pst = null;
            ResultSet rs = null;
            try {
                java.sql.Connection con = ConnectionProvider.getCon();
                pst = con.prepareStatement("select * from room where roomNO=?");
                pst.setString(1, roomNo);
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Room Number Already Exist");
                } else {
                    String Query = "insert into room values('" + roomNo + "','" + roomType + "','" + bed + "','" + price + "','Not Booked')";
                    InsertUpdateDelete.setData(Query, "Successfully Updated");
                    sin=3;

                }

            } catch (Exception e) {

            }
        }
        return sin;
    }

    public static void InsertCustomer(int id, String name, String mobileNumber, String gender, String email, String idProof, String address, String checkIn, String roomNo, String bed, String roomType, String price){
        InsertUpdateDelete.setData("insert into customer(id,name,mobileNumber,gender,email,idProof,address,checkIn,roomNo,bed,roomType,pricePerDay) values("+id+",'"+name+"','"+mobileNumber+"','"+gender+"','"+email+"','"+idProof+"','"+address+"','"+checkIn+"','"+roomNo+"','"+bed+"','"+roomType+"','"+price+"')", "CHECK IN SUCCESFUL");

    }

    public static ResultSet SelectCustomer(String roomNo){
        return Select.getData("select *from customer where roomNo='"+roomNo+"' and checkout is NULL");
    }
}
