package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1154e f14092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14094d;

    public j() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public j(List<q> list, C1154e c1154e) {
        this.f14091a = list;
        this.f14092b = c1154e;
        MotionEvent motionEventA = a();
        int i10 = 0;
        this.f14093c = motionEventA != null ? motionEventA.getButtonState() : 0;
        MotionEvent motionEventA2 = a();
        if (motionEventA2 != null) {
            motionEventA2.getMetaState();
        }
        MotionEvent motionEventA3 = a();
        int i11 = 1;
        if (motionEventA3 != null) {
            int actionMasked = motionEventA3.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else if (actionMasked == 1) {
                i10 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i10 = 1;
                        break;
                    case 6:
                        i10 = 2;
                        break;
                    case 7:
                        i10 = 3;
                        break;
                    case 8:
                        i10 = 6;
                        break;
                    case 9:
                        i10 = 4;
                        break;
                    case 10:
                        i10 = 5;
                        break;
                }
            } else {
                i10 = 3;
            }
            i11 = i10;
        } else {
            int size = list.size();
            while (i10 < size) {
                q qVar = list.get(i10);
                if (I.b.e(qVar)) {
                    i11 = 2;
                } else if (!I.b.c(qVar)) {
                    i10++;
                }
            }
            i11 = 3;
        }
        this.f14094d = i11;
    }

    public final MotionEvent a() {
        C1154e c1154e = this.f14092b;
        if (c1154e != null) {
            return (MotionEvent) c1154e.f14074b.f14119b;
        }
        return null;
    }
}
