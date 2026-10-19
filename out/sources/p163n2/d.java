package p163n2;

import A8.A;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p141l2.C2749t;
import p248u2.b;
import p271w0.c;

/* JADX INFO: compiled from: NavBackStackEntryStateImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f44767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f44768d;

    public d(C2749t c2749t, int i10) {
        this.f44765a = c2749t.f44303g;
        this.f44766b = i10;
        c cVar = c2749t.f44305i;
        this.f44767c = cVar.a();
        y.p();
        Bundle bundleB = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.f44768d = bundleB;
        cVar.f44759h.c(bundleB);
    }

    public d(Bundle state) {
        i.e(state, "state");
        String string = state.getString("nav-entry-state:id");
        if (string != null) {
            this.f44765a = string;
            this.f44766b = b.a(state, "nav-entry-state:destination-id");
            this.f44767c = b.b(state, "nav-entry-state:args");
            this.f44768d = b.b(state, "nav-entry-state:saved-state");
            return;
        }
        A.g("nav-entry-state:id");
        throw null;
    }
}
