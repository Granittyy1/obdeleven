package androidx.compose.foundation.layout;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f10249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f10250b;

    public b0(c0 c0Var, View view) {
        this.f10249a = c0Var;
        this.f10250b = view;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        c0 c0Var = this.f10249a;
        int i10 = c0Var.f10273t - 1;
        c0Var.f10273t = i10;
        if (i10 == 0) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            View view = this.f10250b;
            androidx.core.view.O.d.u(view, null);
            androidx.core.view.O.p(view, null);
            view.removeOnAttachStateChangeListener(c0Var.f10274u);
        }
    }
}
