package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "EXPECTED-IDENTS", "CHECKSUMS", "SECURITYS", "DATABLOCK-REFS", "SDGS"})
@Root(name = "SESSION")
public class SESSION {

    @Element(name = "CHECKSUMS")
    protected CHECKSUMS checksums;

    @Element(name = "DATABLOCK-REFS", required = true)
    protected DATABLOCKREFS datablockrefs;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Element(name = "EXPECTED-IDENTS")
    protected EXPECTEDIDENTS expectedidents;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SDGS")
    protected SDGS sdgs;

    @Element(name = "SECURITYS")
    protected SECURITYS securitys;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    public CHECKSUMS getCHECKSUMS() {
        return this.checksums;
    }

    public DATABLOCKREFS getDATABLOCKREFS() {
        return this.datablockrefs;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public EXPECTEDIDENTS getEXPECTEDIDENTS() {
        return this.expectedidents;
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

    public SDGS getSDGS() {
        return this.sdgs;
    }

    public SECURITYS getSECURITYS() {
        return this.securitys;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public void setCHECKSUMS(CHECKSUMS checksums) {
        this.checksums = checksums;
    }

    public void setDATABLOCKREFS(DATABLOCKREFS datablockrefs) {
        this.datablockrefs = datablockrefs;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setEXPECTEDIDENTS(EXPECTEDIDENTS expectedidents) {
        this.expectedidents = expectedidents;
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

    public void setSDGS(SDGS sdgs) {
        this.sdgs = sdgs;
    }

    public void setSECURITYS(SECURITYS securitys) {
        this.securitys = securitys;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }
}
