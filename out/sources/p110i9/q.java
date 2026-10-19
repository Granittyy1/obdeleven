package p110i9;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.B;
import com.voltasit.obdeleven.R;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: OnDemandAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q<T, VH extends RecyclerView.B> extends h<T, VH> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f36825g;

    public q(Activity activity) {
        super(activity);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.on_demand_list_preloader, (ViewGroup) null, false);
        this.f36825g = viewInflate;
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h(viewInflate);
    }

    @Override // p110i9.h
    public void b(List<T> list) {
        Objects.requireNonNull(list);
        h(null);
        super.b(list);
    }
}
