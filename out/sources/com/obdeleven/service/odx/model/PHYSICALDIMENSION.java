package com.obdeleven.service.odx.model;

import com.obdeleven.service.odx.converter.CollapsedStringConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"SHORT-NAME", "LONG-NAME", "DESC", "LENGTH-EXP", "MASS-EXP", "TIME-EXP", "CURRENT-EXP", "TEMPERATURE-EXP", "MOLAR-AMOUNT-EXP", "LUMINOUS-INTENSITY-EXP"})
@Root(name = "PHYSICAL-DIMENSION")
public class PHYSICALDIMENSION {

    @Element(name = "CURRENT-EXP")
    protected Integer currentexp;

    @Element(name = "DESC")
    protected DESCRIPTION desc;

    @Attribute(name = "ID", required = true)
    @Convert(CollapsedStringConverter.class)
    protected String id;

    @Element(name = "LENGTH-EXP")
    protected Integer lengthexp;

    @Element(name = "LONG-NAME")
    protected LONGNAME longname;

    @Element(name = "LUMINOUS-INTENSITY-EXP")
    protected Integer luminousintensityexp;

    @Element(name = "MASS-EXP")
    protected Integer massexp;

    @Element(name = "MOLAR-AMOUNT-EXP")
    protected Integer molaramountexp;

    @Attribute(name = "OID")
    protected String oid;

    @Element(name = "SHORT-NAME", required = true)
    protected String shortname;

    @Element(name = "TEMPERATURE-EXP")
    protected Integer temperatureexp;

    @Element(name = "TIME-EXP")
    protected Integer timeexp;

    public Integer getCURRENTEXP() {
        return this.currentexp;
    }

    public DESCRIPTION getDESC() {
        return this.desc;
    }

    public String getID() {
        return this.id;
    }

    public Integer getLENGTHEXP() {
        return this.lengthexp;
    }

    public LONGNAME getLONGNAME() {
        return this.longname;
    }

    public Integer getLUMINOUSINTENSITYEXP() {
        return this.luminousintensityexp;
    }

    public Integer getMASSEXP() {
        return this.massexp;
    }

    public Integer getMOLARAMOUNTEXP() {
        return this.molaramountexp;
    }

    public String getOID() {
        return this.oid;
    }

    public String getSHORTNAME() {
        return this.shortname;
    }

    public Integer getTEMPERATUREEXP() {
        return this.temperatureexp;
    }

    public Integer getTIMEEXP() {
        return this.timeexp;
    }

    public void setCURRENTEXP(Integer num) {
        this.currentexp = num;
    }

    public void setDESC(DESCRIPTION description) {
        this.desc = description;
    }

    public void setID(String str) {
        this.id = str;
    }

    public void setLENGTHEXP(Integer num) {
        this.lengthexp = num;
    }

    public void setLONGNAME(LONGNAME longname) {
        this.longname = longname;
    }

    public void setLUMINOUSINTENSITYEXP(Integer num) {
        this.luminousintensityexp = num;
    }

    public void setMASSEXP(Integer num) {
        this.massexp = num;
    }

    public void setMOLARAMOUNTEXP(Integer num) {
        this.molaramountexp = num;
    }

    public void setOID(String str) {
        this.oid = str;
    }

    public void setSHORTNAME(String str) {
        this.shortname = str;
    }

    public void setTEMPERATUREEXP(Integer num) {
        this.temperatureexp = num;
    }

    public void setTIMEEXP(Integer num) {
        this.timeexp = num;
    }
}
