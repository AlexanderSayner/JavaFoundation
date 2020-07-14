package org.sayner.sandbox.example.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sayner.sandbox.example.business.model.Car;
import org.sayner.sandbox.example.business.service.CarService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dev")
public class DevServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        final CarService service = new CarService();
        final PrintWriter printWriter = resp.getWriter();
        final ObjectMapper mapper = new ObjectMapper();
        for (Car car : service.findAll()) {
            printWriter.write(mapper.writeValueAsString(car.toString()) + ",");
        }
        printWriter.write("...");
        printWriter.close();
    }
}
