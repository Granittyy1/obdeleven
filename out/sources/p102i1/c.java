package p102i1;

import android.os.Bundle;
import android.text.Spanned;
import p114j1.A;

/* JADX INFO: compiled from: CustomSpanBundler.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f36548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f36549e;

    static {
        int i10 = A.f40996a;
        f36545a = Integer.toString(0, 36);
        f36546b = Integer.toString(1, 36);
        f36547c = Integer.toString(2, 36);
        f36548d = Integer.toString(3, 36);
        f36549e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f36545a, spanned.getSpanStart(obj));
        bundle2.putInt(f36546b, spanned.getSpanEnd(obj));
        bundle2.putInt(f36547c, spanned.getSpanFlags(obj));
        bundle2.putInt(f36548d, i10);
        if (bundle != null) {
            bundle2.putBundle(f36549e, bundle);
        }
        return bundle2;
    }
}
