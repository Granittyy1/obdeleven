package com.obdeleven.service.odx.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"COMPU-NUMERATOR", "COMPU-DENOMINATOR"})
@Root(name = "COMPU-RATIONAL-COEFFS")
public class COMPURATIONALCOEFFS {

    @Element(name = "COMPU-DENOMINATOR")
    protected COMPUDENOMINATOR compudenominator;

    @Element(name = "COMPU-NUMERATOR", required = true)
    protected COMPUNUMERATOR compunumerator;

    public COMPUDENOMINATOR getCOMPUDENOMINATOR() {
        return this.compudenominator;
    }

    public COMPUNUMERATOR getCOMPUNUMERATOR() {
        return this.compunumerator;
    }

    public void setCOMPUDENOMINATOR(COMPUDENOMINATOR compudenominator) {
        this.compudenominator = compudenominator;
    }

    public void setCOMPUNUMERATOR(COMPUNUMERATOR compunumerator) {
        this.compunumerator = compunumerator;
    }
}
