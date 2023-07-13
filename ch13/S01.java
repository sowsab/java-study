package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S01 {
    public static void main(String[] args) {
        // 자바와 DB를 연결하는 객체
        Connection connection = null;

        // 3306까지가 데이터베이스 시스템 / hr위치가 데이터베이스
        // 데이터베이스를 지정하지 않으면 쿼리 명령어가 먹히질 않는다
        String url = "jdbc:mariadb://localhost:3306/hr";

        // 데이터베이스 연결하기
        try {
            connection = DriverManager.getConnection(
                url,
                "root",
                "1234"
            );
        } catch (SQLException e) {
            System.out.println("DB 연결 중 오류가 발생했습니다");
            return;
        }
        
        // 쿼리문 날리기
        String sql = "select first_name from employees where employee_id = ?";

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            // 위 sql 변수의 ?를 1부터 시작하고 100으로 지정
            preparedStatement.setInt(1, 100);
        } catch (SQLException e) {
            System.out.println("DB 사용 중 오류가 발생했습니다");
            return;
        }

        ResultSet resultSet = null;

        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("쿼리 실행 중 오류가 발생했습니다");
            System.out.println(e.getMessage());
            return;
        }

        // 데이터 자바로 변환
        try {
            if(resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (SQLException e) {
            System.out.println("데이터 변환 중 오류가 발생했습니다");
        }

        try {
            // connection은 무조건 닫아줘야 한다
            // 객체 만든건 무조건 닫아줘야 한다
            // null 체크 (중요)
            if(connection != null) {
                connection.close();
            }
            if(preparedStatement != null){
                preparedStatement.close();
            }
            if(resultSet != null) {
                resultSet.close();
            }


        } catch (SQLException e) {
            System.out.println("연결 종료 중 오류가 발생했습니다");
        }
    }

}
