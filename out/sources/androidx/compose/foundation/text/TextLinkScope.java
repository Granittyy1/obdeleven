package androidx.compose.foundation.text;

import D2.C0692t;
import androidx.compose.animation.core.X;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.R0;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.InterfaceC1267h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextLinkScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextLinkScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1085f0 f11234a = J0.f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1260a f11235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SnapshotStateList<Ia.l<p, p293xa.r>> f11236c;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextLinkScope$1, reason: invalid class name */
    /* JADX INFO: compiled from: TextLinkScope.kt */
    public static final class AnonymousClass1 extends Lambda implements Ia.l<C1260a.c<? extends C1260a.InterfaceC0160a>, List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>>> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AnonymousClass1 f11237h = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.l
        public final List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>> invoke(C1260a.c<? extends C1260a.InterfaceC0160a> cVar) {
            androidx.compose.ui.text.v vVar;
            C1260a.c<? extends C1260a.InterfaceC0160a> cVar2 = cVar;
            T t8 = cVar2.f15418a;
            if (t8 instanceof AbstractC1266g) {
                kotlin.jvm.internal.i.c(t8, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                androidx.compose.ui.text.C cB = ((AbstractC1266g) t8).b();
                if (cB != null && (cB.f15306a != null || cB.f15307b != null || cB.f15308c != null || cB.f15309d != null)) {
                    T t10 = cVar2.f15418a;
                    kotlin.jvm.internal.i.c(t10, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                    androidx.compose.ui.text.C cB2 = ((AbstractC1266g) t10).b();
                    if (cB2 == null || (vVar = cB2.f15306a) == null) {
                        vVar = new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                    }
                    return kotlin.collections.l.n(cVar2, new C1260a.c(cVar2.f15419b, cVar2.f15420c, vVar));
                }
            }
            return kotlin.collections.l.n(cVar2);
        }
    }

    public TextLinkScope(C1260a c1260a) {
        c1260a.getClass();
        C1260a.b bVar = new C1260a.b(c1260a);
        ArrayList arrayList = bVar.f15413d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<? extends C1260a.c<? extends C1260a.InterfaceC0160a>> listInvoke = AnonymousClass1.f11237h.invoke(((C1260a.b.C0161a) arrayList.get(i10)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C1260a.c<? extends C1260a.InterfaceC0160a> cVar = listInvoke.get(i11);
                arrayList3.add(new C1260a.b.C0161a(cVar.f15419b, cVar.f15420c, cVar.f15418a, cVar.f15421d));
            }
            kotlin.collections.p.z(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f11235b = bVar.i();
        this.f11236c = new SnapshotStateList<>();
    }

    public static C1260a.c c(C1260a.c cVar, androidx.compose.ui.text.B b10) {
        C1268i c1268i = b10.f15301b;
        int iC = c1268i.c(c1268i.f15475f - 1, false);
        if (cVar.f15419b < iC) {
            return C1260a.c.a(cVar, null, Math.min(cVar.f15420c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public final void a(InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        C1086g c1086gP = interfaceC1084f.p(1154651354);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        ?? r10 = 0;
        if (c1086gP.C(i11 & 1, (i11 & 3) != 2)) {
            final R0 r11 = (R0) c1086gP.x(CompositionLocalsKt.f14856r);
            C1260a c1260a = this.f11235b;
            List listA = c1260a.a(c1260a.f15408c.length());
            int size = listA.size();
            int i12 = 0;
            while (i12 < size) {
                final C1260a.c cVar = (C1260a.c) listA.get(i12);
                if (cVar.f15419b != cVar.f15420c) {
                    c1086gP.L(1386075176);
                    Object objF = c1086gP.f();
                    Object obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objF;
                    androidx.compose.ui.h hVarA = androidx.compose.foundation.u.a(androidx.compose.ui.semantics.p.b(T.a(androidx.compose.ui.h.a.f13984b, new Ia.l<U, p293xa.r>() { // from class: androidx.compose.foundation.text.TextLinkScope$clipLink$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.l
                        public final p293xa.r invoke(U u10) {
                            C1144u c1144uI;
                            androidx.compose.ui.text.B b10;
                            C1260a.c cVarC;
                            U u11 = u10;
                            TextLinkScope textLinkScope = this.this$0;
                            C1260a.c<AbstractC1266g> cVar2 = cVar;
                            textLinkScope.getClass();
                            if (!((Boolean) new TextLinkScope$shouldMeasureLinks$1(textLinkScope).invoke()).booleanValue() || (b10 = (androidx.compose.ui.text.B) textLinkScope.f11234a.getValue()) == null || (cVarC = TextLinkScope.c(cVar2, b10)) == null) {
                                c1144uI = null;
                            } else {
                                int i13 = cVarC.f15419b;
                                int i14 = cVarC.f15420c;
                                c1144uI = b10.i(i13, i14);
                                I.f fVarB = b10.b(i13);
                                int i15 = i14 - 1;
                                I.f fVarB2 = b10.b(i15);
                                C1268i c1268i = b10.f15301b;
                                c1144uI.v(((((long) Float.floatToRawIntBits(c1268i.d(i13) == c1268i.d(i15) ? Math.min(fVarB2.f3757a, fVarB.f3757a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(fVarB.f3758b)) & 4294967295L)) ^ (-9223372034707292160L));
                            }
                            C c10 = c1144uI != null ? new C(c1144uI) : null;
                            if (c10 != null) {
                                u11.O0(c10);
                                u11.z(true);
                            }
                            return p293xa.r.f47939a;
                        }
                    }), r10, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.v<p293xa.r> vVar = SemanticsProperties.f15171y;
                            p293xa.r rVar = p293xa.r.f47939a;
                            wVar.e(vVar, rVar);
                            return rVar;
                        }
                    }).i(new F(new B(this, cVar))), kVar);
                    androidx.compose.ui.input.pointer.m.f14096a.getClass();
                    androidx.compose.ui.h hVarF = Fa.d.f(hVarA, androidx.compose.ui.input.pointer.o.f14099b);
                    boolean zK = c1086gP.k(this) | c1086gP.K(cVar) | c1086gP.k(r11);
                    Object objF2 = c1086gP.f();
                    if (zK || objF2 == obj) {
                        objF2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final p293xa.r invoke() {
                                InterfaceC1267h interfaceC1267h;
                                p293xa.r rVar;
                                TextLinkScope textLinkScope = this.this$0;
                                AbstractC1266g abstractC1266g = cVar.f15418a;
                                R0 r12 = r11;
                                textLinkScope.getClass();
                                if (abstractC1266g instanceof AbstractC1266g.b) {
                                    InterfaceC1267h interfaceC1267h2 = ((AbstractC1266g.b) abstractC1266g).f15469c;
                                    if (interfaceC1267h2 != null) {
                                        interfaceC1267h2.a(abstractC1266g);
                                        rVar = p293xa.r.f47939a;
                                    } else {
                                        rVar = null;
                                    }
                                    if (rVar == null) {
                                        try {
                                            r12.a(((AbstractC1266g.b) abstractC1266g).f15467a);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                } else if ((abstractC1266g instanceof AbstractC1266g.a) && (interfaceC1267h = ((AbstractC1266g.a) abstractC1266g).f15466c) != null) {
                                    interfaceC1267h.a(abstractC1266g);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    BoxKt.a(ClickableKt.d(hVarF, kVar, (Ia.a) objF2), c1086gP, r10);
                    AbstractC1266g abstractC1266g = (AbstractC1266g) cVar.f15418a;
                    androidx.compose.ui.text.C cB = abstractC1266g.b();
                    if (cB == null || (cB.f15306a == null && cB.f15307b == null && cB.f15308c == null && cB.f15309d == null)) {
                        boolean z11 = r10;
                        c1086gP.L(1388926990);
                        c1086gP.T(z11);
                        z10 = z11;
                    } else {
                        c1086gP.L(1386898319);
                        Object objF3 = c1086gP.f();
                        if (objF3 == obj) {
                            objF3 = new m(kVar);
                            c1086gP.E(objF3);
                        }
                        final m mVar = (m) objF3;
                        p293xa.r rVar = p293xa.r.f47939a;
                        Object objF4 = c1086gP.f();
                        if (objF4 == obj) {
                            objF4 = new TextLinkScope$LinksComposables$1$3$1(mVar, null);
                            c1086gP.E(objF4);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, rVar);
                        Boolean boolValueOf = Boolean.valueOf((mVar.f11361b.o() & 2) != 0);
                        C1081d0 c1081d0 = mVar.f11361b;
                        Boolean boolValueOf2 = Boolean.valueOf((c1081d0.o() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((c1081d0.o() & 4) != 0);
                        androidx.compose.ui.text.C cB2 = abstractC1266g.b();
                        androidx.compose.ui.text.v vVar = cB2 != null ? cB2.f15306a : null;
                        androidx.compose.ui.text.C cB3 = abstractC1266g.b();
                        androidx.compose.ui.text.v vVar2 = cB3 != null ? cB3.f15307b : null;
                        androidx.compose.ui.text.C cB4 = abstractC1266g.b();
                        androidx.compose.ui.text.v vVar3 = cB4 != null ? cB4.f15308c : null;
                        androidx.compose.ui.text.C cB5 = abstractC1266g.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, vVar, vVar2, vVar3, cB5 != null ? cB5.f15309d : null};
                        boolean zK2 = c1086gP.k(this) | c1086gP.K(cVar);
                        Object objF5 = c1086gP.f();
                        if (zK2 || objF5 == obj) {
                            objF5 = new Ia.l<p, p293xa.r>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(p pVar) {
                                    androidx.compose.ui.text.C cB6;
                                    androidx.compose.ui.text.C cB7;
                                    androidx.compose.ui.text.C cB8;
                                    p pVar2 = pVar;
                                    TextLinkScope textLinkScope = this.this$0;
                                    androidx.compose.ui.text.C cB9 = cVar.f15418a.b();
                                    final androidx.compose.ui.text.v vVarC = null;
                                    androidx.compose.ui.text.v vVar4 = cB9 != null ? cB9.f15306a : null;
                                    androidx.compose.ui.text.v vVarC2 = ((mVar.f11361b.o() & 1) == 0 || (cB8 = cVar.f15418a.b()) == null) ? null : cB8.f15307b;
                                    textLinkScope.getClass();
                                    if (vVar4 != null) {
                                        vVarC2 = vVar4.c(vVarC2);
                                    }
                                    androidx.compose.ui.text.v vVarC3 = ((mVar.f11361b.o() & 2) == 0 || (cB7 = cVar.f15418a.b()) == null) ? null : cB7.f15308c;
                                    if (vVarC2 != null) {
                                        vVarC3 = vVarC2.c(vVarC3);
                                    }
                                    if ((mVar.f11361b.o() & 4) != 0 && (cB6 = cVar.f15418a.b()) != null) {
                                        vVarC = cB6.f15309d;
                                    }
                                    if (vVarC3 != null) {
                                        vVarC = vVarC3.c(vVarC);
                                    }
                                    final C1260a.c<AbstractC1266g> cVar2 = cVar;
                                    pVar2.getClass();
                                    final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                                    Ia.l<C1260a.c<? extends C1260a.InterfaceC0160a>, C1260a.c<? extends C1260a.InterfaceC0160a>> lVar = new Ia.l<C1260a.c<? extends C1260a.InterfaceC0160a>, C1260a.c<? extends C1260a.InterfaceC0160a>>() { // from class: androidx.compose.foundation.text.TextAnnotatorScope$replaceStyle$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Code duplicated, block: B:14:0x004a  */
                                        @Override // Ia.l
                                        public final C1260a.c<? extends C1260a.InterfaceC0160a> invoke(C1260a.c<? extends C1260a.InterfaceC0160a> cVar3) {
                                            C1260a.c<? extends C1260a.InterfaceC0160a> cVar4;
                                            C1260a.c<? extends C1260a.InterfaceC0160a> cVar5 = cVar3;
                                            if (ref$BooleanRef.element && (cVar5.f15418a instanceof androidx.compose.ui.text.v)) {
                                                C1260a.c<AbstractC1266g> cVar6 = cVar2;
                                                int i13 = cVar6.f15419b;
                                                int i14 = cVar5.f15419b;
                                                if (i14 == i13) {
                                                    int i15 = cVar6.f15420c;
                                                    int i16 = cVar5.f15420c;
                                                    if (i16 == i15) {
                                                        androidx.compose.ui.text.v vVar5 = vVarC;
                                                        if (vVar5 == null) {
                                                            vVar5 = new androidx.compose.ui.text.v(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                                                        }
                                                        cVar4 = new C1260a.c<>(i14, i16, vVar5);
                                                    } else {
                                                        cVar4 = cVar5;
                                                    }
                                                } else {
                                                    cVar4 = cVar5;
                                                }
                                            } else {
                                                cVar4 = cVar5;
                                            }
                                            ref$BooleanRef.element = kotlin.jvm.internal.i.a(cVar2, cVar5);
                                            return cVar4;
                                        }
                                    };
                                    C1260a c1260a2 = pVar2.f11518a;
                                    c1260a2.getClass();
                                    C1260a.b bVar = new C1260a.b(c1260a2);
                                    ArrayList arrayList = bVar.f15413d;
                                    int size2 = arrayList.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        C1260a.c<? extends C1260a.InterfaceC0160a> cVarInvoke = lVar.invoke(((C1260a.b.C0161a) arrayList.get(i13)).a(Integer.MIN_VALUE));
                                        arrayList.set(i13, new C1260a.b.C0161a(cVarInvoke.f15419b, cVarInvoke.f15420c, cVarInvoke.f15418a, cVarInvoke.f15421d));
                                    }
                                    pVar2.f11519b = bVar.i();
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF5);
                        }
                        b(objArr, (Ia.l) objF5, c1086gP, (i11 << 6) & 896);
                        z10 = 0;
                        c1086gP.T(false);
                    }
                    c1086gP.T(z10);
                } else {
                    z10 = r10;
                    c1086gP.L(1388940878);
                    c1086gP.T(z10);
                }
                i12++;
                r10 = z10;
            }
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.a(interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public final void b(final Object[] objArr, final Ia.l<? super p, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2083052099);
        int i11 = (i10 & 48) == 0 ? (c1086gP.k(lVar) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(this) ? 256 : 128;
        }
        c1086gP.q(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= c1086gP.k(obj) ? 4 : 0;
        }
        c1086gP.T(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if (c1086gP.C(i11 & 1, (i11 & 147) != 146)) {
            C0692t c0692t = new C0692t(2);
            ArrayList arrayList = (ArrayList) c0692t.f2697b;
            arrayList.add(lVar);
            c0692t.b(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zK = c1086gP.k(this) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        this.this$0.f11236c.add(lVar);
                        return new X(this.this$0, 1, lVar);
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.runtime.E.c(array, (Ia.l) objF, c1086gP);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextLinkScope textLinkScope = this.$tmp1_rcvr;
                    Object[] objArr2 = objArr;
                    textLinkScope.b(Arrays.copyOf(objArr2, objArr2.length), lVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
