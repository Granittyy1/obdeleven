package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1845k2 extends AbstractC1803e2<Boolean> {
    @Override // com.google.android.gms.internal.measurement.AbstractC1803e2
    public final Boolean c(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (K1.f25496c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (K1.f25497d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f25688a.f25784c;
        String strB = this.f25689b;
        if (str2 == null || !str2.isEmpty()) {
            strB = androidx.compose.ui.text.font.s.b(str2, strB);
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + strB + ": " + String.valueOf(obj));
        return null;
    }
}
