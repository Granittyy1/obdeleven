package androidx.compose.foundation.text;

import android.view.KeyEvent;

/* JADX INFO: renamed from: androidx.compose.foundation.text.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KeyMapping.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0998g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11251a = new a();

    /* JADX INFO: renamed from: androidx.compose.foundation.text.g$a */
    /* JADX INFO: compiled from: KeyMapping.android.kt */
    public static final class a implements InterfaceC0997f {
        @Override // androidx.compose.foundation.text.InterfaceC0997f
        public final KeyCommand b(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long jA = O.h.a(keyEvent.getKeyCode());
                if (O.b.a(jA, n.f11500i)) {
                    keyCommand = KeyCommand.f11141P;
                } else if (O.b.a(jA, n.j)) {
                    keyCommand = KeyCommand.f11142Q;
                } else if (O.b.a(jA, n.f11501k)) {
                    keyCommand = KeyCommand.f11133H;
                } else if (O.b.a(jA, n.f11502l)) {
                    keyCommand = KeyCommand.f11134I;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA2 = O.h.a(keyEvent.getKeyCode());
                if (O.b.a(jA2, n.f11500i)) {
                    keyCommand = KeyCommand.j;
                } else if (O.b.a(jA2, n.j)) {
                    keyCommand = KeyCommand.f11157k;
                } else if (O.b.a(jA2, n.f11501k)) {
                    keyCommand = KeyCommand.f11162p;
                } else if (O.b.a(jA2, n.f11502l)) {
                    keyCommand = KeyCommand.f11163q;
                }
            }
            return keyCommand == null ? KeyMappingKt.f11173a.b(keyEvent) : keyCommand;
        }
    }
}
