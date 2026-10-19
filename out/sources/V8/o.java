package V8;

import B8.E0;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.parse.model.CodingType;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p134k8.D1;

/* JADX INFO: compiled from: SubsystemFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class o extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f6810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f6811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f6812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f6813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f6814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f6815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public D1 f6816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ControlUnit f6817t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button[] f6809l = new Button[3];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.f f6818u = (com.voltasit.obdeleven.domain.usecases.f) KoinJavaComponent.a(com.voltasit.obdeleven.domain.usecases.f.class);

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_subsystem, viewGroup, false);
        this.f6810m = (ImageView) viewInflate.findViewById(R.id.subsystemFragment_image);
        this.f6811n = (TextView) viewInflate.findViewById(R.id.subsystemFragment_name);
        this.f6812o = (TextView) viewInflate.findViewById(R.id.subsystemFragment_number);
        this.f6813p = (LinearLayout) viewInflate.findViewById(R.id.subsystemFragment_buttons);
        Button button = (Button) viewInflate.findViewById(R.id.subsystemFragment_info);
        this.f6814q = (Button) viewInflate.findViewById(R.id.subsystemFragment_coding);
        Button button2 = (Button) viewInflate.findViewById(R.id.subsystemFragment_longCoding);
        this.f6815r = button2;
        Button[] buttonArr = this.f6809l;
        buttonArr[0] = button;
        buttonArr[1] = this.f6814q;
        buttonArr[2] = button2;
        for (Button button3 : buttonArr) {
            button3.setOnClickListener(this);
        }
        return viewInflate;
    }

    public final void O() {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "SubsystemFragment", "requestInfo()", Arrays.copyOf(new Object[0], 0));
        C2134a0.b(getActivity(), R.string.common_loading_data);
        this.f6816s.s().continueWith(new j(0, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void P() {
        int color;
        String str;
        if (isVisible()) {
            if (!this.f6817t.b()) {
                color = getResources().getColor(R.color.black);
            } else if (this.f6817t.j0()) {
                color = this.f6817t.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
            this.f6812o.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            try {
                String string = this.f6811n.getText().toString() + "\n";
                if (this.f6818u.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    Locale locale = Locale.US;
                    sb2.append("(" + this.f6816s.getId() + ") ");
                    string = sb2.toString();
                }
                try {
                    str = string + this.f6816s.u();
                } catch (ControlUnitException unused) {
                    str = string + getResources().getString(R.string.common_unknown);
                }
                this.f6811n.setText(str);
                if (this.f6816s.v() != CodingType.f34405e) {
                    LinearLayout linearLayout = this.f6813p;
                    linearLayout.getChildAt(linearLayout.indexOfChild(this.f6814q) - 1).setVisibility(8);
                    this.f6814q.setVisibility(8);
                }
                if (this.f6816s.v() != CodingType.f34406f) {
                    LinearLayout linearLayout2 = this.f6813p;
                    linearLayout2.getChildAt(linearLayout2.indexOfChild(this.f6815r) - 1).setVisibility(8);
                    this.f6815r.setVisibility(8);
                }
                C2134a0.a();
                int i10 = 0;
                for (Button button : this.f6809l) {
                    if (button.getVisibility() == 0) {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.scale_in_horizontal);
                        animationLoadAnimation.setStartOffset(i10);
                        button.startAnimation(animationLoadAnimation);
                        i10 += 50;
                    }
                }
                this.f6813p.setVisibility(0);
            } catch (ControlUnitException unused2) {
                O();
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "SubsystemFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.subsystemFragment_coding /* 2131363286 */:
                h hVar = new h();
                D1 d10 = this.f6816s;
                hVar.f6791r = d10;
                hVar.f6792s = d10.h();
                r().n(hVar, null);
                break;
            case R.id.subsystemFragment_info /* 2131363288 */:
                s sVar = new s();
                D1 d11 = this.f6816s;
                sVar.f6825l = d11;
                sVar.f6826m = d11.h();
                r().n(sVar, null);
                break;
            case R.id.subsystemFragment_longCoding /* 2131363289 */:
                D d12 = new D();
                D1 d13 = this.f6816s;
                d12.f6761y = d13;
                d12.f6762z = d13.h();
                r().n(d12, null);
                break;
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        D1 d10 = this.f6816s;
        if (d10 != null) {
            d10.a();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C2137c.a();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f6816s == null) {
            q().J();
            return;
        }
        com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(this.f6817t.a0());
        T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
        kotlin.jvm.internal.i.d(dVarJ, "placeholder(...)");
        dVarM.a(dVarJ).x(this.f6810m);
        this.f6812o.setText(this.f6817t.t());
        ActivityC1347l activity = getActivity();
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        this.f6811n.setText(this.f6817t.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(activity).c()).b()));
        P();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_control_unit);
    }
}
