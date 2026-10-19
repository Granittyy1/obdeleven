package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0984t {
    public static final void a(final InterfaceC0985u interfaceC0985u, final Object obj, final int i10, final Object obj2, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.K(interfaceC0985u) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.K(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.h(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c1086gP.K(obj2) ? 2048 : 1024;
        }
        if (c1086gP.C(i12 & 1, (i12 & 1171) != 1170)) {
            ((androidx.compose.runtime.saveable.c) obj).d(obj2, androidx.compose.runtime.internal.a.b(980966366, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        interfaceC0985u.i(i10, interfaceC1084f3, obj2);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 48);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    C0984t.a(interfaceC0985u, obj, i10, obj2, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
