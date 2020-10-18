package Client;
import java.io.Serializable;

public class DisplayTrainsRequest implements Serializable {
    private String source;
    private String sDate;
    private String dest;



    DisplayTrainsRequest(String source, String dest, String sDate) {
        this.source = source;
        this.dest = dest;
        this.sDate = sDate;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public String getsDate() {
        return sDate;
    }
}
