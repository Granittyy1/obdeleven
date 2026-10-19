package com.voltasit.obdeleven.presentation.about;

import A0.f;
import B8.O;
import B8.o1;
import I.e;
import M0.h;
import Y8.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.Positionable$Position;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: AboutFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AboutFragment extends BaseFragment<O> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f31224l = R.layout.fragment_about;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f31225m;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.voltasit.obdeleven.presentation.about.AboutFragment$special$$inlined$viewModel$default$1] */
    public AboutFragment() {
        final Ia.a<Ob.a> aVar = new Ia.a<Ob.a>() { // from class: com.voltasit.obdeleven.presentation.about.AboutFragment$aboutViewModel$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Ob.a invoke() {
                return e.j(this.this$0.r());
            }
        };
        final ?? r10 = new Ia.a<Fragment>(this) { // from class: com.voltasit.obdeleven.presentation.about.AboutFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ Fragment $this_viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            @Override // Ia.a
            public final Fragment invoke() {
                return this.$this_viewModel;
            }
        };
        this.f31225m = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<a>(this) { // from class: com.voltasit.obdeleven.presentation.about.AboutFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ Fragment $this_viewModel;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModel = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.about.a] */
            @Override // Ia.a
            public final a invoke() {
                p014b1.a defaultViewModelCreationExtras;
                Fragment fragment = this.$this_viewModel;
                Pb.a aVar2 = this.$qualifier;
                Ia.a aVar3 = r10;
                Ia.a aVar4 = this.$extrasProducer;
                Ia.a aVar5 = aVar;
                b0 viewModelStore = ((c0) aVar3.invoke()).getViewModelStore();
                if (aVar4 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                }
                return Gb.a.a(l.a(a.class), viewModelStore, null, defaultViewModelCreationExtras, aVar2, Cb.a.i(fragment), aVar5);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final void C(h hVar) {
        O o10 = (O) hVar;
        o10.t((a) this.f31225m.getValue());
        String string = getString(R.string.common_software_version);
        o1 o1Var = o10.f1768y;
        o1Var.t(string);
        o1Var.u(c.b("0.107.1 (10800)", false));
        String string2 = getString(R.string.common_developer);
        o1 o1Var2 = o10.f1762s;
        o1Var2.t(string2);
        o1Var2.u(c.a(R.string.common_company_title, false));
        int i10 = f.i(this);
        ShapeableImageView shapeableImageView = o10.f1761r;
        int i11 = i10 / 4;
        shapeableImageView.getLayoutParams().height = i11;
        shapeableImageView.getLayoutParams().width = i11;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "AboutFragment";
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final int p() {
        return this.f31224l;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Position t() {
        return Positionable$Position.f31108d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        String string = getString(R.string.common_about);
        i.d(string, "getString(...)");
        return string;
    }
}
