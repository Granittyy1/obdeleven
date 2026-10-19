package androidx.activity.compose;

import androidx.compose.runtime.A;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackHandlerKt.a f8213a;

    public c(BackHandlerKt.a aVar) {
        this.f8213a = aVar;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f8213a.e();
    }
}
