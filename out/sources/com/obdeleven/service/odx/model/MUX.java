package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"BYTE-POSITION", "SWITCH-KEY", "DEFAULT-CASE", "CASES"})
@Root(name = "MUX")
public class MUX extends COMPLEXDOP {

    @Element(name = "BYTE-POSITION")
    protected long byteposition;

    @Element(name = "CASES")
    protected CASES cases;

    @Element(name = "DEFAULT-CASE")
    protected DEFAULTCASE defaultcase;

    @Attribute(name = "IS-VISIBLE")
    protected Boolean isvisible;

    @Element(name = "SWITCH-KEY", required = true)
    protected SWITCHKEY switchkey;

    public long getBYTEPOSITION() {
        return this.byteposition;
    }

    public CASES getCASES() {
        return this.cases;
    }

    public DEFAULTCASE getDEFAULTCASE() {
        return this.defaultcase;
    }

    public SWITCHKEY getSWITCHKEY() {
        return this.switchkey;
    }

    public boolean isISVISIBLE() {
        Boolean bool = this.isvisible;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setBYTEPOSITION(long j) {
        this.byteposition = j;
    }

    public void setCASES(CASES cases) {
        this.cases = cases;
    }

    public void setDEFAULTCASE(DEFAULTCASE defaultcase) {
        this.defaultcase = defaultcase;
    }

    public void setISVISIBLE(Boolean bool) {
        this.isvisible = bool;
    }

    public void setSWITCHKEY(SWITCHKEY switchkey) {
        this.switchkey = switchkey;
    }
}
