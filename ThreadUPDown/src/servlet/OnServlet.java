package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thread.MyController01;

/**
 * Servlet implementation class OnServlet
 */
public class OnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public OnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			MyController01.createController();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean a=MyController01.cisInterrupted();
		boolean b=MyController01.isSleep();
		if( !a&& b) {
			MyController01.crun();
		}else {
			System.out.println("中断了");
		}
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
