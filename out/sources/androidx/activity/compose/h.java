package androidx.activity.compose;

import androidx.compose.runtime.A;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f8224a;

    public h(g gVar) {
        this.f8224a = gVar;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f8224a.e();
    }
}
