package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1831i2 extends AbstractC1803e2<Long> {
    @Override // com.google.android.gms.internal.measurement.AbstractC1803e2
    public final Long c(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f25688a.f25784c;
        String strB = this.f25689b;
        if (str == null || !str.isEmpty()) {
            strB = androidx.compose.ui.text.font.s.b(str, strB);
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + strB + ": " + String.valueOf(obj));
        return null;
    }
}
