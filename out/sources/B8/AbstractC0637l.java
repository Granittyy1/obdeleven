package B8;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.presentation.devices.DeviceFragment;

/* JADX INFO: renamed from: B8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceFragmentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0637l extends M0.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FloatingActionButton f1996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f1997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p110i9.d f1998t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DeviceFragment f1999u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.voltasit.obdeleven.a f2000v;

    public AbstractC0637l(M0.d dVar, View view, FloatingActionButton floatingActionButton, RecyclerView recyclerView) {
        super(view, 0, dVar);
        this.f1996r = floatingActionButton;
        this.f1997s = recyclerView;
    }

    public abstract void t(p110i9.d dVar);

    public abstract void u(com.voltasit.obdeleven.a aVar);

    public abstract void v(DeviceFragment deviceFragment);
}
