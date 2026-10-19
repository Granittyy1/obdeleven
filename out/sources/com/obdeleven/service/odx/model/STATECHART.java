package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "SEMANTIC", "STATE-TRANSITIONS", "START-STATE-SNREF", "STATES"})
@Root(name = "STATE-CHART")
public class STATECHART {

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SEMANTIC", required = true)
    protected String semantic;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "START-STATE-SNREF", required = true)
    protected SNREF startstatesnref;

    @Element(name = "STATES")
    protected STATES states;

    @Element(name = "STATE-TRANSITIONS")
    protected STATETRANSITIONS statetransitions;

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

    public String getSEMANTIC() {
        return this.semantic;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public SNREF getSTARTSTATESNREF() {
        return this.startstatesnref;
    }

    public STATES getSTATES() {
        return this.states;
    }

    public STATETRANSITIONS getSTATETRANSITIONS() {
        return this.statetransitions;
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

    public void setSEMANTIC(String str) {
        this.semantic = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setSTARTSTATESNREF(SNREF snref) {
        this.startstatesnref = snref;
    }

    public void setSTATES(STATES states) {
        this.states = states;
    }

    public void setSTATETRANSITIONS(STATETRANSITIONS statetransitions) {
        this.statetransitions = statetransitions;
    }
}
