package p147l9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.Locale;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: KWPBackupAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f44474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f44475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f44476c;

    /* JADX INFO: compiled from: KWPBackupAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f44477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f44478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ProgressBar f44479d;
    }

    public c(MainActivity mainActivity, JSONObject jSONObject) {
        this.f44474a = mainActivity;
        this.f44475b = jSONObject;
        this.f44476c = LayoutInflater.from(mainActivity);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f44475b.optJSONArray("values").length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        JSONObject jSONObject = this.f44475b;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("values").optJSONObject(i10);
        aVar.f44478c.setVisibility(0);
        aVar.f44479d.setVisibility(8);
        aVar.f44477b.setText(String.format(Locale.US, "%s: %03d", this.f44474a.getString(R.string.common_channel), Integer.valueOf(jSONObjectOptJSONObject.optInt("channel"))));
        ViewGroup viewGroup = aVar.f44478c;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) this.f44476c.inflate(R.layout.item_labeled_button_bottom, viewGroup, false);
            viewGroup.addView(linearLayout);
        }
        TextView textView = (TextView) linearLayout.getChildAt(0);
        TextView textView2 = (TextView) linearLayout.getChildAt(1);
        textView.setText(R.string.common_value);
        if (jSONObjectOptJSONObject.optString("data").equals("SECURITY_ACCESS")) {
            textView2.setText(R.string.common_secured);
        } else if (jSONObject.optString("type").equals("KWP")) {
            textView2.setText(Integer.toString(Integer.parseInt(jSONObjectOptJSONObject.optString("data"), 16)));
        } else {
            textView2.setText(n.d(jSONObjectOptJSONObject.optString("data")));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = this.f44476c.inflate(R.layout.item_uds, viewGroup, false);
        a aVar = new a(viewInflate);
        aVar.f44477b = (TextView) viewInflate.findViewById(R.id.itemUds_title);
        aVar.f44478c = (LinearLayout) viewInflate.findViewById(R.id.itemUds_content);
        aVar.f44479d = (ProgressBar) viewInflate.findViewById(R.id.itemUds_progress);
        return aVar;
    }
}
