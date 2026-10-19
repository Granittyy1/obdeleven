package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: EepromAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends p110i9.c<EepromFragment.EepromData, C0333a> {

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.eeprom.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EepromAdapter.java */
    public class C0333a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f31557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f31558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f31559d;
    }

    @Override // p110i9.c
    public final void b(RecyclerView.B b10, EepromFragment.EepromData eepromData) {
        SpannableString spannableString;
        C0333a c0333a = (C0333a) b10;
        EepromFragment.EepromData eepromData2 = eepromData;
        c0333a.f31557b.setText(eepromData2.b());
        TextView textView = c0333a.f31558c;
        textView.setText("");
        if (TextUtils.isEmpty(eepromData2.a()) || eepromData2.a().equals(eepromData2.c())) {
            textView.setText(eepromData2.c());
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(eepromData2.a().split(" ")));
            ArrayList arrayList2 = new ArrayList(Arrays.asList(eepromData2.c().split(" ")));
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (((String) arrayList.get(i10)).equals(arrayList2.get(i10))) {
                    spannableString = new SpannableString(Q8.d.a(new StringBuilder(), (String) arrayList.get(i10), " "));
                    spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 33);
                } else {
                    spannableString = new SpannableString(Q8.d.a(new StringBuilder(), (String) arrayList.get(i10), " "));
                    spannableString.setSpan(new ForegroundColorSpan(-16711936), 0, spannableString.length(), 33);
                }
                textView.append(spannableString);
            }
        }
        int adapterPosition = c0333a.getAdapterPosition();
        int size = this.f36779a.size() - 1;
        View view = c0333a.f31559d;
        if (adapterPosition == size) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        c0333a.itemView.setOnClickListener(new com.braze.ui.contentcards.view.a(this, c0333a, eepromData2, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f36780b).inflate(R.layout.item_eeprom_data_labeled, viewGroup, false);
        C0333a c0333a = new C0333a(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        c0333a.f31557b = (TextView) linearLayout.getChildAt(0);
        c0333a.f31558c = (TextView) viewInflate.findViewById(R.id.eeprom_labeled_description);
        c0333a.f31559d = linearLayout.getChildAt(2);
        return c0333a;
    }
}
