package com.voltasit.obdeleven.presentation.dialogs.checkNetwork;

import Ia.p;
import S4.o;
import U.a;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.h;
import androidx.compose.ui.text.font.l;
import com.voltasit.obdeleven.R;
import java.util.Locale;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: CheckNetworkDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$CheckNetworkDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f32231a = new ComposableLambdaImpl(false, -2038529503, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.ComposableSingletons$CheckNetworkDialogKt$lambda-1$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                String upperCase = o.p(interfaceC1084f2, R.string.common_try_again).toUpperCase(Locale.ROOT);
                i.d(upperCase, "toUpperCase(...)");
                TextKt.b(upperCase, PaddingKt.g(8, 10, h.a.f13984b), a.a(interfaceC1084f2, R.color.grey_l), 0L, null, l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 196656, 0, 131032);
            }
            return r.f47939a;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComposableLambdaImpl f32232b = new ComposableLambdaImpl(false, 61208927, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.ComposableSingletons$CheckNetworkDialogKt$lambda-2$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                String upperCase = o.p(interfaceC1084f2, R.string.common_cancel).toUpperCase(Locale.ROOT);
                i.d(upperCase, "toUpperCase(...)");
                TextKt.b(upperCase, PaddingKt.g(8, 10, h.a.f13984b), a.a(interfaceC1084f2, R.color.grey_l), 0L, null, l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 196656, 0, 131032);
            }
            return r.f47939a;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ComposableLambdaImpl f32233c = new ComposableLambdaImpl(false, 851701933, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.ComposableSingletons$CheckNetworkDialogKt$lambda-3$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                TextKt.b(o.p(interfaceC1084f2, R.string.common_connection_failed), null, 0L, G0.a.g(22), null, l.f15441f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 199680, 0, 131030);
            }
            return r.f47939a;
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ComposableLambdaImpl f32234d = new ComposableLambdaImpl(false, 1901571148, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.checkNetwork.ComposableSingletons$CheckNetworkDialogKt$lambda-4$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                TextKt.b(o.p(interfaceC1084f2, R.string.common_check_network_connection), null, 0L, G0.a.g(16), null, l.f15441f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 199680, 0, 131030);
            }
            return r.f47939a;
        }
    });
}
