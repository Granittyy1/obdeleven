package io.intercom.android.sdk.m5.conversation.utils;

import android.view.View;
import androidx.compose.foundation.layout.c0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import p013b0.c;

/* JADX INFO: compiled from: KeyboardState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class KeyboardStateKt {
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    public static final N0<KeyboardState> keyboardAsState(InterfaceC1084f interfaceC1084f, int i10) {
        boolean z10;
        interfaceC1084f.L(-1867236611);
        interfaceC1084f.L(-137398301);
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = J0.f(null);
            interfaceC1084f.E(objF);
        }
        X x10 = (X) objF;
        interfaceC1084f.D();
        c cVar = (c) interfaceC1084f.x(CompositionLocalsKt.f14847h);
        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
        int i11 = c0.a.c(interfaceC1084f).f10257c.e().f46854d;
        int i12 = c0.a.c(interfaceC1084f).f10257c.e().f46854d - c0.a.c(interfaceC1084f).f10259e.e().f46854d;
        int i13 = i12 < 0 ? 0 : i12;
        boolean z11 = i11 > 0;
        boolean zA = i.a(c0.a.c(interfaceC1084f).f10271r, c0.a.c(interfaceC1084f).f10270q);
        boolean z12 = !zA;
        float fT0 = cVar.T0(2);
        if (z11) {
            if (!zA) {
                KeyboardState keyboardStateKeyboardAsState$lambda$1 = keyboardAsState$lambda$1(x10);
                if ((keyboardStateKeyboardAsState$lambda$1 != null ? keyboardStateKeyboardAsState$lambda$1.getBottomDiff() : 0) - i11 >= fT0) {
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        KeyboardState keyboardState = new KeyboardState(z12, i11, z11, z10, i13);
        x10.setValue(keyboardState);
        X xI = J0.i(keyboardState, interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    private static final KeyboardState keyboardAsState$lambda$1(X<KeyboardState> x10) {
        return x10.getValue();
    }
}
