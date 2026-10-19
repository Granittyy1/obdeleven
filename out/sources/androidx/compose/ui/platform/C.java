package androidx.compose.ui.platform;

import android.content.Context;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f14830b;

    public C(Context context, D d10) {
        this.f14829a = context;
        this.f14830b = d10;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f14829a.getApplicationContext().unregisterComponentCallbacks(this.f14830b);
    }
}
