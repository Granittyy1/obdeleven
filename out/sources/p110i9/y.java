package p110i9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import p134k8.T1;

/* JADX INFO: compiled from: ValuesAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f36845b = new ArrayList();

    /* JADX INFO: compiled from: ValuesAdapter.java */
    public static class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f36846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f36847c;

        public a(View view) {
            super(view);
            LinearLayout linearLayout = (LinearLayout) view;
            this.f36846b = (TextView) linearLayout.getChildAt(0);
            this.f36847c = (TextView) linearLayout.getChildAt(1);
        }
    }

    public y(Context context) {
        this.f36844a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f36845b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        T1 t8 = (T1) this.f36845b.get(i10);
        String str = t8.f42678a;
        String strF = t8.f42679b;
        String str2 = t8.f42680c;
        if (str == null || str.isEmpty()) {
            aVar.f36846b.setText("");
        } else {
            aVar.f36846b.setText(str);
        }
        if (str2 != null && !str2.isEmpty()) {
            strF = O.a.f(strF, " ", str2);
        }
        aVar.f36847c.setText(strF);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(this.f36844a).inflate(R.layout.item_labeled_button, viewGroup, false));
    }
}
