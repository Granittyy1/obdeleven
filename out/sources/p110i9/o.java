package p110i9;

import B8.q1;
import O.e;
import Q8.b;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.twofactorauth.verify.c;

/* JADX INFO: compiled from: NearbyBluetoothDeviceAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends c<b, a> {

    /* JADX INFO: compiled from: NearbyBluetoothDeviceAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q1 f36819b;

        public a(q1 q1Var) {
            super(q1Var.f4488d);
            q1Var.f4488d.setOnClickListener(new c(3, this));
            this.f36819b = q1Var;
        }
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, b bVar) {
        a aVar = (a) b10;
        b bVar2 = bVar;
        q1 q1Var = aVar.f36819b;
        q1Var.t(bVar2);
        boolean z10 = bVar2.f5132g;
        ImageView imageView = q1Var.f2107t;
        o oVar = o.this;
        String str = bVar2.f5128c;
        if (z10) {
            e.s(str, "isReachable");
            imageView.setImageDrawable(oVar.f36780b.getResources().getDrawable(R.drawable.ic_bluetooth_blue));
        } else {
            e.s(str, "notReachable");
            Drawable drawable = oVar.f36780b.getResources().getDrawable(R.drawable.ic_bluetooth);
            p234t0.a.C0532a.g(drawable, p0.a.b.a(oVar.f36780b, R.color.black));
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((q1) M0.e.a(LayoutInflater.from(this.f36780b), R.layout.list_device_name, viewGroup, false, null));
    }
}
