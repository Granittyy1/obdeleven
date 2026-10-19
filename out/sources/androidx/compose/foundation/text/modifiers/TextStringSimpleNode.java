package androidx.compose.foundation.text.modifiers;

import Ia.l;
import Z3.o;
import androidx.compose.animation.D;
import androidx.compose.foundation.text.s;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.k;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.v;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.A;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.internal.measurement.M1;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.EmptyList;
import p293xa.r;

/* JADX INFO: compiled from: TextStringSimpleNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleNode extends androidx.compose.ui.h.c implements InterfaceC1198t, InterfaceC1191l, b0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f11418A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f11419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F f11420q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.text.font.d.a f11421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public L f11426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f11427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f11428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l<? super List<B>, Boolean> f11429z;

    /* JADX INFO: compiled from: TextStringSimpleNode.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11432c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f11433d = null;

        public a(String str, String str2) {
            this.f11430a = str;
            this.f11431b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f11430a, aVar.f11430a) && kotlin.jvm.internal.i.a(this.f11431b, aVar.f11431b) && this.f11432c == aVar.f11432c && kotlin.jvm.internal.i.a(this.f11433d, aVar.f11433d);
        }

        public final int hashCode() {
            int iB = D.b(B1.a.b(this.f11431b, this.f11430a.hashCode() * 31, 31), 31, this.f11432c);
            f fVar = this.f11433d;
            return iB + (fVar == null ? 0 : fVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
            sb2.append(this.f11433d);
            sb2.append(", isShowingSubstitution=");
            return o.d(sb2, this.f11432c, ')');
        }
    }

    public static final void Q1(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.getClass();
        C1185f.f(textStringSimpleNode).P();
        C1185f.f(textStringSimpleNode).O();
        C1192m.a(textStringSimpleNode);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(H h8, androidx.compose.ui.layout.D d10, long j) {
        f fVarR1;
        int i10;
        androidx.compose.ui.text.l lVar;
        a aVar = this.f11418A;
        if (aVar == null) {
            fVarR1 = R1();
        } else {
            if (!aVar.f11432c) {
                aVar = null;
            }
            if (aVar == null || (fVarR1 = aVar.f11433d) == null) {
                fVarR1 = R1();
            }
        }
        fVarR1.c(h8);
        LayoutDirection layoutDirection = h8.getLayoutDirection();
        boolean z10 = true;
        long jE = fVarR1.f11467g > 1 ? f.e(fVarR1, j, layoutDirection) : j;
        AndroidParagraph androidParagraph = fVarR1.j;
        if (androidParagraph == null || (lVar = fVarR1.f11473n) == null || lVar.a() || layoutDirection != fVarR1.f11474o || (!p013b0.a.b(jE, fVarR1.f11475p) && (p013b0.a.h(jE) != p013b0.a.h(fVarR1.f11475p) || p013b0.a.j(jE) != p013b0.a.j(fVarR1.f11475p) || p013b0.a.g(jE) < androidParagraph.d() || androidParagraph.f15288d.f6622e))) {
            androidx.compose.ui.text.l lVarD = fVarR1.d(layoutDirection);
            long jA = b.a(jE, fVarR1.f11465e, fVarR1.f11464d, lVarD.c());
            boolean z11 = fVarR1.f11465e;
            int i11 = fVarR1.f11464d;
            int i12 = fVarR1.f11466f;
            if (z11 || !(m.a(i11, 2) || m.a(i11, 4) || m.a(i11, 5))) {
                if (i12 < 1) {
                    i12 = 1;
                }
                i10 = i12;
            } else {
                i10 = 1;
            }
            AndroidParagraph androidParagraph2 = new AndroidParagraph((AndroidParagraphIntrinsics) lVarD, i10, fVarR1.f11464d, jA);
            fVarR1.f11475p = jE;
            long jD = p013b0.b.d(jE, (((long) s.a(androidParagraph2.i())) << 32) | (((long) s.a(androidParagraph2.d())) & 4294967295L));
            fVarR1.f11471l = jD;
            fVarR1.f11470k = !m.a(fVarR1.f11464d, 3) && (((float) ((int) (jD >> 32))) < androidParagraph2.i() || ((float) ((int) (jD & 4294967295L))) < androidParagraph2.d());
            fVarR1.j = androidParagraph2;
        } else {
            if (!p013b0.a.b(jE, fVarR1.f11475p)) {
                AndroidParagraph androidParagraph3 = fVarR1.j;
                kotlin.jvm.internal.i.b(androidParagraph3);
                long jD2 = p013b0.b.d(jE, (((long) s.a(androidParagraph3.d())) & 4294967295L) | (((long) s.a(Math.min(androidParagraph3.f15285a.f15613i.c(), androidParagraph3.i()))) << 32));
                fVarR1.f11471l = jD2;
                if (m.a(fVarR1.f11464d, 3) || (((int) (jD2 >> 32)) >= androidParagraph3.i() && ((int) (jD2 & 4294967295L)) >= androidParagraph3.d())) {
                    z10 = false;
                }
                fVarR1.f11470k = z10;
                fVarR1.f11475p = jE;
            }
            z10 = false;
        }
        androidx.compose.ui.text.l lVar2 = fVarR1.f11473n;
        if (lVar2 != null) {
            lVar2.a();
        }
        r rVar = r.f47939a;
        AndroidParagraph androidParagraph4 = fVarR1.j;
        kotlin.jvm.internal.i.b(androidParagraph4);
        long j10 = fVarR1.f11471l;
        if (z10) {
            C1185f.d(this, 2).G1();
            HashMap map = this.f11427x;
            if (map == null) {
                map = new HashMap(2);
                this.f11427x = map;
            }
            map.put(AlignmentLineKt.f14165a, Integer.valueOf(Math.round(androidParagraph4.c())));
            map.put(AlignmentLineKt.f14166b, Integer.valueOf(Math.round(androidParagraph4.f())));
        }
        int i13 = (int) (j10 >> 32);
        int i14 = (int) (j10 & 4294967295L);
        final Y yQ = d10.Q(p013b0.a.C0206a.b(i13, i13, i14, i14));
        HashMap map2 = this.f11427x;
        kotlin.jvm.internal.i.b(map2);
        return h8.y1(i13, i14, map2, new l<Y.a, r>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Y.a aVar2) {
                aVar2.d(yQ, 0, 0, 0.0f);
                return r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final f R1() {
        if (this.f11428y == null) {
            this.f11428y = new f(this.f11419p, this.f11420q, this.f11421r, this.f11422s, this.f11423t, this.f11424u, this.f11425v);
        }
        f fVar = this.f11428y;
        kotlin.jvm.internal.i.b(fVar);
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        f fVarR1;
        a aVar = this.f11418A;
        if (aVar == null) {
            fVarR1 = R1();
        } else {
            if (!aVar.f11432c) {
                aVar = null;
            }
            if (aVar == null || (fVarR1 = aVar.f11433d) == null) {
                fVarR1 = R1();
            }
        }
        fVarR1.c(lookaheadCapablePlaceable);
        return s.a(fVarR1.d(lookaheadCapablePlaceable.getLayoutDirection()).b());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        f fVarR1;
        a aVar = this.f11418A;
        if (aVar == null) {
            fVarR1 = R1();
        } else {
            if (!aVar.f11432c) {
                aVar = null;
            }
            if (aVar == null || (fVarR1 = aVar.f11433d) == null) {
                fVarR1 = R1();
            }
        }
        fVarR1.c(lookaheadCapablePlaceable);
        return fVarR1.a(i10, lookaheadCapablePlaceable.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(w wVar) {
        l lVar = this.f11429z;
        if (lVar == null) {
            lVar = new l<List<B>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1
                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0031  */
                @Override // Ia.l
                public final Boolean invoke(List<B> list) {
                    InterfaceC1167m interfaceC1167m;
                    B b10;
                    B b11;
                    List<B> list2 = list;
                    f fVarR1 = this.this$0.R1();
                    TextStringSimpleNode textStringSimpleNode = this.this$0;
                    F f10 = textStringSimpleNode.f11420q;
                    L l10 = textStringSimpleNode.f11426w;
                    F fE = F.e(f10, l10 != null ? l10.a() : androidx.compose.ui.graphics.H.f13504l, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                    LayoutDirection layoutDirection = fVarR1.f11474o;
                    if (layoutDirection == null || (interfaceC1167m = fVarR1.f11469i) == null) {
                        b10 = null;
                    } else {
                        C1260a c1260a = new C1260a(fVarR1.f11461a);
                        if (fVarR1.j == null || fVarR1.f11473n == null) {
                            b10 = null;
                        } else {
                            long j = fVarR1.f11475p & (-8589934589L);
                            EmptyList emptyList = EmptyList.f42983b;
                            int i10 = fVarR1.f11466f;
                            boolean z10 = fVarR1.f11465e;
                            int i11 = fVarR1.f11464d;
                            androidx.compose.ui.text.font.d.a aVar = fVarR1.f11463c;
                            b10 = new B(new A(c1260a, fE, emptyList, i10, z10, i11, interfaceC1167m, layoutDirection, aVar, j), new C1268i(new MultiParagraphIntrinsics(c1260a, fE, emptyList, interfaceC1167m, aVar), j, fVarR1.f11466f, fVarR1.f11464d), fVarR1.f11471l);
                        }
                    }
                    if (b10 != null) {
                        list2.add(b10);
                        b11 = b10;
                    } else {
                        b11 = null;
                    }
                    return Boolean.valueOf(b11 != null);
                }
            };
            this.f11429z = lVar;
        }
        C1260a c1260a = new C1260a(this.f11419p);
        Oa.l<Object>[] lVarArr = t.f15251a;
        wVar.e(SemanticsProperties.f15172z, M1.k(c1260a));
        a aVar = this.f11418A;
        if (aVar != null) {
            boolean z10 = aVar.f11432c;
            v<Boolean> vVar = SemanticsProperties.f15136B;
            Oa.l<Object>[] lVarArr2 = t.f15251a;
            Oa.l<Object> lVar2 = lVarArr2[15];
            Boolean boolValueOf = Boolean.valueOf(z10);
            vVar.getClass();
            wVar.e(vVar, boolValueOf);
            C1260a c1260a2 = new C1260a(aVar.f11431b);
            v<C1260a> vVar2 = SemanticsProperties.f15135A;
            Oa.l<Object> lVar3 = lVarArr2[14];
            vVar2.getClass();
            wVar.e(vVar2, c1260a2);
        }
        wVar.e(k.f15218k, new androidx.compose.ui.semantics.a(null, new l<C1260a, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$2
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(C1260a c1260a3) {
                TextStringSimpleNode textStringSimpleNode = this.this$0;
                String str = c1260a3.f15408c;
                TextStringSimpleNode.a aVar2 = textStringSimpleNode.f11418A;
                if (aVar2 == null) {
                    TextStringSimpleNode.a aVar3 = new TextStringSimpleNode.a(textStringSimpleNode.f11419p, str);
                    f fVar = new f(str, textStringSimpleNode.f11420q, textStringSimpleNode.f11421r, textStringSimpleNode.f11422s, textStringSimpleNode.f11423t, textStringSimpleNode.f11424u, textStringSimpleNode.f11425v);
                    fVar.c(textStringSimpleNode.R1().f11469i);
                    aVar3.f11433d = fVar;
                    textStringSimpleNode.f11418A = aVar3;
                } else if (!kotlin.jvm.internal.i.a(str, aVar2.f11431b)) {
                    aVar2.f11431b = str;
                    f fVar2 = aVar2.f11433d;
                    if (fVar2 != null) {
                        F f10 = textStringSimpleNode.f11420q;
                        androidx.compose.ui.text.font.d.a aVar4 = textStringSimpleNode.f11421r;
                        int i10 = textStringSimpleNode.f11422s;
                        boolean z11 = textStringSimpleNode.f11423t;
                        int i11 = textStringSimpleNode.f11424u;
                        int i12 = textStringSimpleNode.f11425v;
                        fVar2.f11461a = str;
                        fVar2.f11462b = f10;
                        fVar2.f11463c = aVar4;
                        fVar2.f11464d = i10;
                        fVar2.f11465e = z11;
                        fVar2.f11466f = i11;
                        fVar2.f11467g = i12;
                        fVar2.b();
                        r rVar = r.f47939a;
                    }
                }
                TextStringSimpleNode.Q1(this.this$0);
                return Boolean.TRUE;
            }
        }));
        wVar.e(k.f15219l, new androidx.compose.ui.semantics.a(null, new l<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$3
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                TextStringSimpleNode textStringSimpleNode = this.this$0;
                TextStringSimpleNode.a aVar2 = textStringSimpleNode.f11418A;
                if (aVar2 == null) {
                    return Boolean.FALSE;
                }
                aVar2.f11432c = zBooleanValue;
                TextStringSimpleNode.Q1(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }));
        wVar.e(k.f15220m, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$4
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                TextStringSimpleNode textStringSimpleNode = this.this$0;
                textStringSimpleNode.f11418A = null;
                TextStringSimpleNode.Q1(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }));
        t.d(wVar, lVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        f fVarR1;
        a aVar = this.f11418A;
        if (aVar == null) {
            fVarR1 = R1();
        } else {
            if (!aVar.f11432c) {
                aVar = null;
            }
            if (aVar == null || (fVarR1 = aVar.f11433d) == null) {
                fVarR1 = R1();
            }
        }
        fVarR1.c(lookaheadCapablePlaceable);
        return s.a(fVarR1.d(lookaheadCapablePlaceable.getLayoutDirection()).c());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        f fVarR1;
        a aVar = this.f11418A;
        if (aVar == null) {
            fVarR1 = R1();
        } else {
            if (!aVar.f11432c) {
                aVar = null;
            }
            if (aVar == null || (fVarR1 = aVar.f11433d) == null) {
                fVarR1 = R1();
            }
        }
        fVarR1.c(lookaheadCapablePlaceable);
        return fVarR1.a(i10, lookaheadCapablePlaceable.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0015  */
    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        f fVarR1;
        if (this.f13997o) {
            a aVar = this.f11418A;
            if (aVar == null) {
                fVarR1 = R1();
            } else {
                if (!aVar.f11432c) {
                    aVar = null;
                }
                if (aVar == null || (fVarR1 = aVar.f11433d) == null) {
                    fVarR1 = R1();
                }
            }
            AndroidParagraph androidParagraph = fVarR1.j;
            if (androidParagraph == null) {
                p245u.c.b("no paragraph (layoutCache=" + this.f11428y + ", textSubstitution=" + this.f11418A + ')');
                throw new KotlinNothingValueException();
            }
            E eA = c1202x.f14624b.f3941c.a();
            boolean z10 = fVarR1.f11470k;
            if (z10) {
                long j = fVarR1.f11471l;
                eA.g();
                eA.k(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                androidx.compose.ui.text.v vVar = this.f11420q.f15318a;
                androidx.compose.ui.text.style.h hVar = vVar.f15701m;
                if (hVar == null) {
                    hVar = androidx.compose.ui.text.style.h.f15670b;
                }
                androidx.compose.ui.text.style.h hVar2 = hVar;
                k0 k0Var = vVar.f15702n;
                if (k0Var == null) {
                    k0Var = k0.f13652d;
                }
                k0 k0Var2 = k0Var;
                J.f fVar = vVar.f15704p;
                if (fVar == null) {
                    fVar = J.h.f3954a;
                }
                J.f fVar2 = fVar;
                C cE = vVar.f15690a.e();
                if (cE != null) {
                    androidParagraph.l(eA, cE, this.f11420q.f15318a.f15690a.a(), k0Var2, hVar2, fVar2, 3);
                } else {
                    L l10 = this.f11426w;
                    long jA = l10 != null ? l10.a() : androidx.compose.ui.graphics.H.f13504l;
                    if (jA == 16) {
                        jA = this.f11420q.b() != 16 ? this.f11420q.b() : androidx.compose.ui.graphics.H.f13495b;
                    }
                    androidParagraph.k(eA, jA, k0Var2, hVar2, fVar2, 3);
                }
            } finally {
                if (z10) {
                    eA.o();
                }
            }
        }
    }
}
