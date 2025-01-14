package com.kodilla.jdbc;

public class DbManagerTestSuite {
//    @Test
//    public void testConnection() throws SQLException {
//        //Given
//        //When
//        DbManager dbManager = DbManager.getInstance();
//        //Then
//        Assert.assertNotNull(dbManager.getConnection());
//    }
//
//    @Test
//    public void testSelectUsers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        //When
//        String sqlQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getInt("ID") + ". " +
//                    rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assert.assertEquals(5, counter);
//    }
//
//    @Test
//    public void testSelectUsersAndPosts() throws SQLException {
//        //given
//        DbManager dbManager = DbManager.getInstance();
//        //When
//        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER " +
//                "FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID " +
//                "GROUP BY P.USER_ID " +
//                "HAVING COUNT(*) >= 2;";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//        //Then
//        int counter = 0;
//        while(rs.next()) {
//            System.out.println(rs.getString("FIRSTNAME") + ", " +
//                    rs.getString("LASTNAME") + ", " +
//                    rs.getString("POSTS_NUMBER"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        Assert.assertEquals(1, counter);
//    }
}