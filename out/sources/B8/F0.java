package B8;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel;

/* JADX INFO: compiled from: FragmentVehicleBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F0 extends D0 implements N8.b.a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final SparseIntArray f1660U;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final N8.b f1661I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final N8.b f1662J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final N8.b f1663K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final N8.b f1664L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final N8.b f1665M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final N8.b f1666N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final N8.b f1667O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final N8.b f1668P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final N8.b f1669Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final N8.b f1670R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final N8.b f1671S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f1672T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1660U = sparseIntArray;
        sparseIntArray.put(R.id.photoContainer, 16);
        sparseIntArray.put(R.id.contentLayout, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 18, null, f1660U);
        Button button = (Button) objArrK[8];
        Button button2 = (Button) objArrK[13];
        ImageView imageView = (ImageView) objArrK[4];
        Button button3 = (Button) objArrK[11];
        LinearLayout linearLayout = (LinearLayout) objArrK[17];
        Button button4 = (Button) objArrK[12];
        TextView textView = (TextView) objArrK[5];
        FloatingActionButton floatingActionButton = (FloatingActionButton) objArrK[15];
        Button button5 = (Button) objArrK[14];
        Button button6 = (Button) objArrK[9];
        Button button7 = (Button) objArrK[7];
        ShapeableImageView shapeableImageView = (ShapeableImageView) objArrK[1];
        Button button8 = (Button) objArrK[6];
        Button button9 = (Button) objArrK[10];
        TextView textView2 = (TextView) objArrK[2];
        super(dVar, view, button, button2, imageView, button3, linearLayout, button4, textView, floatingActionButton, button5, button6, button7, shapeableImageView, button8, button9, textView2, (TextView) objArrK[3]);
        this.f1672T = -1L;
        this.f1648r.setTag(null);
        this.f1649s.setTag(null);
        this.f1650t.setTag(null);
        this.f1651u.setTag(null);
        this.f1653w.setTag(null);
        this.f1654x.setTag(null);
        this.f1655y.setTag(null);
        this.f1656z.setTag(null);
        this.f1640A.setTag(null);
        this.f1641B.setTag(null);
        this.f1642C.setTag(null);
        this.f1643D.setTag(null);
        this.f1644E.setTag(null);
        ((FrameLayout) objArrK[0]).setTag(null);
        this.f1645F.setTag(null);
        this.f1646G.setTag(null);
        r(view);
        this.f1661I = new N8.b(this, 3);
        this.f1662J = new N8.b(this, 11);
        this.f1663K = new N8.b(this, 7);
        this.f1664L = new N8.b(this, 6);
        this.f1665M = new N8.b(this, 8);
        this.f1666N = new N8.b(this, 1);
        this.f1667O = new N8.b(this, 9);
        this.f1668P = new N8.b(this, 4);
        this.f1669Q = new N8.b(this, 2);
        this.f1670R = new N8.b(this, 10);
        this.f1671S = new N8.b(this, 5);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        p255u9.E e10;
        switch (i10) {
            case 1:
                VehicleViewModel vehicleViewModel = this.f1647H;
                if (vehicleViewModel != null) {
                    vehicleViewModel.f33411i0.j(vehicleViewModel.f33423y);
                }
                break;
            case 2:
                VehicleViewModel vehicleViewModel2 = this.f1647H;
                if (vehicleViewModel2 != null) {
                    vehicleViewModel2.f33391O.j(vehicleViewModel2.f33423y);
                }
                break;
            case 3:
                VehicleViewModel vehicleViewModel3 = this.f1647H;
                if (vehicleViewModel3 != null) {
                    vehicleViewModel3.f33416r.G();
                    vehicleViewModel3.f33393Q.j(vehicleViewModel3.f33423y);
                }
                break;
            case 4:
                VehicleViewModel vehicleViewModel4 = this.f1647H;
                if (vehicleViewModel4 != null) {
                    vehicleViewModel4.f33395S.j(vehicleViewModel4.f33423y);
                }
                break;
            case 5:
                VehicleViewModel vehicleViewModel5 = this.f1647H;
                if (vehicleViewModel5 != null) {
                    vehicleViewModel5.f33397U.j(vehicleViewModel5.f33423y);
                }
                break;
            case 6:
                VehicleViewModel vehicleViewModel6 = this.f1647H;
                if (vehicleViewModel6 != null) {
                    vehicleViewModel6.f33399W.j(vehicleViewModel6.f33423y);
                }
                break;
            case 7:
                VehicleViewModel vehicleViewModel7 = this.f1647H;
                if (vehicleViewModel7 != null) {
                    vehicleViewModel7.f33401Y.j(vehicleViewModel7.f33423y);
                }
                break;
            case 8:
                VehicleViewModel vehicleViewModel8 = this.f1647H;
                if (vehicleViewModel8 != null) {
                    vehicleViewModel8.f33403a0.j(vehicleViewModel8.f33423y);
                }
                break;
            case 9:
                VehicleViewModel vehicleViewModel9 = this.f1647H;
                if (vehicleViewModel9 != null) {
                    vehicleViewModel9.f33407e0.j(vehicleViewModel9.f33423y);
                }
                break;
            case 10:
                VehicleViewModel vehicleViewModel10 = this.f1647H;
                if (vehicleViewModel10 != null && (e10 = vehicleViewModel10.f33423y) != null) {
                    String str = "";
                    if (e10.i() != null) {
                        p255u9.D dI = e10.i();
                        kotlin.jvm.internal.i.b(dI);
                        String string = dI.getString("forum");
                        if (string != null) {
                            str = string;
                        }
                    }
                    if (str.length() <= 0) {
                        vehicleViewModel10.f33387K.j(vehicleViewModel10.f33415q.a(R.string.snackbar_forum_not_available, new Object[0]));
                    } else {
                        vehicleViewModel10.f33405c0.j(str);
                    }
                    break;
                }
                break;
            case 11:
                VehicleViewModel vehicleViewModel11 = this.f1647H;
                if (vehicleViewModel11 != null) {
                    vehicleViewModel11.f33377A.j(Boolean.FALSE);
                    vehicleViewModel11.f33389M.j(Boolean.TRUE);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        String str;
        String str2;
        boolean zP;
        String str3;
        boolean zP2;
        boolean zP3;
        String str4;
        boolean zP4;
        long j10;
        String str5;
        String str6;
        String str7;
        String str8;
        synchronized (this) {
            j = this.f1672T;
            this.f1672T = 0L;
        }
        VehicleViewModel vehicleViewModel = this.f1647H;
        if ((511 & j) != 0) {
            if ((j & 385) == 0) {
                str5 = null;
            } else {
                androidx.lifecycle.B b10 = vehicleViewModel != null ? vehicleViewModel.f33420v : null;
                s(0, b10);
                if (b10 != null) {
                    str5 = (String) b10.d();
                } else {
                    str5 = null;
                }
            }
            if ((j & 386) == 0) {
                str6 = null;
                str7 = null;
            } else {
                androidx.lifecycle.C c10 = vehicleViewModel != null ? vehicleViewModel.f33419u : null;
                s(1, c10);
                G8.H h8 = c10 != null ? (G8.H) c10.d() : null;
                if (h8 != null) {
                    str7 = h8.f3431e;
                    str6 = h8.f3432f;
                } else {
                    str6 = null;
                    str7 = null;
                }
            }
            if ((j & 388) != 0) {
                androidx.lifecycle.C c11 = vehicleViewModel != null ? vehicleViewModel.f33382F : null;
                s(2, c11);
                zP2 = M0.h.p(c11 != null ? (Boolean) c11.d() : null);
            } else {
                zP2 = false;
            }
            if ((j & 392) != 0) {
                androidx.lifecycle.C c12 = vehicleViewModel != null ? vehicleViewModel.f33380D : null;
                s(3, c12);
                zP3 = M0.h.p(c12 != null ? (Boolean) c12.d() : null);
            } else {
                zP3 = false;
            }
            if ((j & 400) == 0) {
                str8 = null;
            } else {
                androidx.lifecycle.C c13 = vehicleViewModel != null ? vehicleViewModel.f33422x : null;
                s(4, c13);
                if (c13 != null) {
                    str8 = (String) c13.d();
                } else {
                    str8 = null;
                }
            }
            if ((j & 416) != 0) {
                androidx.lifecycle.C c14 = vehicleViewModel != null ? vehicleViewModel.f33378B : null;
                s(5, c14);
                zP4 = M0.h.p(c14 != null ? (Boolean) c14.d() : null);
            } else {
                zP4 = false;
            }
            if ((j & 448) != 0) {
                androidx.lifecycle.C c15 = vehicleViewModel != null ? vehicleViewModel.f33384H : null;
                s(6, c15);
                j10 = 448;
                String str9 = str6;
                zP = M0.h.p(c15 != null ? (Boolean) c15.d() : null);
                str = str9;
                String str10 = str8;
                str4 = str5;
                str2 = str7;
                str3 = str10;
            } else {
                str = str6;
                zP = false;
                j10 = 448;
                String str11 = str8;
                str4 = str5;
                str2 = str7;
                str3 = str11;
            }
        } else {
            str = null;
            str2 = null;
            zP = false;
            str3 = null;
            zP2 = false;
            zP3 = false;
            str4 = null;
            zP4 = false;
            j10 = 448;
        }
        if ((j10 & j) != 0) {
            N0.d.a(this.f1648r, this.f1668P, zP);
            N0.d.a(this.f1649s, this.f1667O, zP);
            N0.d.a(this.f1651u, this.f1663K, zP);
            N0.d.a(this.f1653w, this.f1665M, zP);
            N0.d.a(this.f1656z, this.f1670R, zP);
            N0.d.a(this.f1640A, this.f1671S, zP);
            N0.d.a(this.f1641B, this.f1661I, zP);
            N0.d.a(this.f1643D, this.f1669Q, zP);
            N0.d.a(this.f1644E, this.f1664L, zP);
        }
        if ((256 & j) != 0) {
            this.f1650t.setOnClickListener(this.f1666N);
            this.f1655y.setOnClickListener(this.f1662J);
        }
        if ((388 & j) != 0) {
            W8.d.f(this.f1650t, zP2);
        }
        if ((400 & j) != 0) {
            N0.c.a(this.f1654x, str3);
        }
        if ((392 & j) != 0) {
            W8.d.f(this.f1654x, zP3);
        }
        if ((416 & j) != 0) {
            W8.d.f(this.f1655y, zP4);
        }
        if ((j & 386) != 0) {
            ShapeableImageView shapeableImageView = this.f1642C;
            Drawable drawableE = com.voltasit.obdeleven.domain.usecases.device.v.e(shapeableImageView.getContext(), R.drawable.vehicle_default);
            if (str != null && !kotlin.text.n.S(str)) {
                com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.d(shapeableImageView).m(str);
                T3.d dVarJ = ((T3.d) E0.a(R.drawable.vehicle_default)).f(R.drawable.vehicle_default).j(R.drawable.vehicle_default);
                kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
                dVarM.a(dVarJ).x(shapeableImageView);
            } else if (drawableE != null) {
                shapeableImageView.setImageDrawable(drawableE);
            }
            N0.c.a(this.f1646G, str2);
        }
        if ((j & 385) != 0) {
            N0.c.a(this.f1645F, str4);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1672T != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1672T = 256L;
        }
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
                    this.f1672T |= 1;
                    break;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1672T |= 2;
                    break;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1672T |= 4;
                    break;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1672T |= 8;
                    break;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1672T |= 16;
                    break;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1672T |= 32;
                    break;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1672T |= 64;
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // B8.D0
    public final void t(VehicleViewModel vehicleViewModel) {
        this.f1647H = vehicleViewModel;
        synchronized (this) {
            this.f1672T |= 128;
        }
        c(32);
        n();
    }
}
