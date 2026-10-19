package com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice;

import Ia.p;
import Ia.q;
import S4.o;
import U.a;
import androidx.compose.foundation.layout.U;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.text.font.l;
import com.voltasit.obdeleven.R;
import java.util.Locale;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: BadBluetoothDeviceSelectedDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BadBluetoothDeviceSelectedDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f32191a = new ComposableLambdaImpl(false, -1134112728, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.ComposableSingletons$BadBluetoothDeviceSelectedDialogKt$lambda-1$1
        @Override // Ia.q
        public final r invoke(U u10, InterfaceC1084f interfaceC1084f, Integer num) {
            U TextButton = u10;
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            int iIntValue = num.intValue();
            i.e(TextButton, "$this$TextButton");
            if ((iIntValue & 81) == 16 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                String upperCase = o.p(interfaceC1084f2, R.string.common_ok).toUpperCase(Locale.ROOT);
                i.d(upperCase, "toUpperCase(...)");
                TextKt.b(upperCase, null, a.a(interfaceC1084f2, R.color.grey_l), 0L, null, l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 196608, 0, 131034);
            }
            return r.f47939a;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComposableLambdaImpl f32192b = new ComposableLambdaImpl(false, -1477340351, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.ComposableSingletons$BadBluetoothDeviceSelectedDialogKt$lambda-2$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                TextKt.b(o.p(interfaceC1084f2, R.string.common_bad_bluetooth_device_selected), null, 0L, G0.a.g(16), null, l.f15441f, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 199680, 0, 131030);
            }
            return r.f47939a;
        }
    });
}
