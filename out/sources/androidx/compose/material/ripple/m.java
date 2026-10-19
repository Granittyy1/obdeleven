package androidx.compose.material.ripple;

import androidx.compose.foundation.w;
import androidx.compose.runtime.X;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public abstract class m implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateLayer f12015c;

    public m(final X x10, boolean z10) {
        this.f12014b = z10;
        this.f12015c = new StateLayer(z10, new Ia.a<f>() { // from class: androidx.compose.material.ripple.RippleIndicationInstance$stateLayer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final f invoke() {
                return x10.getValue();
            }
        });
    }

    public abstract void e(androidx.compose.foundation.interaction.m.b bVar);

    public abstract void f();
}
