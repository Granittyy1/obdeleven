package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.d f9642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<p013b0.l, p013b0.l> f9643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0923x<p013b0.l> f9644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9645d;

    public i(Ia.l lVar, InterfaceC0923x interfaceC0923x, androidx.compose.ui.d dVar, boolean z10) {
        this.f9642a = dVar;
        this.f9643b = lVar;
        this.f9644c = interfaceC0923x;
        this.f9645d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.i.a(this.f9642a, iVar.f9642a) && kotlin.jvm.internal.i.a(this.f9643b, iVar.f9643b) && kotlin.jvm.internal.i.a(this.f9644c, iVar.f9644c) && this.f9645d == iVar.f9645d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9645d) + ((this.f9644c.hashCode() + ((this.f9643b.hashCode() + (this.f9642a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.f9642a);
        sb2.append(", size=");
        sb2.append(this.f9643b);
        sb2.append(", animationSpec=");
        sb2.append(this.f9644c);
        sb2.append(", clip=");
        return Z3.o.d(sb2, this.f9645d, ')');
    }
}
