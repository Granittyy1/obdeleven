package p248u2;

import A8.A;
import Ha.a;
import android.os.Bundle;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SavedStateReader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class b {
    public static final int a(Bundle bundle, String key) {
        i.e(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, BrazeLogger.SUPPRESS) != Integer.MAX_VALUE) {
            return i10;
        }
        A.g(key);
        throw null;
    }

    public static final Bundle b(Bundle bundle, String key) {
        i.e(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        A.g(key);
        throw null;
    }

    public static final boolean c(Bundle bundle, String key) {
        i.e(key, "key");
        return bundle.containsKey(key) && bundle.get(key) == null;
    }
}
