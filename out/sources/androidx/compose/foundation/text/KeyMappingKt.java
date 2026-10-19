package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: classes.dex */
public final class KeyMappingKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11173a = new a(new J.b(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
        {
            Object obj = CallableReference.NO_RECEIVER;
        }

        @Override // kotlin.jvm.internal.PropertyReference1Impl, Oa.j
        public final Object get(Object obj) {
            return Boolean.valueOf(((O.c) obj).f4721a.isCtrlPressed());
        }
    }));

    /* JADX INFO: compiled from: KeyMapping.kt */
    public static final class a implements InterfaceC0997f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J.b f11174b;

        public a(J.b bVar) {
            this.f11174b = bVar;
        }

        @Override // androidx.compose.foundation.text.InterfaceC0997f
        public final KeyCommand b(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jA = O.h.a(keyEvent.getKeyCode());
                if (O.b.a(jA, n.f11500i)) {
                    keyCommand = KeyCommand.f11135J;
                } else if (O.b.a(jA, n.j)) {
                    keyCommand = KeyCommand.f11136K;
                } else if (O.b.a(jA, n.f11501k)) {
                    keyCommand = KeyCommand.f11138M;
                } else if (O.b.a(jA, n.f11502l)) {
                    keyCommand = KeyCommand.f11137L;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jA2 = O.h.a(keyEvent.getKeyCode());
                if (O.b.a(jA2, n.f11500i)) {
                    keyCommand = KeyCommand.f11152e;
                } else if (O.b.a(jA2, n.j)) {
                    keyCommand = KeyCommand.f11151d;
                } else if (O.b.a(jA2, n.f11501k)) {
                    keyCommand = KeyCommand.f11154g;
                } else if (O.b.a(jA2, n.f11502l)) {
                    keyCommand = KeyCommand.f11153f;
                } else if (O.b.a(jA2, n.f11494c)) {
                    keyCommand = KeyCommand.f11167u;
                } else if (O.b.a(jA2, n.f11511u)) {
                    keyCommand = KeyCommand.f11170x;
                } else if (O.b.a(jA2, n.f11510t)) {
                    keyCommand = KeyCommand.f11169w;
                } else if (O.b.a(jA2, n.f11499h)) {
                    keyCommand = KeyCommand.f11143R;
                }
            } else if (keyEvent.isShiftPressed()) {
                long jA3 = O.h.a(keyEvent.getKeyCode());
                if (O.b.a(jA3, n.f11505o)) {
                    keyCommand = KeyCommand.f11139N;
                } else if (O.b.a(jA3, n.f11506p)) {
                    keyCommand = KeyCommand.f11140O;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA4 = O.h.a(keyEvent.getKeyCode());
                if (O.b.a(jA4, n.f11510t)) {
                    keyCommand = KeyCommand.f11171y;
                } else if (O.b.a(jA4, n.f11511u)) {
                    keyCommand = KeyCommand.f11172z;
                }
            }
            return keyCommand == null ? this.f11174b.b(keyEvent) : keyCommand;
        }
    }
}
