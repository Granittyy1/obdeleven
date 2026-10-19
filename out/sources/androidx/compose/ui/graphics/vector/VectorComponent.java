package androidx.compose.ui.graphics.vector;

import S4.o;
import android.graphics.Bitmap;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.X;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VectorComponent extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupComponent f13841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f13844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lambda f13845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f13846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public A f13847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1085f0 f13848i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Ia.l<J.e, r> f13851m;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.graphics.vector.VectorComponent$1, kotlin.jvm.internal.Lambda] */
    public VectorComponent(GroupComponent groupComponent) {
        this.f13841b = groupComponent;
        groupComponent.f13812i = new Ia.l<g, r>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [Ia.a, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final r invoke(g gVar) {
                VectorComponent vectorComponent = VectorComponent.this;
                vectorComponent.f13843d = true;
                vectorComponent.f13845f.invoke();
                return r.f47939a;
            }
        };
        this.f13842c = "";
        this.f13843d = true;
        this.f13844e = new a();
        this.f13845f = new Ia.a<r>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // Ia.a
            public final /* bridge */ /* synthetic */ r invoke() {
                return r.f47939a;
            }
        };
        this.f13846g = J0.f(null);
        this.f13848i = J0.f(new I.h(0L));
        this.j = 9205357640488583168L;
        this.f13849k = 1.0f;
        this.f13850l = 1.0f;
        this.f13851m = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // androidx.compose.ui.graphics.vector.g
    public final void a(J.e eVar) {
        e(eVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(J.e eVar, float f10, I i10) {
        A a10;
        Ia.l<J.e, r> lVar;
        C1141q c1141qA;
        int i11;
        Ia.l<J.e, r> lVar2;
        I i12;
        GroupComponent groupComponent = this.f13841b;
        boolean z10 = groupComponent.f13807d;
        C1085f0 c1085f0 = this.f13846g;
        int i13 = (z10 && groupComponent.f13808e != 16 && i.a((I) c1085f0.getValue()) && i.a(i10)) ? 1 : 0;
        boolean z11 = this.f13843d;
        a aVar = this.f13844e;
        if (z11 || !I.h.a(this.j, eVar.j())) {
            if (X.a(i13, 1)) {
                a10 = new A(5, groupComponent.f13808e);
            } else {
                a10 = null;
            }
            this.f13847h = a10;
            char c10 = ' ';
            float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.j() >> 32));
            C1085f0 c1085f1 = this.f13848i;
            this.f13849k = fIntBitsToFloat / Float.intBitsToFloat((int) (((I.h) c1085f1.getValue()).f3769a >> 32));
            this.f13850l = Float.intBitsToFloat((int) (eVar.j() & 4294967295L)) / Float.intBitsToFloat((int) (((I.h) c1085f1.getValue()).f3769a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (eVar.j() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (eVar.j() & 4294967295L))))) & 4294967295L);
            LayoutDirection layoutDirection = eVar.getLayoutDirection();
            lVar = this.f13851m;
            aVar.f13861c = eVar;
            c1141qA = aVar.f13859a;
            C1138n c1138nC = aVar.f13860b;
            if (c1141qA != null || c1138nC == null) {
                i11 = i13;
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                int i14 = (int) (jCeil >> 32);
                Bitmap bitmap = c1141qA.f13790a;
                if (i14 <= bitmap.getWidth()) {
                    i11 = i13;
                    if (((int) (jCeil & 4294967295L)) > bitmap.getHeight() || !X.a(aVar.f13863e, i11)) {
                        c10 = ' ';
                    }
                    aVar.f13862d = jCeil;
                    long jK = A8.A.k(jCeil);
                    J.a aVar2 = aVar.f13864f;
                    J.a.C0049a c0049a = aVar2.f3940b;
                    p013b0.c cVar = c0049a.f3944a;
                    LayoutDirection layoutDirection2 = c0049a.f3945b;
                    E e10 = c0049a.f3946c;
                    long j = c0049a.f3947d;
                    c0049a.f3944a = eVar;
                    c0049a.f3945b = layoutDirection;
                    c0049a.f3946c = c1138nC;
                    c0049a.f3947d = jK;
                    c1138nC.g();
                    J.e.s0(aVar2, H.f13495b, 0L, 0L, 0.0f, 62);
                    ((VectorComponent$drawVectorBlock$1) lVar2).invoke(aVar2);
                    c1138nC.o();
                    J.a.C0049a c0049a2 = aVar2.f3940b;
                    c0049a2.f3944a = cVar;
                    c0049a2.f3945b = layoutDirection2;
                    c0049a2.f3946c = e10;
                    c0049a2.f3947d = j;
                    c1141qA.a();
                    this.f13843d = false;
                    this.j = eVar.j();
                } else {
                    i11 = i13;
                }
            }
            c1141qA = o.a((int) (jCeil >> c10), (int) (4294967295L & jCeil), i11);
            c1138nC = D9.o.c(c1141qA);
            aVar.f13859a = c1141qA;
            aVar.f13860b = c1138nC;
            aVar.f13863e = i11;
            aVar.f13862d = jCeil;
            long jK2 = A8.A.k(jCeil);
            J.a aVar3 = aVar.f13864f;
            J.a.C0049a c0049a3 = aVar3.f3940b;
            p013b0.c cVar2 = c0049a3.f3944a;
            LayoutDirection layoutDirection3 = c0049a3.f3945b;
            E e11 = c0049a3.f3946c;
            long j10 = c0049a3.f3947d;
            c0049a3.f3944a = eVar;
            c0049a3.f3945b = layoutDirection;
            c0049a3.f3946c = c1138nC;
            c0049a3.f3947d = jK2;
            c1138nC.g();
            J.e.s0(aVar3, H.f13495b, 0L, 0L, 0.0f, 62);
            ((VectorComponent$drawVectorBlock$1) lVar2).invoke(aVar3);
            c1138nC.o();
            J.a.C0049a c0049a4 = aVar3.f3940b;
            c0049a4.f3944a = cVar2;
            c0049a4.f3945b = layoutDirection3;
            c0049a4.f3946c = e11;
            c0049a4.f3947d = j10;
            c1141qA.a();
            this.f13843d = false;
            this.j = eVar.j();
        } else {
            C1141q c1141q = aVar.f13859a;
            if (!X.a(i13, c1141q != null ? c1141q.b() : 0)) {
                if (X.a(i13, 1)) {
                    a10 = new A(5, groupComponent.f13808e);
                } else {
                    a10 = null;
                }
                this.f13847h = a10;
                char c11 = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar.j() >> 32));
                C1085f0 c1085f2 = this.f13848i;
                this.f13849k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((I.h) c1085f2.getValue()).f3769a >> 32));
                this.f13850l = Float.intBitsToFloat((int) (eVar.j() & 4294967295L)) / Float.intBitsToFloat((int) (((I.h) c1085f2.getValue()).f3769a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (eVar.j() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (eVar.j() & 4294967295L))))) & 4294967295L);
                LayoutDirection layoutDirection4 = eVar.getLayoutDirection();
                lVar = this.f13851m;
                aVar.f13861c = eVar;
                c1141qA = aVar.f13859a;
                C1138n c1138nC2 = aVar.f13860b;
                if (c1141qA != null) {
                    i11 = i13;
                    lVar2 = lVar;
                    c1141qA = o.a((int) (jCeil2 >> c11), (int) (4294967295L & jCeil2), i11);
                    c1138nC2 = D9.o.c(c1141qA);
                    aVar.f13859a = c1141qA;
                    aVar.f13860b = c1138nC2;
                    aVar.f13863e = i11;
                } else {
                    i11 = i13;
                    lVar2 = lVar;
                    c1141qA = o.a((int) (jCeil2 >> c11), (int) (4294967295L & jCeil2), i11);
                    c1138nC2 = D9.o.c(c1141qA);
                    aVar.f13859a = c1141qA;
                    aVar.f13860b = c1138nC2;
                    aVar.f13863e = i11;
                }
                aVar.f13862d = jCeil2;
                long jK3 = A8.A.k(jCeil2);
                J.a aVar4 = aVar.f13864f;
                J.a.C0049a c0049a5 = aVar4.f3940b;
                p013b0.c cVar3 = c0049a5.f3944a;
                LayoutDirection layoutDirection5 = c0049a5.f3945b;
                E e12 = c0049a5.f3946c;
                long j11 = c0049a5.f3947d;
                c0049a5.f3944a = eVar;
                c0049a5.f3945b = layoutDirection4;
                c0049a5.f3946c = c1138nC2;
                c0049a5.f3947d = jK3;
                c1138nC2.g();
                J.e.s0(aVar4, H.f13495b, 0L, 0L, 0.0f, 62);
                ((VectorComponent$drawVectorBlock$1) lVar2).invoke(aVar4);
                c1138nC2.o();
                J.a.C0049a c0049a6 = aVar4.f3940b;
                c0049a6.f3944a = cVar3;
                c0049a6.f3945b = layoutDirection5;
                c0049a6.f3946c = e12;
                c0049a6.f3947d = j11;
                c1141qA.a();
                this.f13843d = false;
                this.j = eVar.j();
            }
        }
        if (i10 != null) {
            i12 = i10;
        } else {
            i12 = ((I) c1085f0.getValue()) != null ? (I) c1085f0.getValue() : this.f13847h;
        }
        C1141q c1141q2 = aVar.f13859a;
        if (c1141q2 == null) {
            R.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        J.e.t1(eVar, c1141q2, 0L, aVar.f13862d, 0L, 0L, f10, null, i12, 0, 0, 858);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f13842c);
        sb2.append("\n\tviewportWidth: ");
        C1085f0 c1085f0 = this.f13848i;
        sb2.append(Float.intBitsToFloat((int) (((I.h) c1085f0.getValue()).f3769a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((I.h) c1085f0.getValue()).f3769a & 4294967295L)));
        sb2.append("\n");
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
