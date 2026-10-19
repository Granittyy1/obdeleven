package androidx.compose.animation;

import android.view.ViewConfiguration;
import androidx.compose.animation.core.C0919t;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9264a = ViewConfiguration.getScrollFriction();

    public static final InterfaceC0918s a(InterfaceC1084f interfaceC1084f) {
        p013b0.c cVar = (p013b0.c) interfaceC1084f.x(CompositionLocalsKt.f14847h);
        boolean zG = interfaceC1084f.g(cVar.getDensity());
        Object objF = interfaceC1084f.f();
        if (zG || objF == InterfaceC1084f.a.f12980a) {
            objF = new C0919t(new B(cVar));
            interfaceC1084f.E(objF);
        }
        return (InterfaceC0918s) objF;
    }
}
