package androidx.compose.ui.platform;

import android.content.Context;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f14890b;

    public E(Context context, F f10) {
        this.f14889a = context;
        this.f14890b = f10;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f14889a.getApplicationContext().unregisterComponentCallbacks(this.f14890b);
    }
}
