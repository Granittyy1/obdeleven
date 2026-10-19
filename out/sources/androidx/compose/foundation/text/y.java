package androidx.compose.foundation.text;

import androidx.compose.runtime.X;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f11645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f11646b;

    public y(X x10, androidx.compose.foundation.interaction.k kVar) {
        this.f11645a = x10;
        this.f11646b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.A
    public final void dispose() {
        X x10 = this.f11645a;
        androidx.compose.foundation.interaction.m.b bVar = (androidx.compose.foundation.interaction.m.b) x10.getValue();
        if (bVar != null) {
            androidx.compose.foundation.interaction.m.a aVar = new androidx.compose.foundation.interaction.m.a(bVar);
            androidx.compose.foundation.interaction.k kVar = this.f11646b;
            if (kVar != null) {
                kVar.a(aVar);
            }
            x10.setValue(null);
        }
    }
}
