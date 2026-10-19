package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "FUNCTION-DIAG-COMM-CONNECTORS", "TABLE-ROW-CONNECTORS", "ENV-DATA-CONNECTORS", "DTC-CONNECTORS"})
@Root(name = "DIAG-OBJECT-CONNECTOR")
public class DIAGOBJECTCONNECTOR {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DTC-CONNECTORS")
    protected DTCCONNECTORS dtcconnectors;

    @Element(name = "ENV-DATA-CONNECTORS")
    protected ENVDATACONNECTORS envdataconnectors;

    @Element(name = "FUNCTION-DIAG-COMM-CONNECTORS")
    protected FUNCTIONDIAGCOMMCONNECTORS functiondiagcommconnectors;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TABLE-ROW-CONNECTORS")
    protected TABLEROWCONNECTORS tablerowconnectors;

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public DTCCONNECTORS getDTCCONNECTORS() {
        return this.dtcconnectors;
    }

    public ENVDATACONNECTORS getENVDATACONNECTORS() {
        return this.envdataconnectors;
    }

    public FUNCTIONDIAGCOMMCONNECTORS getFUNCTIONDIAGCOMMCONNECTORS() {
        return this.functiondiagcommconnectors;
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

    public String getSHORTNAME() {
        return this.shortname;
    }

    public TABLEROWCONNECTORS getTABLEROWCONNECTORS() {
        return this.tablerowconnectors;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setDTCCONNECTORS(DTCCONNECTORS dtcconnectors) {
        this.dtcconnectors = dtcconnectors;
    }

    public void setENVDATACONNECTORS(ENVDATACONNECTORS envdataconnectors) {
        this.envdataconnectors = envdataconnectors;
    }

    public void setFUNCTIONDIAGCOMMCONNECTORS(FUNCTIONDIAGCOMMCONNECTORS functiondiagcommconnectors) {
        this.functiondiagcommconnectors = functiondiagcommconnectors;
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

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTABLEROWCONNECTORS(TABLEROWCONNECTORS tablerowconnectors) {
        this.tablerowconnectors = tablerowconnectors;
    }
}
