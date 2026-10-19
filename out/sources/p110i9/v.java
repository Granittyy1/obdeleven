package p110i9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import p255u9.C;

/* JADX INFO: compiled from: StatisticsAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends h<UserTrackingUtils.Key, a> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C f36835g;

    /* JADX INFO: compiled from: StatisticsAdapter.java */
    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinearLayout f36837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f36838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f36839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AppCompatImageView f36840f;
    }

    @Override // p110i9.h
    public final void c(RecyclerView.B b10, int i10) {
        a aVar = (a) b10;
        UserTrackingUtils.Key key = (UserTrackingUtils.Key) this.f36795b.get(i10);
        aVar.f36836b.setVisibility(i10 == 0 ? 0 : 8);
        int i11 = key.h() ? 0 : 8;
        LinearLayout linearLayout = aVar.f36837c;
        linearLayout.setVisibility(i11);
        linearLayout.setBackgroundResource(R.drawable.content_title_all);
        int iC = key.c();
        AppCompatImageView appCompatImageView = aVar.f36840f;
        appCompatImageView.setImageResource(iC);
        Context context = this.f36794a;
        appCompatImageView.setColorFilter(key.a(context.getResources()));
        aVar.f36838d.setText(context.getString(key.f()));
        String strValueOf = String.valueOf(key.d(this.f36835g));
        TextView textView = aVar.f36839e;
        textView.setText(strValueOf);
        textView.setTextColor(key.a(context.getResources()));
    }

    @Override // p110i9.h
    public final RecyclerView.B e(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.statistics_list_item, viewGroup, false);
        a aVar = new a(viewInflate);
        aVar.f36838d = (TextView) viewInflate.findViewById(R.id.statisticsItem_title);
        aVar.f36839e = (TextView) viewInflate.findViewById(R.id.statisticsItem_amount);
        aVar.f36836b = viewInflate.findViewById(R.id.statisticsListItem_marginTop);
        aVar.f36837c = (LinearLayout) viewInflate.findViewById(R.id.statisticsItem);
        aVar.f36840f = (AppCompatImageView) viewInflate.findViewById(R.id.statisticsListItem_icon);
        return aVar;
    }

    public final void k(C c10) {
        this.f36835g = c10;
        if (c10 == null) {
            this.f36795b = new ArrayList();
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (UserTrackingUtils.Key key : UserTrackingUtils.Key.values()) {
            if (key.h()) {
                arrayList.add(key);
            }
        }
        b(arrayList);
    }
}
