package p033c7;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.c;
import java.util.ArrayList;
import p128k2.j;

/* JADX INFO: renamed from: c7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC1498k implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22466b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22467c;

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[LOOP:3: B:31:0x0092->B:33:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f22466b) {
            case 0:
                ((C1501n.c) this.f22467c).getClass();
                throw null;
            default:
                j jVar = (j) this.f22467c;
                ViewGroup viewGroup2 = jVar.f41503f;
                if (viewGroup2 == null || (viewGroup = jVar.f41504g) == null) {
                    return;
                }
                c cVar = jVar.f41498a;
                int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
                while (true) {
                    if (viewGroup.getChildCount() <= 1) {
                        View view = jVar.f41507k;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        int iC = j.c(jVar.f41506i);
                        int childCount = viewGroup2.getChildCount() - 1;
                        for (int i10 = 0; i10 < childCount; i10++) {
                            iC += j.c(viewGroup2.getChildAt(i10));
                        }
                        if (iC <= width) {
                            ViewGroup viewGroup3 = jVar.f41505h;
                            if (viewGroup3 == null || viewGroup3.getVisibility() != 0) {
                                return;
                            }
                            ValueAnimator valueAnimator = jVar.f41514r;
                            if (valueAnimator.isStarted()) {
                                return;
                            }
                            jVar.f41513q.cancel();
                            valueAnimator.start();
                            return;
                        }
                        if (view != null) {
                            view.setVisibility(0);
                            iC += j.c(view);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup2.getChildAt(i11);
                            iC -= j.c(childAt);
                            arrayList.add(childAt);
                            if (iC <= width) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                viewGroup2.removeViews(0, arrayList.size());
                                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                    viewGroup.addView((View) arrayList.get(i12), viewGroup.getChildCount() - 1);
                                }
                                return;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            viewGroup2.removeViews(0, arrayList.size());
                            while (i12 < arrayList.size()) {
                                viewGroup.addView((View) arrayList.get(i12), viewGroup.getChildCount() - 1);
                            }
                            return;
                        }
                        return;
                    }
                    int childCount2 = viewGroup.getChildCount() - 2;
                    View childAt2 = viewGroup.getChildAt(childCount2);
                    viewGroup.removeViewAt(childCount2);
                    viewGroup2.addView(childAt2, 0);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1498k(j jVar) {
        this.f22467c = jVar;
    }
}
