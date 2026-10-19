package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ShapesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f12298a = new O0(new Ia.a<c0>() { // from class: androidx.compose.material3.ShapesKt$LocalShapes$1
        @Override // Ia.a
        public final c0 invoke() {
            return new c0(0);
        }
    });

    public static final androidx.compose.ui.graphics.l0 a(ShapeKeyTokens shapeKeyTokens, InterfaceC1084f interfaceC1084f) {
        c0 c0Var = (c0) interfaceC1084f.x(f12298a);
        switch (shapeKeyTokens.ordinal()) {
            case 0:
                return c0Var.f12433e;
            case 1:
                return b(c0Var.f12433e);
            case 2:
                return c0Var.f12429a;
            case 3:
                return b(c0Var.f12429a);
            case 4:
                return p270w.g.f47680a;
            case 5:
                return c0Var.f12432d;
            case 6:
                float f10 = (float) 0.0d;
                return p270w.a.b(c0Var.f12432d, new p270w.d(f10), null, null, new p270w.d(f10), 6);
            case 7:
                return b(c0Var.f12432d);
            case 8:
                return c0Var.f12431c;
            case 9:
                return androidx.compose.ui.graphics.h0.f13629a;
            case 10:
                return c0Var.f12430b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final p270w.a b(p270w.a aVar) {
        float f10 = (float) 0.0d;
        return p270w.a.b(aVar, null, null, new p270w.d(f10), new p270w.d(f10), 3);
    }
}
