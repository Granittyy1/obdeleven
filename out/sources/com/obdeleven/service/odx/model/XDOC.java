package com.obdeleven.service.odx.model;

import java.util.Date;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "NUMBER", "STATE", "DATE", "PUBLISHER", "URL", "POSITION"})
@Root(name = "XDOC")
public class XDOC {

    @Element(name = "DATE")
    protected Date date;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "NUMBER")
    protected String number;

    @Element(name = "POSITION")
    protected String position;

    @Element(name = "PUBLISHER")
    protected String publisher;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STATE")
    protected String state;

    @Element(name = "URL")
    protected String url;

    public Date getDATE() {
        return this.date;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getNUMBER() {
        return this.number;
    }

    public String getPOSITION() {
        return this.position;
    }

    public String getPUBLISHER() {
        return this.publisher;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public String getSTATE() {
        return this.state;
    }

    public String getURL() {
        return this.url;
    }

    public void setDATE(Date date) {
        this.date = date;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setNUMBER(String str) {
        this.number = str;
    }

    public void setPOSITION(String str) {
        this.position = str;
    }

    public void setPUBLISHER(String str) {
        this.publisher = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSTATE(String str) {
        this.state = str;
    }

    public void setURL(String str) {
        this.url = str;
    }
}
