package edu.eci.cvds.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.eci.cvds.servlet.model.Todo;

@WebServlet(
    urlPatterns = "/prueba"
)
public class Sample2Servlet extends HttpServlet{
    static final long serialVersionUID = 35L;

    @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	Writer responseWriter = resp.getWriter();
        Optional<String> optId = Optional.ofNullable(req.getParameter("id"));
        int id = optId.isPresent() && !optId.get().isEmpty() ? Integer.parseInt(optId.get()) : 0;
        
        if(Service.getTodo(id) != null) {
        	resp.setStatus(HttpServletResponse.SC_OK);
        	responseWriter.write(Service.todosToHTMLTable(Service.getTodo(id)));
        	responseWriter.flush();
        }
    }     
    
}
   