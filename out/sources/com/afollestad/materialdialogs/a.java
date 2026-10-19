package com.afollestad.materialdialogs;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRvAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends RecyclerView.Adapter<ViewOnClickListenerC0242a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialDialog f23264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GravityEnum f23266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MaterialDialog f23267d;

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultRvAdapter.java */
    public static class ViewOnClickListenerC0242a extends RecyclerView.B implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CompoundButton f23268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f23269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f23270d;

        public ViewOnClickListenerC0242a(View view, a aVar) {
            super(view);
            this.f23268b = (CompoundButton) view.findViewById(R.id.md_control);
            this.f23269c = (TextView) view.findViewById(R.id.md_title);
            this.f23270d = aVar;
            view.setOnClickListener(this);
            aVar.f23264a.f23192d.getClass();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = this.f23270d;
            if (aVar.f23267d == null || getAdapterPosition() == -1) {
                return;
            }
            MaterialDialog materialDialog = aVar.f23264a;
            if (materialDialog.f23192d.f23242l != null && getAdapterPosition() < materialDialog.f23192d.f23242l.size()) {
                materialDialog.f23192d.f23242l.get(getAdapterPosition());
            }
            aVar.f23267d.e(view, getAdapterPosition(), false);
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            a aVar = this.f23270d;
            if (aVar.f23267d == null || getAdapterPosition() == -1) {
                return false;
            }
            MaterialDialog materialDialog = aVar.f23264a;
            if (materialDialog.f23192d.f23242l != null && getAdapterPosition() < materialDialog.f23192d.f23242l.size()) {
                materialDialog.f23192d.f23242l.get(getAdapterPosition());
            }
            return aVar.f23267d.e(view, getAdapterPosition(), true);
        }
    }

    public a(MaterialDialog materialDialog, int i10) {
        this.f23264a = materialDialog;
        this.f23265b = i10;
        this.f23266c = materialDialog.f23192d.f23237f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<CharSequence> arrayList = this.f23264a.f23192d.f23242l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        boolean z10;
        MaterialDialog materialDialog;
        ViewOnClickListenerC0242a viewOnClickListenerC0242a = (ViewOnClickListenerC0242a) b10;
        View view = viewOnClickListenerC0242a.itemView;
        Integer numValueOf = Integer.valueOf(i10);
        MaterialDialog materialDialog2 = this.f23264a;
        Integer[] numArr = materialDialog2.f23192d.f23216F;
        if (numArr != null && numArr.length != 0) {
            int length = numArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z10 = false;
                    break;
                } else {
                    if (numArr[i11].equals(numValueOf)) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
        } else {
            z10 = false;
            break;
        }
        MaterialDialog.a aVar = materialDialog2.f23192d;
        int iA = z10 ? p067f3.b.a(0.4f, aVar.f23225O) : aVar.f23225O;
        boolean z11 = !z10;
        viewOnClickListenerC0242a.itemView.setEnabled(z11);
        int iOrdinal = materialDialog2.f23206s.ordinal();
        CompoundButton compoundButton = viewOnClickListenerC0242a.f23268b;
        if (iOrdinal == 1) {
            RadioButton radioButton = (RadioButton) compoundButton;
            boolean z12 = aVar.f23215E == i10;
            int i12 = aVar.f23247q;
            int iA2 = p067f3.b.a(0.3f, p067f3.b.c(p067f3.b.f(radioButton.getContext(), android.R.attr.textColorPrimary, 0)) ? -16777216 : -1);
            radioButton.setButtonTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled, -16842912}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, android.R.attr.state_checked}}, new int[]{p067f3.b.f(radioButton.getContext(), R.attr.colorControlNormal, 0), i12, iA2, iA2}));
            radioButton.setChecked(z12);
            radioButton.setEnabled(z11);
        } else if (iOrdinal == 2) {
            throw null;
        }
        CharSequence charSequence = aVar.f23242l.get(i10);
        TextView textView = viewOnClickListenerC0242a.f23269c;
        textView.setText(charSequence);
        textView.setTextColor(iA);
        MaterialDialog.g(textView, aVar.f23218H);
        ViewGroup viewGroup = (ViewGroup) view;
        GravityEnum gravityEnum = this.f23266c;
        ((LinearLayout) viewGroup).setGravity(gravityEnum.a() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (gravityEnum == GravityEnum.f23190d) {
                materialDialog = materialDialog2;
                if (materialDialog.f23192d.f23232a.getResources().getConfiguration().getLayoutDirection() != 1 && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                    CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(0);
                    viewGroup.removeView(compoundButton2);
                    TextView textView2 = (TextView) viewGroup.getChildAt(0);
                    viewGroup.removeView(textView2);
                    textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingLeft(), textView2.getPaddingBottom());
                    viewGroup.addView(textView2);
                    viewGroup.addView(compoundButton2);
                }
            } else {
                materialDialog = materialDialog2;
            }
            if (gravityEnum == GravityEnum.f23188b && materialDialog.f23192d.f23232a.getResources().getConfiguration().getLayoutDirection() == 1 && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
                CompoundButton compoundButton3 = (CompoundButton) viewGroup.getChildAt(1);
                viewGroup.removeView(compoundButton3);
                TextView textView3 = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView3);
                textView3.setPadding(textView3.getPaddingRight(), textView3.getPaddingTop(), textView3.getPaddingRight(), textView3.getPaddingBottom());
                viewGroup.addView(compoundButton3);
                viewGroup.addView(textView3);
            }
        }
        if (viewGroup.getChildCount() == 2) {
            if (viewGroup.getChildAt(0) instanceof CompoundButton) {
                viewGroup.getChildAt(0).setBackground(null);
            } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
                viewGroup.getChildAt(1).setBackground(null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f23265b, viewGroup, false);
        MaterialDialog materialDialog = this.f23264a;
        MaterialDialog.a aVar = materialDialog.f23192d;
        aVar.getClass();
        Drawable drawableG = p067f3.b.g(aVar.f23232a, R.attr.md_list_selector);
        if (drawableG == null) {
            drawableG = p067f3.b.g(materialDialog.getContext(), R.attr.md_list_selector);
        }
        viewInflate.setBackground(drawableG);
        return new ViewOnClickListenerC0242a(viewInflate, this);
    }
}
