/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahashop.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INT105
 */
public class AhashopG4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//        Class.forName("org.apache.derby.jdbc.ClientDriver");
//        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shop(1)","app","app");
//       
//        Statement st =conn.createStatement();
//        st.executeUpdate("INSERT INTO product VALUES(24,'Watch',200)");
//        st.executeUpdate("UPDATE product SET price = 2000 WHERE product_id =24");
//          ResultSet rs= st.executeQuery("SELECT * FROM order_item");
//          System.out.println("|\tOrder id\tProduct id\tQuantity\tPrice\t|");
//          while(rs.next()){
//              System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getInt(2)+"\t|\t"+rs.getInt(3)+"\t|\t"+rs.getDouble(4)+"\t|");
//          }
//          System.out.println("******************************************************************************************************************************");
//          System.out.println("|\tOrder id\tProduct Name\t\t\t\tQuantity\tProduct price\t\tTotal\t\tStatus\t|");
//          rs = st.executeQuery("SELECT ORDER_ITEM.ORDER_ID,PRODUCT.PRODUCT_NAME,ORDER_ITEM.QUANTITY,ORDER_ITEM.PRODUCT_PRICE,(ORDER_ITEM.QUANTITY*ORDER_ITEM.PRODUCT_PRICE) as total ,ORDERS.STATUS FROM order_item JOIN product ON order_item.PRODUCT_ID=product.PRODUCT_ID  JOIN ORDERS ON ORDER_ITEM.ORDER_ID=ORDERS.ORDER_ID  WHERE ORDER_ITEM.ORDER_ID=51");
//          double total=0;
//          while(rs.next()){
//              total += rs.getDouble("total");
//              System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getInt(3)+"\t|\t"+rs.getInt(4)+"\t|\t"+rs.getFloat(5)+"\t|\t"+rs.getString(6));
//          }
//          System.out.println("Total Price = "+total);
//          conn.close();
//
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shop(1)","app","app");
//            
//            Statement st =conn.createStatement();
//            ResultSet rs= st.executeQuery("SELECT * FROM product");
//            Product prod ;
//            
//            while(rs.next()){
//                prod = new Product (rs.getInt("product_id"),rs.getString("product_name"),rs.getDouble("price"));
//                System.out.println(prod.toString());
//            }

//            Product p = Product.findById(20);
//            System.out.println(p);
//              Product temp = new Product(300,"Mouse",100);
//              temp.updateProduct();
//              ProductOld temp = ProductOld.findById(300);
//              temp.setPrice(200);
//              temp.updateProduct();
//            ProductTobTaun prod01 = ProductTobTaun.findById(30);
//            System.out.println(prod01);
//            conn.close();
//        String[] str_arr = new String[2];
//        str_arr[0] = "Hello world";
//        str_arr[1] = "JAVA Programming";
//        System.out.println("Size of str_arr = " + str_arr.length);
//        for (int i = 0; i < str_arr.length; i++) {
//            System.out.println(str_arr[i]);
//        }
//
//        System.out.println("***************************************");
//        ArrayList<String> str_arr_list = new ArrayList<String>();
//
//        str_arr_list.add("Hello world");
//        str_arr_list.add("JAVA Programming");
//        str_arr_list.add("Other String");
//        str_arr_list.remove(1);
//        System.out.println("Size of  str_arr_list= " + str_arr_list.size());
//        for (int i = 0; i < str_arr_list.size(); i++) {
//            System.out.println(str_arr_list.get(i));
//        }
//        Product pro01 =new Product (200,"Mouse",50);
//        Product pro02 =new Product (201,"Pen",5);
//        ArrayList<Product> prodArrList = new ArrayList<Product>();
//        prodArrList.add(pro01);
//        prodArrList.add(pro02);
//        prodArrList.add(new Product(202,"Keyboard",3));
//        prodArrList.add(new Product(203,"Monitor",200));
//        System.out.println("*****************************************");
//        for(int i=0;i<prodArrList.size();i++){
//            System.out.println(prodArrList.get(i));
//            prodArrList.get(i).updateProduct();
//        }
//        
//          File f = new File("file/product.csv");
//          FileReader fr =null;
//        try {
//            fr = new FileReader(f);
//            int ch;
//            while((ch=fr.read())!= -1){
//                System.out.print((char)ch);
//            }
//            
//            
//            
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
//        finally{
//            try{
//             fr.close();
//            }catch(IOException ex){
//            }
//        }
//
//            File f = new File("file/product.csv");
//            Scanner sc =new Scanner(f);
//            sc.useDelimiter(",");
//            
//            while(sc.hasNext()){
//                System.out.println(sc.next());
//            }
//            
//            sc.close();
//        Product prod = new Product();
//        File f = new File("file/product.csv");
//        Scanner sc = new Scanner(f);
//        sc.useDelimiter(",");
//
//        while (sc.hasNext()) {
////                System.out.println(sc.next());
//            String temp = sc.nextLine();
//            String[] temp2 = temp.split(",");
////                System.out.println(temp);
//            prod.setProduct_id(Integer.parseInt(temp2[0]));
////                temp =sc.next();
////                System.out.println(temp);
//            prod.setProduct_name(temp2[1]);
////                temp =sc.next();
////                System.out.println(temp);
//            prod.setPrice(Double.parseDouble(temp2[2]));
//
//            System.out.println(prod);
//            prod.updateProduct();
//        }
//            
//        sc.close();
//        File f = new File("file/name.txt");
//        FileReader fr = new FileReader(f);
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        fr.close();
//          FileWriter fw = new FileWriter("file/testWrite.txt");
//         fw.write("aha\n");
//         fw.write("Other line\n");
//          fw.close();
//        File f = new File("file/testWrite.txt");
//        FileWriter fw = new FileWriter(f,true);
//        PrintWriter pw = new PrintWriter(fw);
//        fw.write("hhh\n");
//        fw.write("Other line\n");
//        fw.close();
        File f = new File("file/testWrite.txt");
        FileWriter fw = new FileWriter(f, false);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("aha");
        pw.println("aha2");
        pw.close();
    }

}
