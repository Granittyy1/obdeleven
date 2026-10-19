package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;

/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusRequester {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FocusRequester f13428b = new FocusRequester();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FocusRequester f13429c = new FocusRequester();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FocusRequester f13430d = new FocusRequester();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<v> f13431a = new androidx.compose.runtime.collection.c<>(new v[16]);

    public final boolean a(Ia.l<? super FocusTargetNode, Boolean> lVar) {
        if (this == f13428b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f13429c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        androidx.compose.runtime.collection.c<v> cVar = this.f13431a;
        int i10 = cVar.f12945d;
        if (i10 == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        v[] vVarArr = cVar.f12943b;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            v vVar = vVarArr[i11];
            if (!vVar.getNode().f13997o) {
                R.a.b("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.c cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
            androidx.compose.ui.h.c cVar3 = vVar.getNode().f13990g;
            if (cVar3 == null) {
                C1185f.a(cVar2, vVar.getNode());
            } else {
                cVar2.b(cVar3);
            }
            while (true) {
                int i12 = cVar2.f12945d;
                if (i12 == 0) {
                    break;
                }
                androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar2.p(i12 - 1);
                if ((cVarB.f13988e & 1024) == 0) {
                    C1185f.a(cVar2, cVarB);
                } else {
                    while (cVarB != null) {
                        if ((cVarB.f13987d & 1024) != 0) {
                            androidx.compose.runtime.collection.c cVar4 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                                    if (focusTargetNode.R1().f13459a ? lVar.invoke(focusTargetNode).booleanValue() : F.e(focusTargetNode, 7, lVar)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if (((cVarB.f13987d & 1024) != 0) && (cVarB instanceof AbstractC1187h)) {
                                    int i13 = 0;
                                    for (androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) cVarB).f14585q; cVar5 != null; cVar5 = cVar5.f13990g) {
                                        if ((cVar5.f13987d & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                cVarB = cVar5;
                                            } else {
                                                if (cVar4 == null) {
                                                    cVar4 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    cVar4.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar4.b(cVar5);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                cVarB = C1185f.b(cVar4);
                            }
                            break;
                        }
                        cVarB = cVarB.f13990g;
                    }
                }
            }
        }
        return z10;
    }

    public final boolean b(final int i10) {
        return a(new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$requestFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.D(i10));
            }
        });
    }
}
