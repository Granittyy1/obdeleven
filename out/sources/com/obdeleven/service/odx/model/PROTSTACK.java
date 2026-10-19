package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "PDU-PROTOCOL-TYPE", "PHYSICAL-LINK-TYPE", "COMPARAM-SUBSET-REFS"})
@Root(name = "PROT-STACK")
public class PROTSTACK {

    @Element(name = "COMPARAM-SUBSET-REFS")
    protected COMPARAMSUBSETREFS comparamsubsetrefs;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "PDU-PROTOCOL-TYPE", required = true)
    protected String pduprotocoltype;

    @Element(name = "PHYSICAL-LINK-TYPE", required = true)
    protected String physicallinktype;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public COMPARAMSUBSETREFS getCOMPARAMSUBSETREFS() {
        return this.comparamsubsetrefs;
    }

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

    public String getPDUPROTOCOLTYPE() {
        return this.pduprotocoltype;
    }

    public String getPHYSICALLINKTYPE() {
        return this.physicallinktype;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setCOMPARAMSUBSETREFS(COMPARAMSUBSETREFS comparamsubsetrefs) {
        this.comparamsubsetrefs = comparamsubsetrefs;
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

    public void setPDUPROTOCOLTYPE(String str) {
        this.pduprotocoltype = str;
    }

    public void setPHYSICALLINKTYPE(String str) {
        this.physicallinktype = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
