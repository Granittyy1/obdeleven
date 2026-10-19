package p110i9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.module.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: SupportedModelAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends c<p315z8.a, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f36841d;

    /* JADX INFO: compiled from: SupportedModelAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f36842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f36843c;
    }

    public x(Context context, l lVar) {
        super(context);
        this.f36841d = new ArrayList();
        this.f36781c = lVar;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, p315z8.a aVar) {
        a aVar2 = (a) b10;
        p315z8.a aVar3 = aVar;
        aVar2.f36842b.setText(aVar3.f42678a);
        aVar2.f36843c.setText(aVar3.f42679b);
    }

    @Override // p110i9.c
    public final void d(List<p315z8.a> list) {
        this.f36841d.clear();
        super.d(list);
    }

    public final void e(String str) {
        boolean zContains;
        ArrayList<p315z8.a> arrayList = this.f36841d;
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f36779a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (p315z8.a aVar : arrayList) {
            String str2 = aVar.f42679b;
            if (str2 == null || str == null) {
                zContains = false;
            } else {
                Locale locale = Locale.US;
                zContains = str2.toLowerCase(locale).contains(str.toLowerCase(locale));
            }
            if (zContains) {
                arrayList2.add(aVar);
            }
        }
        super.d(arrayList2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f36780b).inflate(R.layout.item_labeled_button, viewGroup, false);
        a aVar = new a(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        aVar.f36842b = (TextView) linearLayout.getChildAt(0);
        aVar.f36843c = (TextView) linearLayout.getChildAt(1);
        return aVar;
    }
}
