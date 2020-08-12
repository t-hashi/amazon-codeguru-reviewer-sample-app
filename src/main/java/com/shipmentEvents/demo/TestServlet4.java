package com.shipmentEvents.handlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class TestServlet4
 */
@WebServlet("/TestServlet4")
public class TestServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = LogManager.getLogger();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String creditCard = "9999-9999-9999-9999";
		String creditCardNumber = "9999999999999999";
		logger.info("info={}",creditCard);
		logger.info("info={}",creditCardNumber);		
		logger.error("error={}",creditCard); 
		logger.error("error={}",creditCardNumber); 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
