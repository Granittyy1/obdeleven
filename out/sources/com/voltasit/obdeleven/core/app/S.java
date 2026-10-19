package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: EepromCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class S extends AbstractC2102q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f30062p;

    public S(I8.b bVar, String str) {
        super(bVar, false);
        this.f30062p = str;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30062p;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        String[] strArr = this.j;
        return controlUnit.o0(33, Integer.parseInt(strArr[0], 16), Integer.parseInt(strArr[1], 16)).continueWith(new V8.r(1, this));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        super.h(i10);
        String strA = a();
        String strSubstring = strA.substring(0, strA.length() - 4);
        StringBuilder sbE = C4.b.e(strSubstring);
        int i11 = 65535;
        for (byte b10 : com.obdeleven.service.util.b.e(strSubstring)) {
            for (int i12 = 0; i12 < 8; i12++) {
                boolean z10 = ((b10 >> (7 - i12)) & 1) == 1;
                boolean z11 = ((i11 >> 15) & 1) == 1;
                i11 <<= 1;
                if (z10 ^ z11) {
                    i11 ^= 4129;
                }
            }
            i11 &= 65535;
        }
        sbE.append(String.format("%04X", Integer.valueOf(i11)));
        f(sbE.toString());
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        Calendar calendar = Calendar.getInstance();
        return controlUnit.t0("F199", String.format(Locale.US, "%ty%tm%td", calendar, calendar, calendar)).continueWithTask(new O(0, controlUnit)).continueWithTask(new P(this, controlUnit));
    }
}
