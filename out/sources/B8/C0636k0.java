package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1376t;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.profile.ProfileViewModel;

/* JADX INFO: renamed from: B8.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentProfileBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0636k0 extends AbstractC0634j0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final M0.h.d f1989H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final SparseIntArray f1990I;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f1991G;

    static {
        M0.h.d dVar = new M0.h.d(16);
        f1989H = dVar;
        dVar.a(2, new String[]{"item_labeled_button", "item_labeled_button", "item_labeled_button"}, new int[]{3, 4, 5}, new int[]{R.layout.item_labeled_button, R.layout.item_labeled_button, R.layout.item_labeled_button});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1990I = sparseIntArray;
        sparseIntArray.put(R.id.profileFragment_name, 6);
        sparseIntArray.put(R.id.personalInformation, 7);
        sparseIntArray.put(R.id.profileFragment_userStatistics, 8);
        sparseIntArray.put(R.id.subscriptionButtonsContainer, 9);
        sparseIntArray.put(R.id.profileFragment_getCredits, 10);
        sparseIntArray.put(R.id.profileFragment_logout, 11);
        sparseIntArray.put(R.id.profileFragment_deleteAccount, 12);
        sparseIntArray.put(R.id.profileFragment_imageLayout, 13);
        sparseIntArray.put(R.id.profileFragment_image, 14);
        sparseIntArray.put(R.id.profileFragment_editUser, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0636k0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 16, f1989H, f1990I);
        AbstractC0620c1 abstractC0620c1 = (AbstractC0620c1) objArrK[4];
        Button button = (Button) objArrK[7];
        LinearLayout linearLayout = (LinearLayout) objArrK[2];
        Button button2 = (Button) objArrK[12];
        ImageButton imageButton = (ImageButton) objArrK[15];
        Button button3 = (Button) objArrK[10];
        ShapeableImageView shapeableImageView = (ShapeableImageView) objArrK[14];
        super(dVar, view, abstractC0620c1, button, linearLayout, button2, imageButton, button3, shapeableImageView, (Button) objArrK[11], (TextView) objArrK[6], (Button) objArrK[8], (LinearLayout) objArrK[9], (AbstractC0620c1) objArrK[3], (TextView) objArrK[1], (AbstractC0620c1) objArrK[5]);
        this.f1991G = -1L;
        AbstractC0620c1 abstractC0620c2 = this.f1977r;
        if (abstractC0620c2 != null) {
            abstractC0620c2.j = this;
        }
        ((RelativeLayout) objArrK[0]).setTag(null);
        this.f1979t.setTag(null);
        AbstractC0620c1 abstractC0620c3 = this.f1973C;
        if (abstractC0620c3 != null) {
            abstractC0620c3.j = this;
        }
        this.f1974D.setTag(null);
        AbstractC0620c1 abstractC0620c4 = this.f1975E;
        if (abstractC0620c4 != null) {
            abstractC0620c4.j = this;
        }
        r(view);
        i();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        String str;
        synchronized (this) {
            j = this.f1991G;
            this.f1991G = 0L;
        }
        ProfileViewModel profileViewModel = this.f1976F;
        String str2 = null;
        boolean zP = false;
        if ((116 & j) != 0) {
            if ((j & 100) == 0) {
                str = null;
            } else {
                androidx.lifecycle.C c10 = profileViewModel != null ? profileViewModel.f32842O : null;
                s(2, c10);
                if (c10 != null) {
                    str = (String) c10.d();
                } else {
                    str = null;
                }
            }
            if ((j & 112) != 0) {
                androidx.lifecycle.C<Boolean> c11 = profileViewModel != null ? profileViewModel.f32840M : null;
                s(4, c11);
                zP = M0.h.p(c11 != null ? c11.d() : null);
            }
            str2 = str;
        }
        if ((j & 112) != 0) {
            W8.d.f(this.f1973C.f4488d, zP);
        }
        if ((j & 100) != 0) {
            N0.c.a(this.f1974D, str2);
        }
        this.f1973C.e();
        this.f1977r.e();
        this.f1975E.e();
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                if (this.f1991G != 0) {
                    return true;
                }
                return this.f1973C.g() || this.f1977r.g() || this.f1975E.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1991G = 64L;
        }
        this.f1973C.i();
        this.f1977r.i();
        this.f1975E.i();
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        if (i10 == 0) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1991G |= 1;
            }
            return true;
        }
        if (i10 == 1) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1991G |= 2;
            }
            return true;
        }
        if (i10 == 2) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1991G |= 4;
            }
            return true;
        }
        if (i10 == 3) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1991G |= 8;
            }
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f1991G |= 16;
        }
        return true;
    }

    @Override // M0.h
    public final void q(InterfaceC1376t interfaceC1376t) {
        super.q(interfaceC1376t);
        this.f1973C.q(interfaceC1376t);
        this.f1977r.q(interfaceC1376t);
        this.f1975E.q(interfaceC1376t);
    }

    @Override // B8.AbstractC0634j0
    public final void t(ProfileViewModel profileViewModel) {
        this.f1976F = profileViewModel;
        synchronized (this) {
            this.f1991G |= 32;
        }
        c(20);
        n();
    }
}
