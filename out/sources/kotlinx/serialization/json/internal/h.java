package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43986c;

    public h(q qVar, boolean z10) {
        super(qVar);
        this.f43986c = z10;
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void d(byte b10) {
        if (this.f43986c) {
            j(String.valueOf(b10 & 255));
        } else {
            h(String.valueOf(b10 & 255));
        }
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void f(int i10) {
        boolean z10 = this.f43986c;
        String unsignedString = Integer.toUnsignedString(i10);
        if (z10) {
            j(unsignedString);
        } else {
            h(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void g(long j) {
        boolean z10 = this.f43986c;
        String unsignedString = Long.toUnsignedString(j);
        if (z10) {
            j(unsignedString);
        } else {
            h(unsignedString);
        }
    }

    @Override // kotlinx.serialization.json.internal.f
    public final void i(short s10) {
        boolean z10 = this.f43986c;
        String strA = p293xa.p.a(s10);
        if (z10) {
            j(strA);
        } else {
            h(strA);
        }
    }
}
