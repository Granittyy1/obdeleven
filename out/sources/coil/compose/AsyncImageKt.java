package coil.compose;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncImageKt {

    /* JADX INFO: compiled from: AsyncImage.kt */
    public static final class a implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22711a = new a();

        @Override // androidx.compose.ui.layout.E
        public final F g(H h8, List<? extends D> list, long j) {
            return h8.y1(p013b0.a.j(j), p013b0.a.i(j), kotlin.collections.y.p(), new c(0));
        }
    }

    public static final void a(final g gVar, final String str, final androidx.compose.ui.h hVar, final Ia.l<? super AsyncImagePainter.a, ? extends AsyncImagePainter.a> lVar, final Ia.l<? super AsyncImagePainter.a, p293xa.r> lVar2, final androidx.compose.ui.d dVar, final InterfaceC1161g interfaceC1161g, final float f10, final I i10, final int i11, final boolean z10, InterfaceC1084f interfaceC1084f, final int i12, final int i13) {
        int i14;
        int i15;
        C1086g c1086gP = interfaceC1084f.p(-421592773);
        if ((i12 & 14) == 0) {
            i14 = (c1086gP.K(gVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i14 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= c1086gP.K(hVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= c1086gP.k(lVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= c1086gP.k(lVar2) ? 16384 : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= c1086gP.K(dVar) ? 131072 : 65536;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= c1086gP.K(interfaceC1161g) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= c1086gP.g(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i12) == 0) {
            i14 |= c1086gP.K(i10) ? 67108864 : 33554432;
        }
        if ((1879048192 & i12) == 0) {
            i14 |= c1086gP.h(i11) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (c1086gP.c(z10) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((1533916891 & i14) == 306783378 && (i15 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            coil.request.g gVarB = y.b(gVar.f22768a, interfaceC1161g, c1086gP);
            int i16 = i14 >> 6;
            int i17 = i16 & 57344;
            AsyncImagePainter asyncImagePainterA = f.a(gVarB, gVar.f22770c, lVar, lVar2, interfaceC1161g, i11, c1086gP, 0);
            Z2.f fVar = gVarB.f23069y;
            c(fVar instanceof ConstraintsSizeResolver ? hVar.i((androidx.compose.ui.h) fVar) : hVar, asyncImagePainterA, str, dVar, interfaceC1161g, f10, i10, z10, c1086gP, ((i14 << 3) & 896) | (i16 & 7168) | i17 | (i16 & 458752) | (i16 & 3670016) | ((i15 << 21) & 29360128));
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: coil.compose.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = L4.b.l(i12 | 1);
                    int iL2 = L4.b.l(i13);
                    AsyncImageKt.a(gVar, str, hVar, lVar, lVar2, dVar, interfaceC1161g, f10, i10, i11, z10, (InterfaceC1084f) obj, iL, iL2);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(coil.request.g gVar, String str, coil.f fVar, androidx.compose.ui.h hVar, Ia.l lVar, InterfaceC1161g interfaceC1161g, I i10, InterfaceC1084f interfaceC1084f, int i11, int i12) {
        interfaceC1084f.e(2032051394);
        int i13 = i11 >> 3;
        a(new g(gVar, m.f22790a, fVar), str, hVar, AsyncImagePainter.f22712v, (i12 & 32) != 0 ? null : lVar, androidx.compose.ui.d.a.f13339e, (i12 & 128) != 0 ? InterfaceC1161g.a.f14244b : interfaceC1161g, 1.0f, (i12 & 512) != 0 ? null : i10, 1, true, interfaceC1084f, (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024), 0);
        interfaceC1084f.I();
    }

    public static final void c(final androidx.compose.ui.h hVar, final AsyncImagePainter asyncImagePainter, final String str, final androidx.compose.ui.d dVar, final InterfaceC1161g interfaceC1161g, final float f10, final I i10, final boolean z10, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(777774312);
        if ((i11 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(asyncImagePainter) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= c1086gP.K(str) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= c1086gP.K(dVar) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= c1086gP.K(interfaceC1161g) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= c1086gP.g(f10) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= c1086gP.K(i10) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= c1086gP.c(z10) ? 8388608 : 4194304;
        }
        if ((i12 & 23967451) == 4793490 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Z2.c cVar = y.f22840b;
            androidx.compose.ui.h hVarB = str != null ? androidx.compose.ui.semantics.p.b(hVar, false, new x(0, str)) : hVar;
            if (z10) {
                hVarB = A8.p.s(hVarB);
            }
            androidx.compose.ui.h hVarI = hVarB.i(new ContentPainterElement(asyncImagePainter, dVar, interfaceC1161g, f10, i10));
            a aVar = a.f22711a;
            c1086gP.e(544976794);
            int i13 = c1086gP.f12996P;
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            ComposeUiNode.f14331c0.getClass();
            final Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.e(1405779621);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(new Ia.a<ComposeUiNode>() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // Ia.a
                    public final ComposeUiNode invoke() {
                        return aVar2.invoke();
                    }
                });
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, aVar);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            c1086gP.T(true);
            c1086gP.T(false);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: coil.compose.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AsyncImageKt.c(hVar, asyncImagePainter, str, dVar, interfaceC1161g, f10, i10, z10, (InterfaceC1084f) obj, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
