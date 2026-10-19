package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import p220r9.C2782n;

/* JADX INFO: compiled from: DialogFragmentRecyclerListBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends B {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f1628y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1629x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1628y = sparseIntArray;
        sparseIntArray.put(R.id.item_list_title, 2);
        sparseIntArray.put(R.id.list_buttons, 3);
        sparseIntArray.put(R.id.item_list_neutral, 4);
        sparseIntArray.put(R.id.item_list_positive, 5);
        sparseIntArray.put(R.id.item_list_negative, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 7, null, f1628y);
        RecyclerView recyclerView = (RecyclerView) objArrK[1];
        Button button = (Button) objArrK[6];
        Button button2 = (Button) objArrK[4];
        Button button3 = (Button) objArrK[5];
        TextView textView = (TextView) objArrK[2];
        super(dVar, view, recyclerView, button, button2, button3, textView);
        this.f1629x = -1L;
        this.f1611r.setTag(null);
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1629x;
            this.f1629x = 0L;
        }
        p110i9.c cVar = this.f1616w;
        if ((j & 3) != 0) {
            C2782n.a(this.f1611r, cVar);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1629x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1629x = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.B
    public final void t(p110i9.c cVar) {
        this.f1616w = cVar;
        synchronized (this) {
            this.f1629x |= 1;
        }
        c(6);
        n();
    }
}
