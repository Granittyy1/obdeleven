package p141l2;

import O.h;
import android.os.Bundle;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import p248u2.b;

/* JADX INFO: renamed from: l2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2742l extends L<Integer> {
    @Override // p141l2.L
    public final Integer get(Bundle bundle, String key) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        return Integer.valueOf(b.a(bundle, key));
    }

    @Override // p141l2.L
    public final String getName() {
        return AttributeType.INTEGER;
    }

    @Override // p141l2.L
    public final Integer parseValue(String value) {
        int i10;
        i.e(value, "value");
        if (m.I(value, "0x", false)) {
            String strSubstring = value.substring(2);
            i.d(strSubstring, "substring(...)");
            h.c(16);
            i10 = Integer.parseInt(strSubstring, 16);
        } else {
            i10 = Integer.parseInt(value);
        }
        return Integer.valueOf(i10);
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Integer num) {
        int iIntValue = num.intValue();
        i.e(bundle, "bundle");
        i.e(key, "key");
        bundle.putInt(key, iIntValue);
    }
}
