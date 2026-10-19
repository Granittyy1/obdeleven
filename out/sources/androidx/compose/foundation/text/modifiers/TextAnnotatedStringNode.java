package androidx.compose.foundation.text.modifiers;

import Ia.l;
import androidx.compose.animation.D;
import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.text.s;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1166l;
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
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.style.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.internal.measurement.M1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import p293xa.r;

/* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringNode extends androidx.compose.ui.h.c implements InterfaceC1198t, InterfaceC1191l, b0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public L f11389A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public l<? super a, r> f11390B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Map<AbstractC1155a, Integer> f11391C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public e f11392D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public l<? super List<B>, Boolean> f11393E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public a f11394F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1260a f11395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F f11396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.text.font.d.a f11397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l<? super B, r> f11398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<C1260a.c<p>> f11403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l<? super List<I.f>, r> f11404y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SelectionController f11405z;

    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1260a f11406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1260a f11407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11408c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f11409d = null;

        public a(C1260a c1260a, C1260a c1260a2) {
            this.f11406a = c1260a;
            this.f11407b = c1260a2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f11406a, aVar.f11406a) && kotlin.jvm.internal.i.a(this.f11407b, aVar.f11407b) && this.f11408c == aVar.f11408c && kotlin.jvm.internal.i.a(this.f11409d, aVar.f11409d);
        }

        public final int hashCode() {
            int iB = D.b((this.f11407b.hashCode() + (this.f11406a.hashCode() * 31)) * 31, 31, this.f11408c);
            e eVar = this.f11409d;
            return iB + (eVar == null ? 0 : eVar.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f11406a) + ", substitution=" + ((Object) this.f11407b) + ", isShowingSubstitution=" + this.f11408c + ", layoutCache=" + this.f11409d + ')';
        }
    }

    public TextAnnotatedStringNode() {
        throw null;
    }

    public TextAnnotatedStringNode(C1260a c1260a, F f10, androidx.compose.ui.text.font.d.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, SelectionController selectionController, L l10, l lVar3) {
        this.f11395p = c1260a;
        this.f11396q = f10;
        this.f11397r = aVar;
        this.f11398s = lVar;
        this.f11399t = i10;
        this.f11400u = z10;
        this.f11401v = i11;
        this.f11402w = i12;
        this.f11403x = list;
        this.f11404y = lVar2;
        this.f11405z = selectionController;
        this.f11389A = l10;
        this.f11390B = lVar3;
    }

    public static final void Q1(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.getClass();
        C1185f.f(textAnnotatedStringNode).P();
        C1185f.f(textAnnotatedStringNode).O();
        C1192m.a(textAnnotatedStringNode);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(H h8, androidx.compose.ui.layout.D d10, long j) {
        boolean z10;
        e eVarT1 = T1(h8);
        LayoutDirection layoutDirection = h8.getLayoutDirection();
        if (eVarT1.f11451f > 1) {
            c cVar = eVarT1.f11453h;
            F f10 = eVarT1.f11455k;
            p013b0.c cVar2 = eVarT1.j;
            kotlin.jvm.internal.i.b(cVar2);
            c cVarA = c.a.a(cVar, layoutDirection, f10, cVar2, eVarT1.f11447b);
            eVarT1.f11453h = cVarA;
            j = cVarA.a(eVarT1.f11451f, j);
        }
        B b10 = eVarT1.f11458n;
        if (b10 == null) {
            eVarT1.f11458n = eVarT1.e(layoutDirection, j, eVarT1.b(j, layoutDirection));
            z10 = true;
        } else {
            C1268i c1268i = b10.f15301b;
            if (c1268i.f15470a.a()) {
                eVarT1.f11458n = eVarT1.e(layoutDirection, j, eVarT1.b(j, layoutDirection));
                z10 = true;
            } else {
                A a10 = b10.f15300a;
                if (layoutDirection != a10.f15283h) {
                    eVarT1.f11458n = eVarT1.e(layoutDirection, j, eVarT1.b(j, layoutDirection));
                    z10 = true;
                } else {
                    long j10 = a10.j;
                    if (!p013b0.a.b(j, j10) && (p013b0.a.h(j) != p013b0.a.h(j10) || p013b0.a.j(j) != p013b0.a.j(j10) || p013b0.a.g(j) < c1268i.f15474e || c1268i.f15472c)) {
                        eVarT1.f11458n = eVarT1.e(layoutDirection, j, eVarT1.b(j, layoutDirection));
                    } else {
                        B b11 = eVarT1.f11458n;
                        kotlin.jvm.internal.i.b(b11);
                        if (p013b0.a.b(j, b11.f15300a.j)) {
                            z10 = false;
                        } else {
                            B b12 = eVarT1.f11458n;
                            kotlin.jvm.internal.i.b(b12);
                            eVarT1.f11458n = eVarT1.e(layoutDirection, j, b12.f15301b);
                        }
                    }
                    z10 = true;
                }
            }
        }
        B b13 = eVarT1.f11458n;
        if (b13 == null) {
            throw new IllegalStateException("You must call layoutWithConstraints first");
        }
        b13.f15301b.f15470a.a();
        if (z10) {
            C1185f.d(this, 2).G1();
            l<? super B, r> lVar = this.f11398s;
            if (lVar != null) {
                lVar.invoke(b13);
            }
            SelectionController selectionController = this.f11405z;
            if (selectionController != null) {
                B b14 = selectionController.f11376e.f11491b;
                if (b14 != null && !kotlin.jvm.internal.i.a(b14.f15300a.f15276a, b13.f15300a.f15276a)) {
                    selectionController.f11374c.h();
                }
                selectionController.f11376e = j.a(selectionController.f11376e, null, b13, 1);
            }
            Map<AbstractC1155a, Integer> linkedHashMap = this.f11391C;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>(2);
            }
            linkedHashMap.put(AlignmentLineKt.f14165a, Integer.valueOf(Math.round(b13.f15303d)));
            linkedHashMap.put(AlignmentLineKt.f14166b, Integer.valueOf(Math.round(b13.f15304e)));
            this.f11391C = linkedHashMap;
        }
        l<? super List<I.f>, r> lVar2 = this.f11404y;
        if (lVar2 != null) {
            lVar2.invoke(b13.f15305f);
        }
        long j11 = b13.f15302c;
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        final Y yQ = d10.Q(p013b0.a.C0206a.b(i10, i10, i11, i11));
        Map<AbstractC1155a, Integer> map = this.f11391C;
        kotlin.jvm.internal.i.b(map);
        return h8.y1(i10, i11, map, new l<Y.a, r>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Y.a aVar) {
                aVar.d(yQ, 0, 0, 0.0f);
                return r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final void R1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            e eVarS1 = S1();
            C1260a c1260a = this.f11395p;
            F f10 = this.f11396q;
            androidx.compose.ui.text.font.d.a aVar = this.f11397r;
            int i10 = this.f11399t;
            boolean z14 = this.f11400u;
            int i11 = this.f11401v;
            int i12 = this.f11402w;
            List<C1260a.c<p>> list = this.f11403x;
            eVarS1.f11446a = c1260a;
            boolean zC = f10.c(eVarS1.f11455k);
            eVarS1.f11455k = f10;
            if (!zC) {
                eVarS1.f11456l = null;
                eVarS1.f11458n = null;
                eVarS1.f11460p = -1;
                eVarS1.f11459o = -1;
            }
            eVarS1.f11447b = aVar;
            eVarS1.f11448c = i10;
            eVarS1.f11449d = z14;
            eVarS1.f11450e = i11;
            eVarS1.f11451f = i12;
            eVarS1.f11452g = list;
            eVarS1.f11456l = null;
            eVarS1.f11458n = null;
            eVarS1.f11460p = -1;
            eVarS1.f11459o = -1;
        }
        if (this.f13997o) {
            if (z11 || (z10 && this.f11393E != null)) {
                C1185f.f(this).P();
            }
            if (z11 || z12 || z13) {
                C1185f.f(this).O();
                C1192m.a(this);
            }
            if (z10) {
                C1192m.a(this);
            }
        }
    }

    public final e S1() {
        if (this.f11392D == null) {
            this.f11392D = new e(this.f11395p, this.f11396q, this.f11397r, this.f11399t, this.f11400u, this.f11401v, this.f11402w, this.f11403x);
        }
        e eVar = this.f11392D;
        kotlin.jvm.internal.i.b(eVar);
        return eVar;
    }

    public final e T1(p013b0.c cVar) {
        e eVar;
        a aVar = this.f11394F;
        if (aVar != null && aVar.f11408c && (eVar = aVar.f11409d) != null) {
            eVar.c(cVar);
            return eVar;
        }
        e eVarS1 = S1();
        eVarS1.c(cVar);
        return eVarS1;
    }

    public final boolean U1(l<? super B, r> lVar, l<? super List<I.f>, r> lVar2, SelectionController selectionController, l<? super a, r> lVar3) {
        boolean z10;
        if (this.f11398s != lVar) {
            this.f11398s = lVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f11404y != lVar2) {
            this.f11404y = lVar2;
            z10 = true;
        }
        if (!kotlin.jvm.internal.i.a(this.f11405z, selectionController)) {
            this.f11405z = selectionController;
            z10 = true;
        }
        if (this.f11390B == lVar3) {
            return z10;
        }
        this.f11390B = lVar3;
        return true;
    }

    public final boolean V1(F f10, List list, int i10, int i11, boolean z10, androidx.compose.ui.text.font.d.a aVar, int i12) {
        boolean z11 = !this.f11396q.c(f10);
        this.f11396q = f10;
        if (!kotlin.jvm.internal.i.a(this.f11403x, list)) {
            this.f11403x = list;
            z11 = true;
        }
        if (this.f11402w != i10) {
            this.f11402w = i10;
            z11 = true;
        }
        if (this.f11401v != i11) {
            this.f11401v = i11;
            z11 = true;
        }
        if (this.f11400u != z10) {
            this.f11400u = z10;
            z11 = true;
        }
        if (!kotlin.jvm.internal.i.a(this.f11397r, aVar)) {
            this.f11397r = aVar;
            z11 = true;
        }
        if (!m.a(this.f11399t, i12)) {
            this.f11399t = i12;
            z11 = true;
        }
        if (kotlin.jvm.internal.i.a(null, null)) {
            return z11;
        }
        return true;
    }

    public final boolean W1(C1260a c1260a) {
        boolean zA = kotlin.jvm.internal.i.a(this.f11395p.f15408c, c1260a.f15408c);
        boolean z10 = (zA && kotlin.jvm.internal.i.a(this.f11395p.f15407b, c1260a.f15407b)) ? false : true;
        if (z10) {
            this.f11395p = c1260a;
        }
        if (!zA) {
            this.f11394F = null;
        }
        return z10;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return s.a(T1(lookaheadCapablePlaceable).d(lookaheadCapablePlaceable.getLayoutDirection()).b());
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return T1(lookaheadCapablePlaceable).a(i10, lookaheadCapablePlaceable.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(w wVar) {
        l lVar = this.f11393E;
        if (lVar == null) {
            lVar = new l<List<B>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final Boolean invoke(List<B> list) {
                    B b10;
                    List<B> list2 = list;
                    B b11 = this.this$0.S1().f11458n;
                    if (b11 != null) {
                        A a10 = b11.f15300a;
                        C1260a c1260a = a10.f15276a;
                        TextAnnotatedStringNode textAnnotatedStringNode = this.this$0;
                        F f10 = textAnnotatedStringNode.f11396q;
                        L l10 = textAnnotatedStringNode.f11389A;
                        b10 = new B(new A(c1260a, F.e(f10, l10 != null ? l10.a() : androidx.compose.ui.graphics.H.f13504l, 0L, null, null, null, 0L, null, 0, 0L, 16777214), a10.f15278c, a10.f15279d, a10.f15280e, a10.f15281f, a10.f15282g, a10.f15283h, a10.f15284i, a10.j), b11.f15301b, b11.f15302c);
                        list2.add(b10);
                    } else {
                        b10 = null;
                    }
                    return Boolean.valueOf(b10 != null);
                }
            };
            this.f11393E = lVar;
        }
        C1260a c1260a = this.f11395p;
        Oa.l<Object>[] lVarArr = t.f15251a;
        wVar.e(SemanticsProperties.f15172z, M1.k(c1260a));
        a aVar = this.f11394F;
        if (aVar != null) {
            C1260a c1260a2 = aVar.f11407b;
            v<C1260a> vVar = SemanticsProperties.f15135A;
            Oa.l<Object>[] lVarArr2 = t.f15251a;
            Oa.l<Object> lVar2 = lVarArr2[14];
            vVar.getClass();
            wVar.e(vVar, c1260a2);
            boolean z10 = aVar.f11408c;
            v<Boolean> vVar2 = SemanticsProperties.f15136B;
            Oa.l<Object> lVar3 = lVarArr2[15];
            Boolean boolValueOf = Boolean.valueOf(z10);
            vVar2.getClass();
            wVar.e(vVar2, boolValueOf);
        }
        wVar.e(k.f15218k, new androidx.compose.ui.semantics.a(null, new l<C1260a, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(C1260a c1260a3) {
                C1260a c1260a4 = c1260a3;
                TextAnnotatedStringNode textAnnotatedStringNode = this.this$0;
                TextAnnotatedStringNode.a aVar2 = textAnnotatedStringNode.f11394F;
                if (aVar2 == null) {
                    TextAnnotatedStringNode.a aVar3 = new TextAnnotatedStringNode.a(textAnnotatedStringNode.f11395p, c1260a4);
                    e eVar = new e(c1260a4, textAnnotatedStringNode.f11396q, textAnnotatedStringNode.f11397r, textAnnotatedStringNode.f11399t, textAnnotatedStringNode.f11400u, textAnnotatedStringNode.f11401v, textAnnotatedStringNode.f11402w, EmptyList.f42983b);
                    eVar.c(textAnnotatedStringNode.S1().j);
                    aVar3.f11409d = eVar;
                    textAnnotatedStringNode.f11394F = aVar3;
                } else if (!kotlin.jvm.internal.i.a(c1260a4, aVar2.f11407b)) {
                    aVar2.f11407b = c1260a4;
                    e eVar2 = aVar2.f11409d;
                    if (eVar2 != null) {
                        F f10 = textAnnotatedStringNode.f11396q;
                        androidx.compose.ui.text.font.d.a aVar4 = textAnnotatedStringNode.f11397r;
                        int i10 = textAnnotatedStringNode.f11399t;
                        boolean z11 = textAnnotatedStringNode.f11400u;
                        int i11 = textAnnotatedStringNode.f11401v;
                        int i12 = textAnnotatedStringNode.f11402w;
                        EmptyList emptyList = EmptyList.f42983b;
                        eVar2.f11446a = c1260a4;
                        boolean zC = f10.c(eVar2.f11455k);
                        eVar2.f11455k = f10;
                        if (!zC) {
                            eVar2.f11456l = null;
                            eVar2.f11458n = null;
                            eVar2.f11460p = -1;
                            eVar2.f11459o = -1;
                        }
                        eVar2.f11447b = aVar4;
                        eVar2.f11448c = i10;
                        eVar2.f11449d = z11;
                        eVar2.f11450e = i11;
                        eVar2.f11451f = i12;
                        eVar2.f11452g = emptyList;
                        eVar2.f11456l = null;
                        eVar2.f11458n = null;
                        eVar2.f11460p = -1;
                        eVar2.f11459o = -1;
                        r rVar = r.f47939a;
                    }
                }
                TextAnnotatedStringNode.Q1(this.this$0);
                return Boolean.TRUE;
            }
        }));
        wVar.e(k.f15219l, new androidx.compose.ui.semantics.a(null, new l<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                TextAnnotatedStringNode textAnnotatedStringNode = this.this$0;
                TextAnnotatedStringNode.a aVar2 = textAnnotatedStringNode.f11394F;
                if (aVar2 == null) {
                    return Boolean.FALSE;
                }
                l<? super TextAnnotatedStringNode.a, r> lVar4 = textAnnotatedStringNode.f11390B;
                if (lVar4 != null) {
                    lVar4.invoke(aVar2);
                }
                TextAnnotatedStringNode textAnnotatedStringNode2 = this.this$0;
                TextAnnotatedStringNode.a aVar3 = textAnnotatedStringNode2.f11394F;
                if (aVar3 != null) {
                    aVar3.f11408c = zBooleanValue;
                }
                TextAnnotatedStringNode.Q1(textAnnotatedStringNode2);
                return Boolean.TRUE;
            }
        }));
        wVar.e(k.f15220m, new androidx.compose.ui.semantics.a(null, new Ia.a<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            {
                super(0);
            }

            @Override // Ia.a
            public final Boolean invoke() {
                TextAnnotatedStringNode textAnnotatedStringNode = this.this$0;
                textAnnotatedStringNode.f11394F = null;
                TextAnnotatedStringNode.Q1(textAnnotatedStringNode);
                return Boolean.TRUE;
            }
        }));
        t.d(wVar, lVar);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return s.a(T1(lookaheadCapablePlaceable).d(lookaheadCapablePlaceable.getLayoutDirection()).c());
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return T1(lookaheadCapablePlaceable).a(i10, lookaheadCapablePlaceable.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) throws Throwable {
        androidx.compose.foundation.text.selection.i iVarB;
        long j;
        J.a.b bVar;
        if (this.f13997o) {
            SelectionController selectionController = this.f11405z;
            J.a aVar = c1202x.f14624b;
            if (selectionController != null && (iVarB = selectionController.f11374c.i().b(selectionController.f11373b)) != null) {
                androidx.compose.foundation.text.selection.i.a aVar2 = iVarB.f11603b;
                androidx.compose.foundation.text.selection.i.a aVar3 = iVarB.f11602a;
                boolean z10 = iVarB.f11604c;
                int i10 = !z10 ? aVar3.f11606b : aVar2.f11606b;
                int i11 = !z10 ? aVar2.f11606b : aVar3.f11606b;
                if (i10 != i11) {
                    if (i10 > 0) {
                        i10 = 0;
                    }
                    if (i11 > 0) {
                        i11 = 0;
                    }
                    B b10 = selectionController.f11376e.f11491b;
                    C1144u c1144uI = b10 != null ? b10.i(i10, i11) : null;
                    if (c1144uI != null) {
                        B b11 = selectionController.f11376e.f11491b;
                        if (b11 == null || m.a(b11.f15300a.f15281f, 3) || !b11.d()) {
                            J.e.N(c1202x, c1144uI, selectionController.f11375d, null, null, 60);
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (aVar.j() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (aVar.j() & 4294967295L));
                            J.a.b bVar2 = aVar.f3941c;
                            long jE = bVar2.e();
                            bVar2.a().g();
                            try {
                                bVar2.f3948a.d(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                j = jE;
                                bVar = bVar2;
                                try {
                                    J.e.N(c1202x, c1144uI, selectionController.f11375d, null, null, 60);
                                    C0936h.f(bVar, j);
                                } catch (Throwable th) {
                                    th = th;
                                    C0936h.f(bVar, j);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j = jE;
                                bVar = bVar2;
                            }
                        }
                    }
                }
            }
            E eA = aVar.f3941c.a();
            B b12 = T1(c1202x).f11458n;
            if (b12 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            boolean z11 = b12.d() && !m.a(this.f11399t, 3);
            if (z11) {
                long j10 = b12.f15302c;
                I.f fVarA = p111ia.c.a(0L, (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L));
                eA.g();
                eA.q(fVarA, 1);
            }
            try {
                androidx.compose.ui.text.v vVar = this.f11396q.f15318a;
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
                C1268i c1268i = b12.f15301b;
                if (cE != null) {
                    C1268i.j(c1268i, eA, cE, this.f11396q.f15318a.f15690a.a(), k0Var2, hVar2, fVar2);
                } else {
                    L l10 = this.f11389A;
                    long jA = l10 != null ? l10.a() : androidx.compose.ui.graphics.H.f13504l;
                    if (jA == 16) {
                        jA = this.f11396q.b() != 16 ? this.f11396q.b() : androidx.compose.ui.graphics.H.f13495b;
                    }
                    C1268i.i(c1268i, eA, jA, k0Var2, hVar2, fVar2);
                }
                if (z11) {
                    eA.o();
                }
                a aVar4 = this.f11394F;
                if (!((aVar4 == null || !aVar4.f11408c) ? C6.b.b(this.f11395p) : false)) {
                    List<C1260a.c<p>> list = this.f11403x;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                }
                c1202x.A1();
            } catch (Throwable th3) {
                if (z11) {
                    eA.o();
                }
                throw th3;
            }
        }
    }
}
