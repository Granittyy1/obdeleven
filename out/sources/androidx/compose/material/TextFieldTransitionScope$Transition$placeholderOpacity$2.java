package androidx.compose.material;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.c0;
import androidx.compose.runtime.InterfaceC1084f;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends Lambda implements Ia.q<Transition.b<InputPhase>, InterfaceC1084f, Integer, InterfaceC0923x<Float>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 f11855h = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    public TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    @Override // Ia.q
    public final InterfaceC0923x<Float> invoke(Transition.b<InputPhase> bVar, InterfaceC1084f interfaceC1084f, Integer num) {
        InterfaceC0923x<Float> c0Var;
        Transition.b<InputPhase> bVar2 = bVar;
        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
        num.intValue();
        interfaceC1084f2.L(-1079955085);
        InputPhase inputPhase = InputPhase.f11758b;
        InputPhase inputPhase2 = InputPhase.f11759c;
        if (bVar2.d(inputPhase, inputPhase2)) {
            c0Var = C0907g.d(67, 0, C0922w.f9638d, 2);
        } else {
            c0Var = (bVar2.d(inputPhase2, inputPhase) || bVar2.d(InputPhase.f11760d, inputPhase2)) ? new c0(83, 67, C0922w.f9638d) : C0907g.c(0.0f, 0.0f, null, 7);
        }
        interfaceC1084f2.D();
        return c0Var;
    }
}
