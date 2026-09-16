package javaEX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCRUDEx {

    // =========================
    // SELECT
    // =========================
    public Emp selectEmp(int empno) {

        String sql =
                "SELECT EMPNO, ENAME, DEPTNO " +
                        "FROM EMP " +
                        "WHERE EMPNO = ?";
        Connection conn = null;
        try {
            conn = DBConn.getDBConnecton();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, empno);

            ResultSet rs = pstmt.executeQuery() ;

            if (rs.next()) {

                int no = rs.getInt("EMPNO");
                String name = rs.getString("ENAME");
                int dept = rs.getInt("DEPTNO");

                return new Emp(no, name, dept);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


    public boolean insertEmp(int empno, String ename, int deptno) {

        String sql =
                "INSERT INTO EMP(EMPNO, ENAME, DEPTNO) " +
                        "VALUES (?, ?, ?)";

        Connection conn = null;

        try {
            conn = DBConn.getDBConnecton();
            PreparedStatement pstmt = conn.prepareStatement(sql) ;

            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setInt(3, deptno);

            int count = pstmt.executeUpdate();
            return count == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }


    // =========================
    // DELETE
    // =========================
    public boolean deleteEmp(int empno) {

        String sql = " DELETE FROM EMP WHERE EMPNO = ? ";
        Connection conn = null;

        try {
            conn  = DBConn.getDBConnecton();
            PreparedStatement pstmt = conn.prepareStatement(sql) ;


            pstmt.setInt(1, empno);

            int count = pstmt.executeUpdate();

            return count == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }


    // =========================
    // UPDATE
    // =========================
    public boolean updateEmp(int empno, String ename, int deptno) {
        String sql =
                "UPDATE EMP " +
                        "SET ENAME = ?, DEPTNO = ? " +
                        "WHERE EMPNO = ?";

        Connection conn = null;

        try {
            conn  = DBConn.getDBConnecton();
            PreparedStatement pstmt = conn.prepareStatement(sql) ;

            pstmt.setString(1, ename);
            pstmt.setInt(2, deptno);
            pstmt.setInt(3, empno);

            int count = pstmt.executeUpdate();

            return count == 1;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return false;
    }


    // =========================
    // MAIN
    // =========================
    public static void main(String[] args) {

        JdbcCRUDEx dao = new JdbcCRUDEx();
        System.out.println("\n===== SELECT =====");

        System.out.println(dao.selectEmp(7900));

        System.out.println("===== INSERT =====");

        boolean r = dao.insertEmp(9999,"lee",10);


//        System.out.println("\n===== UPDATE =====");
//        boolean updateResult =
//                dao.updateEmp(9999, "KIM", 20);
//        System.out.println("UPDATE 결과 : " + updateResult);
//
//
        System.out.println("\n===== DELETE =====");
        boolean deleteResult =
                dao.deleteEmp(9999);
        System.out.println("DELETE 결과 : " + deleteResult);
    }
}