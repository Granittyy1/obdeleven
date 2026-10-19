package p073f9;

import B8.g1;
import M0.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.LineDataChart;
import p110i9.c;

/* JADX INFO: compiled from: OBDIIChartDataAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends c<k.a, a> {

    /* JADX INFO: compiled from: OBDIIChartDataAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g1 f35051b;

        public a(g1 g1Var) {
            super(g1Var.f4488d);
            this.f35051b = g1Var;
        }
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, k.a aVar) {
        a aVar2 = (a) b10;
        k.a aVar3 = aVar;
        aVar2.getClass();
        String label = aVar3.f35059c.f34189a.getLabel();
        String strF = aVar3.f35060d;
        String str = aVar3.f35061e;
        LineDataChart.b bVar = aVar3.f35059c;
        int color = bVar.f34189a.getColor();
        g1 g1Var = aVar2.f35051b;
        g1Var.f1924s.setText(label);
        boolean zIsEmpty = strF.isEmpty();
        TextView textView = g1Var.f1926u;
        if (zIsEmpty) {
            textView.setText("");
        } else {
            if (str != null && !str.isEmpty()) {
                strF = O.a.f(strF, " ", str);
            }
            textView.setText(strF);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        AppCompatCheckBox appCompatCheckBox = g1Var.f1923r;
        appCompatCheckBox.setSupportButtonTintList(colorStateListValueOf);
        appCompatCheckBox.setChecked(bVar.f34189a.isVisible());
        int adapterPosition = aVar2.getAdapterPosition();
        j jVar = j.this;
        int size = jVar.f36779a.size() - 1;
        Context context = jVar.f36780b;
        LinearLayout linearLayout = g1Var.f1925t;
        if (adapterPosition == size) {
            linearLayout.setBackground(context.getResources().getDrawable(R.drawable.content_button_bottom_selector));
        } else {
            linearLayout.setBackground(context.getResources().getDrawable(R.drawable.content_button_selector));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a((g1) e.a(LayoutInflater.from(this.f36780b), R.layout.item_labeled_checkbox, viewGroup, false, null));
    }
}
