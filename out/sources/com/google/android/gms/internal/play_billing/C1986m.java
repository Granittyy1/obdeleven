package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1986m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.s f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.s f26215c;

    public C1986m(String str) {
        androidx.compose.ui.input.pointer.s sVar = new androidx.compose.ui.input.pointer.s();
        this.f26214b = sVar;
        this.f26215c = sVar;
        this.f26213a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f26213a);
        sb2.append('{');
        androidx.compose.ui.input.pointer.s sVar = (androidx.compose.ui.input.pointer.s) this.f26214b.f14119b;
        String str = "";
        while (sVar != null) {
            Object obj = sVar.f14118a;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            sVar = (androidx.compose.ui.input.pointer.s) sVar.f14119b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
