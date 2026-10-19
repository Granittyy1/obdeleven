package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y implements I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14223e = PlaceableKt.f14206b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14224f = 0;

    /* JADX INFO: compiled from: Placeable.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14225a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(a aVar, Y y10) {
            aVar.getClass();
            if (y10 instanceof androidx.compose.ui.node.I) {
                ((androidx.compose.ui.node.I) y10).Y(aVar.f14225a);
            }
        }

        public static void f(a aVar, Y y10, long j) {
            aVar.getClass();
            a(aVar, y10);
            y10.q0(p013b0.j.d(j, y10.f14224f), 0.0f, null);
        }

        public static void g(a aVar, Y y10, int i10, int i11) {
            long j = (((long) i10) << 32) | (((long) i11) & 4294967295L);
            if (aVar.b() == LayoutDirection.f15717b || aVar.c() == 0) {
                a(aVar, y10);
                y10.q0(p013b0.j.d(j, y10.f14224f), 0.0f, null);
            } else {
                int iC = (aVar.c() - y10.f14220b) - ((int) (j >> 32));
                a(aVar, y10);
                y10.q0(p013b0.j.d((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), y10.f14224f), 0.0f, null);
            }
        }

        public static void h(a aVar, Y y10, int i10, int i11) {
            Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = PlaceableKt.f14205a;
            long j = (((long) i10) << 32) | (((long) i11) & 4294967295L);
            if (aVar.b() == LayoutDirection.f15717b || aVar.c() == 0) {
                a(aVar, y10);
                y10.q0(p013b0.j.d(j, y10.f14224f), 0.0f, lVar);
            } else {
                int iC = (aVar.c() - y10.f14220b) - ((int) (j >> 32));
                a(aVar, y10);
                y10.q0(p013b0.j.d((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), y10.f14224f), 0.0f, lVar);
            }
        }

        public static void i(a aVar, Y y10, long j) {
            Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = PlaceableKt.f14205a;
            if (aVar.b() == LayoutDirection.f15717b || aVar.c() == 0) {
                a(aVar, y10);
                y10.q0(p013b0.j.d(j, y10.f14224f), 0.0f, lVar);
            } else {
                int iC = (aVar.c() - y10.f14220b) - ((int) (j >> 32));
                a(aVar, y10);
                y10.q0(p013b0.j.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iC) << 32), y10.f14224f), 0.0f, lVar);
            }
        }

        public static void j(a aVar, Y y10, long j, androidx.compose.ui.graphics.layer.b bVar) {
            if (aVar.b() == LayoutDirection.f15717b || aVar.c() == 0) {
                a(aVar, y10);
                y10.r0(p013b0.j.d(j, y10.f14224f), 0.0f, bVar);
            } else {
                int iC = (aVar.c() - y10.f14220b) - ((int) (j >> 32));
                a(aVar, y10);
                y10.r0(p013b0.j.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iC) << 32), y10.f14224f), 0.0f, bVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void k(a aVar, Y y10, int i10, int i11, Ia.l lVar, int i12) {
            if ((i12 & 8) != 0) {
                lVar = PlaceableKt.f14205a;
            }
            aVar.getClass();
            a(aVar, y10);
            y10.q0(p013b0.j.d((((long) i11) & 4294967295L) | (((long) i10) << 32), y10.f14224f), 0.0f, lVar);
        }

        public static void l(a aVar, Y y10, long j) {
            Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = PlaceableKt.f14205a;
            aVar.getClass();
            a(aVar, y10);
            y10.q0(p013b0.j.d(j, y10.f14224f), 0.0f, lVar);
        }

        public abstract LayoutDirection b();

        public abstract int c();

        public final void d(Y y10, int i10, int i11, float f10) {
            a(this, y10);
            y10.q0(p013b0.j.d((((long) i11) & 4294967295L) | (((long) i10) << 32), y10.f14224f), f10, null);
        }
    }

    public Y() {
        long j = 0;
        this.f14222d = (j & 4294967295L) | (j << 32);
    }

    public int l0() {
        return (int) (this.f14222d & 4294967295L);
    }

    public int o0() {
        return (int) (this.f14222d >> 32);
    }

    public final void p0() {
        this.f14220b = Na.l.D((int) (this.f14222d >> 32), p013b0.a.j(this.f14223e), p013b0.a.h(this.f14223e));
        int iD = Na.l.D((int) (this.f14222d & 4294967295L), p013b0.a.i(this.f14223e), p013b0.a.g(this.f14223e));
        this.f14221c = iD;
        int i10 = this.f14220b;
        long j = this.f14222d;
        this.f14224f = (((long) ((i10 - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iD - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar);

    public void r0(long j, float f10, androidx.compose.ui.graphics.layer.b bVar) {
        q0(j, f10, null);
    }

    public final void t0(long j) {
        if (p013b0.l.b(this.f14222d, j)) {
            return;
        }
        this.f14222d = j;
        p0();
    }

    public final void u0(long j) {
        if (p013b0.a.b(this.f14223e, j)) {
            return;
        }
        this.f14223e = j;
        p0();
    }
}
