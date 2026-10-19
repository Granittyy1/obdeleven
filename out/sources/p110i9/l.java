package p110i9;

import B8.u1;
import M0.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: MultiChoiceAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public class l extends c<String, a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<String> f36809d;

    /* JADX INFO: compiled from: MultiChoiceAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u1 f36810b;

        public a(u1 u1Var) {
            super(u1Var.f4488d);
            this.f36810b = u1Var;
            u1Var.f2165r.setOnClickListener(new com.voltasit.obdeleven.presentation.twofactorauth.verify.a(1, this));
        }

        public void a(String str) {
            u1 u1Var = this.f36810b;
            u1Var.f2165r.setVisibility(0);
            u1Var.f2165r.setChecked(l.this.f36809d.contains(str));
            u1Var.t(str);
            u1Var.f();
        }
    }

    public l(Context context) {
        super(context);
        this.f36809d = new ArrayList<>();
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, String str) {
        ((a) b10).a(str);
    }

    public a e(u1 u1Var) {
        return new a(u1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return e((u1) e.a(LayoutInflater.from(this.f36780b), R.layout.list_dialog_item, viewGroup, false, null));
    }
}
