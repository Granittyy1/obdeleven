package p073f9;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p220r9.P;
import p255u9.C2800c;
import p255u9.v;

/* JADX INFO: compiled from: ChartAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<ViewOnClickListenerC0366c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivityC1347l f35026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f35027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f35028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f35029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f35030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f35031f;

    /* JADX INFO: compiled from: ChartAdapter.java */
    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) linearLayout.getChildAt(0);
            TextView textView2 = (TextView) linearLayout.getChildAt(1);
            c cVar = c.this;
            ClipboardManager clipboardManager = (ClipboardManager) cVar.f35026a.getSystemService("clipboard");
            ClipData clipDataNewPlainText = ClipData.newPlainText(textView.getText(), textView2.getText());
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
            }
            P.e(cVar.f35026a, String.format(Locale.US, "%s %s", textView.getText(), cVar.f35026a.getString(R.string.common_copied)));
            view.setPressed(false);
            return true;
        }
    }

    /* JADX INFO: compiled from: ChartAdapter.java */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            c cVar = c.this;
            ((ClipboardManager) cVar.f35026a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(cVar.f35026a.getString(R.string.common_value), ((TextView) view).getText()));
            ActivityC1347l activityC1347l = cVar.f35026a;
            Locale locale = Locale.US;
            P.e(activityC1347l, activityC1347l.getString(R.string.common_value) + " " + cVar.f35026a.getString(R.string.common_copied));
            view.setPressed(false);
            return true;
        }
    }

    /* JADX INFO: renamed from: f9.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChartAdapter.java */
    public class ViewOnClickListenerC0366c extends RecyclerView.B implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f35034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinearLayout f35035c;

        public ViewOnClickListenerC0366c(View view) {
            super(view);
            this.f35034b = (TextView) view.findViewById(R.id.itemHistory_title);
            this.f35035c = (LinearLayout) view.findViewById(R.id.itemHistory_content);
            this.itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            g gVar = c.this.f35029d;
            if (gVar == null || adapterPosition == -1) {
                return;
            }
            gVar.onItemClick(null, this.itemView, adapterPosition, getItemId());
        }
    }

    public final void a(ViewOnClickListenerC0366c viewOnClickListenerC0366c, String str, String str2, boolean z10) {
        LinearLayout linearLayout = (LinearLayout) this.f35027b.inflate(R.layout.item_labeled_button, (ViewGroup) viewOnClickListenerC0366c.f35035c, false);
        ((TextView) linearLayout.getChildAt(0)).setText(str);
        ((TextView) linearLayout.getChildAt(1)).setText(str2);
        viewOnClickListenerC0366c.f35035c.addView(linearLayout);
        linearLayout.setOnLongClickListener(this.f35030e);
        if (z10) {
            this.f35027b.inflate(R.layout.item_button_divider, (ViewGroup) viewOnClickListenerC0366c.f35035c, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f35028c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        ViewOnClickListenerC0366c viewOnClickListenerC0366c = (ViewOnClickListenerC0366c) b10;
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        ActivityC1347l activityC1347l = this.f35026a;
        DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activityC1347l).c());
        C2800c c2800c = (C2800c) this.f35028c.get(i10);
        viewOnClickListenerC0366c.f35034b.setText(c2800c.getString("name"));
        LinearLayout linearLayout = viewOnClickListenerC0366c.f35035c;
        linearLayout.removeAllViews();
        if (((ControlUnitDB) c2800c.getParseObject("controlUnit")) != null) {
            a(viewOnClickListenerC0366c, activityC1347l.getString(R.string.common_control_unit), ((v) ((ControlUnitDB) c2800c.getParseObject("controlUnit")).getControlUnitBase().getParseObject("texttable")).getString(databaseLanguageValueOf.b()), true);
        }
        ArrayList<String> arrayList = new ArrayList(c2800c.getList("labels"));
        a(viewOnClickListenerC0366c, activityC1347l.getString(R.string.common_parameters), (String) arrayList.remove(0), false);
        for (String str : arrayList) {
            TextView textView = (TextView) this.f35027b.inflate(R.layout.item_button, (ViewGroup) linearLayout, false);
            textView.setText(str);
            linearLayout.addView(textView);
            textView.setOnLongClickListener(this.f35031f);
        }
        this.f35027b.inflate(R.layout.item_button_divider, (ViewGroup) viewOnClickListenerC0366c.f35035c, true);
        a(viewOnClickListenerC0366c, activityC1347l.getString(R.string.common_date), new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(c2800c.getCreatedAt()), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewOnClickListenerC0366c(this.f35027b.inflate(R.layout.item_history, viewGroup, false));
    }
}
