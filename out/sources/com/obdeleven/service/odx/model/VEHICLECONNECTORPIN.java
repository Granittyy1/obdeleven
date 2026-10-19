package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "PIN-NUMBER"})
@Root(name = "VEHICLE-CONNECTOR-PIN")
public class VEHICLECONNECTORPIN {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PIN-NUMBER")
    protected long pinnumber;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Attribute(name = "TYPE", required = true)
    @Convert(PINTYPE.Converter.class)
    protected PINTYPE type;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public long getPINNUMBER() {
        return this.pinnumber;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public PINTYPE getTYPE() {
        return this.type;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setPINNUMBER(long j) {
        this.pinnumber = j;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTYPE(PINTYPE pintype) {
        this.type = pintype;
    }
}
