package com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest;

import androidx.fragment.app.ActivityC1347l;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.i;
import p220r9.P;

/* JADX INFO: compiled from: UDSOutputTestFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UDSOutputTestFragment f31988a;

    public d(UDSOutputTestFragment uDSOutputTestFragment) {
        this.f31988a = uDSOutputTestFragment;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, xa.g] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        i.e(task, "task");
        Integer num = (Integer) task.getResult();
        UDSOutputTestFragment uDSOutputTestFragment = this.f31988a;
        if (num != null && num.intValue() == 0) {
            UserTrackingUtils.c(UserTrackingUtils.Key.f34240A, 1);
            P.f(uDSOutputTestFragment.requireActivity(), R.string.snackbar_output_test_started);
        } else if (num != null && num.intValue() == -1) {
            P.f(uDSOutputTestFragment.requireActivity(), R.string.common_something_went_wrong);
        } else if (num != null && num.intValue() == 51) {
            SfdViewModel sfdViewModel = (SfdViewModel) uDSOutputTestFragment.f31962H.getValue();
            ControlUnit controlUnit = uDSOutputTestFragment.f31971s;
            i.b(controlUnit);
            String objectId = controlUnit.f29320b.getControlUnitBase().getObjectId();
            i.d(objectId, "getObjectId(...)");
            ControlUnit controlUnit2 = uDSOutputTestFragment.f31971s;
            i.b(controlUnit2);
            sfdViewModel.b(objectId, controlUnit2.n().shortValue());
        } else {
            ActivityC1347l activityC1347lRequireActivity = uDSOutputTestFragment.requireActivity();
            Locale locale = Locale.US;
            i.b(num);
            P.a(activityC1347lRequireActivity, String.format(locale, "(%02X) %s", Arrays.copyOf(new Object[]{num, Texttabe.a(num.intValue())}, 2)));
            C2134a0.a();
        }
        FloatingActionButton floatingActionButton = uDSOutputTestFragment.f31968p;
        i.b(floatingActionButton);
        floatingActionButton.setEnabled(true);
        return null;
    }
}
