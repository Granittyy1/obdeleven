package p110i9;

import B8.AbstractC0641n;
import M0.e;
import M0.h;
import Q8.b;
import X5.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.media3.exoplayer.C;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.j;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.Objects;

/* JADX INFO: compiled from: BluetoothDeviceAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends c<b, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f36782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f36783e;

    /* JADX INFO: compiled from: BluetoothDeviceAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC0641n f36784b;

        public a(AbstractC0641n abstractC0641n) {
            super(abstractC0641n.f4488d);
            this.f36784b = abstractC0641n;
            abstractC0641n.f2075r.setOnClickListener(new j(2, this));
            abstractC0641n.f2076s.setOnClickListener(new com.voltasit.obdeleven.presentation.dialogs.bonus.b(2, this));
        }
    }

    public d(MainActivity mainActivity, p pVar, C c10) {
        super(mainActivity);
        this.f36782d = pVar;
        this.f36783e = c10;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, b bVar) {
        AbstractC0641n abstractC0641n = ((a) b10).f36784b;
        abstractC0641n.t(bVar);
        abstractC0641n.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f36780b).inflate(R.layout.device_fragment_list_item, viewGroup, false);
        DataBinderMapperImpl dataBinderMapperImpl = e.f4480a;
        boolean z10 = h.f4481n;
        h hVarB = viewInflate != null ? (h) viewInflate.getTag(R.id.dataBinding) : null;
        if (hVarB == null) {
            Object tag = viewInflate.getTag();
            if (!(tag instanceof String)) {
                throw new IllegalArgumentException("View is not a binding layout");
            }
            DataBinderMapperImpl dataBinderMapperImpl2 = e.f4480a;
            int iD = dataBinderMapperImpl2.d((String) tag);
            if (iD == 0) {
                throw new IllegalArgumentException(coil.intercept.a.a(tag, "View is not a binding layout. Tag: "));
            }
            hVarB = dataBinderMapperImpl2.b(null, viewInflate, iD);
        }
        AbstractC0641n abstractC0641n = (AbstractC0641n) hVarB;
        Objects.requireNonNull(abstractC0641n);
        return new a(abstractC0641n);
    }
}
