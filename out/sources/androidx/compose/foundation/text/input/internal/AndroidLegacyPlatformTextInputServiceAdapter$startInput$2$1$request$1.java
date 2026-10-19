package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.layout.InterfaceC1170p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements Ia.l<a0, p293xa.r> {
    final /* synthetic */ X.a $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(X.a aVar) {
        super(1, kotlin.jvm.internal.i.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = aVar;
    }

    @Override // Ia.l
    public final p293xa.r invoke(a0 a0Var) {
        float[] fArr = a0Var.f13538a;
        InterfaceC1170p interfaceC1170pY = this.$node.Y();
        if (interfaceC1170pY != null) {
            if (!interfaceC1170pY.c()) {
                interfaceC1170pY = null;
            }
            if (interfaceC1170pY != null) {
                interfaceC1170pY.G(fArr);
            }
        }
        return p293xa.r.f47939a;
    }
}
