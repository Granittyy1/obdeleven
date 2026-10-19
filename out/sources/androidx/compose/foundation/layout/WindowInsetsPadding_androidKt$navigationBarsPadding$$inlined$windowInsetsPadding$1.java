package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.InterfaceC1084f;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WindowInsetsPadding.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1 extends Lambda implements Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h> {
    public WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }

    @Override // Ia.q
    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        num.intValue();
        interfaceC1084f2.L(359872873);
        WeakHashMap<View, c0> weakHashMap = c0.f10254v;
        c0 c0VarC = c0.a.c(interfaceC1084f2);
        boolean zK = interfaceC1084f2.K(c0VarC);
        Object objF = interfaceC1084f2.f();
        if (zK || objF == InterfaceC1084f.a.f12980a) {
            objF = new InsetsPaddingModifier(c0VarC.f10259e);
            interfaceC1084f2.E(objF);
        }
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objF;
        interfaceC1084f2.D();
        return insetsPaddingModifier;
    }
}
