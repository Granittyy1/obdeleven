package p010a9;

import J8.a;
import O.e;
import O8.b;
import V8.g;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.F0;
import kotlin.jvm.internal.i;
import org.koin.java.KoinJavaComponent;
import p022b9.f;
import p219r8.c;

/* JADX INFO: compiled from: ControlUnitSelectiveOutputTestFragment.java */
/* JADX INFO: loaded from: classes3.dex */
@b("http://obdeleven.proboards.com/thread/99/output-test")
public class d extends f implements DialogCallback {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public F0 f8080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8081z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f8079A = KoinJavaComponent.b(a.class, null, null);

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment
    public final boolean A() {
        F0 f10 = this.f8080y;
        if (f10 == null) {
            r().h();
            return true;
        }
        f10.y();
        this.f8080y = null;
        return true;
    }

    @Override // p022b9.f, com.voltasit.obdeleven.ui.module.BaseFragment
    public final View B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20628o = false;
        View viewB = super.B(layoutInflater, viewGroup, bundle);
        this.f20625l.setOnClickListener(this);
        F0 f10 = this.f8080y;
        if (f10 == null || !f10.isVisible()) {
            T();
            this.f20635v.setVisibility(4);
        }
        return viewB;
    }

    @Override // p022b9.f
    public final void O() {
        e.s("ControlUnitSelectiveOutputTestFragment", "createOutputTest(Selective)");
        this.f20630q = new c(this.f20629p);
    }

    public final void T() {
        F0 f10 = this.f8080y;
        if (f10 != null) {
            f10.y();
            this.f8080y = null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_title", R.string.common_enter_channel);
        bundle.putInt("key_min", 0);
        bundle.putInt("key_max", 65535);
        ControlUnit controlUnit = this.f20629p;
        Bundle bundle2 = this.f34090k;
        i.b(bundle2);
        bundle.putBoolean("isSequantialOutputSupported", bundle2.getBoolean("is_sequential_test_supported"));
        F0 f11 = new F0();
        f11.setArguments(bundle);
        f11.f32261r = getFragmentManager();
        f11.setTargetFragment(this, 0);
        f11.f33785w = controlUnit;
        this.f8080y = f11;
        f11.A();
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, xa.g] */
    @Override // com.voltasit.obdeleven.interfaces.DialogCallback
    public final void g(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (str.equals("SelectiveOutputDialog")) {
            if (callbackType == DialogCallback.CallbackType.f31103d) {
                ((a) this.f8079A.getValue()).U("selective");
                e.s("ControlUnitSelectiveOutputTestFragment", "handleSequentialTest()");
                this.f20631r = false;
                p219r8.e eVar = this.f20630q;
                Task taskContinueWithTask = eVar.f46401b.continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(5, eVar));
                eVar.f46401b = taskContinueWithTask;
                taskContinueWithTask.continueWith(new a(0, this), Task.UI_THREAD_EXECUTOR).continueWith(new b(0));
            } else if (callbackType == DialogCallback.CallbackType.f31101b) {
                TextView textView = (TextView) this.f20627n[0].getChildAt(1);
                textView.getText();
                if (!this.f20631r && textView.getText().length() == 0) {
                    r().h();
                }
                F0 f10 = this.f8080y;
                if (f10 != null) {
                    f10.y();
                    this.f8080y = null;
                }
            } else if (callbackType == DialogCallback.CallbackType.f31102c) {
                e.s("ControlUnitSelectiveOutputTestFragment", "prepareAndStartTest()");
                this.f20631r = false;
                p219r8.e eVar2 = this.f20630q;
                Task taskContinueWithTask2 = eVar2.f46401b.continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(5, eVar2));
                eVar2.f46401b = taskContinueWithTask2;
                taskContinueWithTask2.continueWith(new g(this, 1, bundle), Task.UI_THREAD_EXECUTOR).continueWith(new c(0));
            }
            F0 f11 = this.f8080y;
            if (f11 != null) {
                f11.y();
                this.f8080y = null;
            }
        }
    }

    @Override // p022b9.f, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "ControlUnitSelectiveOutputTestFragment";
    }

    @Override // p022b9.f, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.controlUnitSequentialOutputTestFragment_title) {
            T();
            return;
        }
        if (!this.f8081z || view.getId() != R.id.controlUnitSequentialOutputTestFragment_fab) {
            super.onClick(view);
            return;
        }
        if (!this.f20631r) {
            this.f20626m.n();
            this.f20626m.setEnabled(true);
            this.f20626m.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.holo_red_dark)));
            this.f20626m.setImageResource(2131231453);
            S(false);
            return;
        }
        this.f20626m.n();
        this.f20626m.setEnabled(true);
        this.f20626m.setClickable(true);
        this.f20626m.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.holo_green_dark)));
        this.f20626m.setImageResource(2131231441);
        this.f20631r = false;
    }

    @Override // com.voltasit.obdeleven.ui.module.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        F0 f10 = this.f8080y;
        if (f10 != null) {
            f10.y();
            this.f8080y = null;
        }
    }

    @Override // p022b9.f
    public final void P() {
    }
}
