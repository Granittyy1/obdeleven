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

/* JADX INFO: compiled from: ChartDataAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends c<b.C0365b, a> {

    /* JADX INFO: compiled from: ChartDataAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g1 f35037b;

        public a(g1 g1Var) {
            super(g1Var.f4488d);
            this.f35037b = g1Var;
        }
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, b.C0365b c0365b) {
        a aVar = (a) b10;
        b.C0365b c0365b2 = c0365b;
        aVar.getClass();
        String label = c0365b2.f35021a.f34189a.getLabel();
        String strF = c0365b2.f35024d;
        String str = c0365b2.f35025e;
        LineDataChart.b bVar = c0365b2.f35021a;
        int color = bVar.f34189a.getColor();
        g1 g1Var = aVar.f35037b;
        g1Var.f1924s.setText(label);
        TextView textView = g1Var.f1926u;
        if (strF == null || strF.isEmpty()) {
            textView.setText("");
        } else {
            if (str != null && !str.isEmpty()) {
                strF = O.a.f(strF, " ", str);
            }
            textView.setText(strF);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        AppCompatCheckBox appCompatCheckBox = g1Var.f1923r;
        appCompatCheckBox.setButtonTintList(colorStateListValueOf);
        appCompatCheckBox.setChecked(bVar.f34189a.isVisible());
        int adapterPosition = aVar.getAdapterPosition();
        d dVar = d.this;
        int size = dVar.f36779a.size() - 1;
        Context context = dVar.f36780b;
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
