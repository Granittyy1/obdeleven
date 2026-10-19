package V8;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: V8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: InfoAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0827a extends RecyclerView.Adapter<ViewOnClickListenerC0097a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6765a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityC1347l f6766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f6767c;

    /* JADX INFO: renamed from: V8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InfoAdapter.java */
    public class ViewOnClickListenerC0097a extends RecyclerView.B implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f6768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f6769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f6770d;

        public ViewOnClickListenerC0097a(View view) {
            super(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
            LinearLayout linearLayout = (LinearLayout) view;
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.getChildAt(0);
            this.f6768b = (TextView) relativeLayout.getChildAt(0);
            this.f6769c = (TextView) relativeLayout.getChildAt(1);
            this.f6770d = (TextView) linearLayout.getChildAt(1);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getAdapterPosition();
            C0827a.this.getClass();
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            int adapterPosition = getAdapterPosition();
            s sVar = C0827a.this.f6767c;
            if (sVar == null || adapterPosition == -1) {
                return false;
            }
            return sVar.onItemLongClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    public C0827a(ActivityC1347l activityC1347l) {
        this.f6766b = activityC1347l;
    }

    public final void a(String str) {
        ArrayList arrayList = this.f6765a;
        arrayList.add(str);
        notifyItemInserted(arrayList.size() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f6765a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        ViewOnClickListenerC0097a viewOnClickListenerC0097a = (ViewOnClickListenerC0097a) b10;
        String str = (String) this.f6765a.get(i10);
        if (str == null) {
            return;
        }
        String[] strArrSplit = str.split("\n");
        viewOnClickListenerC0097a.f6768b.setText(strArrSplit[0]);
        int length = strArrSplit.length;
        TextView textView = viewOnClickListenerC0097a.f6770d;
        if (length <= 2 || TextUtils.isEmpty(strArrSplit[2])) {
            if (strArrSplit.length <= 1 || TextUtils.isEmpty(strArrSplit[1])) {
                textView.setText(R.string.common_no_data);
                return;
            } else {
                textView.setText(strArrSplit[1]);
                return;
            }
        }
        SpannableString spannableString = new SpannableString(Q8.d.a(new StringBuilder(" ("), strArrSplit[2], ")"));
        ActivityC1347l activityC1347l = this.f6766b;
        spannableString.setSpan(new ForegroundColorSpan(activityC1347l.getResources().getColor(R.color.green_l)), 0, spannableString.length(), 33);
        viewOnClickListenerC0097a.f6769c.setText(activityC1347l.getString(R.string.view_cu_info_new_version_exists));
        textView.setText(strArrSplit[1]);
        textView.append(spannableString);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC0097a(LayoutInflater.from(this.f6766b).inflate(R.layout.item_labeled_button_info, viewGroup, false));
    }
}
