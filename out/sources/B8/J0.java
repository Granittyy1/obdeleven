package B8;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC1376t;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FragmentVehicleInfoBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends I0 {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final M0.h.d f1730L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final SparseIntArray f1731M;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f1732K;

    static {
        M0.h.d dVar = new M0.h.d(35);
        f1730L = dVar;
        dVar.a(1, new String[]{"item_labeled_button", "item_labeled_button", "item_labeled_button"}, new int[]{5, 6, 7}, new int[]{R.layout.item_labeled_button, R.layout.item_labeled_button, R.layout.item_labeled_button});
        dVar.a(2, new String[]{"item_labeled_button", "item_labeled_button", "item_labeled_button", "item_labeled_button"}, new int[]{8, 9, 10, 11}, new int[]{R.layout.item_labeled_button, R.layout.item_labeled_button, R.layout.item_labeled_button, R.layout.item_labeled_button});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1731M = sparseIntArray;
        sparseIntArray.put(R.id.vehicleInfoFragment_mileage, 3);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineRemark, 4);
        sparseIntArray.put(R.id.vehicleInfoFragment_container, 12);
        sparseIntArray.put(R.id.vehicleInfoFragment_name, 13);
        sparseIntArray.put(R.id.vehicleInfoFragment_changeName, 14);
        sparseIntArray.put(R.id.vehicleInfoFragment_vinDivider, 15);
        sparseIntArray.put(R.id.vehicleInfoFragment_yearDivider, 16);
        sparseIntArray.put(R.id.vehicleInfoFragment_bodyDivider, 17);
        sparseIntArray.put(R.id.vehicleInfoFragment_engine, 18);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineSearchLayout, 19);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineSearchTextInputLayout, 20);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineInput, 21);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineSearch, 22);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineCodeDivider, 23);
        sparseIntArray.put(R.id.vehicleInfoFragment_enginePowerDivider, 24);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineVolumeDivider, 25);
        sparseIntArray.put(R.id.vehicleInfoFragment_engineCylindersDivider, 26);
        sparseIntArray.put(R.id.vehicleInfoFragment_equipment, 27);
        sparseIntArray.put(R.id.vehicleInfoFragment_equipmentSearchTextInputLayout, 28);
        sparseIntArray.put(R.id.vehicleInfoFragment_equipmentInput, 29);
        sparseIntArray.put(R.id.vehicleInfoFragment_equipmentSearch, 30);
        sparseIntArray.put(R.id.vehicleInfoFragment_equipmentInfoLayout, 31);
        sparseIntArray.put(R.id.vehicleInfoFragment_imageFrame, 32);
        sparseIntArray.put(R.id.vehicleInfoFragment_image, 33);
        sparseIntArray.put(R.id.vehicleInfoFragment_changeImage, 34);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1732K = 0L;
        }
        this.f1712G.e();
        this.f1714I.e();
        this.f1716r.e();
        this.f1720v.e();
        this.f1706A.e();
        this.f1709D.e();
        this.f1722x.e();
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                if (this.f1732K != 0) {
                    return true;
                }
                return this.f1712G.g() || this.f1714I.g() || this.f1716r.g() || this.f1720v.g() || this.f1706A.g() || this.f1709D.g() || this.f1722x.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1732K = 256L;
        }
        this.f1712G.i();
        this.f1714I.i();
        this.f1716r.i();
        this.f1720v.i();
        this.f1706A.i();
        this.f1709D.i();
        this.f1722x.i();
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        switch (i10) {
            case 0:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 1;
                    break;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 2;
                    break;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 4;
                    break;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 8;
                    break;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 16;
                    break;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 32;
                    break;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1732K |= 64;
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // M0.h
    public final void q(InterfaceC1376t interfaceC1376t) {
        super.q(interfaceC1376t);
        this.f1712G.q(interfaceC1376t);
        this.f1714I.q(interfaceC1376t);
        this.f1716r.q(interfaceC1376t);
        this.f1720v.q(interfaceC1376t);
        this.f1706A.q(interfaceC1376t);
        this.f1709D.q(interfaceC1376t);
        this.f1722x.q(interfaceC1376t);
    }
}
