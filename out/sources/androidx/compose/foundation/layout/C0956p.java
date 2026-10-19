package androidx.compose.foundation.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0956p implements androidx.compose.ui.modifier.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<a0, p293xa.r> f10311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f10312c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0956p(Ia.l<? super a0, p293xa.r> lVar) {
        this.f10311b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0956p) && ((C0956p) obj).f10311b == this.f10311b;
    }

    public final int hashCode() {
        return this.f10311b.hashCode();
    }

    @Override // androidx.compose.ui.modifier.d
    public final void m(androidx.compose.ui.modifier.g gVar) {
        a0 a0Var = (a0) gVar.s(WindowInsetsPaddingKt.f10233a);
        if (kotlin.jvm.internal.i.a(a0Var, this.f10312c)) {
            return;
        }
        this.f10312c = a0Var;
        this.f10311b.invoke(a0Var);
    }
}
