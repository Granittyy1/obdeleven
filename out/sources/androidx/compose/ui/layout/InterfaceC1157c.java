package androidx.compose.ui.layout;

import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.layout.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1157c extends InterfaceC1198t {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$a */
    /* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
    public static final class a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$b */
    /* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
    public static final class b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
    public static final class C0158c {
        public C0158c() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.c$d */
    /* JADX INFO: compiled from: ApproachLayoutModifierNode.kt */
    public static final class d {
        public d() {
        }
    }

    default int F0(InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        NodeCoordinator nodeCoordinator = getNode().f13992i;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        androidx.compose.ui.node.D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.E0() ? NodeMeasuringIntrinsics.c(new C0158c(), interfaceC1156b, interfaceC1166l, i10) : interfaceC1166l.k0(i10);
    }

    default int h0(InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        NodeCoordinator nodeCoordinator = getNode().f13992i;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        androidx.compose.ui.node.D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.E0() ? NodeMeasuringIntrinsics.b(new b(), interfaceC1156b, interfaceC1166l, i10) : interfaceC1166l.J(i10);
    }

    default int j0(InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        NodeCoordinator nodeCoordinator = getNode().f13992i;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        androidx.compose.ui.node.D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.E0() ? NodeMeasuringIntrinsics.a(new a(), interfaceC1156b, interfaceC1166l, i10) : interfaceC1166l.s(i10);
    }

    F p0();

    default int q1(InterfaceC1156b interfaceC1156b, InterfaceC1166l interfaceC1166l, int i10) {
        NodeCoordinator nodeCoordinator = getNode().f13992i;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        androidx.compose.ui.node.D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.E0() ? NodeMeasuringIntrinsics.d(new d(), interfaceC1156b, interfaceC1166l, i10) : interfaceC1166l.I(i10);
    }

    boolean t0();
}
