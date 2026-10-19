package p158m9;

import O8.e;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.Y;
import com.obdeleven.service.model.f;
import com.obdeleven.service.util.a;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p122j9.b;
import p122j9.c;

/* JADX INFO: compiled from: GatewayListCodingDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends DialogInterfaceOnCancelListenerC1342g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppCompatSpinner f44646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f44647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f44648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f44649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p122j9.b f44650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map<Short, f> f44651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.controlunitlist.online.b f44652x;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        if (this.f44646r.getSelectedItemPosition() < 0) {
            return;
        }
        c cVar = this.f44649u;
        this.f44652x.a((f) cVar.f36803b.get(this.f44646r.getSelectedItemPosition()), this.f44650v.f41174b);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f44648t = getFragmentManager();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gateway_coding_dialog, (ViewGroup) null);
        ActivityC1347l activity = getActivity();
        Map<Short, f> map = this.f44651w;
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new a(0));
        f fVar = map.get((short) 25);
        if (fVar != null) {
            arrayList.remove(fVar);
            arrayList.add(0, fVar);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        c cVar = new c(activity);
        cVar.f36803b.addAll(arrayList2);
        this.f44649u = cVar;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) viewInflate.findViewById(R.id.gateway_dropdown);
        this.f44646r = appCompatSpinner;
        appCompatSpinner.setAdapter((SpinnerAdapter) this.f44649u);
        this.f44646r.setOnItemSelectedListener(new e() { // from class: m9.a
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, xa.g] */
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i10, long j) {
                b bVar = this.f44645b;
                f fVar2 = (f) bVar.f44649u.f36803b.get(i10);
                b bVar2 = bVar.f44650v;
                bVar2.getClass();
                O.e.j("setGatewayListCoding", "gateway id: ".concat(fVar2.t()));
                ((J8.a) bVar2.f41177e.getValue()).u();
                bVar2.f41174b = Y.e(fVar2.f29426D);
                bVar2.f41175c = fVar2;
                bVar2.notifyDataSetChanged();
            }
        });
        this.f44650v = new p122j9.b(getActivity());
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.gateway_control_unit_list);
        this.f44647s = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.f44647s.setAdapter(this.f44650v);
        return new androidx.appcompat.app.e.a(getActivity()).setTitle(R.string.common_gateway_list_coding).setView(viewInflate).setPositiveButton(R.string.common_ok, this).setNegativeButton(R.string.common_cancel, new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.b()).create();
    }
}
