package classwork.November20;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Warmup {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8088);

        ServletContextHandler handler = new ServletContextHandler();

        handler.addServlet(new ServletHolder(new HelloServlet()),"/hello/*");
        handler.addServlet(new ServletHolder(new ByeServlet()),"/bye/*");

        server.setHandler(handler);
        server.start();
        server.join();

    }
}
