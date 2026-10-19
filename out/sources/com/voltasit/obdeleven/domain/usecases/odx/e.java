package com.voltasit.obdeleven.domain.usecases.odx;

import J8.p;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.PHYSICALDATATYPE;
import com.voltasit.obdeleven.domain.exceptions.TextualDataInputLengthInvalidException;
import p293xa.r;

/* JADX INFO: compiled from: GetIsTextualDataInputLengthValidUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30894a;

    public e(p pVar) {
        this.f30894a = pVar;
    }

    public final C8.a a(DATAOBJECTPROP dop, String input) {
        kotlin.jvm.internal.i.e(input, "input");
        kotlin.jvm.internal.i.e(dop, "dop");
        PHYSICALDATATYPE basedatatype = dop.getPHYSICALTYPE().getBASEDATATYPE();
        if (basedatatype != PHYSICALDATATYPE.A_UNICODE2STRING && basedatatype != PHYSICALDATATYPE.A_BYTEFIELD) {
            return new C8.a.b(r.f47939a);
        }
        if (!dop.getDIAGCODEDTYPE().getMinMaxLengthsExist()) {
            this.f30894a.d(new Exception("MIN-LENGTH or MAX-LENGTH missing"), false);
            return new C8.a.b(r.f47939a);
        }
        long maxlength = dop.getDIAGCODEDTYPE().getMaxlength();
        long minlength = dop.getDIAGCODEDTYPE().getMinlength();
        if (basedatatype != PHYSICALDATATYPE.A_BYTEFIELD) {
            long length = input.length();
            return (minlength > length || length > maxlength) ? new C8.a.C0024a(new TextualDataInputLengthInvalidException(minlength, maxlength)) : new C8.a.b(r.f47939a);
        }
        long j = 2;
        long j10 = maxlength * j;
        return (((long) input.length()) > j10 || ((long) input.length()) < minlength * j) ? new C8.a.C0024a(new TextualDataInputLengthInvalidException(minlength * j, j10)) : new C8.a.b(r.f47939a);
    }
}
