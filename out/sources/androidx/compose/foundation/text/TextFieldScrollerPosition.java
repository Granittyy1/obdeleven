package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.Q0;
import java.util.List;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W.f f11225g = androidx.compose.runtime.saveable.a.a(new Ia.p<androidx.compose.runtime.saveable.j, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.p
        public final List<? extends Object> invoke(androidx.compose.runtime.saveable.j jVar, TextFieldScrollerPosition textFieldScrollerPosition) {
            TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
            return kotlin.collections.l.s(Float.valueOf(textFieldScrollerPosition2.f11226a.j()), Boolean.valueOf(((Orientation) textFieldScrollerPosition2.f11231f.getValue()) == Orientation.f9957b));
        }
    }, new Ia.l<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // Ia.l
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            Object obj = list2.get(1);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.f9957b : Orientation.f9958c;
            Object obj2 = list2.get(0);
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1079c0 f11226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1079c0 f11227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1081d0 f11228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I.f f11229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f11231f;

    public TextFieldScrollerPosition(Orientation orientation, float f10) {
        this.f11226a = new C1079c0(f10);
        this.f11227b = new C1079c0(0.0f);
        this.f11228c = new C1081d0(0);
        this.f11229d = I.f.f3756e;
        this.f11230e = androidx.compose.ui.text.E.f15314b;
        this.f11231f = new C1085f0(orientation, Q0.f12888a);
    }

    public final void a(Orientation orientation, I.f fVar, int i10, int i11) {
        float f10;
        float f11 = i11 - i10;
        this.f11227b.f(f11);
        I.f fVar2 = this.f11229d;
        float f12 = fVar2.f3757a;
        float f13 = fVar.f3757a;
        C1079c0 c1079c0 = this.f11226a;
        float f14 = fVar.f3758b;
        if (f13 != f12 || f14 != fVar2.f3758b) {
            boolean z10 = orientation == Orientation.f9957b;
            if (z10) {
                f13 = f14;
            }
            float f15 = z10 ? fVar.f3760d : fVar.f3759c;
            float fJ = c1079c0.j();
            float f16 = i10;
            float f17 = fJ + f16;
            if (f15 <= f17 && (f13 >= fJ || f15 - f13 <= f16)) {
                f10 = (f13 >= fJ || f15 - f13 > f16) ? 0.0f : f13 - fJ;
            } else {
                f10 = f15 - f17;
            }
            c1079c0.f(c1079c0.j() + f10);
            this.f11229d = fVar;
        }
        c1079c0.f(Na.l.C(c1079c0.j(), 0.0f, f11));
        this.f11228c.m(i10);
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation) {
        this(orientation, 0.0f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.f9957b);
    }
}
