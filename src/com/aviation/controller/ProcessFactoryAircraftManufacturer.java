package com.aviation.controller;

import com.aviation.utility.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procacmanufacturerselection.html")
public class ProcessFactoryAircraftManufacturer extends HttpServlet implements IntroTexts {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String input_aircraftMan = request.getParameter("selectedManufacturer");

		if ("AIRBUS".equalsIgnoreCase(input_aircraftMan)) {

			response.sendRedirect("indexAirbus.jsp");

		} else if ("BOEING".equalsIgnoreCase(input_aircraftMan)) {

			response.sendRedirect("indexBoeing.jsp");

		} else if ("DOUGLAS".equalsIgnoreCase(input_aircraftMan)) {

			response.sendRedirect("indexDouglas.jsp");

		}

	}

}
