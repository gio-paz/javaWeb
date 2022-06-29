package prueba_tecnicaGet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet(name = "get", urlPatterns = { "/get" })
/**
 * Servlet implementation class get
 */
public class get extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public get() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("/tecnica/perfiles.jsp");
	}

	private String getc() throws ServletException, IOException {

		String salida = "";
		URL url = new URL("https://62a758fc97b6156bff8cef5c.mockapi.io/api/prueba/prueba_tecnica");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");
		InputStreamReader entra = new InputStreamReader(con.getInputStream());
		BufferedReader lectura = new BufferedReader(entra);
		salida = lectura.readLine();
		con.disconnect();
		return salida;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	public JSONObject getDatos() {
		try {
			JSONObject json = new JSONObject();
			String source = getc();
			if (source.startsWith("[")) {
				JSONArray datos = new JSONArray(source);
				json.put("datos", datos);
			}
			return json;
		} catch (ServletException | IOException ex) {
			ex.printStackTrace(System.out);
			return null;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/get [POST] Parametros:");
		request.getParameterMap().keySet().forEach(k -> {
			System.out.println(k + ": " + request.getParameter(k));
		});

		JSONObject data = new JSONObject();
		data.put("nombre", request.getParameter("nombre"));
		data.put("apellido", request.getParameter("apellido"));
		data.put("email", request.getParameter("email"));
		data.put("telefono", request.getParameter("telefono"));
		data.put("ciudad", request.getParameter("Ciudad"));
		data.put("pais", request.getParameter("pais"));
		URL url = new URL("https://62a758fc97b6156bff8cef5c.mockapi.io/api/prueba/prueba_tecnica");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.addRequestProperty("Content-Type", "application/json");
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
		out.write(data.toString());
		out.flush();
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		out.close();
		reader.close();
		response.sendRedirect("/tecnica/perfiles.jsp");
	}

}
