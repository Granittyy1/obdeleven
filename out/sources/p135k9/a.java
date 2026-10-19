package p135k9;

import C4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.obdeleven.service.odx.Param;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: UDSDataAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<ViewOnClickListenerC0475a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f42883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42884b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseFragment f42885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42886d;

    /* JADX INFO: renamed from: k9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UDSDataAdapter.java */
    public class ViewOnClickListenerC0475a extends RecyclerView.B implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f42887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f42888c;

        public ViewOnClickListenerC0475a(View view) {
            super(view);
            this.itemView.setOnClickListener(this);
            this.f42887b = (TextView) ((LinearLayout) this.itemView).getChildAt(0);
            this.f42888c = (TextView) ((LinearLayout) this.itemView).getChildAt(1);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.AdapterView$OnItemClickListener, com.voltasit.obdeleven.ui.module.BaseFragment] */
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
            a aVar = a.this;
            if (aVar.f42885c == null || adapterPosition == -1 || !aVar.c(adapterPosition).f29466o) {
                return;
            }
            aVar.f42885c.onItemClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    public a(MainActivity mainActivity, boolean z10) {
        this.f42883a = mainActivity;
        this.f42886d = z10;
    }

    public final void a(Collection<? extends Param> collection) {
        this.f42884b.addAll(collection);
        notifyDataSetChanged();
    }

    public final void b() {
        this.f42884b.clear();
        notifyDataSetChanged();
    }

    public final Param c(int i10) {
        return (Param) this.f42884b.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f42884b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        ViewOnClickListenerC0475a viewOnClickListenerC0475a = (ViewOnClickListenerC0475a) b10;
        Param paramC = c(i10);
        if (paramC.f29453a == Param.Type.f29473h) {
            viewOnClickListenerC0475a.f42887b.setText("");
            viewOnClickListenerC0475a.f42888c.setText(R.string.common_not_available);
        } else {
            String strD = paramC.d();
            if (this.f42886d) {
                StringBuilder sbF = b.f(strD, " (");
                sbF.append(paramC.f29463l);
                sbF.append("/");
                sbF.append(paramC.f29464m);
                sbF.append("/");
                sbF.append(paramC.b());
                sbF.append(")");
                strD = sbF.toString();
            }
            if (strD == null || strD.isEmpty()) {
                viewOnClickListenerC0475a.f42887b.setText("");
            } else {
                viewOnClickListenerC0475a.f42887b.setText(strD);
            }
            String strF = paramC.f();
            String strE = paramC.e();
            if (strE != null && !strE.isEmpty()) {
                strF = O.a.f(strF, " ", strE);
            }
            viewOnClickListenerC0475a.f42888c.setText(strF);
        }
        int size = this.f42884b.size() - 1;
        MainActivity mainActivity = this.f42883a;
        if (i10 == size) {
            viewOnClickListenerC0475a.itemView.setBackground(mainActivity.getResources().getDrawable(R.drawable.content_button_bottom_selector));
        } else {
            viewOnClickListenerC0475a.itemView.setBackground(mainActivity.getResources().getDrawable(R.drawable.content_button_selector));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC0475a(LayoutInflater.from(this.f42883a).inflate(R.layout.item_labeled_button, viewGroup, false));
    }
}
