package buyproduct;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Regular extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String product=req.getParameter("product");
		int shoe=Integer.parseInt(getServletContext().getInitParameter("shoe"));
		int shirt=Integer.parseInt(getServletContext().getInitParameter("shirt"));
		Double percentage=Double.parseDouble(getServletConfig().getInitParameter("discount"));
		if(product.equals("shoe"))
		{
			res.getWriter().print("<h1>Price of shoe is "+(shoe-(shoe*(percentage/100)))+" </h1>");
		}
		else if(product.equals("shirt")){
			res.getWriter().print("<h1> Price of the Shirt is "+(shirt-(shirt*(percentage/100)))+"</h1>");
		}
		else{
			res.getWriter().print("<h1>Enter the valid product</h1>");
		}
	}
	
}
