package classwork.November22.web;

import classwork.November22.jdbc.DbConnection;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.sql.Connection;

public class WebApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8082);

    ServletContextHandler handler = new ServletContextHandler();

    handler.addServlet(new ServletHolder(new LoginServlet()), "/login/*");
    handler.addServlet(new ServletHolder(new CalcServlet()), "/calc/*");
    handler.addServlet(new ServletHolder(new HelloServlet(33)), "/*");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}
