package com.aviation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aviation.utility.*;
import com.aviation.utility.AircraftFactory;

import com.aviation.model.aircraft.*;
import com.aviation.model.details.*;

@WebServlet("/procorder.html")
public class ProcessOrder extends HttpServlet implements IntroTexts {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String input_aircraftType = request.getParameter("acid");
		Aircraft aircraft = new AircraftFactory().getAircraft(input_aircraftType);
		Detail detail = new DetailFactory().getDetail(input_aircraftType);	
		aircraft.setDetail(detail);
		request.setAttribute("aircraft", aircraft);
		request.getRequestDispatcher("displayConfirmOrder.jsp").forward(request, response);
	}

}
