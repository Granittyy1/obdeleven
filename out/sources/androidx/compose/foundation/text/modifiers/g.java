package androidx.compose.foundation.text.modifiers;

import Ia.l;
import androidx.compose.ui.graphics.L;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.InterfaceC1193n;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.F;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p293xa.r;

/* JADX INFO: compiled from: SelectableTextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1187h implements InterfaceC1198t, InterfaceC1191l, InterfaceC1193n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SelectionController f11478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l<? super TextAnnotatedStringNode.a, r> f11479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextAnnotatedStringNode f11480t;

    public g() {
        throw null;
    }

    public g(C1260a c1260a, F f10, androidx.compose.ui.text.font.d.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, SelectionController selectionController, L l10) {
        this.f11478r = selectionController;
        this.f11479s = null;
        TextAnnotatedStringNode textAnnotatedStringNode = new TextAnnotatedStringNode(c1260a, f10, aVar, lVar, i10, z10, i11, i12, list, lVar2, selectionController, l10, null);
        Q1(textAnnotatedStringNode);
        this.f11480t = textAnnotatedStringNode;
        if (this.f11478r != null) {
            return;
        }
        p245u.c.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(H h8, D d10, long j) {
        return this.f11480t.B(h8, d10, j);
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f11480t.c(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f11480t.o(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f11480t.q(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return this.f11480t.r(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1193n
    public final void w1(NodeCoordinator nodeCoordinator) {
        SelectionController selectionController = this.f11478r;
        if (selectionController != null) {
            selectionController.f11376e = j.a(selectionController.f11376e, nodeCoordinator, null, 2);
            selectionController.f11374c.c();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) throws Throwable {
        this.f11480t.x(c1202x);
    }
}
