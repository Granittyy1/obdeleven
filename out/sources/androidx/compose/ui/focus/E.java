package androidx.compose.ui.focus;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f13410b = new E();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i10 = 0;
        if (D.d(focusTargetNode3) && D.d(focusTargetNode4)) {
            LayoutNode layoutNodeF = C1185f.f(focusTargetNode3);
            LayoutNode layoutNodeF2 = C1185f.f(focusTargetNode4);
            if (!kotlin.jvm.internal.i.a(layoutNodeF, layoutNodeF2)) {
                Object[] objArr = new LayoutNode[16];
                int i11 = 0;
                while (layoutNodeF != null) {
                    int i12 = i11 + 1;
                    if (objArr.length < i12) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i11 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i11 + 0);
                    }
                    objArr[0] = layoutNodeF;
                    i11++;
                    layoutNodeF = layoutNodeF.G();
                }
                Object[] objArr3 = new LayoutNode[16];
                int i13 = 0;
                while (layoutNodeF2 != null) {
                    int i14 = i13 + 1;
                    if (objArr3.length < i14) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i13 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i13 + 0);
                    }
                    objArr3[0] = layoutNodeF2;
                    i13++;
                    layoutNodeF2 = layoutNodeF2.G();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.i.a(objArr[i10], objArr3[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return kotlin.jvm.internal.i.g(((LayoutNode) objArr[i10]).H(), ((LayoutNode) objArr3[i10]).H());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (D.d(focusTargetNode3)) {
                return -1;
            }
            if (D.d(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
