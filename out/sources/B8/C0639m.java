package B8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.presentation.devices.DeviceFragment;
import p220r9.C2782n;

/* JADX INFO: renamed from: B8.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0639m extends AbstractC0637l implements N8.b.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Switch f2040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final N8.a f2041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final N8.b f2042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2043z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0639m(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 4, null, null);
        super(dVar, view, (FloatingActionButton) objArrK[3], (RecyclerView) objArrK[2]);
        this.f2043z = -1L;
        this.f1996r.setTag(null);
        this.f1997s.setTag(null);
        ((FrameLayout) objArrK[0]).setTag(null);
        Switch r10 = (Switch) objArrK[1];
        this.f2040w = r10;
        r10.setTag(null);
        r(view);
        this.f2041x = new N8.a(this);
        this.f2042y = new N8.b(this, 2);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) throws Exception {
        DeviceFragment deviceFragment = this.f1999u;
        if (deviceFragment != null) {
            deviceFragment.O();
        }
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f2043z;
            this.f2043z = 0L;
        }
        p110i9.d dVar = this.f1998t;
        com.voltasit.obdeleven.a aVar = this.f2000v;
        long j10 = 9 & j;
        long j11 = 10 & j;
        boolean zB = (j11 == 0 || aVar == null) ? false : aVar.b("key_ask_which_device_to_choose", true);
        if ((j & 8) != 0) {
            this.f1996r.setOnClickListener(this.f2042y);
            this.f2040w.setOnCheckedChangeListener(this.f2041x);
        }
        if (j10 != 0) {
            C2782n.a(this.f1997s, dVar);
        }
        if (j11 != 0) {
            Switch r10 = this.f2040w;
            if (r10.isChecked() != zB) {
                r10.setChecked(zB);
            }
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2043z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2043z = 8L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.AbstractC0637l
    public final void t(p110i9.d dVar) {
        this.f1998t = dVar;
        synchronized (this) {
            this.f2043z |= 1;
        }
        c(13);
        n();
    }

    @Override // B8.AbstractC0637l
    public final void u(com.voltasit.obdeleven.a aVar) {
        this.f2000v = aVar;
        synchronized (this) {
            this.f2043z |= 2;
        }
        c(21);
        n();
    }

    @Override // B8.AbstractC0637l
    public final void v(DeviceFragment deviceFragment) {
        this.f1999u = deviceFragment;
        synchronized (this) {
            this.f2043z |= 4;
        }
        c(33);
        n();
    }
}
