package p110i9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.module.g;
import p134k8.T1;

/* JADX INFO: compiled from: LookupAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends h<T1, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f36805g;

    /* JADX INFO: compiled from: LookupAdapter.java */
    public class a extends RecyclerView.B implements View.OnLongClickListener, View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f36806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f36807c;

        public a(View view) {
            super(view);
            LinearLayout linearLayout = (LinearLayout) view;
            this.f36806b = (TextView) linearLayout.getChildAt(0);
            this.f36807c = (TextView) linearLayout.getChildAt(1);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getAdapterPosition();
            k.this.getClass();
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = getAdapterPosition();
            g gVar = k.this.f36805g;
            if (gVar == null || adapterPosition == -1) {
                return false;
            }
            return gVar.onItemLongClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        T1 t8 = (T1) this.f36795b.get(i10);
        aVar.f36806b.setText(t8.f42678a);
        aVar.f36807c.setText(t8.f42679b);
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new a(LayoutInflater.from(this.f36794a).inflate(R.layout.item_labeled_button_with_divider, viewGroup, false));
    }
}
