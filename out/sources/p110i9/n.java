package p110i9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: MultiChoiceDialogAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends c<String, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Integer> f36815e;

    /* JADX INFO: compiled from: MultiChoiceDialogAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LinearLayout f36816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f36817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CheckBox f36818d;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, String str) {
        final a aVar = (a) b10;
        aVar.f36817c.setText(str);
        boolean z10 = this.f36814d;
        CheckBox checkBox = aVar.f36818d;
        if (z10) {
            checkBox.setChecked(true);
            e(aVar, true);
        } else {
            checkBox.setChecked(false);
            e(aVar, false);
        }
        aVar.f36816b.setOnClickListener(new View.OnClickListener() { // from class: i9.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n nVar = this.f36812b;
                nVar.getClass();
                n.a aVar2 = aVar;
                nVar.e(aVar2, !aVar2.f36818d.isChecked());
                CheckBox checkBox2 = aVar2.f36818d;
                checkBox2.setChecked(!checkBox2.isChecked());
            }
        });
    }

    public final void e(a aVar, boolean z10) {
        ArrayList<Integer> arrayList = this.f36815e;
        if (z10) {
            arrayList.add(Integer.valueOf(aVar.getAdapterPosition()));
        } else {
            arrayList.remove(Integer.valueOf(aVar.getAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f36780b).inflate(R.layout.item_multi_choice_item, viewGroup, false);
        a aVar = new a(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        aVar.f36816b = linearLayout;
        aVar.f36818d = (CheckBox) linearLayout.getChildAt(0);
        aVar.f36817c = (TextView) linearLayout.getChildAt(1);
        return aVar;
    }
}
