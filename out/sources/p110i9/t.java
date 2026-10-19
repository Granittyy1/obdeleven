package p110i9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SingleChoiceDialogAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends c<String, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36831e;

    /* JADX INFO: compiled from: SingleChoiceDialogAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LinearLayout f36832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f36833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RadioButton f36834d;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, String str) {
        final a aVar = (a) b10;
        aVar.f36833c.setText(str);
        boolean z10 = aVar.getAdapterPosition() == this.f36830d;
        RadioButton radioButton = aVar.f36834d;
        radioButton.setChecked(z10);
        boolean z11 = this.f36831e;
        LinearLayout linearLayout = aVar.f36832b;
        linearLayout.setEnabled(z11);
        radioButton.setClickable(this.f36831e);
        radioButton.setEnabled(this.f36831e);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: i9.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t tVar = this.f36826b;
                tVar.getClass();
                tVar.f36830d = aVar.getAdapterPosition();
                tVar.notifyItemRangeChanged(0, tVar.f36779a.size());
            }
        });
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: i9.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t tVar = this.f36828b;
                tVar.getClass();
                tVar.f36830d = aVar.getAdapterPosition();
                tVar.notifyItemRangeChanged(0, tVar.f36779a.size());
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f36780b).inflate(R.layout.item_single_choice_item, viewGroup, false);
        a aVar = new a(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        aVar.f36832b = linearLayout;
        aVar.f36834d = (RadioButton) linearLayout.getChildAt(0);
        aVar.f36833c = (TextView) linearLayout.getChildAt(1);
        return aVar;
    }
}
