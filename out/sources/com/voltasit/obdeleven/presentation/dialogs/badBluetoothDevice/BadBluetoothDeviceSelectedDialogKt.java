package com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice;

import Ia.a;
import Ia.p;
import L4.b;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: BadBluetoothDeviceSelectedDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BadBluetoothDeviceSelectedDialogKt {
    public static final void a(final a<r> onOk, final a<r> onCancel, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(onOk, "onOk");
        i.e(onCancel, "onCancel");
        C1086g c1086gP = interfaceC1084f.p(1019896077);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onOk) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onCancel) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.L(803040521);
            boolean z10 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new a<r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.BadBluetoothDeviceSelectedDialogKt$BadBluetoothDeviceSelectedDialog$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCancel.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            AndroidAlertDialog_androidKt.a((a) objF, androidx.compose.runtime.internal.a.b(-1623841339, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.BadBluetoothDeviceSelectedDialogKt$BadBluetoothDeviceSelectedDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        interfaceC1084f3.L(718863849);
                        boolean zK = interfaceC1084f3.K(onOk);
                        final a<r> aVar = onOk;
                        Object objF2 = interfaceC1084f3.f();
                        if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                            objF2 = new a<r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.BadBluetoothDeviceSelectedDialogKt$BadBluetoothDeviceSelectedDialog$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    aVar.invoke();
                                    return r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF2);
                        }
                        interfaceC1084f3.D();
                        ButtonKt.b((a) objF2, null, null, ComposableSingletons$BadBluetoothDeviceSelectedDialogKt.f32191a, interfaceC1084f3, 805306368, 510);
                    }
                    return r.f47939a;
                }
            }, c1086gP), null, null, null, ComposableSingletons$BadBluetoothDeviceSelectedDialogKt.f32192b, null, 0L, 0L, null, c1086gP, 196656, 988);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.dialogs.badBluetoothDevice.BadBluetoothDeviceSelectedDialogKt$BadBluetoothDeviceSelectedDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    BadBluetoothDeviceSelectedDialogKt.a(onOk, onCancel, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
