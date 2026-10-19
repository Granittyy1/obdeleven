package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEventPass;

/* JADX INFO: compiled from: PointerInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Y extends InterfaceC1184e {
    default long Q() {
        int i10 = d0.f14580b;
        return d0.f14579a;
    }

    default boolean l1() {
        return false;
    }

    void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j);

    default void r1() {
        u0();
    }

    void u0();

    default void w() {
        u0();
    }

    default void G0() {
    }
}
