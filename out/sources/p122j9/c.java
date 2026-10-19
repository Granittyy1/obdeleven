package p122j9;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obdeleven.service.model.f;
import java.util.List;
import p110i9.j;

/* JADX INFO: compiled from: GatewaySpinnerAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends j<f> {

    /* JADX INFO: compiled from: GatewaySpinnerAdapter.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f41180a;
    }

    @Override // p110i9.j
    public final View b(f fVar, View view, ViewGroup viewGroup) {
        a aVar;
        f fVar2 = fVar;
        Context context = this.f36804c;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (view != null) {
            aVar = (a) view.getTag();
        } else {
            view = layoutInflater.inflate(R.layout.simple_spinner_dropdown_item, viewGroup, false);
            aVar = new a();
            aVar.f41180a = (TextView) view;
            view.setTag(aVar);
        }
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        aVar.f41180a.setText(B6.c.d("(", fVar2.t(), ") ", fVar2.x(com.voltasit.obdeleven.a.C0320a.a(context).c())));
        return view;
    }
}
