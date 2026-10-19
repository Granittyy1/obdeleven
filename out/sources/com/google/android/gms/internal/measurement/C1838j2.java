package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1838j2 extends AbstractC1803e2<Double> {
    @Override // com.google.android.gms.internal.measurement.AbstractC1803e2
    public final Double c(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f25688a.f25784c;
        String strB = this.f25689b;
        if (str == null || !str.isEmpty()) {
            strB = androidx.compose.ui.text.font.s.b(str, strB);
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + strB + ": " + String.valueOf(obj));
        return null;
    }
}
