package p110i9;

import B8.Q0;
import M0.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import p109i8.h;

/* JADX INFO: compiled from: AutocodeProgressDialogAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c<Q8.a, C0386a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DatabaseLanguage f36772d;

    /* JADX INFO: renamed from: i9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutocodeProgressDialogAdapter.java */
    public class C0386a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f36773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ProgressBar f36774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f36775d;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, Q8.a aVar) {
        C0386a c0386a = (C0386a) b10;
        Q8.a aVar2 = aVar;
        TextView textView = c0386a.f36773b;
        String strB = this.f36772d.b();
        h hVar = aVar2.f5126b;
        textView.setText("(" + hVar.t() + ") " + hVar.x(strB));
        int iOrdinal = aVar2.f5125a.ordinal();
        ProgressBar progressBar = c0386a.f36774c;
        ImageView imageView = c0386a.f36775d;
        if (iOrdinal == 0) {
            progressBar.setVisibility(8);
            imageView.setVisibility(4);
            return;
        }
        Context context = this.f36780b;
        if (iOrdinal == 1) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
            imageView.setColorFilter(context.getResources().getColor(R.color.black));
        } else if (iOrdinal == 2) {
            progressBar.setVisibility(8);
            imageView.setColorFilter(context.getResources().getColor(R.color.button_green));
            imageView.setVisibility(0);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            progressBar.setVisibility(8);
            imageView.setColorFilter(context.getResources().getColor(R.color.button_red));
            imageView.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Q0 q10 = (Q0) e.a(LayoutInflater.from(this.f36780b), R.layout.item_autocode_progress, viewGroup, false, null);
        C0386a c0386a = new C0386a(q10.f4488d);
        c0386a.f36775d = q10.f1792r;
        c0386a.f36773b = q10.f1794t;
        c0386a.f36774c = q10.f1793s;
        return c0386a;
    }
}
