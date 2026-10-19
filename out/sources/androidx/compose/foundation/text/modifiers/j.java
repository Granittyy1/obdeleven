package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.B;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f11489c = new j(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1170p f11490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f11491b;

    public j(InterfaceC1170p interfaceC1170p, B b10) {
        this.f11490a = interfaceC1170p;
        this.f11491b = b10;
    }

    public static j a(j jVar, NodeCoordinator nodeCoordinator, B b10, int i10) {
        InterfaceC1170p interfaceC1170p = nodeCoordinator;
        if ((i10 & 1) != 0) {
            interfaceC1170p = jVar.f11490a;
        }
        if ((i10 & 2) != 0) {
            b10 = jVar.f11491b;
        }
        jVar.getClass();
        return new j(interfaceC1170p, b10);
    }
}
