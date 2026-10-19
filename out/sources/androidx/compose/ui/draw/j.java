package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static androidx.compose.ui.h a(androidx.compose.ui.h hVar, Painter painter, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, I i10, int i11) {
        if ((i11 & 4) != 0) {
            dVar = androidx.compose.ui.d.a.f13339e;
        }
        androidx.compose.ui.d dVar2 = dVar;
        if ((i11 & 16) != 0) {
            f10 = 1.0f;
        }
        return hVar.i(new PainterElement(painter, true, dVar2, interfaceC1161g, f10, i10));
    }
}
