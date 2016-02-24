// Garrett Martin
// CS374 HW2P1

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HW2Prog1{
	public static void main(String[] args) throws Exception {
		HttpServer server = HttpServer.create(new InetSocketAddress(12000), 0);
		server.createContext("/", new RequestHandler());
		server.setExecutor(null);	// Starts the server executor, which gathers and runs the tasks of showing the page
		server.start();
	}
	
	static class RequestHandler implements HttpHandler {
		@Override
		public void handle(HttpExchange t) throws IOException {
			String response = "Hello CS374!";
			t.sendResponseHeaders(200, response.length());
			OutputStream os = t.getResponseBody();
			os.write(response.getBytes());
			os.close();
		}
	}
	
}