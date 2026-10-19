package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class I3 extends F3 {
    @Override // com.google.android.gms.internal.measurement.F3
    public final void j() {
        if (!this.f25446e) {
            if (this.f25444c.size() > 0) {
                ((I2) f(0).getKey()).z();
                throw null;
            }
            Iterator it = e().iterator();
            if (it.hasNext()) {
                ((I2) ((Map.Entry) it.next()).getKey()).z();
                throw null;
            }
        }
        super.j();
    }
}
