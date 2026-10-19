package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.layout.PinnableContainerKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void a(final Object obj, final int i10, final G g10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.k(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.k(g10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c1086gP.k(pVar) ? 2048 : 1024;
        }
        if (c1086gP.C(1 & i12, (i12 & 1171) != 1170)) {
            boolean zK = c1086gP.K(obj) | c1086gP.K(g10);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = new E(obj, g10);
                c1086gP.E(objF);
            }
            final E e10 = (E) objF;
            e10.f10577c = i10;
            C1085f0 c1085f0 = e10.f10581g;
            androidx.compose.runtime.C c10 = PinnableContainerKt.f14203a;
            androidx.compose.ui.layout.X x10 = (androidx.compose.ui.layout.X) c1086gP.x(c10);
            androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
            Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
            androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
            try {
                if (x10 != ((androidx.compose.ui.layout.X) c1085f0.getValue())) {
                    c1085f0.setValue(x10);
                    if (e10.f10578d > 0) {
                        androidx.compose.ui.layout.X.a aVar = e10.f10579e;
                        if (aVar != null) {
                            aVar.a();
                        }
                        e10.f10579e = x10 != null ? x10.b() : null;
                    }
                }
                p293xa.r rVar = p293xa.r.f47939a;
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                boolean zK2 = c1086gP.K(e10);
                Object objF2 = c1086gP.f();
                if (zK2 || objF2 == c0153a) {
                    objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                            return new F(e10);
                        }
                    };
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.a(e10, (Ia.l) objF2, c1086gP);
                CompositionLocalKt.a(c10.b(e10), pVar, c1086gP, ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                throw th;
            }
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    LazyLayoutPinnableItemKt.a(obj, i10, g10, pVar, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
