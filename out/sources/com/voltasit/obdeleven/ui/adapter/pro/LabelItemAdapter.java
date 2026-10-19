package com.voltasit.obdeleven.ui.adapter.pro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.parse.ParseUser;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter;
import com.voltasit.obdeleven.ui.dialogs.ViewOnClickListenerC2181y0;
import java.util.ArrayList;
import p255u9.u;
import p255u9.z;

/* JADX INFO: loaded from: classes3.dex */
public final class LabelItemAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Theme f33715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f33716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33717c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdapterView.OnItemLongClickListener f33718d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Theme {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Theme f33719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Theme f33720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Theme[] f33721d;

        static {
            Theme theme = new Theme("LIGHT", 0);
            f33719b = theme;
            Theme theme2 = new Theme("DARK", 1);
            f33720c = theme2;
            f33721d = new Theme[]{theme, theme2};
        }

        public Theme() {
            throw null;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) f33721d.clone();
        }
    }

    public abstract class a extends RecyclerView.B {
        public abstract void a(b bVar);
    }

    public static abstract class b {
        public abstract int a();
    }

    public class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f33722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f33723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f33724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f33725e;

        public c(Context context, ViewGroup viewGroup, Theme theme) {
            super(LayoutInflater.from(context).inflate(R.layout.item_translation, viewGroup, false));
            LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.itemTranslation_button);
            this.f33722b = (ImageView) this.itemView.findViewById(R.id.itemTranslation_up);
            TextView textView = (TextView) this.itemView.findViewById(R.id.itemTranslation_value);
            this.f33723c = textView;
            this.f33724d = (ImageView) this.itemView.findViewById(R.id.itemTranslation_down);
            View viewFindViewById = this.itemView.findViewById(R.id.itemTranslation_divider);
            this.f33725e = viewFindViewById;
            if (theme == Theme.f33719b) {
                textView.setTextColor(context.getResources().getColor(android.R.color.white));
            } else {
                viewFindViewById.setBackgroundColor(1342177280);
            }
            linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: j9.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    LabelItemAdapter.c cVar = this.f41181b;
                    AdapterView.OnItemLongClickListener onItemLongClickListener = LabelItemAdapter.this.f33718d;
                    return onItemLongClickListener != null && onItemLongClickListener.onItemLongClick(null, cVar.itemView, cVar.getAdapterPosition(), cVar.getItemId());
                }
            });
        }

        @Override // com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter.a
        public final void a(b bVar) {
            if (!(bVar instanceof d)) {
                throw new RuntimeException("ItemHolder must bind ItemItem");
            }
            final u uVar = ((d) bVar).f33727a;
            this.f33723c.setText(((d) bVar).f33727a.getString("value"));
            ViewOnClickListenerC2181y0 viewOnClickListenerC2181y0 = new ViewOnClickListenerC2181y0(this, 2, uVar);
            ImageView imageView = this.f33724d;
            imageView.setOnClickListener(viewOnClickListenerC2181y0);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: j9.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LabelItemAdapter.c cVar = this.f41182b;
                    cVar.getClass();
                    u uVar2 = uVar;
                    uVar2.increment("rating", 1);
                    int i10 = z.f47484b;
                    uVar2.getRelation("usersRated").add((z) ParseUser.getCurrentUser());
                    uVar2.f47481b = true;
                    uVar2.saveEventually();
                    cVar.f33724d.setVisibility(4);
                    cVar.f33722b.setVisibility(4);
                }
            };
            ImageView imageView2 = this.f33722b;
            imageView2.setOnClickListener(onClickListener);
            int i10 = uVar.f47481b ? 4 : 0;
            imageView.setVisibility(i10);
            imageView2.setVisibility(i10);
            int adapterPosition = getAdapterPosition();
            LabelItemAdapter labelItemAdapter = LabelItemAdapter.this;
            int size = labelItemAdapter.f33717c.size() - 1;
            View view = this.f33725e;
            if (adapterPosition >= size || labelItemAdapter.getItemViewType(adapterPosition + 1) != 1) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public static class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f33727a;

        public d(u uVar) {
            this.f33727a = uVar;
        }

        @Override // com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter.b
        public final int a() {
            return 1;
        }
    }

    public class e extends a {
        @Override // com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter.a
        public final void a(b bVar) {
            if (!(bVar instanceof f)) {
                throw new RuntimeException("LabelHolder must bind LabelItem");
            }
            ((TextView) this.itemView).setText(((f) bVar).f33728a);
        }
    }

    public static class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33728a;

        public f(String str) {
            this.f33728a = str;
        }

        @Override // com.voltasit.obdeleven.ui.adapter.pro.LabelItemAdapter.b
        public final int a() {
            return 0;
        }
    }

    public LabelItemAdapter(Context context, Theme theme) {
        this.f33715a = theme;
        this.f33716b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f33717c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        return ((b) this.f33717c.get(i10)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        ((a) b10).a((b) this.f33717c.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Theme theme = this.f33715a;
        Context context = this.f33716b;
        if (i10 != 0) {
            return new c(context, viewGroup, theme);
        }
        e eVar = new e(LayoutInflater.from(context).inflate(R.layout.item_label, viewGroup, false));
        if (theme != Theme.f33719b) {
            return eVar;
        }
        ((TextView) eVar.itemView).setTextColor(context.getResources().getColor(android.R.color.white));
        return eVar;
    }
}
