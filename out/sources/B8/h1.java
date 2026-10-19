package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemLabeledCheckboxBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends g1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f1953w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1954v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1953w = sparseIntArray;
        sparseIntArray.put(R.id.itemLabeledCheckbox_label, 1);
        sparseIntArray.put(R.id.itemLabeledCheckbox_value, 2);
        sparseIntArray.put(R.id.itemLabeledCheckbox_checkbox, 3);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1954v = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1954v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1954v = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
