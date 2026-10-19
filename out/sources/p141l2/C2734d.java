package p141l2;

import A8.A;
import android.os.Bundle;
import kotlin.jvm.internal.i;
import p248u2.b;

/* JADX INFO: renamed from: l2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2734d extends L<Boolean> {
    @Override // p141l2.L
    public final Boolean get(Bundle bundle, String key) {
        i.e(bundle, "bundle");
        i.e(key, "key");
        if (!bundle.containsKey(key) || b.c(bundle, key)) {
            return null;
        }
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z10);
        }
        A.g(key);
        throw null;
    }

    @Override // p141l2.L
    public final String getName() {
        return "boolean";
    }

    @Override // p141l2.L
    public final Boolean parseValue(String value) {
        boolean z10;
        i.e(value, "value");
        if (value.equals("true")) {
            z10 = true;
        } else {
            if (!value.equals("false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        i.e(bundle, "bundle");
        i.e(key, "key");
        bundle.putBoolean(key, zBooleanValue);
    }
}
