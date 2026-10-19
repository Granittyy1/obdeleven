package androidx.compose.material3.internal;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.text.F;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ProvideContentColorTextStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProvideContentColorTextStyleKt {
    public static final void a(final long j, final F f10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-716124955);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.i(j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.runtime.C c10 = TextKt.f12383a;
            CompositionLocalKt.b(new C1101n0[]{B7.b.b(j, ContentColorKt.f12125a), c10.b(((F) c1086gP.x(c10)).d(f10))}, pVar, c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.internal.ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ProvideContentColorTextStyleKt.a(j, f10, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
