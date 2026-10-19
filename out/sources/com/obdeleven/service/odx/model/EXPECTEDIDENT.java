package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "IDENT-VALUES"})
@Root(name = "EXPECTED-IDENT")
public class EXPECTEDIDENT {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "IDENT-VALUES", required = true)
    protected IDENTVALUES identvalues;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getID() {
        return this.id;
    }

    public IDENTVALUES getIDENTVALUES() {
        return this.identvalues;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setIDENTVALUES(IDENTVALUES identvalues) {
        this.identvalues = identvalues;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
