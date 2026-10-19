package p010a9;

import B8.AbstractC0626f0;
import O.h;
import android.content.res.ColorStateList;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.r;
import com.voltasit.obdeleven.core.app.r0;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.E;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.presentation.controlUnit.t;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.parse.Parse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import p097h9.k;
import p134k8.D1;
import p219r8.d;
import p219r8.e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8076b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f8075a = i10;
        this.f8076b = obj;
    }

    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, xa.g] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        e aVar;
        switch (this.f8075a) {
            case 0:
                d dVar = (d) this.f8076b;
                ControlUnit controlUnit = dVar.f20629p;
                int iOrdinal = controlUnit.f29327i.ordinal();
                if (iOrdinal != 0) {
                    aVar = iOrdinal != 1 ? null : new d(controlUnit);
                } else {
                    aVar = new p219r8.a(controlUnit);
                }
                dVar.f20630q = aVar;
                dVar.f20635v.setVisibility(0);
                dVar.f8081z = false;
                dVar.f20626m.n();
                dVar.f20626m.setEnabled(true);
                dVar.f20626m.setBackgroundTintList(ColorStateList.valueOf(dVar.getResources().getColor(R.color.button_blue)));
                dVar.f20626m.setImageResource(R.drawable.ic_arrow_right);
                dVar.S(true);
                return null;
            case 1:
                r0 r0Var = (r0) this.f8076b;
                r0Var.getClass();
                D1 d10 = (D1) task.getResult();
                return d10 != null ? d10.f(r0Var.a()).continueWith(new r(1)) : Task.forResult(-3);
            case 2:
                EepromFragment this$0 = (EepromFragment) this.f8076b;
                i.e(this$0, "this$0");
                i.e(task, "task");
                this$0.w();
                String str = (String) task.getResult();
                if (str == null) {
                    this$0.E(R.string.common_something_went_wrong);
                } else if (task.isFaulted() || m.I(str, "7F", false)) {
                    String strSubstring = str.substring(4);
                    i.d(strSubstring, "substring(...)");
                    h.c(16);
                    int i10 = Integer.parseInt(strSubstring, 16);
                    if (i10 == 51) {
                        this$0.P().getClass();
                        SfdViewModel sfdViewModel = (SfdViewModel) this$0.f31553z.getValue();
                        ControlUnit controlUnit2 = this$0.f31540m;
                        i.b(controlUnit2);
                        String objectId = controlUnit2.f29320b.getControlUnitBase().getObjectId();
                        i.d(objectId, "getObjectId(...)");
                        ControlUnit controlUnit3 = this$0.f31540m;
                        i.b(controlUnit3);
                        sfdViewModel.b(objectId, controlUnit3.n().shortValue());
                    } else {
                        this$0.F(String.format(Locale.US, "(%02X) %s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Texttabe.a(i10)}, 2)));
                    }
                } else {
                    Parse.f34395b.e();
                    AbstractC0626f0 abstractC0626f0 = this$0.f31539l;
                    if (abstractC0626f0 == null) {
                        i.m("binding");
                        throw null;
                    }
                    abstractC0626f0.f1910t.setVisibility(0);
                    this$0.R(1);
                    String upperCase = str.toUpperCase();
                    i.d(upperCase, "toUpperCase(...)");
                    String str2 = this$0.f31549v;
                    i.b(str2);
                    this$0.S(upperCase, upperCase, str2);
                }
                return null;
            case 3:
                B0 b10 = (B0) this.f8076b;
                b10.getClass();
                List<String> list = (List) task.getResult();
                b10.f33755y = list;
                b10.f33749s.addAll(list);
                b10.F(true);
                b10.f33751u.f1698z.setVisibility(8);
                return null;
            case 4:
                p097h9.r rVar = (p097h9.r) this.f8076b;
                rVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                C2134a0.b(rVar.getContext(), R.string.common_loading);
                Task.callInBackground(new k(0, rVar)).continueWith(new t(2, rVar), Task.UI_THREAD_EXECUTOR);
                return null;
            case 5:
                D1 d11 = (D1) this.f8076b;
                return d11.g().continueWithTask(new E(4, d11));
            default:
                return Task.forResult((HashMap) this.f8076b);
        }
    }
}
