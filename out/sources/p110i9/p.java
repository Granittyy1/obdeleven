package p110i9;

import B8.k1;
import M0.e;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.text.font.s;
import androidx.media3.exoplayer.C1406y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C1787c0;
import com.obdeleven.service.enums.ValueUnit;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.ViewOnClickListenerC2143f;
import java.util.ArrayList;
import java.util.List;
import p109i8.j;
import p134k8.A1;
import p134k8.T1;

/* JADX INFO: compiled from: OBDIILiveDataListAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends c<A1, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f36821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1406y f36822e;

    /* JADX INFO: compiled from: OBDIILiveDataListAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k1 f36823b;

        public a(k1 k1Var) {
            super(k1Var.f4488d);
            this.f36823b = k1Var;
        }
    }

    public p(Context context, LinearLayoutManager linearLayoutManager) {
        super(context);
        this.f36821d = linearLayoutManager;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, A1 a10) {
        String string;
        a aVar = (a) b10;
        A1 a11 = a10;
        p pVar = p.this;
        int size = pVar.f36779a.size();
        k1 k1Var = aVar.f36823b;
        if (size > 1) {
            k1Var.f1994t.setVisibility(0);
        } else {
            k1Var.f1994t.setVisibility(8);
        }
        String strB = a11.f42568a.b();
        Context context = pVar.f36780b;
        String str = a11.f42569b;
        j jVar = a11.f42568a;
        if (strB != null) {
            string = context.getString(jVar.getDescription());
            if (TextUtils.isEmpty(string)) {
                string = s.b(d.b("(", strB, ") "), str);
            }
        } else {
            string = str;
        }
        k1Var.f1995u.setText(string);
        LinearLayout linearLayout = k1Var.f1992r;
        linearLayout.setVisibility(0);
        ArrayList<T1> arrayListA = jVar.a(str);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (arrayListA.isEmpty()) {
            arrayListA.add(new T1(null, "", null));
        }
        for (T1 t8 : arrayListA) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_backup_value, (ViewGroup) linearLayout, false);
            linearLayout.addView(viewInflate);
            TextView textView = (TextView) viewInflate.findViewById(R.id.paramName);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.paramValue);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.paramUnit);
            String str2 = t8.f42678a;
            if (str2 == null || str2.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
            String str3 = t8.f42680c;
            if (str3 == null) {
                textView2.setText(R.string.common_not_available);
            } else {
                String str4 = t8.f42679b;
                List<String> list = com.voltasit.obdeleven.a.f29638c;
                if (com.voltasit.obdeleven.a.C0320a.a(context).i() == ValueUnit.f29311c) {
                    T1 t1K = C1787c0.k(new T1(null, str4, str3));
                    String str5 = t1K.f42679b;
                    str3 = t1K.f42680c;
                    str4 = str5;
                }
                textView2.setText(str4);
                if (str3 == null || str3.isEmpty()) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(str3);
                }
            }
        }
        k1Var.f1994t.setOnClickListener(new ViewOnClickListenerC2143f(2, aVar));
        k1Var.f1993s.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void e(List<A1> list) {
        int iIndexOf;
        if (this.f36779a.size() == 0) {
            d(list);
            return;
        }
        for (A1 a10 : list) {
            for (T t8 : this.f36779a) {
                if (t8.f42568a == a10.f42568a && (iIndexOf = this.f36779a.indexOf(t8)) >= 0) {
                    this.f36779a.set(iIndexOf, (T) a10);
                    notifyItemChanged(iIndexOf);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((k1) e.a(LayoutInflater.from(this.f36780b), R.layout.item_uds, viewGroup, false, null));
    }
}
