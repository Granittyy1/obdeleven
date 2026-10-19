package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.layout.U;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.T;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HelpCenterTopBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterTopBarKt {
    public static final void HelpCenterTopBar(final Ia.a<p293xa.r> onBackClick, final Ia.a<p293xa.r> onSearchClick, int i10, StringProvider stringProvider, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        int i14;
        StringProvider stringRes;
        C1086g c1086g;
        final int i15;
        final StringProvider stringProvider2;
        kotlin.jvm.internal.i.e(onBackClick, "onBackClick");
        kotlin.jvm.internal.i.e(onSearchClick, "onSearchClick");
        C1086g c1086gP = interfaceC1084f.p(644687815);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.k(onBackClick) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.k(onSearchClick) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                i14 = i10;
                int i16 = c1086gP.h(i14) ? 256 : 128;
                i13 |= i16;
            } else {
                i14 = i10;
            }
            i13 |= i16;
        } else {
            i14 = i10;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                stringRes = stringProvider;
                int i17 = c1086gP.K(stringRes) ? 2048 : 1024;
                i13 |= i17;
            } else {
                stringRes = stringProvider;
            }
            i13 |= i17;
        } else {
            stringRes = stringProvider;
        }
        if ((i13 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
            stringProvider2 = stringRes;
            i15 = i14;
        } else {
            c1086gP.r0();
            if ((i11 & 1) == 0 || c1086gP.a0()) {
                if ((i12 & 4) != 0) {
                    i14 = io.intercom.android.sdk.R.drawable.intercom_back;
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    stringRes = new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_get_help, null, 2, null);
                    i13 &= -7169;
                }
            } else {
                c1086gP.w();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
            }
            int i18 = i14;
            StringProvider stringProvider3 = stringRes;
            c1086gP.U();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i19 = IntercomTheme.$stable;
            long jM635getHeader0d7_KjU = intercomTheme.getColors(c1086gP, i19).m635getHeader0d7_KjU();
            final long jM642getOnHeader0d7_KjU = intercomTheme.getColors(c1086gP, i19).m642getOnHeader0d7_KjU();
            c1086g = c1086gP;
            TopActionBarKt.m130TopActionBarNpQZenA(null, stringProvider3.getText(c1086gP, StringProvider.$stable | ((i13 >> 9) & 14)), null, null, null, onBackClick, Integer.valueOf(i18), false, jM635getHeader0d7_KjU, jM642getOnHeader0d7_KjU, 0L, null, androidx.compose.runtime.internal.a.b(736282477, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U TopActionBar, InterfaceC1084f interfaceC1084f2, int i20) {
                    kotlin.jvm.internal.i.e(TopActionBar, "$this$TopActionBar");
                    if ((i20 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar = onSearchClick;
                    final long j = jM642getOnHeader0d7_KjU;
                    IconButtonKt.b(aVar, null, false, null, null, androidx.compose.runtime.internal.a.b(739646154, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar.1.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i21) {
                            if ((i21 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                IconKt.b(p306z.i.a(), S4.o.p(interfaceC1084f3, io.intercom.android.sdk.R.string.intercom_search_help_articles), null, j, interfaceC1084f3, 0, 4);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                }
            }, c1086gP), c1086g, ((i13 << 15) & 458752) | ((i13 << 12) & 3670016), 384, 3229);
            i15 = i18;
            stringProvider2 = stringProvider3;
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterTopBarKt.HelpCenterTopBar$lambda$0(onBackClick, onSearchClick, i15, stringProvider2, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterTopBar$lambda$0(Ia.a onBackClick, Ia.a onSearchClick, int i10, StringProvider stringProvider, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(onBackClick, "$onBackClick");
        kotlin.jvm.internal.i.e(onSearchClick, "$onSearchClick");
        HelpCenterTopBar(onBackClick, onSearchClick, i10, stringProvider, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void HelpCenterTopBarPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-536592516);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterTopBarKt.INSTANCE.m285getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterTopBarPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HelpCenterTopBarPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
