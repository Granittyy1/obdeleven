package p141l2;

import A8.A;
import O.h;
import android.os.Bundle;
import kotlin.jvm.internal.i;
import kotlin.text.m;

/* JADX INFO: renamed from: l2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2745o extends L<Long> {
    @Override // p141l2.L
    public final Long get(Bundle bundle, String key) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        long j = bundle.getLong(key, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return Long.valueOf(j);
        }
        A.g(key);
        throw null;
    }

    @Override // p141l2.L
    public final String getName() {
        return "long";
    }

    @Override // p141l2.L
    public final Long parseValue(String value) {
        String strSubstring;
        long j;
        i.e(value, "value");
        if (m.C(value, "L", false)) {
            strSubstring = value.substring(0, value.length() - 1);
            i.d(strSubstring, "substring(...)");
        } else {
            strSubstring = value;
        }
        if (m.I(value, "0x", false)) {
            String strSubstring2 = strSubstring.substring(2);
            i.d(strSubstring2, "substring(...)");
            h.c(16);
            j = Long.parseLong(strSubstring2, 16);
        } else {
            j = Long.parseLong(strSubstring);
        }
        return Long.valueOf(j);
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Long l10) {
        long jLongValue = l10.longValue();
        i.e(bundle, "bundle");
        i.e(key, "key");
        bundle.putLong(key, jLongValue);
    }
}
