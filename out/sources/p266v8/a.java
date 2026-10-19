package p266v8;

import p109i8.l;

/* JADX INFO: compiled from: StatusGatewayless.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47670c;

    @Override // p109i8.l
    public final void a(boolean z10) {
        this.f47670c = z10;
    }

    @Override // p109i8.l
    public final boolean b() {
        return this.f47669b;
    }

    @Override // p109i8.l
    public final boolean c() {
        return this.f47670c || this.f47669b;
    }

    @Override // p109i8.l
    public final boolean d() {
        return this.f47670c;
    }

    @Override // p109i8.l
    public final void f(boolean z10) {
        this.f47669b = z10;
    }

    @Override // p109i8.l
    public final void g(boolean z10) {
        this.f47669b = z10;
        this.f47670c = z10;
    }
}
