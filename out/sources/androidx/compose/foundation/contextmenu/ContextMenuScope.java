package androidx.compose.foundation.contextmenu;

import Ia.p;
import Ia.q;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextMenuScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnapshotStateList<q<a, InterfaceC1084f, Integer, r>> f9865a = new SnapshotStateList<>();

    public static void b(ContextMenuScope contextMenuScope, final ContextMenu_androidKt$TextItem$1 contextMenu_androidKt$TextItem$1, final Ia.a aVar) {
        final androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
        contextMenuScope.getClass();
        final boolean z10 = true;
        final q qVar = null;
        contextMenuScope.f9865a.add(new ComposableLambdaImpl(true, 262103052, new q<a, InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // Ia.q
            public final r invoke(a aVar3, InterfaceC1084f interfaceC1084f, Integer num) {
                a aVar4 = aVar3;
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                int iIntValue = num.intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= interfaceC1084f2.K(aVar4) ? 4 : 2;
                }
                if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String strInvoke = contextMenu_androidKt$TextItem$1.invoke(interfaceC1084f2, 0);
                    if (n.S(strInvoke)) {
                        p245u.c.c("Label must not be blank");
                    }
                    ContextMenuUi_androidKt.b(strInvoke, z10, aVar4, aVar2, qVar, aVar, interfaceC1084f2, (iIntValue << 6) & 896, 0);
                } else {
                    interfaceC1084f2.w();
                }
                return r.f47939a;
            }
        }));
    }

    public final void a(final a aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(1320309496);
        int i11 = (i10 & 6) == 0 ? (c1086gP.K(aVar) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(this) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            SnapshotStateList<q<a, InterfaceC1084f, Integer, r>> snapshotStateList = this.f9865a;
            int size = snapshotStateList.size();
            for (int i12 = 0; i12 < size; i12++) {
                snapshotStateList.get(i12).invoke(aVar, c1086gP, Integer.valueOf(i11 & 14));
            }
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.a(aVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
