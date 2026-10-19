package androidx.compose.ui.platform;

/* JADX INFO: compiled from: TestTag.kt */
/* JADX INFO: loaded from: classes.dex */
final class TestTagElement extends androidx.compose.ui.node.H<O0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14966b;

    public TestTagElement(String str) {
        this.f14966b = str;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        O0 o10 = new O0();
        o10.f14940p = this.f14966b;
        return o10;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((O0) cVar).f14940p = this.f14966b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f14966b, ((TestTagElement) obj).f14966b);
    }

    public final int hashCode() {
        return this.f14966b.hashCode();
    }
}
