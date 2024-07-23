import java.awt.Desktop;
import java.net.URI;

public class OpenStackOverflow {
    public static void main(String[] args) {
        try {
            URI url = new URI("https://stackoverflow.com");
            Desktop.getDesktop().browse(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
