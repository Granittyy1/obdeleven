package com.voltasit.obdeleven.presentation.history.vehicle;

import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.presentation.history.HistoryAdapter;
import p220r9.H;

/* JADX INFO: compiled from: VehicleHistoryFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VehicleHistoryFragment f32511e;

    public k(VehicleHistoryFragment vehicleHistoryFragment, RecyclerView.l lVar) {
        this.f32511e = vehicleHistoryFragment;
        this.f46416a = 0;
        this.f46417b = 0;
        this.f46418c = true;
        this.f46419d = (LinearLayoutManager) lVar;
    }

    @Override // p220r9.H
    public final void c(final int i10, int i11, RecyclerView view) {
        kotlin.jvm.internal.i.e(view, "view");
        Handler handler = new Handler();
        final VehicleHistoryFragment vehicleHistoryFragment = this.f32511e;
        handler.post(new Runnable() { // from class: com.voltasit.obdeleven.presentation.history.vehicle.j
            @Override // java.lang.Runnable
            public final void run() {
                VehicleHistoryFragment this$0 = vehicleHistoryFragment;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (this$0.y()) {
                    return;
                }
                HistoryAdapter historyAdapter = this$0.f32475l;
                kotlin.jvm.internal.i.b(historyAdapter);
                historyAdapter.h(historyAdapter.f36825g);
                boolean z10 = this$0.f32483t;
                int i12 = i10;
                if (z10) {
                    this$0.R(i12);
                } else {
                    this$0.R(i12 + 1);
                }
            }
        });
    }
}
