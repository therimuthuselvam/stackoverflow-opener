import java.awt.Desktop;
import java.net.URI;

public class OpenStackOverflow1 {

	public static void main(String[] args) {
		try {
			System.out.println("StackOverflow Entry");
			URI url = new URI("https://stackoverflow.com");
			Desktop.getDesktop().browse(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("StackOverflow Exit");
		}
	}

}
