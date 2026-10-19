package com.voltasit.obdeleven.ui.adapter.pro;

import C4.b;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import java.util.Arrays;
import java.util.Locale;
import p005a4.q;

/* JADX INFO: loaded from: classes3.dex */
public final class LabelInputAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Theme f33701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f33706g = new String[0];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Theme {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Theme f33707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Theme f33708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Theme[] f33709d;

        static {
            Theme theme = new Theme("LIGHT", 0);
            f33707b = theme;
            Theme theme2 = new Theme("DARK", 1);
            f33708c = theme2;
            f33709d = new Theme[]{theme, theme2};
        }

        public Theme() {
            throw null;
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) f33709d.clone();
        }
    }

    public LabelInputAdapter(Context context, Theme theme, boolean z10, boolean z11) {
        this.f33700a = context;
        this.f33701b = theme;
        this.f33702c = z10;
        this.f33703d = z11;
    }

    public final void a(int i10, String str) {
        boolean z10 = this.f33703d;
        if (i10 == -2 && z10) {
            i10 = -1;
        } else if (i10 == -1 && z10) {
            i10 = -2;
        }
        if (z10) {
            i10++;
        }
        if (this.f33702c) {
            i10++;
        }
        if (i10 >= 0) {
            this.f33706g[i10] = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final void b(int i10, boolean z10) {
        int iPow;
        int i11;
        this.f33704e = i10;
        this.f33705f = z10;
        boolean z11 = this.f33703d;
        ?? r10 = this.f33702c;
        int i12 = r10;
        if (z11) {
            i11 = r10 + 1;
        }
        if (z10) {
            i12 = i11;
            iPow = (int) (Math.pow(2.0d, i10) + ((double) i12));
        } else {
            i12 = i11;
            iPow = i10 + i12;
        }
        this.f33706g = (String[]) Arrays.copyOf(this.f33706g, iPow);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        String[] strArr = this.f33706g;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        if (this.f33702c) {
            i10--;
        }
        boolean z10 = this.f33703d;
        if (z10) {
            i10--;
        }
        if (i10 == -2) {
            return -1L;
        }
        if (i10 == -1 && z10) {
            return -2L;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        String string;
        a aVar = (a) b10;
        long itemId = getItemId(i10);
        String str = this.f33706g[i10];
        if (str == null) {
            str = "";
        }
        if (itemId == -2) {
            aVar.f33712d.setMaxLines(BrazeLogger.SUPPRESS);
            aVar.f33712d.setInputType(147457);
        } else {
            aVar.f33712d.setMaxLines(1);
            aVar.f33712d.setInputType(16385);
        }
        Context context = this.f33700a;
        if (itemId == -2) {
            string = context.getString(R.string.common_description);
        } else if (itemId == -1) {
            string = context.getString(R.string.common_name);
        } else {
            String str2 = context.getString(R.string.common_value) + ' ';
            if (this.f33705f) {
                StringBuilder sbE = b.e(str2);
                sbE.append(String.format(q.c(new StringBuilder("%"), this.f33704e, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY), Long.toBinaryString(itemId)).replace(' ', '0'));
                string = sbE.toString();
            } else {
                StringBuilder sbE2 = b.e(str2);
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(itemId + 1);
                sbE2.append(sb2.toString());
                string = sbE2.toString();
            }
        }
        aVar.f33711c.setHint(string);
        aVar.f33712d.setText(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(this.f33700a).inflate(this.f33701b == Theme.f33707b ? R.layout.item_input_light : R.layout.item_input_dark, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        a aVar = (a) b10;
        aVar.f33712d.addTextChangedListener(aVar.f33710b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        a aVar = (a) b10;
        aVar.f33712d.removeTextChangedListener(aVar.f33710b);
    }

    public class a extends RecyclerView.B {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0347a f33710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextInputLayout f33711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final EditText f33712d;

        public a(View view) {
            super(view);
            this.f33711c = (TextInputLayout) view.findViewById(R.id.itemInput_inputLayout);
            this.f33712d = (EditText) view.findViewById(R.id.itemInput_input);
            this.f33710b = new C0347a();
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.adapter.pro.LabelInputAdapter$a$a, reason: collision with other inner class name */
        public class C0347a implements TextWatcher {
            public C0347a() {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                a aVar = a.this;
                LabelInputAdapter.this.f33706g[aVar.getAdapterPosition()] = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        }
    }
}
