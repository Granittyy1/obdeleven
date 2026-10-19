package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"shortname", "longname", "desc", "diagcommsnref", "outparamifrefs", "inparamifrefs"})
@Root(name = "SUB-COMPONENT-PARAM-CONNECTOR")
public class SUBCOMPONENTPARAMCONNECTOR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DIAG-COMM-SNREF", required = true)
    protected SNREF diagcommsnref;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "IN-PARAM-IF-REFS")
    protected INPARAMIFREFS inparamifrefs;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "OUT-PARAM-IF-REFS")
    protected OUTPARAMIFREFS outparamifrefs;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public SNREF getDIAGCOMMSNREF() {
        return this.diagcommsnref;
    }

    public String getID() {
        return this.id;
    }

    public INPARAMIFREFS getINPARAMIFREFS() {
        return this.inparamifrefs;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public OUTPARAMIFREFS getOUTPARAMIFREFS() {
        return this.outparamifrefs;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDIAGCOMMSNREF(SNREF snref) {
        this.diagcommsnref = snref;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setINPARAMIFREFS(INPARAMIFREFS inparamifrefs) {
        this.inparamifrefs = inparamifrefs;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setOUTPARAMIFREFS(OUTPARAMIFREFS outparamifrefs) {
        this.outparamifrefs = outparamifrefs;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
