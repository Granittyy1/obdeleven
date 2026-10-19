package com.voltasit.obdeleven.ui.dialogs.fakeadapty;

import G8.C0706h;
import Ia.l;
import Ia.p;
import L4.b;
import Q3.d;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import java.util.List;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ProductsSection.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProductsSectionKt {
    public static final void a(final List<C0706h> products, final int i10, final l<? super Integer, r> onSelect, String str, String str2, final l<? super C0706h, Boolean> isPopularProvider, final l<? super C0706h, String> descriptionProvider, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        h.a aVar;
        i.e(products, "products");
        i.e(onSelect, "onSelect");
        i.e(isPopularProvider, "isPopularProvider");
        i.e(descriptionProvider, "descriptionProvider");
        C1086g c1086gP = interfaceC1084f.p(-1940613278);
        String str3 = (i12 & 8) != 0 ? null : str;
        String str4 = (i12 & 16) != 0 ? null : str2;
        c1086gP.L(-427635739);
        h.a aVar2 = h.a.f13984b;
        if (str3 == null) {
            aVar = aVar2;
        } else {
            aVar = aVar2;
            TextKt.b(str3, PaddingKt.h(aVar2, 24, 0.0f, 2), H.f13499f, G0.a.g(18), null, androidx.compose.ui.text.font.l.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200112, 0, 131024);
            Lb.a.a(c1086gP, W.e(aVar, 8));
            r rVar = r.f47939a;
        }
        boolean z10 = false;
        c1086gP.T(false);
        c1086gP.L(-427635452);
        if (str4 != null) {
            TextKt.b(str4, PaddingKt.h(aVar, (float) 24, 0.0f, 2), d.e(4289769648L), G0.a.g(14), null, null, null, 0L, null, null, G0.a.g(14), 0, false, 0, 0, null, null, c1086gP, 3504, 6, 130032);
            Lb.a.a(c1086gP, W.e(aVar, 16));
            r rVar2 = r.f47939a;
        }
        c1086gP.T(false);
        c1086gP.L(-427635168);
        final int i13 = 0;
        for (Object obj : products) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            C0706h c0706h = (C0706h) obj;
            boolean zBooleanValue = isPopularProvider.invoke(c0706h).booleanValue();
            String strInvoke = descriptionProvider.invoke(c0706h);
            String str5 = c0706h.f3498a;
            boolean z11 = i13 == i10 ? true : z10;
            c1086gP.L(653981001);
            boolean zH = ((((i11 & 896) ^ 384) > 256 && c1086gP.K(onSelect)) || (i11 & 384) == 256) | c1086gP.h(i13);
            Object objF = c1086gP.f();
            if (zH || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.ProductsSectionKt$ProductsSection$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onSelect.invoke(Integer.valueOf(i13));
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            Ia.a aVar3 = (Ia.a) objF;
            c1086gP.T(false);
            int i15 = i13;
            ProductBundleCardKt.a(str5, strInvoke, c0706h.f3503f, zBooleanValue, z11, aVar3, c1086gP, 0, 0);
            c1086gP.L(-427634740);
            if (i15 != kotlin.collections.l.r(products)) {
                Lb.a.a(c1086gP, W.e(aVar, 12));
            }
            c1086gP.T(false);
            z10 = false;
            i13 = i14;
        }
        c1086gP.T(z10);
        Lb.a.a(c1086gP, W.e(aVar, 32));
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final String str6 = str3;
            final String str7 = str4;
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.ProductsSectionKt$ProductsSection$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ProductsSectionKt.a(products, i10, onSelect, str6, str7, isPopularProvider, descriptionProvider, interfaceC1084f2, b.l(i11 | 1), i12);
                    return r.f47939a;
                }
            };
        }
    }
}
