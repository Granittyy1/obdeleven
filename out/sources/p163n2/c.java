package p163n2;

import android.os.Bundle;
import androidx.lifecycle.C1378v;
import androidx.lifecycle.K;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.S;
import androidx.lifecycle.Y;
import io.intercom.android.sdk.ui.preview.ui.m;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p141l2.C;
import p141l2.C2749t;
import p141l2.N;
import p248u2.d;
import p273w2.b;
import p293xa.g;

/* JADX INFO: compiled from: NavBackStackEntryImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2749t f44752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f44753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f44754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lifecycle.State f44755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f44756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f44758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f44759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44760i;
    public final C1378v j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Lifecycle.State f44761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S f44762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f44763m;

    /* JADX INFO: compiled from: NavBackStackEntryImpl.kt */
    public static final class a extends Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f44764a;

        public a(K handle) {
            i.e(handle, "handle");
            this.f44764a = handle;
        }
    }

    public c(C2749t entry) {
        i.e(entry, "entry");
        this.f44752a = entry;
        this.f44753b = entry.f44299c;
        this.f44754c = entry.f44300d;
        this.f44755d = entry.f44301e;
        this.f44756e = entry.f44302f;
        this.f44757f = entry.f44303g;
        this.f44758g = entry.f44304h;
        this.f44759h = new d(new b(entry, new io.intercom.android.sdk.ui.preview.ui.c(entry, 1)));
        g gVarA = kotlin.a.a(new b(0));
        this.j = new C1378v(entry);
        this.f44761k = Lifecycle.State.f17750c;
        this.f44762l = (S) gVarA.getValue();
        this.f44763m = kotlin.a.a(new m(1));
    }

    public final Bundle a() {
        Bundle bundle = this.f44754c;
        if (bundle == null) {
            return null;
        }
        y.p();
        Bundle bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleB.putAll(bundle);
        return bundleB;
    }

    public final void b() {
        if (!this.f44760i) {
            d dVar = this.f44759h;
            dVar.a();
            this.f44760i = true;
            if (this.f44756e != null) {
                androidx.lifecycle.N.b(this.f44752a);
            }
            dVar.b(this.f44758g);
        }
        int iOrdinal = this.f44755d.ordinal();
        int iOrdinal2 = this.f44761k.ordinal();
        C1378v c1378v = this.j;
        if (iOrdinal < iOrdinal2) {
            c1378v.h(this.f44755d);
        } else {
            c1378v.h(this.f44761k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.a(this.f44752a.getClass()).a());
        sb2.append("(" + this.f44757f + ')');
        sb2.append(" destination=");
        sb2.append(this.f44753b);
        String string = sb2.toString();
        i.d(string, "toString(...)");
        return string;
    }
}
