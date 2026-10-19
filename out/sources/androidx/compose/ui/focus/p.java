package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.I;

/* JADX INFO: compiled from: FocusOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public interface p extends n {
    void a(i iVar);

    void b(FocusTargetNode focusTargetNode);

    void c();

    FocusOwnerImpl$modifier$1 d();

    Boolean e(int i10, I.f fVar, Ia.l<? super FocusTargetNode, Boolean> lVar);

    boolean f(Q.c cVar, Ia.a<Boolean> aVar);

    boolean g();

    FocusStateImpl i();

    boolean j(KeyEvent keyEvent, Ia.a<Boolean> aVar);

    B k();

    I.f l();

    boolean m(int i10, boolean z10, boolean z11);

    void n(FocusTargetNode focusTargetNode);

    boolean p(KeyEvent keyEvent);

    void q();

    FocusTargetNode r();

    I<m> s();

    boolean t();
}
