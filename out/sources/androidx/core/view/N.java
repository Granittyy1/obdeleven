package androidx.core.view;

import android.view.View;

/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class N extends O.b<Boolean> {
    @Override // androidx.core.view.O.b
    public final Boolean a(View view) {
        return Boolean.valueOf(O.h.c(view));
    }

    @Override // androidx.core.view.O.b
    public final void b(View view, Boolean bool) {
        O.h.g(view, bool.booleanValue());
    }

    @Override // androidx.core.view.O.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
