package com.voltasit.obdeleven.presentation.controlUnit.info;

import B8.e1;
import Ia.l;
import Ia.p;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C1451p;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.Iterator;
import java.util.List;
import kotlin.text.n;
import p293xa.r;

/* JADX INFO: compiled from: InfoAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends A<h, b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31644e = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<h, r> f31645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<h, Boolean> f31646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<h, String, r> f31647d;

    /* JADX INFO: compiled from: InfoAdapter.kt */
    public static final class a extends C1451p.e<h> {
        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean a(h hVar, h hVar2) {
            return hVar.equals(hVar2);
        }

        @Override // androidx.recyclerview.widget.C1451p.e
        public final boolean b(h hVar, h hVar2) {
            return hVar == hVar2;
        }
    }

    /* JADX INFO: compiled from: InfoAdapter.kt */
    public final class b extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e1 f31648b;

        public b(e1 e1Var) {
            super(e1Var.f4488d);
            this.f31648b = e1Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super h, r> lVar, l<? super h, Boolean> lVar2, p<? super h, ? super String, r> pVar) {
        super(f31644e);
        this.f31645b = lVar;
        this.f31646c = lVar2;
        this.f31647d = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        final b holder = (b) b10;
        kotlin.jvm.internal.i.e(holder, "holder");
        h hVarA = a(i10);
        kotlin.jvm.internal.i.d(hVarA, "getItem(...)");
        final h hVar = hVarA;
        e1 e1Var = holder.f31648b;
        View view = e1Var.f4488d;
        final d dVar = d.this;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final h item = hVar;
                kotlin.jvm.internal.i.e(item, "$item");
                d.b this$0 = holder;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                final d this$1 = dVar;
                kotlin.jvm.internal.i.e(this$1, "this$1");
                List<String> list = item.f31662e;
                if (list.isEmpty()) {
                    this$1.f31645b.invoke(item);
                    return;
                }
                e1 e1Var2 = this$0.f31648b;
                PopupMenu popupMenu = new PopupMenu(e1Var2.f4488d.getContext(), e1Var2.f1899r);
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    popupMenu.getMenu().add(it.next());
                }
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.g
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        d this$2 = this$1;
                        kotlin.jvm.internal.i.e(this$2, "this$0");
                        h item2 = item;
                        kotlin.jvm.internal.i.e(item2, "$item");
                        this$2.f31647d.invoke(item2, String.valueOf(menuItem.getTitle()));
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.voltasit.obdeleven.presentation.controlUnit.info.f
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                d.b this$0 = holder;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                d this$1 = dVar;
                kotlin.jvm.internal.i.e(this$1, "this$1");
                h item = hVar;
                kotlin.jvm.internal.i.e(item, "$item");
                this$0.f31648b.f4488d.setPressed(false);
                return this$1.f31646c.invoke(item).booleanValue();
            }
        };
        View view2 = e1Var.f4488d;
        view2.setOnLongClickListener(onLongClickListener);
        e1Var.t(hVar);
        TextView textView = e1Var.f1899r;
        String str = hVar.f31661d;
        textView.setText(str);
        String str2 = hVar.f31659b;
        if (n.S(str2)) {
            if (n.S(str)) {
                textView.setText(view2.getContext().getString(R.string.common_no_data));
            }
        } else {
            SpannableString spannableString = new SpannableString(androidx.compose.foundation.gestures.d.b(" (", str2, ")"));
            spannableString.setSpan(new ForegroundColorSpan(view2.getResources().getColor(R.color.green_l)), 0, spannableString.length(), 33);
            textView.append(spannableString);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.i.e(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        int i11 = e1.f1898v;
        DataBinderMapperImpl dataBinderMapperImpl = M0.e.f4480a;
        e1 e1Var = (e1) M0.h.h(layoutInflaterFrom, R.layout.item_labeled_button_info, parent, false, null);
        kotlin.jvm.internal.i.d(e1Var, "inflate(...)");
        return new b(e1Var);
    }
}
