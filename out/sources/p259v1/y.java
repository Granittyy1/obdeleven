package p259v1;

import androidx.media3.exoplayer.o0;
import java.util.Objects;
import p078g1.B;
import p241t7.b;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0[] f47624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t[] f47625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f47626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v.a f47627e;

    public y(o0[] o0VarArr, t[] tVarArr, B b10, v.a aVar) {
        b.e(o0VarArr.length == tVarArr.length);
        this.f47624b = o0VarArr;
        this.f47625c = (t[]) tVarArr.clone();
        this.f47626d = b10;
        this.f47627e = aVar;
        this.f47623a = o0VarArr.length;
    }

    public final boolean a(y yVar, int i10) {
        return yVar != null && Objects.equals(this.f47624b[i10], yVar.f47624b[i10]) && Objects.equals(this.f47625c[i10], yVar.f47625c[i10]);
    }

    public final boolean b(int i10) {
        return this.f47624b[i10] != null;
    }
}
