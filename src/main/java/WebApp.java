import com.jfinal.core.JFinal;

public class WebApp {

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 80, "/");
    }
}
