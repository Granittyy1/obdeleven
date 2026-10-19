package p122j9;

import B6.c;
import X5.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.collection.Y;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.f;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p134k8.S0;

/* JADX INFO: compiled from: GatewayControlUnitsAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityC1347l f41173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y<S0> f41174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f41175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DatabaseLanguage f41176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f41177e = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: compiled from: GatewayControlUnitsAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckBox f41178b;

        public a(View view) {
            super(view);
            CheckBox checkBox = (CheckBox) view;
            this.f41178b = checkBox;
            checkBox.setOnClickListener(new n(3, this));
        }
    }

    public b(ActivityC1347l activityC1347l) {
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        this.f41176d = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activityC1347l).c());
        this.f41173a = activityC1347l;
    }

    public final int a(int i10) {
        ArrayList arrayList = new ArrayList(this.f41175c.f29424B.values());
        Collections.sort(arrayList, new com.obdeleven.service.util.a(0));
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            List list = (List) this.f41175c.f29425C.get(((ControlUnit) it.next()).n());
            if (list != null) {
                if (list.size() + size > i10) {
                    return ((Integer) list.get(i10 - size)).intValue();
                }
                size += list.size();
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        f fVar = this.f41175c;
        if (fVar == null) {
            return 0;
        }
        return fVar.f29426D.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        int iA = a(i10);
        ControlUnit controlUnit = null;
        if (iA >= 0) {
            f fVar = this.f41175c;
            for (ControlUnit controlUnit2 : fVar.f29424B.values()) {
                List list = (List) fVar.f29425C.get(controlUnit2.n());
                if (list != null && list.contains(Integer.valueOf(iA))) {
                    controlUnit = controlUnit2;
                    break;
                }
            }
        }
        if (controlUnit == null) {
            aVar.f41178b.setChecked(false);
            aVar.f41178b.setText("");
            return;
        }
        S0 s0C = this.f41174b.c(iA);
        if (s0C == null) {
            return;
        }
        aVar.f41178b.setChecked(s0C.f42671c);
        aVar.f41178b.setText(c.d("(", controlUnit.t(), ") ", controlUnit.x(this.f41176d.b())));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(this.f41173a).inflate(R.layout.gateway_list_coding_item, viewGroup, false));
    }
}
