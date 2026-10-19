package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"MAX-LENGTH", "MIN-LENGTH"})
@Root(name = "MIN-MAX-LENGTH-TYPE")
public class MINMAXLENGTHTYPE extends DIAGCODEDTYPE {

    @Element(name = "MAX-LENGTH")
    protected Long maxlength;

    @Element(name = "MIN-LENGTH")
    protected long minlength;

    @Attribute(name = "TERMINATION", required = true)
    protected TERMINATION termination;

    public Long getMAXLENGTH() {
        return this.maxlength;
    }

    public long getMINLENGTH() {
        return this.minlength;
    }

    public TERMINATION getTERMINATION() {
        return this.termination;
    }

    public void setMAXLENGTH(Long l10) {
        this.maxlength = l10;
    }

    public void setMINLENGTH(long j) {
        this.minlength = j;
    }

    public void setTERMINATION(TERMINATION termination) {
        this.termination = termination;
    }
}
