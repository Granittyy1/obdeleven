package com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online;

import android.util.SparseArray;
import com.obdeleven.service.model.OBDIICu;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.activity.o;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import kotlin.jvm.internal.i;
import p134k8.a2;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31717b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f31716a = i10;
        this.f31717b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) {
        Object obj = this.f31717b;
        switch (this.f31716a) {
            case 0:
                OnlineControlUnitAdaptationFragment this$0 = (OnlineControlUnitAdaptationFragment) obj;
                i.e(this$0, "this$0");
                i.e(task1, "task1");
                C2134a0.a();
                if (task1.getResult() != null) {
                    MainActivity mainActivityQ = this$0.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.snackbar_failed_to_save_history));
                }
                return null;
            case 1:
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$1 = (MainActivity) obj;
                i.e(this$1, "this$0");
                i.e(task1, "task");
                if (task1.isFaulted()) {
                    Exception error = task1.getError();
                    i.c(error, "null cannot be cast to non-null type com.parse.ParseException");
                    int code = ((ParseException) error).getCode();
                    if (code == 209 || code == 251) {
                        this$1.w().e("MainActivity", "ParseSession invalid");
                        this$1.G(new o(0, this$1));
                    }
                } else {
                    this$1.w().e("MainActivity", "ParseSession valid");
                }
                return null;
            case 2:
                return (SparseArray) obj;
            case 3:
                OBDIICu oBDIICu = (OBDIICu) obj;
                oBDIICu.getClass();
                boolean z11 = !task1.isFaulted();
                oBDIICu.z(z11);
                return Boolean.valueOf(z11);
            default:
                return ((a2) obj).f42731h.b("010000F7FF1F");
        }
    }
}
