package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class S02 {
    public static void main(String[] args) throws SQLException {
        // try 밖에서도 쓸 수 있게 선언만 해둠
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // db 연결 주소
            String url = "jdbc:mariadb://localhost:3306/hr";
            // db 연결
            connection = DriverManager.getConnection(url, "root", "1234");
            // 쿼리문 준비
            String sql = "select * from employees where salary > 10000";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 100);
            // 쿼리문 실행
            resultSet = preparedStatement.executeQuery();
            // 결과값 확인
            // Emp속성의 배열리스트를 만든다
            List<Emp> list = new ArrayList<>();
            // index값이 없을때 까지 반복
            while (resultSet.next()) {
                // Emp 속성의 emp를 생산한다
                Emp emp = new Emp(
                    resultSet.getInt("employee_id"),
                    resultSet.getString("first_name"),
                    resultSet.getInt("salary"));
                // emp를 list에 넣는다
                list.add(emp);
            }
            System.out.println(list);


            // if(resultSet.next()) {
            //     Emp emp = new Emp(
            //         resultSet.getInt("employee_id"),
            //         resultSet.getString("first_name"),
            //         resultSet.getInt("salary")
            //     );

            //     System.out.println(emp);
            // }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // connection은 무조건 닫아줘야 한다
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

        }

    }
}
