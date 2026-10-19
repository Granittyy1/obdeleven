package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class M0 implements H.a, Iterable<Object>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0 f12877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f12879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1110s0 f12880e;

    public M0(A0 a10, int i10, H h8, C1110s0 c1110s0) {
        this.f12877b = a10;
        this.f12878c = i10;
        this.f12879d = h8;
        this.f12880e = c1110s0;
        h8.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new L0(this.f12877b, this.f12878c, this.f12879d, this.f12880e);
    }
}
