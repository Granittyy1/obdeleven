package com.voltasit.obdeleven.ui.module;

import X8.m;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.text.font.s;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import com.voltasit.obdeleven.models.SupportedManufacturer;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import java.util.ArrayList;
import java.util.Arrays;
import p033c7.a0;
import p110i9.w;
import p110i9.x;
import p220r9.A;
import p255u9.F;

/* JADX INFO: compiled from: SupportedModelFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class l extends BaseFragment implements AdapterView.OnItemClickListener, i9.c.a<p315z8.a>, DialogCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ListView f34125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f34126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProgressBar f34127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f34128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ShapeableImageView f34129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f34130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f34131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f34132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f34133t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EditText f34135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f34136w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x f34138y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f34139z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SupportedManufacturer f34134u = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SupportedManufacturer f34137x = null;

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        if ((this.f34131r.getVisibility() != 0 && this.f34133t.getVisibility() != 0 && this.f34127n.getVisibility() != 0) || this.f34125l.getVisibility() != 8) {
            return false;
        }
        Q();
        return true;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewX = x(viewGroup, R.layout.supported_model_fragment);
        this.f34127n = (ProgressBar) viewX.findViewById(R.id.supportedModelFragment_progress);
        this.f34125l = (ListView) viewX.findViewById(R.id.supportedModelFragment_carManufacturerList);
        this.f34128o = (FrameLayout) viewX.findViewById(R.id.supportedModelFragment_manufacturerSelectionCover);
        this.f34130q = (TextView) viewX.findViewById(R.id.supportedModelFragment_error);
        this.f34132s = (TextView) viewX.findViewById(R.id.supportedModelFragment_modelSelectionTitle);
        this.f34131r = (LinearLayout) viewX.findViewById(R.id.supportedModelFragment_modelSelectionContainer);
        this.f34133t = (FrameLayout) viewX.findViewById(R.id.supportedModelFragment_modelSelectionCover);
        this.f34129p = (ShapeableImageView) viewX.findViewById(R.id.supportedModelFragment_modelSelectionImage);
        this.f34126m = (RecyclerView) viewX.findViewById(R.id.supportedModelFragment_modelList);
        this.f34135v = (EditText) viewX.findViewById(R.id.supportedModelFragment_lookup);
        this.f34136w = (LinearLayout) viewX.findViewById(R.id.supportedModelFragment_rootLayout);
        ListView listView = this.f34125l;
        w wVar = new w(getContext());
        wVar.f36803b.addAll(Arrays.asList(SupportedManufacturer.values()));
        listView.setAdapter((ListAdapter) wVar);
        this.f34125l.setOnItemClickListener(this);
        A.b(this.f34126m);
        this.f34126m.setHasFixedSize(true);
        x xVar = new x(getContext(), this);
        this.f34138y = xVar;
        this.f34126m.setAdapter(xVar);
        this.f34135v.setInputType(1);
        this.f34135v.addTextChangedListener(new k(this));
        Q();
        SupportedManufacturer supportedManufacturer = this.f34137x;
        if (supportedManufacturer != null) {
            P(supportedManufacturer);
            O(this.f34137x);
            this.f34134u = this.f34137x;
        }
        if (q().E()) {
            View viewFindViewById = viewX.findViewById(R.id.supportedModelFragment_manufacturerSelectionImage);
            int i10 = A0.f.i(this) / 3;
            viewFindViewById.getLayoutParams().height = i10;
            this.f34129p.getLayoutParams().height = i10;
        }
        return viewX;
    }

    public final void O(SupportedManufacturer supportedManufacturer) {
        if (supportedManufacturer == null) {
            return;
        }
        p279w9.d.a(F.a(supportedManufacturer.a()), new p279w9.a(s.b("SUPPORTED_MODELS", supportedManufacturer.a()), 0L), new a0(this, supportedManufacturer));
    }

    public final void P(final SupportedManufacturer supportedManufacturer) {
        this.f34127n.setVisibility(0);
        this.f34125l.setVisibility(8);
        this.f34131r.setVisibility(8);
        this.f34133t.setVisibility(8);
        this.f34130q.setVisibility(8);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(q(), android.R.anim.fade_out);
        animationLoadAnimation.setDuration(250L);
        final Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(q(), android.R.anim.fade_in);
        animationLoadAnimation2.setDuration(250L);
        animationLoadAnimation.setAnimationListener(new SimpleAnimationListener() { // from class: com.voltasit.obdeleven.ui.module.i
            @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
            public final void a(SimpleAnimationListener.AnimationState animationState) {
                SimpleAnimationListener.AnimationState animationState2 = SimpleAnimationListener.AnimationState.f31115c;
                l lVar = this.f34121a;
                if (animationState != animationState2) {
                    lVar.getClass();
                    return;
                }
                if (lVar.f34125l.getVisibility() == 0) {
                    return;
                }
                lVar.f34125l.setVisibility(8);
                lVar.f34128o.setVisibility(8);
                TextView textView = lVar.f34132s;
                SupportedManufacturer supportedManufacturer2 = supportedManufacturer;
                textView.setText(supportedManufacturer2.toString());
                lVar.f34129p.setImageResource(supportedManufacturer2.b());
                lVar.f34133t.setVisibility(0);
                lVar.f34133t.startAnimation(animationLoadAnimation2);
            }
        });
        this.f34128o.startAnimation(animationLoadAnimation);
    }

    public final void Q() {
        this.f34134u = null;
        this.f34135v.setText("");
        this.f34136w.setBackgroundResource(R.drawable.content_background);
        this.f34133t.setVisibility(8);
        this.f34128o.setVisibility(0);
        this.f34125l.setVisibility(0);
        this.f34127n.setVisibility(8);
        this.f34131r.setVisibility(8);
        this.f34130q.setVisibility(8);
    }

    @Override // i9.c.a
    public final void d(Object obj) {
        p315z8.c cVar = ((p315z8.a) obj).f48947d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        DialogC2146g0 dialogC2146g0 = new DialogC2146g0(q(), arrayList);
        dialogC2146g0.f33961k = new m(5, this);
        dialogC2146g0.show();
    }

    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (callbackType == DialogCallback.CallbackType.f31102c) {
            O(this.f34134u);
        } else if (callbackType == DialogCallback.CallbackType.f31101b) {
            Q();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "SupportedModelFragment";
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        this.f34136w.setBackground(null);
        SupportedManufacturer supportedManufacturer = (SupportedManufacturer) ((w) adapterView.getAdapter()).f36803b.get(i10);
        this.f34137x = supportedManufacturer;
        this.f34134u = supportedManufacturer;
        P(supportedManufacturer);
        O(supportedManufacturer);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.view_supported_models_title);
    }
}
