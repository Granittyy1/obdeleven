package androidx.activity;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lambda f8170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(Ia.l lVar, boolean z10) {
        super(z10);
        this.f8170d = (Lambda) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.activity.y
    public final void b() {
        this.f8170d.invoke(this);
    }
}
