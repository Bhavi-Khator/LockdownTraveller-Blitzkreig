package com.codes;

import java.io.Serializable;

public class DisplayTrainsRequest extends Request implements Serializable {
    private String source;
    private String sDate;
    private String dest;

    DisplayTrainsRequest(String source, String sDate, String dest) {
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
