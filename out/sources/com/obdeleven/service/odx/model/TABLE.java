package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "KEY-LABEL", "STRUCT-LABEL", "ADMIN-DATA", "KEY-DOP-REF", "TABLE-DIAG-COMM-CONNECTORS", "SDGS"})
@Root(name = "TABLE")
public class TABLE {

    @Element(name = "ADMIN-DATA")
    protected ADMINDATA admindata;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "KEY-DOP-REF")
    protected ODXLINK keydopref;

    @Element(name = "KEY-LABEL")
    protected String keylabel;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "STRUCT-LABEL")
    protected String structlabel;

    @Element(name = "TABLE-DIAG-COMM-CONNECTORS")
    protected TABLEDIAGCOMMCONNECTORS tablediagcommconnectors;

    @ElementList(entry = "TABLE-ROW-REF", inline = true, type = ODXLINK.class)
    protected List<ODXLINK> tablerowrefs;

    @ElementList(inline = true, name = "TABLE-ROW", type = TABLEROW.class)
    protected List<TABLEROW> tablerows;

    public ADMINDATA getADMINDATA() {
        return this.admindata;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getID() {
        return this.id;
    }

    public ODXLINK getKEYDOPREF() {
        return this.keydopref;
    }

    public String getKEYLABEL() {
        return this.keylabel;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public String getSTRUCTLABEL() {
        return this.structlabel;
    }

    public TABLEDIAGCOMMCONNECTORS getTABLEDIAGCOMMCONNECTORS() {
        return this.tablediagcommconnectors;
    }

    public List<ODXLINK> getTABLEROWREFS() {
        if (this.tablerowrefs == null) {
            this.tablerowrefs = new ArrayList();
        }
        return this.tablerowrefs;
    }

    public List<TABLEROW> getTABLEROWS() {
        if (this.tablerows == null) {
            this.tablerows = new ArrayList();
        }
        return this.tablerows;
    }

    public void setADMINDATA(ADMINDATA admindata) {
        this.admindata = admindata;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setKEYDOPREF(ODXLINK odxlink) {
        this.keydopref = odxlink;
    }

    public void setKEYLABEL(String str) {
        this.keylabel = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSTRUCTLABEL(String str) {
        this.structlabel = str;
    }

    public void setTABLEDIAGCOMMCONNECTORS(TABLEDIAGCOMMCONNECTORS tablediagcommconnectors) {
        this.tablediagcommconnectors = tablediagcommconnectors;
    }
}
