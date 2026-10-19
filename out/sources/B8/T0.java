package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemBitCheckboxBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class T0 extends S0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f1809t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1810s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1809t = sparseIntArray;
        sparseIntArray.put(R.id.eeprom_check_box, 1);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1810s = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1810s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1810s = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
