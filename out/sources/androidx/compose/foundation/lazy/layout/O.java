package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class O implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazySaveableStateHolder f10667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10668b;

    public O(LazySaveableStateHolder lazySaveableStateHolder, Object obj) {
        this.f10667a = lazySaveableStateHolder;
        this.f10668b = obj;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f10667a.f10662c.k(this.f10668b);
    }
}
