package p141l2;

import android.os.Bundle;
import kotlin.jvm.internal.i;
import p163n2.d;

/* JADX INFO: compiled from: NavBackStackEntryState.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f44306a;

    public u(C2749t c2749t) {
        this.f44306a = new d(c2749t, c2749t.f44299c.f44219c.f44813d);
    }

    public u(Bundle state) {
        i.e(state, "state");
        state.setClassLoader(u.class.getClassLoader());
        this.f44306a = new d(state);
    }
}
