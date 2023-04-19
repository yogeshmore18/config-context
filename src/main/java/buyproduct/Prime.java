package buyproduct;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/prime", initParams=@WebInitParam(name="discount", value="40"))
public class Prime extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String product=req.getParameter("product");
		int shoe=Integer.parseInt(getServletContext().getInitParameter("shoe"));
		int shirt=Integer.parseInt(getServletContext().getInitParameter("shirt"));
		Double discount=Double.parseDouble(getServletConfig().getInitParameter("discount"));
		if(product.equals("shoe"))
		{
		res.getWriter().print("<h1>the price of the shoe is: "+(shoe-discount)+"</h1>");	
		}
		else if(product.equals("shirt"))
		{
			res.getWriter().print("<h1>price of the shirt is: "+(shirt-discount)+"</h1>");
		}
		else
		{
			res.getWriter().print("Enter the valid product");
		}
	}
}
