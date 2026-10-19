package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, Ia.l<? super U, p293xa.r> lVar) {
        return hVar.i(new BlockGraphicsLayerElement(lVar));
    }

    public static androidx.compose.ui.h b(androidx.compose.ui.h hVar, float f10, float f11, float f12, float f13, float f14, l0 l0Var, boolean z10, int i10) {
        float f15 = (i10 & 1) != 0 ? 1.0f : f10;
        float f16 = (i10 & 2) != 0 ? 1.0f : f11;
        float f17 = (i10 & 4) != 0 ? 1.0f : f12;
        float f18 = (i10 & 32) != 0 ? 0.0f : f13;
        float f19 = (i10 & 256) != 0 ? 0.0f : f14;
        long j = q0.f13791b;
        l0 l0Var2 = (i10 & 2048) != 0 ? h0.f13629a : l0Var;
        boolean z11 = (i10 & 4096) != 0 ? false : z10;
        long j10 = V.f13531a;
        return hVar.i(new GraphicsLayerElement(f15, f16, f17, 0.0f, 0.0f, f18, 0.0f, 0.0f, f19, 8.0f, j, l0Var2, z11, j10, j10, 0));
    }
}
