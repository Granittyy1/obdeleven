package p060e9;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import com.voltasit.obdeleven.presentation.history.k;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.parse.model.HistoryDB;
import p170n9.n;

/* JADX INFO: compiled from: VehicleBackupChildrenFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class j extends VehicleHistoryChildrenFragment {

    /* JADX INFO: compiled from: VehicleBackupChildrenFragment.java */
    public class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f34846b;

        public a(c cVar) {
            this.f34846b = cVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
            c cVar = this.f34846b;
            j jVar = j.this;
            if (((HistoryDB) jVar.P(cVar, i10).getParcelable("historyDb")).h().startsWith("KWP")) {
                n nVar = new n();
                nVar.setArguments(jVar.P(cVar, i10));
                nVar.f31783u = null;
                jVar.r().n(nVar, null);
                return;
            }
            NavigationManager navigationManagerR = jVar.r();
            f fVar = new f();
            fVar.setArguments(jVar.P(cVar, i10));
            navigationManagerR.n(fVar, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e9.g] */
    /* JADX WARN: Type inference failed for: r2v0, types: [e9.h] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e9.i] */
    @Override // com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment
    public final k O() {
        final c cVar = new c(getActivity());
        ?? r10 = new AdapterView.OnItemClickListener() { // from class: e9.g
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                j jVar = this.f34840b;
                NavigationManager navigationManagerR = jVar.r();
                d dVar = new d();
                dVar.setArguments(jVar.P(cVar, i10));
                navigationManagerR.n(dVar, null);
            }
        };
        ?? r11 = new AdapterView.OnItemClickListener() { // from class: e9.h
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                j jVar = this.f34842b;
                NavigationManager navigationManagerR = jVar.r();
                a aVar = new a();
                aVar.setArguments(jVar.P(cVar, i10));
                navigationManagerR.n(aVar, null);
            }
        };
        ?? r12 = new AdapterView.OnItemClickListener() { // from class: e9.i
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
                j jVar = this.f34844b;
                NavigationManager navigationManagerR = jVar.r();
                b bVar = new b();
                bVar.setArguments(jVar.P(cVar, i10));
                navigationManagerR.n(bVar, null);
            }
        };
        a aVar = new a(cVar);
        cVar.f34832l = r10;
        cVar.f34833m = r11;
        cVar.f34834n = r12;
        cVar.f34835o = aVar;
        return cVar;
    }

    public final Bundle P(c cVar, int i10) {
        HistoryDB historyDB = (HistoryDB) cVar.f36795b.get(i10);
        Bundle bundle = new Bundle();
        bundle.putParcelable("vehicleDb", this.f32425n);
        bundle.putParcelable("historyDb", historyDB);
        return bundle;
    }

    @Override // com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_full_backup);
    }
}
