package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SelectionContainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SelectionContainerKt {
    public static final void a(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(336063542);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c1086gP.C(i11 & 1, (i11 & 3) != 2)) {
            CompositionLocalKt.a(SelectionRegistrarKt.f11549a.b(null), pVar, c1086gP, ((i11 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SelectionContainerKt.a(pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
