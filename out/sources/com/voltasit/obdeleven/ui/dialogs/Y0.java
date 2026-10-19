package com.voltasit.obdeleven.ui.dialogs;

import androidx.fragment.app.ActivityC1347l;
import com.afollestad.materialdialogs.MaterialDialog;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.TextualDataInputLengthInvalidException;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.Locale;

/* JADX INFO: compiled from: UdsDataInputDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y0 extends MaterialDialog.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DATAOBJECTPROP f33870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActivityC1347l f33871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Param f33872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f33873e;

    public Y0(Z0 z10, TaskCompletionSource taskCompletionSource, DATAOBJECTPROP dataobjectprop, ActivityC1347l activityC1347l, Param param) {
        this.f33873e = z10;
        this.f33869a = taskCompletionSource;
        this.f33870b = dataobjectprop;
        this.f33871c = activityC1347l;
        this.f33872d = param;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void a(MaterialDialog materialDialog) {
        this.f33869a.setResult(Boolean.FALSE);
        materialDialog.dismiss();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xa.g] */
    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void c(MaterialDialog materialDialog) {
        FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
        String string = floatingEditText.getText().toString();
        com.voltasit.obdeleven.domain.usecases.odx.e eVar = (com.voltasit.obdeleven.domain.usecases.odx.e) this.f33873e.f33879d.getValue();
        DATAOBJECTPROP dataobjectprop = this.f33870b;
        C8.a aVarA = eVar.a(dataobjectprop, string);
        if (aVarA instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVarA).f2462a;
            if (th instanceof TextualDataInputLengthInvalidException) {
                Locale locale = Locale.US;
                String str = this.f33871c.getString(R.string.common_value_length_must_be) + " " + ((TextualDataInputLengthInvalidException) th).b();
                floatingEditText.f34175g = false;
                floatingEditText.f34176h = str;
                floatingEditText.invalidate();
                return;
            }
        }
        try {
            com.obdeleven.service.odx.a aVarPhysicalToInternal = dataobjectprop.physicalToInternal(string);
            Param param = this.f33872d;
            param.f29454b = aVarPhysicalToInternal.f29475a;
            param.f29465n = aVarPhysicalToInternal.f29476b;
            param.f29459g = string;
            this.f33869a.setResult(Boolean.TRUE);
            D9.o.m(floatingEditText);
            materialDialog.dismiss();
        } catch (Exception unused) {
            floatingEditText.c(R.string.common_wrong_value);
        }
    }
}
