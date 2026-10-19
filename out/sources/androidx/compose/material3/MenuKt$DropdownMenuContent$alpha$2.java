package androidx.compose.material3;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.InterfaceC1084f;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$alpha$2 extends Lambda implements Ia.q<Transition.b<Boolean>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MenuKt$DropdownMenuContent$alpha$2 f12217h = new MenuKt$DropdownMenuContent$alpha$2();

    public MenuKt$DropdownMenuContent$alpha$2() {
        super(3);
    }

    @Override // Ia.q
    public final InterfaceC0923x<Float> invoke(Transition.b<Boolean> bVar, InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        num.intValue();
        interfaceC1084f2.L(-1355418157);
        androidx.compose.animation.core.c0 c0VarD = bVar.d(Boolean.FALSE, Boolean.TRUE) ? C0907g.d(30, 0, null, 6) : C0907g.d(75, 0, null, 6);
        interfaceC1084f2.D();
        return c0VarD;
    }
}
