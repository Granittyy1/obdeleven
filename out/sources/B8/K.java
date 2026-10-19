package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: DialogSimpleBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class K extends J {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f1733x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1734w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1733x = sparseIntArray;
        sparseIntArray.put(R.id.dialog_simple_title, 1);
        sparseIntArray.put(R.id.dialog_simple_content, 2);
        sparseIntArray.put(R.id.list_buttons, 3);
        sparseIntArray.put(R.id.simple_button_positive, 4);
        sparseIntArray.put(R.id.simple_button_negative, 5);
        sparseIntArray.put(R.id.simple_button_neutral, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public K(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 7, null, f1733x);
        TextView textView = (TextView) objArrK[2];
        TextView textView2 = (TextView) objArrK[1];
        super(dVar, view, textView, textView2, (Button) objArrK[5], (Button) objArrK[6], (Button) objArrK[4]);
        this.f1734w = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1734w = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1734w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1734w = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
