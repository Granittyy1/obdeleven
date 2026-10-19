package coil.compose;

import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.layout.InterfaceC1161g;

/* JADX INFO: compiled from: SubcomposeAsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n implements v, InterfaceC0948h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0948h f22791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncImagePainter f22792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.d f22794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1161g f22795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f22796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I f22797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22798h;

    public n(InterfaceC0948h interfaceC0948h, AsyncImagePainter asyncImagePainter, String str, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, I i10, boolean z10) {
        this.f22791a = interfaceC0948h;
        this.f22792b = asyncImagePainter;
        this.f22793c = str;
        this.f22794d = dVar;
        this.f22795e = interfaceC1161g;
        this.f22796f = f10;
        this.f22797g = i10;
        this.f22798h = z10;
    }

    @Override // coil.compose.v
    public final float a() {
        return this.f22796f;
    }

    @Override // coil.compose.v
    public final I b() {
        return this.f22797g;
    }

    @Override // coil.compose.v
    public final InterfaceC1161g e() {
        return this.f22795e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.i.a(this.f22791a, nVar.f22791a) && kotlin.jvm.internal.i.a(this.f22792b, nVar.f22792b) && kotlin.jvm.internal.i.a(this.f22793c, nVar.f22793c) && kotlin.jvm.internal.i.a(this.f22794d, nVar.f22794d) && kotlin.jvm.internal.i.a(this.f22795e, nVar.f22795e) && Float.compare(this.f22796f, nVar.f22796f) == 0 && kotlin.jvm.internal.i.a(this.f22797g, nVar.f22797g) && this.f22798h == nVar.f22798h;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0948h
    public final androidx.compose.ui.h f(androidx.compose.ui.h hVar, androidx.compose.ui.f fVar) {
        return this.f22791a.f(hVar, fVar);
    }

    @Override // coil.compose.v
    public final androidx.compose.ui.d g() {
        return this.f22794d;
    }

    @Override // coil.compose.v
    public final String getContentDescription() {
        return this.f22793c;
    }

    @Override // coil.compose.v
    public final AsyncImagePainter h() {
        return this.f22792b;
    }

    public final int hashCode() {
        int iHashCode = (this.f22792b.hashCode() + (this.f22791a.hashCode() * 31)) * 31;
        String str = this.f22793c;
        int iD = O.a.d(this.f22796f, (this.f22795e.hashCode() + ((this.f22794d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31);
        I i10 = this.f22797g;
        return Boolean.hashCode(this.f22798h) + ((iD + (i10 != null ? i10.hashCode() : 0)) * 31);
    }

    @Override // coil.compose.v
    public final boolean n() {
        return this.f22798h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealSubcomposeAsyncImageScope(parentScope=");
        sb2.append(this.f22791a);
        sb2.append(", painter=");
        sb2.append(this.f22792b);
        sb2.append(", contentDescription=");
        sb2.append(this.f22793c);
        sb2.append(", alignment=");
        sb2.append(this.f22794d);
        sb2.append(", contentScale=");
        sb2.append(this.f22795e);
        sb2.append(", alpha=");
        sb2.append(this.f22796f);
        sb2.append(", colorFilter=");
        sb2.append(this.f22797g);
        sb2.append(", clipToBounds=");
        return Z3.o.d(sb2, this.f22798h, ')');
    }
}
