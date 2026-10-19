package p022b9;

import B8.E0;
import O8.b;
import V8.B;
import V8.y;
import W7.c;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.interfaces.Positionable$Transition;
import com.voltasit.obdeleven.presentation.controlUnit.k;
import com.voltasit.obdeleven.presentation.d;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.koin.java.KoinJavaComponent;
import p134k8.T1;
import p194p8.j;
import p219r8.e;
import p220r9.Q;

/* JADX INFO: compiled from: ControlUnitSequentialOutputTestFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/99/output-test")
public class f extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f20625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FloatingActionButton f20626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout[] f20627n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ControlUnit f20629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f20630q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueUnit f20632s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SwipeRefreshLayout f20634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f20635v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20628o = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20631r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20633t = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f20636w = KoinJavaComponent.b(Z8.a.class, null, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f20637x = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: compiled from: ControlUnitSequentialOutputTestFragment.java */
    public class a implements Continuation<Void, Object> {
        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task<Void> task) throws Exception {
            if (!task.isFaulted()) {
                return null;
            }
            O.e.m(task.getError());
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int color;
        z((d) this.f20636w.getValue());
        View viewInflate = layoutInflater.inflate(R.layout.fragment_control_unit_sequential_output_test, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_cover);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_number);
        this.f20635v = (LinearLayout) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_contentHolder);
        this.f20625l = (TextView) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_title);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_meas0);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_meas1);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_meas2);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_meas3);
        this.f20626m = (FloatingActionButton) viewInflate.findViewById(R.id.controlUnitSequentialOutputTestFragment_fab);
        setHasOptionsMenu(true);
        setMenuVisibility(true);
        this.f20627n = new LinearLayout[]{linearLayout, linearLayout2, linearLayout3, linearLayout4};
        int i10 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f20627n;
            if (i10 >= linearLayoutArr.length) {
                break;
            }
            TextView textView3 = (TextView) linearLayoutArr[i10].getChildAt(0);
            Locale locale = Locale.US;
            i10++;
            textView3.setText(getString(R.string.common_value) + " " + i10);
        }
        this.f20626m.setOnClickListener(this);
        this.f20626m.setEnabled(false);
        if (this.f20629p == null) {
            return viewInflate;
        }
        if (c.e()) {
            ActivityC1347l activity = getActivity();
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            this.f20632s = com.voltasit.obdeleven.a.C0320a.a(activity).i();
            com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(getContext()).f(this).m(this.f20629p.a0());
            T3.d dVarJ = ((T3.d) E0.a(R.drawable.control_unit_default)).f(R.drawable.control_unit_default).j(R.drawable.control_unit_default);
            i.d(dVarJ, "placeholder(...)");
            dVarM.a(dVarJ).x(imageView);
            textView2.setText(this.f20629p.t());
            textView.setText(this.f20629p.x(DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(getActivity()).c()).b()));
            if (!this.f20629p.b()) {
                color = getResources().getColor(R.color.black);
            } else if (this.f20629p.j0()) {
                color = this.f20629p.f29337t ? getResources().getColor(R.color.holo_red_dark) : getResources().getColor(R.color.holo_green_dark);
            } else {
                color = getResources().getColor(R.color.yellow_500);
            }
            textView2.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            O();
            if (this.f20628o) {
                S(true);
            }
        } else {
            r().o(false);
        }
        if (q().E()) {
            frameLayout.setVisibility(8);
            ((LinearLayout.LayoutParams) this.f20635v.getLayoutParams()).topMargin = 0;
        }
        this.f20634u = Q.b(viewInflate);
        this.f20626m.setOnLongClickListener(new View.OnLongClickListener() { // from class: b9.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                this.f20622b.S(true);
                return true;
            }
        });
        return this.f20634u;
    }

    public void O() {
        e aVar;
        e eVar;
        O.e.s("ControlUnitSequentialOutputTestFragment", "createOutputTest(Sequential)");
        ControlUnit controlUnit = this.f20629p;
        int iOrdinal = controlUnit.f29327i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eVar = null;
            } else {
                aVar = new p219r8.d(controlUnit);
            }
            this.f20630q = eVar;
        }
        aVar = new p219r8.a(controlUnit);
        eVar = aVar;
        this.f20630q = eVar;
    }

    public void P() {
        S(true);
    }

    public final void Q(final boolean z10) {
        this.f20629p.D(false).continueWithTask(new Continuation() { // from class: b9.c
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                final f fVar = this.f20620a;
                fVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(null);
                }
                e eVar = fVar.f20630q;
                Task<TContinuationResult> taskContinueWithTask = eVar.f46401b.continueWithTask(new k(4, eVar));
                eVar.f46401b = taskContinueWithTask.makeVoid();
                final boolean z11 = z10;
                return taskContinueWithTask.continueWith((Continuation<TContinuationResult, TContinuationResult>) new Continuation() { // from class: b9.e
                    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        String string;
                        f fVar2 = fVar;
                        fVar2.getClass();
                        int i10 = 0;
                        if (task2.isFaulted()) {
                            fVar2.f20631r = false;
                            fVar2.f20626m.setEnabled(false);
                            fVar2.R(task2);
                            fVar2.f20625l.setText(fVar2.getString(R.string.common_not_available));
                            String string2 = fVar2.getString(R.string.common_not_available);
                            while (i10 < 4) {
                                ((TextView) fVar2.f20627n[i10].getChildAt(1)).setText(string2);
                                i10++;
                            }
                            return null;
                        }
                        if (fVar2.f20633t) {
                            UserTrackingUtils.c(UserTrackingUtils.Key.f34240A, 1);
                            fVar2.f20633t = false;
                        }
                        if (fVar2.f20630q.b()) {
                            fVar2.f20626m.setEnabled(false);
                            fVar2.f20631r = false;
                        } else {
                            fVar2.f20626m.setEnabled(true);
                        }
                        if (fVar2.f20629p.f29327i == ApplicationProtocol.f29262b) {
                            fVar2.f20631r = false;
                        }
                        p219r8.e eVar2 = fVar2.f20630q;
                        Task<TContinuationResult> taskContinueWithTask2 = eVar2.f46401b.continueWithTask(new B(6, eVar2));
                        eVar2.f46401b = taskContinueWithTask2.makeVoid();
                        j jVar = (j) taskContinueWithTask2.getResult();
                        boolean z12 = fVar2.f20631r;
                        boolean z13 = z11;
                        if (z12) {
                            fVar2.Q(z13);
                        }
                        fVar2.f20625l.setText(z13 ? fVar2.f20630q.d() : fVar2.f20625l.getText().toString());
                        String string3 = fVar2.getString(R.string.common_not_available);
                        if (jVar == null) {
                            O.e.D("ControlUnitSequentialOutputTestFragment", "updateContent() measurement is null");
                            return null;
                        }
                        ArrayList arrayListA = jVar.a(fVar2.f20632s);
                        while (i10 < 4) {
                            TextView textView = (TextView) fVar2.f20627n[i10].getChildAt(1);
                            if (i10 < arrayListA.size()) {
                                T1 t8 = (T1) arrayListA.get(i10);
                                if (t8.f42679b != null) {
                                    string = t8.toString();
                                } else {
                                    string = string3;
                                }
                            } else {
                                string = string3;
                            }
                            textView.setText(string);
                            i10++;
                        }
                        return null;
                    }
                }, Task.UI_THREAD_EXECUTOR);
            }
        }).continueWith(new a());
    }

    public final void R(Task<Void> task) {
        if (!(task.getError() instanceof CommandException)) {
            P8.c.b(task.getError());
            return;
        }
        int iA = ((CommandException) task.getError()).a();
        if (iA != -1) {
            F(String.format("(%02X) %s", Integer.valueOf(iA), Texttabe.a(iA)));
        } else {
            E(R.string.common_request_timeout);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final void S(boolean z10) {
        ((J8.a) this.f20637x.getValue()).U("sequential");
        this.f20631r = true;
        if (z10) {
            this.f20625l.setText(R.string.common_scanning);
            String string = getString(R.string.common_not_available);
            for (int i10 = 0; i10 < 4; i10++) {
                ((TextView) this.f20627n[i10].getChildAt(1)).setText(string);
            }
        }
        Q(z10);
        M();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public String o() {
        return "ControlUnitSequentialOutputTestFragment";
    }

    public void onClick(View view) {
        if (view.getId() != R.id.controlUnitSequentialOutputTestFragment_fab) {
            return;
        }
        this.f20633t = true;
        this.f20634u.setRefreshing(true);
        this.f20626m.setClickable(false);
        e eVar = this.f20630q;
        Task taskContinueWithTask = eVar.f46401b.continueWithTask(new y(5, eVar));
        eVar.f46401b = taskContinueWithTask;
        taskContinueWithTask.continueWith(new b(0, this), Task.UI_THREAD_EXECUTOR);
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        e eVar;
        super.onPause();
        this.f20631r = false;
        if (this.f20629p != null && (eVar = this.f20630q) != null) {
            Task taskContinueWithTask = eVar.f46401b.continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(5, eVar));
            eVar.f46401b = taskContinueWithTask;
            taskContinueWithTask.continueWithTask(new p022b9.a(0, this));
        }
        N();
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f20629p != null) {
            P();
        }
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final Positionable$Transition s() {
        return Positionable$Transition.f31112d;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return getString(R.string.common_output_test);
    }
}
