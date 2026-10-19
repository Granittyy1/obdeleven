package com.voltasit.obdeleven.ui.dialogs;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1452q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.J.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: GarageDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f33794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollView f33795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextInputLayout f33796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f33797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f33798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f33799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f33800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f33801i;
    public ImageView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f33802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f33803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f33804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f33805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f33806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f33807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f33808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p147l9.h f33809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MainActivity.a f33810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List<p255u9.E> f33811t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MainActivity f33812u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.appcompat.app.e f33813v;

    public J(MainActivity mainActivity, boolean z10) {
        this.f33812u = mainActivity;
        androidx.appcompat.app.e.a negativeButton = new androidx.appcompat.app.e.a(mainActivity).setTitle(R.string.dialog_select_vehicle).setView(R.layout.dialog_garage).setPositiveButton(R.string.common_ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.common_cancel, (DialogInterface.OnClickListener) null);
        if (z10) {
            negativeButton.setNeutralButton(R.string.common_list, (DialogInterface.OnClickListener) null);
        }
        androidx.appcompat.app.e eVarCreate = negativeButton.create();
        this.f33813v = eVarCreate;
        eVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.voltasit.obdeleven.ui.dialogs.F
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                J j = this.f33780b;
                j.getClass();
                androidx.appcompat.app.e eVar = (androidx.appcompat.app.e) dialogInterface;
                j.f33794b = (LinearLayout) eVar.findViewById(R.id.garageDialog_garage);
                j.f33795c = (ScrollView) eVar.findViewById(R.id.garageDialog_list);
                j.f33796d = (TextInputLayout) eVar.findViewById(R.id.garageDialog_inputLayout);
                j.f33797e = (EditText) eVar.findViewById(R.id.garageDialog_input);
                j.f33798f = (RecyclerView) eVar.findViewById(R.id.garageDialog_garageList);
                j.f33799g = (TextView) eVar.findViewById(R.id.garageDialog_empty);
                j.f33800h = (ProgressBar) eVar.findViewById(R.id.garageDialog_progress);
                j.f33801i = (ImageView) eVar.findViewById(R.id.garageDialog_vw);
                j.j = (ImageView) eVar.findViewById(R.id.garageDialog_audi);
                j.f33802k = (ImageView) eVar.findViewById(R.id.garageDialog_seat);
                j.f33803l = (ImageView) eVar.findViewById(R.id.garageDialog_skoda);
                j.f33804m = (ImageView) eVar.findViewById(R.id.garageDialog_lambo);
                j.f33805n = (ImageView) eVar.findViewById(R.id.garageDialog_bentley);
                androidx.appcompat.app.e eVar2 = j.f33813v;
                j.f33806o = eVar2.f(-1);
                j.f33807p = eVar2.f(-2);
                j.f33808q = eVar2.f(-3);
                j.f33797e.addTextChangedListener(j.new a());
                MainActivity mainActivity2 = j.f33812u;
                Resources resources = mainActivity2.getResources();
                int i10 = resources.getDisplayMetrics().heightPixels;
                TypedArray typedArrayObtainStyledAttributes = mainActivity2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.actionBarSize});
                kotlin.jvm.internal.i.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                int dimension = (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                int dimensionPixelSize = ((i10 - dimension) - resources.getDimensionPixelSize(R.dimen.list_divider_height)) / 5;
                p147l9.h hVar = new p147l9.h(mainActivity2, dimensionPixelSize);
                j.f33809r = hVar;
                hVar.f36799f = new Q6.d(j);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                C1452q c1452q = new C1452q(mainActivity2, linearLayoutManager.f19521p);
                Drawable drawable = resources.getDrawable(R.drawable.divider_list_transparent);
                if (drawable == null) {
                    throw new IllegalArgumentException("Drawable cannot be null.");
                }
                c1452q.f19936a = drawable;
                j.f33798f.setLayoutManager(linearLayoutManager);
                j.f33798f.i(c1452q);
                j.f33798f.setHasFixedSize(true);
                j.f33798f.setAdapter(j.f33809r);
                j.f33801i.getLayoutParams().height = dimensionPixelSize;
                j.j.getLayoutParams().height = dimensionPixelSize;
                j.f33802k.getLayoutParams().height = dimensionPixelSize;
                j.f33803l.getLayoutParams().height = dimensionPixelSize;
                j.f33804m.getLayoutParams().height = dimensionPixelSize;
                j.f33805n.getLayoutParams().height = dimensionPixelSize;
                j.f33801i.setOnClickListener(j);
                j.j.setOnClickListener(j);
                j.f33802k.setOnClickListener(j);
                j.f33803l.setOnClickListener(j);
                j.f33804m.setOnClickListener(j);
                j.f33805n.setOnClickListener(j);
                j.f33808q.setOnClickListener(j);
                j.f33807p.setOnClickListener(j);
                j.f33806o.setOnClickListener(j);
                int i11 = p255u9.E.f47459b;
                int i12 = p255u9.z.f47484b;
                ParseQuery<T> query = ((p255u9.z) ParseUser.getCurrentUser()).b().getQuery();
                query.include("vehicleModification");
                query.include("vehicleBase");
                query.include("engine");
                query.include("equipment");
                query.addDescendingOrder("updatedAt");
                p279w9.d.a(query, p279w9.a.f47807d, new C7.h(j));
            }
        });
        eVarCreate.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.voltasit.obdeleven.ui.dialogs.G
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f33788b.f33810s.a();
            }
        });
    }

    public static List a(String str, List list) {
        if (str.isEmpty()) {
            return list;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p255u9.E e10 = (p255u9.E) it.next();
            String lowerCase2 = e10.k().toLowerCase(Locale.getDefault());
            String lowerCase3 = e10.d().toLowerCase(Locale.getDefault());
            String lowerCase4 = e10.e().toLowerCase(Locale.getDefault());
            if (lowerCase2.contains(lowerCase) || lowerCase3.contains(lowerCase) || lowerCase4.contains(lowerCase)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.f33801i)) {
            this.f33810s.b("Volkswagen");
        } else if (view.equals(this.j)) {
            this.f33810s.b("Audi");
        } else if (view.equals(this.f33802k)) {
            this.f33810s.b("Seat");
        } else if (view.equals(this.f33803l)) {
            this.f33810s.b("Skoda");
        } else if (view.equals(this.f33804m)) {
            this.f33810s.b("Lamborghini");
        } else if (view.equals(this.f33805n)) {
            this.f33810s.b("Bentley");
        } else {
            boolean zEquals = view.equals(this.f33806o);
            MainActivity mainActivity = this.f33812u;
            if (zEquals) {
                String upperCase = this.f33797e.getText().toString().toUpperCase();
                if (!upperCase.matches("[A-Z0-9]{17}")) {
                    this.f33796d.setError(mainActivity.getString(R.string.dialog_garage_select_or_enter_vin));
                    return;
                } else {
                    MainActivity.a aVar = this.f33810s;
                    aVar.f33572b.D(upperCase, false).continueWith(new com.voltasit.obdeleven.ui.activity.q(aVar.f33571a));
                }
            } else if (view.equals(this.f33807p)) {
                this.f33810s.a();
            } else if (view.equals(this.f33808q)) {
                if (this.f33808q.getText().toString().equals(mainActivity.getString(R.string.common_list))) {
                    this.f33808q.setText(R.string.common_garage);
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(mainActivity, R.anim.push_up_out);
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(mainActivity, R.anim.push_up_in);
                    animationLoadAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.voltasit.obdeleven.ui.dialogs.H
                        @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
                        public final void a(SimpleAnimationListener.AnimationState animationState) {
                            SimpleAnimationListener.AnimationState animationState2 = SimpleAnimationListener.AnimationState.f31115c;
                            J j = this.f33789a;
                            if (animationState == animationState2) {
                                j.f33794b.setVisibility(8);
                            } else {
                                j.getClass();
                            }
                        }
                    });
                    this.f33795c.setVisibility(0);
                    this.f33794b.startAnimation(animationLoadAnimation);
                    this.f33795c.startAnimation(animationLoadAnimation2);
                    return;
                }
                this.f33808q.setText(R.string.common_list);
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(mainActivity, R.anim.push_down_in);
                Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(mainActivity, R.anim.push_down_out);
                animationLoadAnimation4.setAnimationListener(new SimpleAnimationListener() { // from class: com.voltasit.obdeleven.ui.dialogs.I
                    @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
                    public final void a(SimpleAnimationListener.AnimationState animationState) {
                        SimpleAnimationListener.AnimationState animationState2 = SimpleAnimationListener.AnimationState.f31115c;
                        J j = this.f33792a;
                        if (animationState == animationState2) {
                            j.f33795c.setVisibility(8);
                        } else {
                            j.getClass();
                        }
                    }
                });
                this.f33794b.setVisibility(0);
                this.f33794b.startAnimation(animationLoadAnimation3);
                this.f33795c.startAnimation(animationLoadAnimation4);
                return;
            }
        }
        this.f33813v.dismiss();
    }

    /* JADX INFO: compiled from: GarageDialog.java */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String strValueOf = String.valueOf(charSequence);
            J j = J.this;
            p147l9.h hVar = j.f33809r;
            hVar.f36795b = J.a(strValueOf, j.f33811t);
            hVar.notifyDataSetChanged();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
