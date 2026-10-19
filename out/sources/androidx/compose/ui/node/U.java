package androidx.compose.ui.node;

import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.InterfaceC1209a0;
import androidx.compose.ui.platform.InterfaceC1218f;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.platform.P0;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.platform.d1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Owner.kt */
/* JADX INFO: loaded from: classes.dex */
public interface U {

    /* JADX INFO: compiled from: Owner.kt */
    public interface a {
        void b();
    }

    static /* synthetic */ T a(U u10, Ia.p pVar, Ia.a aVar, androidx.compose.ui.graphics.layer.b bVar, boolean z10, int i10) {
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return u10.e(pVar, aVar, bVar, z10);
    }

    T e(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar, androidx.compose.ui.graphics.layer.b bVar, boolean z10);

    void f();

    void g(Ia.p pVar, ContinuationImpl continuationImpl);

    InterfaceC1218f getAccessibilityManager();

    androidx.compose.ui.autofill.e getAutofill();

    androidx.compose.ui.autofill.i getAutofillManager();

    androidx.compose.ui.autofill.k getAutofillTree();

    androidx.compose.ui.platform.Z getClipboard();

    InterfaceC1209a0 getClipboardManager();

    kotlin.coroutines.e getCoroutineContext();

    p013b0.c getDensity();

    androidx.compose.ui.draganddrop.c getDragAndDropManager();

    androidx.compose.ui.focus.p getFocusOwner();

    androidx.compose.ui.text.font.d.a getFontFamilyResolver();

    androidx.compose.ui.text.font.c.a getFontLoader();

    androidx.compose.ui.graphics.S getGraphicsContext();

    M.a getHapticFeedBack();

    N.b getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    default androidx.compose.ui.layout.Y.a getPlacementScope() {
        Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = PlaceableKt.f14205a;
        return new androidx.compose.ui.layout.V(this);
    }

    androidx.compose.ui.input.pointer.n getPointerIconService();

    androidx.compose.ui.spatial.b getRectManager();

    LayoutNode getRoot();

    androidx.compose.ui.semantics.s getSemanticsOwner();

    C1202x getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    M0 getSoftwareKeyboardController();

    androidx.compose.ui.text.input.y getTextInputService();

    P0 getTextToolbar();

    Y0 getViewConfiguration();

    d1 getWindowInfo();

    void setShowLayoutBounds(boolean z10);
}
