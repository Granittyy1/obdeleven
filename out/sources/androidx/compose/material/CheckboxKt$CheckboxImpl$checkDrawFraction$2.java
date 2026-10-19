package androidx.compose.material;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$checkDrawFraction$2 extends Lambda implements Ia.q<Transition.b<ToggleableState>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$2 f11692h = new CheckboxKt$CheckboxImpl$checkDrawFraction$2();

    public CheckboxKt$CheckboxImpl$checkDrawFraction$2() {
        super(3);
    }

    @Override // Ia.q
    public final InterfaceC0923x<Float> invoke(Transition.b<ToggleableState> bVar, InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC0923x<Float> n10;
        Transition.b<ToggleableState> bVar2 = bVar;
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        num.intValue();
        interfaceC1084f2.L(-1707702900);
        ToggleableState toggleableStateC = bVar2.c();
        ToggleableState toggleableState = ToggleableState.f15274c;
        if (toggleableStateC == toggleableState) {
            n10 = C0907g.d(100, 0, null, 6);
        } else {
            n10 = bVar2.h() == toggleableState ? new androidx.compose.animation.core.N<>(100) : C0907g.c(0.0f, 0.0f, null, 7);
        }
        interfaceC1084f2.D();
        return n10;
    }
}
