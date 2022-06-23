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
import java.io.BufferedReader;
import org.json.JSONObject;
import org.json.JSONArray;
import javax.swing.table.DefaultTableModel;

@WebServlet(name = "get",urlPatterns = {"/get"})
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("/tecnica/perfiles.jsp");
	}

		
	private String getc() throws ServletException, IOException {

		String salida ="";
		URL url = new URL("https://62a758fc97b6156bff8cef5c.mockapi.io/api/prueba/prueba_tecnica");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("accept", "application/json");
		InputStreamReader entra = new InputStreamReader(con.getInputStream());
		BufferedReader lectura = new BufferedReader(entra);
		salida = lectura.readLine();
		System.out.println(salida);
		con.disconnect();
		return salida;
	}
	
	public DefaultTableModel leer() {
	DefaultTableModel tabla = new DefaultTableModel();
	try {
		String encabezado[] = {"nombre","apellid","email","telefono","ciudad","pais"};
		tabla.setColumnIdentifiers(encabezado);
		String datos[] = new String[6];
		JSONArray arreglo = new JSONArray(getc());
		for (int i = 0;i<arreglo.length();i++) {
			JSONObject atributo = arreglo.getJSONObject(i);
			datos[0] = atributo.getString("nombre");
			datos[1] = atributo.getString("apellido");
			datos[2] = atributo.getString("email");
			datos[3] = atributo.getString("telefono");
			datos[4] = atributo.getString("ciudad");
			datos[5] = atributo.getString("pais");
			tabla.addRow(datos);
			System.out.println(datos[0]);
		}
		System.out.println(datos[0]);
	}catch(Exception ex) {
		System.out.println("error en la tabla: "+ ex.getMessage());
	}
	return tabla;
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String salida ="";
		URL url = new URL("https://62a758fc97b6156bff8cef5c.mockapi.io/api/prueba/prueba_tecnica");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("accept", "application/json");
		InputStreamReader entra = new InputStreamReader(con.getInputStream());
		BufferedReader lectura = new BufferedReader(entra);
		salida = lectura.readLine();
		System.out.println(salida);
		con.disconnect();
	}

}
