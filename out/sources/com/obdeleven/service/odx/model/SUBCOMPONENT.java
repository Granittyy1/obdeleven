package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "SUB-COMPONENT-PATTERNS", "SUB-COMPONENT-PARAM-CONNECTORS", "TABLE-ROW-CONNECTORS", "ENV-DATA-CONNECTORS", "DTC-CONNECTORS"})
@Root(name = "SUB-COMPONENT")
public class SUBCOMPONENT {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "DTC-CONNECTORS")
    protected DTCCONNECTORS dtcconnectors;

    @Element(name = "ENV-DATA-CONNECTORS")
    protected ENVDATACONNECTORS envdataconnectors;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Attribute(name = "SEMANTIC")
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "SUB-COMPONENT-PARAM-CONNECTORS")
    protected SUBCOMPONENTPARAMCONNECTORS subcomponentparamconnectors;

    @Element(name = "SUB-COMPONENT-PATTERNS")
    protected SUBCOMPONENTPATTERNS subcomponentpatterns;

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

    public String getID() {
        return this.id;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public String getOID() {
        return this.oid;
    }

    public String getSEMANTIC() {
        return this.semantic;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public SUBCOMPONENTPARAMCONNECTORS getSUBCOMPONENTPARAMCONNECTORS() {
        return this.subcomponentparamconnectors;
    }

    public SUBCOMPONENTPATTERNS getSUBCOMPONENTPATTERNS() {
        return this.subcomponentpatterns;
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

    public void setID(String str) {
        this.id = str;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSUBCOMPONENTPARAMCONNECTORS(SUBCOMPONENTPARAMCONNECTORS subcomponentparamconnectors) {
        this.subcomponentparamconnectors = subcomponentparamconnectors;
    }

    public void setSUBCOMPONENTPATTERNS(SUBCOMPONENTPATTERNS subcomponentpatterns) {
        this.subcomponentpatterns = subcomponentpatterns;
    }

    public void setTABLEROWCONNECTORS(TABLEROWCONNECTORS tablerowconnectors) {
        this.tablerowconnectors = tablerowconnectors;
    }
}
