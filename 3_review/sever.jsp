<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
    String empno = request.getParameter("empno");
    String ename = request.getParameter("name");
    String ejob = request.getParameter("job");
    String esal = request.getParameter("sal");
    String deptno = request.getParameter("deptno");
    System.out.println("사번"+empno);
    System.out.println("이름"+ename);
    System.out.println("업무"+ejob);
    System.out.println("월급"+esal);
    System.out.println("사번"+deptno);
  
    
     String driver	    = "oracle.jdbc.driver.OracleDriver";
	 String url		    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	 String user		= "scott";
	 String pass		= "tiger";

	// [1] 드라이버를 메모리 로딩
				Class.forName(driver);
				// [2] SQL 문장 (*****)			
				String sql = "INSERT INTO emp(empno, ename, sal, job,deptno)  "
						+ " VALUES(?,?,?,?,?) ";
	
				// [3] 연결객체 얻어오기
				Connection con = DriverManager.getConnection(url, user, pass);
				
			
				// [4] 전송객체 얻어오기		
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setInt(1,Integer.parseInt(empno));
				ps.setString(2,ename);
				ps.setInt(3,Integer.parseInt(esal));
				ps.setString(4,ejob);
				ps.setInt(5,Integer.parseInt(deptno));
	
				// [5] 전송			
				int result = ps.executeUpdate();
				
				// [6] 닫기
				ps.close();
				con.close();
%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  실제로 저장되었습니다.
</body>
</html>