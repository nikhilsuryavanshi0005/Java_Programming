import java.sql.*;

class MarvellousJDBC
{
    public static void main(String Ar[])
    {
        try
        {
            //Step1 : Load the database Driver;
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step2 : Connect the Driver with the Database;
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53", "root","");

            //Step3 : Create statement class object;
            Statement sobj = cobj.createStatement();

            //Step4 : Execute the query;
            ResultSet robj = sobj.executeQuery("select * from Student");

            //Step5 : Display the result;
            while(robj.next())
            {
                System.out.println("Roll No:"+robj.getInt("Rno"));
                System.out.println("Name:"+robj.getString("Name"));
                System.out.println("City:"+robj.getString("City"));
                System.out.println("Marks:"+robj.getInt("Marks" ));

            }

            robj.close();
            sobj.close();
            cobj.close();


        }
        catch(Exception eobj)
        {
            System.out.println("Exception Occur"+eobj);
        }

    }
    
}
