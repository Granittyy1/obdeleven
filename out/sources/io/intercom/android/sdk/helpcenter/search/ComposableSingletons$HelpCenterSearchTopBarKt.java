package io.intercom.android.sdk.helpcenter.search;

import Ia.p;
import S4.o;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.collections.EmptyList;
import p293xa.r;

/* JADX INFO: compiled from: HelpCenterSearchTopBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterSearchTopBarKt {
    public static final ComposableSingletons$HelpCenterSearchTopBarKt INSTANCE = new ComposableSingletons$HelpCenterSearchTopBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f6lambda1 = new ComposableLambdaImpl(false, -456122237, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            String strP = o.p(interfaceC1084f, R.string.intercom_search_for_help);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TextKt.b(strP, null, intercomTheme.getColors(interfaceC1084f, i11).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i11).getType04(), interfaceC1084f, 0, 0, 65530);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f7lambda2 = new ComposableLambdaImpl(false, 338459337, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                IconKt.b(p306z.d.a(), o.p(interfaceC1084f, R.string.intercom_clear), null, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m644getPrimaryIcon0d7_KjU(), interfaceC1084f, 0, 4);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f8lambda3 = new ComposableLambdaImpl(false, 1584761703, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-3$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.graphics.vector.c cVarB = p295y.a.f48012a;
            if (cVarB == null) {
                androidx.compose.ui.graphics.vector.c.a aVar = new androidx.compose.ui.graphics.vector.c.a("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                m0 m0Var = new m0(H.f13495b);
                androidx.compose.ui.graphics.vector.d dVar = new androidx.compose.ui.graphics.vector.d();
                dVar.h(20.0f, 11.0f);
                dVar.d(7.83f);
                dVar.g(5.59f, -5.59f);
                dVar.f(12.0f, 4.0f);
                dVar.g(-8.0f, 8.0f);
                dVar.g(8.0f, 8.0f);
                dVar.g(1.41f, -1.41f);
                dVar.f(7.83f, 13.0f);
                dVar.d(20.0f);
                dVar.l(-2.0f);
                dVar.a();
                androidx.compose.ui.graphics.vector.c.a.a(aVar, dVar.f13897a, m0Var);
                cVarB = aVar.b();
                p295y.a.f48012a = cVarB;
            }
            IconKt.b(cVarB, o.p(interfaceC1084f, R.string.intercom_navigation_back), null, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m644getPrimaryIcon0d7_KjU(), interfaceC1084f, 0, 4);
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m55getLambda1$intercom_sdk_base_release() {
        return f6lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m56getLambda2$intercom_sdk_base_release() {
        return f7lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m57getLambda3$intercom_sdk_base_release() {
        return f8lambda3;
    }
}
