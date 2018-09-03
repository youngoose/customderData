package com.customer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modifyOrder")
public class ModifyOrder extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int orderId = Integer.valueOf(request.getParameter("order_id"));
		String customerName = request.getParameter("customer_name");
		String product = request.getParameter("product");
		String price = request.getParameter("price");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "eddy";
		String pw = "jo";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			
			String sql = "UPDATE customer SET customer_name = '" + customerName + "', product = '" + product + "', price = '" + price + "' WHERE order_id = '" + orderId + "'";
			
			int result = stmt.executeUpdate(sql);
			
			if (result == 1) {
				out.print("UPDATE success!!");
			} else {
				out.print("UPDATE fail!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
