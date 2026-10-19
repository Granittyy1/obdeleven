package com.voltasit.obdeleven.presentation.history;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.recyclerview.widget.RecyclerView;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.models.HistoryTypeFilter;
import com.voltasit.obdeleven.presentation.history.child.VehicleHistoryChildrenFragment;
import com.voltasit.parse.model.HistoryDB;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p110i9.q;
import p220r9.P;
import p255u9.C2801d;

/* JADX INFO: compiled from: HistoryChildrenAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends q<HistoryDB, b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ActivityC1347l f32465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LayoutInflater f32466i;
    public VehicleHistoryChildrenFragment j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f32467k;

    /* JADX INFO: compiled from: HistoryChildrenAdapter.java */
    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            LinearLayout linearLayout = (LinearLayout) view;
            TextView textView = (TextView) linearLayout.getChildAt(0);
            TextView textView2 = (TextView) linearLayout.getChildAt(1);
            k kVar = k.this;
            ClipboardManager clipboardManager = (ClipboardManager) kVar.f32465h.getSystemService("clipboard");
            ClipData clipDataNewPlainText = ClipData.newPlainText(textView.getText(), textView2.getText());
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(clipDataNewPlainText);
            }
            P.e(kVar.f32465h, String.format(Locale.US, "%s %s", textView.getText(), kVar.f32465h.getString(R.string.common_copied)));
            view.setPressed(false);
            return true;
        }
    }

    /* JADX INFO: compiled from: HistoryChildrenAdapter.java */
    public class b extends RecyclerView.B implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f32469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinearLayout f32470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f32471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f32472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f32473f;

        public b(View view) {
            super(view);
            this.f32469b = (TextView) view.findViewById(R.id.itemHistory_title);
            this.f32470c = (LinearLayout) view.findViewById(R.id.itemHistory_content);
            this.itemView.setOnClickListener(this);
            this.f32471d = (ImageView) view.findViewById(R.id.itemHistory_advanced);
            this.f32472e = (ImageView) view.findViewById(R.id.itemHistory_delete);
            this.f32473f = (ImageView) view.findViewById(R.id.itemHistory_undelete);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition() - 1;
            k kVar = k.this;
            if (kVar.j == null || adapterPosition < 0) {
                return;
            }
            HistoryDB historyDB = (HistoryDB) kVar.f36795b.get(adapterPosition);
            if (HistoryTypeFilter.b(historyDB.getString("type")).g(historyDB)) {
                kVar.j.onItemClick(null, this.itemView, adapterPosition, getItemId());
            }
        }
    }

    public k(ActivityC1347l activityC1347l) {
        super(activityC1347l);
        this.f32467k = new a();
        this.f32465h = activityC1347l;
        this.f32466i = LayoutInflater.from(activityC1347l);
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, int i10) {
        ActivityC1347l activityC1347l = this.f32465h;
        b bVar = (b) b10;
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activityC1347l).c());
        HistoryDB historyDB = (HistoryDB) this.f36795b.get(i10);
        bVar.f32470c.removeAllViews();
        bVar.f32472e.setVisibility(8);
        bVar.f32473f.setVisibility(8);
        C2801d controlUnitBase = historyDB.c().getControlUnitBase();
        JSONObject jSONObjectD = historyDB.d();
        bVar.f32471d.setVisibility(HistoryTypeFilter.b(historyDB.getString("type")).g(historyDB) ? 0 : 8);
        Locale locale = Locale.US;
        bVar.f32469b.setText(B6.c.d("(", controlUnitBase.getString("klineId"), ") ", controlUnitBase.c(databaseLanguageValueOf.b())));
        k(bVar, jSONObjectD, i10, historyDB.c());
        if (historyDB.getInt("mileage") > 0) {
            l(bVar, activityC1347l.getString(R.string.common_mileage), Integer.toString(historyDB.getInt("mileage")) + " km", true, -1, null);
        }
        l(bVar, activityC1347l.getString(R.string.common_date), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(historyDB.getCreatedAt()), false, -1, null);
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new b(layoutInflater.inflate(R.layout.item_history, viewGroup, false));
    }

    public abstract void k(b bVar, JSONObject jSONObject, int i10, ControlUnitDB controlUnitDB);

    public final void l(final b bVar, String str, String str2, boolean z10, final int i10, final AdapterView.OnItemClickListener onItemClickListener) {
        LinearLayout linearLayout = bVar.f32470c;
        LayoutInflater layoutInflater = this.f32466i;
        LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.item_labeled_button, (ViewGroup) linearLayout, false);
        ((TextView) linearLayout2.getChildAt(0)).setText(str);
        ((TextView) linearLayout2.getChildAt(1)).setText(str2);
        LinearLayout linearLayout3 = bVar.f32470c;
        linearLayout3.addView(linearLayout2);
        linearLayout2.setOnLongClickListener(this.f32467k);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.history.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11;
                AdapterView.OnItemClickListener onItemClickListener2 = onItemClickListener;
                if (onItemClickListener2 == null || (i11 = i10) < 0) {
                    return;
                }
                k.b bVar2 = bVar;
                onItemClickListener2.onItemClick(null, bVar2.itemView, i11, bVar2.getItemId());
            }
        });
        if (z10) {
            layoutInflater.inflate(R.layout.item_button_divider, (ViewGroup) linearLayout3, true);
        }
    }
}
