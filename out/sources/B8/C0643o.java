package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceFragmentListItemBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0643o extends AbstractC0641n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f2084x;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f2085u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f2086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2087w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2084x = sparseIntArray;
        sparseIntArray.put(R.id.deviceFragmentListItem_rename, 3);
        sparseIntArray.put(R.id.deviceFragmentListItem_delete, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0643o(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 5, null, f2084x);
        super(dVar, view, (ImageView) objArrK[4], (ImageView) objArrK[3]);
        this.f2087w = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        TextView textView = (TextView) objArrK[1];
        this.f2085u = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrK[2];
        this.f2086v = textView2;
        textView2.setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        long j;
        String str;
        int i10;
        synchronized (this) {
            j = this.f2087w;
            this.f2087w = 0L;
        }
        Q8.b bVar = this.f2077t;
        long j10 = j & 3;
        String strB = null;
        if (j10 != 0) {
            if (bVar != null) {
                strB = bVar.f5127b;
                i10 = bVar.f5130e;
                str = bVar.f5128c;
            } else {
                i10 = 0;
                str = null;
            }
            strB = androidx.compose.ui.text.font.s.b(i10 + ". ", strB);
        } else {
            str = null;
        }
        if (j10 != 0) {
            N0.c.a(this.f2085u, strB);
            N0.c.a(this.f2086v, str);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2087w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2087w = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.AbstractC0641n
    public final void t(Q8.b bVar) {
        this.f2077t = bVar;
        synchronized (this) {
            this.f2087w |= 1;
        }
        c(11);
        n();
    }
}
