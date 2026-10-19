package B8;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C1362e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.components.coverLayout.MainCoverLayout;
import com.voltasit.obdeleven.presentation.components.progressWheel.ProgressWheel;
import com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.main.MainViewModel;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.presentation.models.UserInteractionState;
import com.voltasit.obdeleven.utils.NavigationManager;
import p134k8.a2;

/* JADX INFO: renamed from: B8.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentMainBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0632i0 extends AbstractC0630h0 implements N8.b.a, N8.d.a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final SparseIntArray f1957Q;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final N8.c f1958J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final N8.b f1959K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final N8.b f1960L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final N8.d f1961M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final N8.b f1962N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final N8.b f1963O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f1964P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1957Q = sparseIntArray;
        sparseIntArray.put(R.id.faultLayout, 16);
        sparseIntArray.put(R.id.dtcStatusBar, 17);
        sparseIntArray.put(R.id.cuNameLayout, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0632i0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 19, null, f1957Q);
        ImageView imageView = (ImageView) objArrK[6];
        ImageView imageView2 = (ImageView) objArrK[7];
        LinearLayout linearLayout = (LinearLayout) objArrK[4];
        ImageView imageView3 = (ImageView) objArrK[5];
        ImageView imageView4 = (ImageView) objArrK[9];
        ImageView imageView5 = (ImageView) objArrK[8];
        ImageView imageView6 = (ImageView) objArrK[10];
        MainCoverLayout mainCoverLayout = (MainCoverLayout) objArrK[1];
        TextView textView = (TextView) objArrK[2];
        ProgressBar progressBar = (ProgressBar) objArrK[17];
        FloatingActionButton floatingActionButton = (FloatingActionButton) objArrK[15];
        super(dVar, view, imageView, imageView2, linearLayout, imageView3, imageView4, imageView5, imageView6, mainCoverLayout, textView, progressBar, floatingActionButton, (RecyclerView) objArrK[3], (ProgressWheel) objArrK[12], (TextView) objArrK[13], (TextView) objArrK[14], (SwipeRefreshLayout) objArrK[0], (TextView) objArrK[11]);
        this.f1964P = -1L;
        this.f1944r.setTag(null);
        this.f1945s.setTag(null);
        this.f1946t.setTag(null);
        this.f1947u.setTag(null);
        this.f1948v.setTag(null);
        this.f1949w.setTag(null);
        this.f1950x.setTag(null);
        this.f1951y.setTag(null);
        this.f1952z.setTag(null);
        this.f1936B.setTag(null);
        this.f1937C.setTag(null);
        this.f1938D.setTag(null);
        this.f1939E.setTag(null);
        this.f1940F.setTag(null);
        this.f1941G.setTag(null);
        this.f1942H.setTag(null);
        r(view);
        this.f1958J = new N8.c(this);
        this.f1959K = new N8.b(this, 6);
        this.f1960L = new N8.b(this, 2);
        this.f1961M = new N8.d(this);
        this.f1962N = new N8.b(this, 3);
        this.f1963O = new N8.b(this, 4);
        i();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // N8.b.a
    public final void a(int i10) {
        MainViewModel mainViewModel;
        p279w9.a aVar = p279w9.a.f47808e;
        if (i10 == 2) {
            MainViewModel mainViewModel2 = this.f1943I;
            if (mainViewModel2 != null) {
                p255u9.E e10 = (p255u9.E) Application.f29634b.e(aVar);
                J8.x xVar = mainViewModel2.f32605t;
                boolean zB = xVar.b();
                NavigationManager navigationManager = mainViewModel2.f32597p;
                if (zB) {
                    a2 a2VarK = xVar.k();
                    p195p9.b bVar = new p195p9.b();
                    p255u9.E e11 = a2VarK.f42726c;
                    kotlin.jvm.internal.i.d(e11, "getParseObject(...)");
                    bVar.R(e11, false, false);
                    navigationManager.n(bVar, null);
                    return;
                }
                boolean z10 = mainViewModel2.f32603s.z();
                K8.o oVar = mainViewModel2.f32601r;
                if (!z10) {
                    navigationManager.m(oVar.H());
                    return;
                }
                if (e10 == null || oVar.a0() == StartView.GARAGE) {
                    navigationManager.n(new GarageFragment(), null);
                    return;
                }
                p195p9.c cVar = new p195p9.c();
                cVar.R(e10, true, false);
                navigationManager.n(cVar, null);
                return;
            }
            return;
        }
        if (i10 == 3) {
            MainViewModel mainViewModel3 = this.f1943I;
            if (mainViewModel3 != null) {
                mainViewModel3.f32534E0.j(Boolean.TRUE);
                return;
            }
            return;
        }
        if (i10 == 4) {
            MainViewModel mainViewModel4 = this.f1943I;
            if (mainViewModel4 != null) {
                mainViewModel4.b();
                return;
            }
            return;
        }
        if (i10 == 6 && (mainViewModel = this.f1943I) != null) {
            if (mainViewModel.f32547L) {
                mainViewModel.f32545K = true;
                mainViewModel.f32608u0.j(U8.c.a(mainViewModel.c(), mainViewModel.f32595o.a(R.string.common_cancelling, new Object[0]), 0, null, false, null, 62));
                return;
            }
            p255u9.E e12 = (p255u9.E) Application.f29634b.e(aVar);
            if (mainViewModel.f32605t.b()) {
                mainViewModel.g();
                return;
            }
            if (e12 != null) {
                OfflineControlUnitListFragment offlineControlUnitListFragment = new OfflineControlUnitListFragment();
                String objectId = e12.getObjectId();
                kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
                Bundle bundle = new Bundle();
                bundle.putString("vehicleId", objectId);
                offlineControlUnitListFragment.setArguments(bundle);
                mainViewModel.f32597p.n(offlineControlUnitListFragment, null);
            }
        }
    }

    @Override // N8.d.a
    public final void b() {
        MainViewModel mainViewModel = this.f1943I;
        if (mainViewModel != null) {
            mainViewModel.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        int iO;
        int iO2;
        int i10;
        int iO3;
        boolean z10;
        boolean z11;
        boolean zP;
        int iO4;
        boolean zP2;
        boolean z12;
        boolean zP3;
        boolean zP4;
        boolean z13;
        boolean z14;
        boolean zP5;
        boolean zP6;
        int iO5;
        synchronized (this) {
            j = this.f1964P;
            this.f1964P = 0L;
        }
        MainViewModel mainViewModel = this.f1943I;
        if ((1048575 & j) != 0) {
            if ((j & 786433) != 0) {
                C1362e c1362e = mainViewModel != null ? mainViewModel.f32526A0 : null;
                s(0, c1362e);
                zP = M0.h.p(c1362e != null ? (Boolean) c1362e.d() : null);
                z11 = !zP;
            } else {
                zP = false;
                z11 = false;
            }
            if ((j & 786434) == 0) {
                str4 = null;
            } else {
                androidx.lifecycle.B b10 = mainViewModel != null ? mainViewModel.f32557Q : null;
                s(1, b10);
                if (b10 != null) {
                    str4 = (String) b10.d();
                } else {
                    str4 = null;
                }
            }
            if ((j & 786436) != 0) {
                androidx.lifecycle.C c10 = mainViewModel != null ? mainViewModel.f32563T : null;
                s(2, c10);
                zP3 = M0.h.p(c10 != null ? (Boolean) c10.d() : null);
            } else {
                zP3 = false;
            }
            if ((j & 786440) == 0) {
                str2 = null;
            } else {
                androidx.lifecycle.C c11 = mainViewModel != null ? mainViewModel.f32594n0 : null;
                s(3, c11);
                if (c11 != null) {
                    str2 = (String) c11.d();
                } else {
                    str2 = null;
                }
            }
            if ((j & 786448) != 0) {
                androidx.lifecycle.C c12 = mainViewModel != null ? mainViewModel.f32583d0 : null;
                s(4, c12);
                zP2 = M0.h.p(c12 != null ? (Boolean) c12.d() : null);
            } else {
                zP2 = false;
            }
            if ((j & 786464) == 0) {
                str3 = null;
            } else {
                androidx.lifecycle.C c13 = mainViewModel != null ? mainViewModel.f32590j0 : null;
                s(5, c13);
                if (c13 != null) {
                    str3 = (String) c13.d();
                } else {
                    str3 = null;
                }
            }
            if ((j & 786496) != 0) {
                androidx.lifecycle.C c14 = mainViewModel != null ? mainViewModel.f32571X : null;
                s(6, c14);
                zP4 = M0.h.p(c14 != null ? (Boolean) c14.d() : null);
            } else {
                zP4 = false;
            }
            if ((j & 786560) == 0) {
                str = null;
            } else {
                androidx.lifecycle.C c15 = mainViewModel != null ? mainViewModel.f32592l0 : null;
                s(7, c15);
                if (c15 != null) {
                    str = (String) c15.d();
                } else {
                    str = null;
                }
            }
            if ((j & 786688) != 0) {
                U7.a aVar = mainViewModel != null ? mainViewModel.f32556P0 : null;
                s(8, aVar);
                iO4 = M0.h.o(aVar != null ? (Integer) aVar.d() : null);
            } else {
                iO4 = 0;
            }
            if ((j & 786944) != 0) {
                U7.a aVar2 = mainViewModel != null ? mainViewModel.f32552N0 : null;
                s(9, aVar2);
                iO = M0.h.o(aVar2 != null ? (Integer) aVar2.d() : null);
            } else {
                iO = 0;
            }
            if ((j & 787456) != 0) {
                androidx.lifecycle.C c16 = mainViewModel != null ? mainViewModel.f32567V : null;
                s(10, c16);
                zP6 = M0.h.p(c16 != null ? (Boolean) c16.d() : null);
            } else {
                zP6 = false;
            }
            if ((j & 788480) != 0) {
                U7.a aVar3 = mainViewModel != null ? mainViewModel.f32568V0 : null;
                s(11, aVar3);
                iO5 = M0.h.o(aVar3 != null ? (Integer) aVar3.d() : null);
            } else {
                iO = iO;
                iO5 = 0;
            }
            if ((j & 790528) != 0) {
                androidx.lifecycle.C c17 = mainViewModel != null ? mainViewModel.f32617z0 : null;
                s(12, c17);
                z14 = !M0.h.p(c17 != null ? (Boolean) c17.d() : null);
            } else {
                iO5 = iO5;
                z14 = false;
            }
            if ((j & 794624) != 0) {
                U7.a aVar4 = mainViewModel != null ? mainViewModel.f32560R0 : null;
                s(13, aVar4);
                iO2 = M0.h.o(aVar4 != null ? (Integer) aVar4.d() : null);
            } else {
                z14 = z14;
                iO2 = 0;
            }
            if ((j & 802816) != 0) {
                U7.a aVar5 = mainViewModel != null ? mainViewModel.f32564T0 : null;
                s(14, aVar5);
                iO3 = M0.h.o(aVar5 != null ? (Integer) aVar5.d() : null);
            } else {
                iO2 = iO2;
                iO3 = 0;
            }
            if ((j & 819200) != 0) {
                androidx.lifecycle.C c18 = mainViewModel != null ? mainViewModel.f32588h0 : null;
                s(15, c18);
                zP5 = M0.h.p(c18 != null ? (Boolean) c18.d() : null);
            } else {
                iO3 = iO3;
                zP5 = false;
            }
            if ((j & 851968) != 0) {
                androidx.lifecycle.C c19 = mainViewModel != null ? mainViewModel.f32613x0 : null;
                s(16, c19);
                z10 = !M0.h.p(c19 != null ? (Boolean) c19.d() : null);
            } else {
                zP5 = zP5;
                z10 = false;
            }
            if ((j & 917504) != 0) {
                androidx.lifecycle.C c20 = mainViewModel != null ? mainViewModel.f32575Z : null;
                s(17, c20);
                z12 = (c20 != null ? (UserInteractionState) c20.d() : null) == UserInteractionState.f32649b;
            } else {
                z12 = false;
            }
            z13 = zP6;
            i10 = iO5;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            iO = 0;
            iO2 = 0;
            i10 = 0;
            iO3 = 0;
            z10 = false;
            z11 = false;
            zP = false;
            iO4 = 0;
            zP2 = false;
            z12 = false;
            zP3 = false;
            zP4 = false;
            z13 = false;
            z14 = false;
            zP5 = false;
        }
        if ((j & 786688) != 0) {
            W8.d.c(this.f1944r, iO4);
        }
        if ((j & 794624) != 0) {
            W8.d.c(this.f1945s, iO2);
        }
        if ((j & 786433) != 0) {
            W8.d.f(this.f1946t, z11);
            W8.d.f(this.f1937C, zP);
        }
        if ((j & 786944) != 0) {
            W8.d.c(this.f1947u, iO);
        }
        if ((j & 788480) != 0) {
            W8.d.c(this.f1948v, i10);
        }
        if ((802816 & j) != 0) {
            W8.d.c(this.f1949w, iO3);
        }
        if ((524288 & j) != 0) {
            this.f1950x.setOnClickListener(this.f1962N);
            this.f1951y.setOnClickListener(this.f1960L);
            this.f1936B.setOnClickListener(this.f1959K);
            this.f1938D.setOnClickListener(this.f1963O);
            this.f1938D.setOnLongClickListener(this.f1958J);
            this.f1941G.setOnRefreshListener(this.f1961M);
        }
        if ((917504 & j) != 0) {
            W8.d.e(this.f1951y, z12);
            W8.d.e(this.f1937C, z12);
            W8.d.e(this.f1938D, z12);
        }
        if ((j & 786448) != 0) {
            W8.d.f(this.f1951y, zP2);
        }
        if ((j & 786464) != 0) {
            N0.c.a(this.f1952z, str3);
        }
        if ((819200 & j) != 0) {
            FloatingActionButton floatingActionButton = this.f1936B;
            kotlin.jvm.internal.i.e(floatingActionButton, "<this>");
            if (zP5) {
                floatingActionButton.n();
            } else {
                floatingActionButton.h();
            }
        }
        if ((j & 786560) != 0) {
            N0.c.a(this.f1939E, str);
        }
        if ((851968 & j) != 0) {
            TextView textView = this.f1939E;
            kotlin.jvm.internal.i.e(textView, "<this>");
            textView.setVisibility(z10 ? 4 : 0);
        }
        if ((j & 786440) != 0) {
            N0.c.a(this.f1940F, str2);
        }
        if ((j & 790528) != 0) {
            TextView textView2 = this.f1940F;
            kotlin.jvm.internal.i.e(textView2, "<this>");
            textView2.setVisibility(z14 ? 4 : 0);
        }
        if ((j & 787456) != 0) {
            W8.d.e(this.f1941G, z13);
        }
        if ((j & 786496) != 0) {
            this.f1941G.setRefreshing(zP4);
        }
        if ((j & 786434) != 0) {
            N0.c.a(this.f1942H, str4);
        }
        if ((j & 786436) != 0) {
            W8.d.f(this.f1942H, zP3);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1964P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1964P = 524288L;
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
                    this.f1964P |= 1;
                    break;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 2;
                    break;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 4;
                    break;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 8;
                    break;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 16;
                    break;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 32;
                    break;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 64;
                    break;
                }
                return true;
            case 7:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 128;
                    break;
                }
                return true;
            case 8:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 256;
                    break;
                }
                return true;
            case 9:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 512;
                    break;
                }
                return true;
            case 10:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 1024;
                    break;
                }
                return true;
            case 11:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 2048;
                    break;
                }
                return true;
            case 12:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 4096;
                    break;
                }
                return true;
            case 13:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 8192;
                    break;
                }
                return true;
            case 14:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 16384;
                    break;
                }
                return true;
            case 15:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 32768;
                    break;
                }
                return true;
            case 16:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 65536;
                    break;
                }
                return true;
            case 17:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1964P |= 131072;
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // B8.AbstractC0630h0
    public final void t(MainViewModel mainViewModel) {
        this.f1943I = mainViewModel;
        synchronized (this) {
            this.f1964P |= 262144;
        }
        c(15);
        n();
    }
}
