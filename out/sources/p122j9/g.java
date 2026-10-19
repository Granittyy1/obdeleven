package p122j9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;
import p134k8.C2642q1;

/* JADX INFO: compiled from: LongCodingAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f41188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseProFragment f41189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2642q1 f41190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2642q1 f41191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41192f = 0;

    /* JADX INFO: compiled from: LongCodingAdapter.java */
    public class a extends RecyclerView.B implements View.OnClickListener, View.OnLongClickListener {
        public a(View view) {
            super(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.AdapterView$OnItemClickListener, androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            ?? r10 = g.this.f41188b;
            if (r10 == 0 || adapterPosition == -1) {
                return;
            }
            r10.onItemClick(null, this.itemView, adapterPosition, getItemId());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.AdapterView$OnItemLongClickListener, com.voltasit.obdeleven.presentation.pro.BaseProFragment] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = getAdapterPosition();
            ?? r10 = g.this.f41189c;
            if (r10 == 0 || adapterPosition == -1) {
                return false;
            }
            return r10.onItemLongClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    public g(Context context) {
        this.f41187a = context;
    }

    public final boolean a() {
        C2642q1 c2642q1;
        C2642q1 c2642q2 = this.f41190d;
        if (c2642q2 == null || (c2642q1 = this.f41191e) == null) {
            return false;
        }
        return !c2642q2.equals(c2642q1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        C2642q1 c2642q1 = this.f41191e;
        if (c2642q1 == null) {
            return 0;
        }
        return c2642q1.f42831c.length() / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        TextView textView = (TextView) ((a) b10).itemView;
        textView.setText((CharSequence) this.f41191e.d().get(i10));
        C2642q1 c2642q1 = this.f41190d;
        Context context = this.f41187a;
        if (c2642q1 != null) {
            textView.setTextColor(this.f41191e.b(i10) != c2642q1.b(i10) ? context.getResources().getColor(R.color.checkbox_green) : context.getResources().getColor(android.R.color.black));
        }
        if (i10 == this.f41192f) {
            textView.setTextSize(0, context.getResources().getDimension(R.dimen.text_xlarge));
        } else {
            textView.setTextSize(0, context.getResources().getDimension(R.dimen.text_medium));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(this.f41187a).inflate(R.layout.list_long_coding, viewGroup, false));
    }
}
