package com.voltasit.obdeleven.core.app;

import G8.C0701c;
import Q8.c;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.RequestType;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.model.f;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2088c;
import com.voltasit.obdeleven.core.app.C2090e;
import com.voltasit.obdeleven.models.BackupFunctionType;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p134k8.T1;
import p194p8.j;
import p220r9.C2778j;
import p220r9.P;
import p255u9.E;
import p255u9.z;
import p279w9.b;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2086b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30079c;

    public /* synthetic */ C2086b(Object obj, int i10, Object obj2) {
        this.f30077a = i10;
        this.f30078b = obj;
        this.f30079c = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, xa.g] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws MeasurementException {
        ArrayList<Param> arrayListC;
        int i10 = 3;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.f30079c;
        Object obj2 = this.f30078b;
        switch (this.f30077a) {
            case 0:
                return ((p146l8.a) obj).h(Integer.toString(Integer.parseInt(((C2089d) obj2).a(), 16)));
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i iVar = (com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i) obj2;
                iVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(null);
                }
                m8.g gVar = (m8.g) obj;
                Task<TContinuationResult> taskContinueWithTask = gVar.f44619d.continueWithTask(new m8.a(gVar));
                taskContinueWithTask.onSuccess(new m8.b(gVar));
                gVar.f44619d = taskContinueWithTask.makeVoid();
                return taskContinueWithTask.continueWith(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.h(iVar, i12, gVar), Task.UI_THREAD_EXECUTOR);
            case 2:
                final OnlineControlUnitAdaptationFragment this$0 = (OnlineControlUnitAdaptationFragment) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                Object result = task.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue()) {
                    return Task.forResult(null);
                }
                final p146l8.a aVar = (p146l8.a) obj;
                kotlin.jvm.internal.i.b(aVar);
                return aVar.f(true).continueWith(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.b
                    /* JADX WARN: Code duplicated, block: B:85:0x02b4  */
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        String string;
                        String strE;
                        String string2;
                        switch (i12) {
                            case 0:
                                OnlineControlUnitAdaptationFragment this$1 = (OnlineControlUnitAdaptationFragment) this$0;
                                i.e(this$1, "this$0");
                                i.b(task2);
                                p146l8.a aVar2 = (p146l8.a) aVar;
                                p121j8.c cVarB = aVar2.b();
                                if (cVarB != null) {
                                    string = cVarB.e(-1);
                                    strE = cVarB.e(-2);
                                } else {
                                    string = null;
                                    strE = null;
                                }
                                if (string == null || string.length() == 0) {
                                    string = this$1.getString(R.string.common_channel);
                                }
                                TextView textView = this$1.f31680p;
                                if (textView == null) {
                                    i.m("channelTitle");
                                    throw null;
                                }
                                textView.setText(string);
                                if (strE == null || strE.length() == 0) {
                                    strE = "...";
                                }
                                TextView textView2 = this$1.f31687w;
                                if (textView2 == null) {
                                    i.m("description");
                                    throw null;
                                }
                                textView2.setText(strE);
                                int i13 = 0;
                                for (int i14 = 0; i14 < this$1.a0().length; i14++) {
                                    View childAt = this$1.a0()[i14].getChildAt(0);
                                    i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
                                    TextView textView3 = (TextView) childAt;
                                    String strE2 = cVarB != null ? cVarB.e(i14) : null;
                                    if (strE2 == null || strE2.length() == 0) {
                                        strE2 = String.format(Locale.US, "%s %d", Arrays.copyOf(new Object[]{this$1.getString(R.string.common_value), Integer.valueOf(i14 + 1)}, 2));
                                    }
                                    textView3.setText(strE2);
                                }
                                if (aVar2.equals(this$1.f31669C)) {
                                    SwipeRefreshLayout swipeRefreshLayout = this$1.f31679o;
                                    if (swipeRefreshLayout != null) {
                                        swipeRefreshLayout.setRefreshing(false);
                                    }
                                    if (task2.isFaulted()) {
                                        Exception error = task2.getError();
                                        i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
                                        this$1.f31671E = false;
                                        this$1.b0().setText(R.string.common_not_available);
                                        this$1.Y().setText("");
                                        this$1.Y().setEnabled(false);
                                        this$1.W().setEnabled(false);
                                        this$1.X().setEnabled(false);
                                        int iA = ((CommandException) error).a();
                                        if (iA != -1) {
                                            int i15 = aVar2.f44412a;
                                            if (iA == 51) {
                                                ControlUnit controlUnit = this$1.f31668B;
                                                i.b(controlUnit);
                                                controlUnit.f29320b.updateAdaptation(this$1.f31670D, "KWP", i15, String.valueOf(iA), "negative");
                                                ControlUnit controlUnit2 = this$1.f31668B;
                                                i.b(controlUnit2);
                                                controlUnit2.f29320b.saveInBackgroundEventually();
                                                if (TextUtils.isEmpty(this$1.f31672F)) {
                                                    this$1.f0();
                                                } else {
                                                    String str = this$1.f31672F;
                                                    i.b(str);
                                                    ControlUnit controlUnit3 = this$1.f31668B;
                                                    i.b(controlUnit3);
                                                    Task<TContinuationResult> taskContinueWithTask2 = controlUnit3.D(false).continueWithTask(new C2090e(this$1, 1, str));
                                                    i.d(taskContinueWithTask2, "continueWithTask(...)");
                                                    taskContinueWithTask2.continueWith(new C2088c(1, this$1), Task.UI_THREAD_EXECUTOR);
                                                }
                                            } else if (i15 == 0 && iA == 0) {
                                                this$1.b0().setText(R.string.view_adaptation_perform_factory_reset);
                                                this$1.Y().setText("0");
                                                this$1.W().setEnabled(true);
                                                this$1.X().setEnabled(true);
                                            } else {
                                                this$1.F(String.format("(%02X) %s", Arrays.copyOf(new Object[]{Integer.valueOf(iA), Texttabe.a(iA)}, 2)));
                                            }
                                        } else {
                                            MainActivity mainActivityQ = this$1.q();
                                            P.a(mainActivityQ, mainActivityQ.getString(R.string.common_request_timeout));
                                        }
                                        LinearLayout[] linearLayoutArrA0 = this$1.a0();
                                        int length = linearLayoutArrA0.length;
                                        while (i13 < length) {
                                            View childAt2 = linearLayoutArrA0[i13].getChildAt(1);
                                            i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                                            ((TextView) childAt2).setText(R.string.common_not_available);
                                            i13++;
                                        }
                                    } else {
                                        Object result2 = task2.getResult();
                                        i.d(result2, "getResult(...)");
                                        String str2 = (String) result2;
                                        O.e.s("OnlineControlUnitAdaptationFragment", "handleReadAdaptationSuccess()");
                                        if (this$1.f31671E) {
                                            this$1.c0();
                                        } else {
                                            O.e.j("OnlineControlUnitAdaptationFragment", "Not processing");
                                        }
                                        boolean z10 = this$1.f31678n;
                                        int i16 = aVar2.f44412a;
                                        if (z10) {
                                            this$1.f31678n = false;
                                            ControlUnit controlUnit4 = this$1.f31668B;
                                            i.b(controlUnit4);
                                            controlUnit4.f29320b.updateAdaptation(this$1.f31670D, "KWP", i16, str2, "positive");
                                            ControlUnit controlUnit5 = this$1.f31668B;
                                            i.b(controlUnit5);
                                            controlUnit5.f29320b.saveInBackgroundEventually();
                                            UserTrackingUtils.c(UserTrackingUtils.Key.f34281z, 1);
                                        }
                                        if (i16 == 0) {
                                            this$1.b0().setText(R.string.view_adaptation_perform_factory_reset);
                                            this$1.Y().setText("0");
                                        } else {
                                            this$1.d0(str2);
                                        }
                                        this$1.Y().setEnabled(aVar2.f44412a != 0);
                                        this$1.W().setEnabled(true);
                                        this$1.X().setEnabled(true);
                                        j result3 = aVar2.e().getResult();
                                        String string3 = this$1.getString(R.string.common_not_available);
                                        i.d(string3, "getString(...)");
                                        ArrayList arrayListA = result3.a(this$1.f31673G);
                                        while (i13 < this$1.a0().length) {
                                            View childAt3 = this$1.a0()[i13].getChildAt(1);
                                            i.c(childAt3, "null cannot be cast to non-null type android.widget.TextView");
                                            TextView textView4 = (TextView) childAt3;
                                            if (i13 < arrayListA.size()) {
                                                T1 t8 = (T1) arrayListA.get(i13);
                                                if (t8.f42679b != null) {
                                                    string2 = t8.toString();
                                                    i.d(string2, "toString(...)");
                                                } else {
                                                    string2 = string3;
                                                }
                                            } else {
                                                string2 = string3;
                                            }
                                            textView4.setText(string2);
                                            i13++;
                                        }
                                    }
                                } else {
                                    this$1.f31678n = true;
                                    aVar2.a().continueWith(new c(this$1));
                                }
                                return null;
                            default:
                                f fVar = (f) this$0;
                                fVar.getClass();
                                if (task2.isFaulted()) {
                                    O.e.m(task2.getError());
                                }
                                return fVar.f29335r.d("2E04A3" + ((String) aVar));
                        }
                    }
                }, Task.UI_THREAD_EXECUTOR);
            case 3:
                final com.obdeleven.service.model.f fVar = (com.obdeleven.service.model.f) obj2;
                fVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue() || fVar.f29327i == ApplicationProtocol.f29262b) {
                    return Task.forResult(-1);
                }
                ControlUnit.RequestSID requestSID = fVar.f29328k;
                ControlUnit.RequestSID requestSID2 = ControlUnit.RequestSID.f29345c;
                final String str = (String) obj;
                p109i8.k kVar = fVar.f29335r;
                if (requestSID != requestSID2) {
                    O.e.j("GatewayControlUnit", "writeGatewayCoding2E(" + str + ")");
                    return kVar.d(RequestType.WorkshopNumber.a() + I.b.j()).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.b
                        /* JADX WARN: Code duplicated, block: B:85:0x02b4  */
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            String string;
                            String strE;
                            String string2;
                            switch (i11) {
                                case 0:
                                    OnlineControlUnitAdaptationFragment this$1 = (OnlineControlUnitAdaptationFragment) fVar;
                                    i.e(this$1, "this$0");
                                    i.b(task2);
                                    p146l8.a aVar2 = (p146l8.a) str;
                                    p121j8.c cVarB = aVar2.b();
                                    if (cVarB != null) {
                                        string = cVarB.e(-1);
                                        strE = cVarB.e(-2);
                                    } else {
                                        string = null;
                                        strE = null;
                                    }
                                    if (string == null || string.length() == 0) {
                                        string = this$1.getString(R.string.common_channel);
                                    }
                                    TextView textView = this$1.f31680p;
                                    if (textView == null) {
                                        i.m("channelTitle");
                                        throw null;
                                    }
                                    textView.setText(string);
                                    if (strE == null || strE.length() == 0) {
                                        strE = "...";
                                    }
                                    TextView textView2 = this$1.f31687w;
                                    if (textView2 == null) {
                                        i.m("description");
                                        throw null;
                                    }
                                    textView2.setText(strE);
                                    int i13 = 0;
                                    for (int i14 = 0; i14 < this$1.a0().length; i14++) {
                                        View childAt = this$1.a0()[i14].getChildAt(0);
                                        i.c(childAt, "null cannot be cast to non-null type android.widget.TextView");
                                        TextView textView3 = (TextView) childAt;
                                        String strE2 = cVarB != null ? cVarB.e(i14) : null;
                                        if (strE2 == null || strE2.length() == 0) {
                                            strE2 = String.format(Locale.US, "%s %d", Arrays.copyOf(new Object[]{this$1.getString(R.string.common_value), Integer.valueOf(i14 + 1)}, 2));
                                        }
                                        textView3.setText(strE2);
                                    }
                                    if (aVar2.equals(this$1.f31669C)) {
                                        SwipeRefreshLayout swipeRefreshLayout = this$1.f31679o;
                                        if (swipeRefreshLayout != null) {
                                            swipeRefreshLayout.setRefreshing(false);
                                        }
                                        if (task2.isFaulted()) {
                                            Exception error = task2.getError();
                                            i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
                                            this$1.f31671E = false;
                                            this$1.b0().setText(R.string.common_not_available);
                                            this$1.Y().setText("");
                                            this$1.Y().setEnabled(false);
                                            this$1.W().setEnabled(false);
                                            this$1.X().setEnabled(false);
                                            int iA = ((CommandException) error).a();
                                            if (iA != -1) {
                                                int i15 = aVar2.f44412a;
                                                if (iA == 51) {
                                                    ControlUnit controlUnit = this$1.f31668B;
                                                    i.b(controlUnit);
                                                    controlUnit.f29320b.updateAdaptation(this$1.f31670D, "KWP", i15, String.valueOf(iA), "negative");
                                                    ControlUnit controlUnit2 = this$1.f31668B;
                                                    i.b(controlUnit2);
                                                    controlUnit2.f29320b.saveInBackgroundEventually();
                                                    if (TextUtils.isEmpty(this$1.f31672F)) {
                                                        this$1.f0();
                                                    } else {
                                                        String str2 = this$1.f31672F;
                                                        i.b(str2);
                                                        ControlUnit controlUnit3 = this$1.f31668B;
                                                        i.b(controlUnit3);
                                                        Task<TContinuationResult> taskContinueWithTask2 = controlUnit3.D(false).continueWithTask(new C2090e(this$1, 1, str2));
                                                        i.d(taskContinueWithTask2, "continueWithTask(...)");
                                                        taskContinueWithTask2.continueWith(new C2088c(1, this$1), Task.UI_THREAD_EXECUTOR);
                                                    }
                                                } else if (i15 == 0 && iA == 0) {
                                                    this$1.b0().setText(R.string.view_adaptation_perform_factory_reset);
                                                    this$1.Y().setText("0");
                                                    this$1.W().setEnabled(true);
                                                    this$1.X().setEnabled(true);
                                                } else {
                                                    this$1.F(String.format("(%02X) %s", Arrays.copyOf(new Object[]{Integer.valueOf(iA), Texttabe.a(iA)}, 2)));
                                                }
                                            } else {
                                                MainActivity mainActivityQ = this$1.q();
                                                P.a(mainActivityQ, mainActivityQ.getString(R.string.common_request_timeout));
                                            }
                                            LinearLayout[] linearLayoutArrA0 = this$1.a0();
                                            int length = linearLayoutArrA0.length;
                                            while (i13 < length) {
                                                View childAt2 = linearLayoutArrA0[i13].getChildAt(1);
                                                i.c(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                                                ((TextView) childAt2).setText(R.string.common_not_available);
                                                i13++;
                                            }
                                        } else {
                                            Object result2 = task2.getResult();
                                            i.d(result2, "getResult(...)");
                                            String str3 = (String) result2;
                                            O.e.s("OnlineControlUnitAdaptationFragment", "handleReadAdaptationSuccess()");
                                            if (this$1.f31671E) {
                                                this$1.c0();
                                            } else {
                                                O.e.j("OnlineControlUnitAdaptationFragment", "Not processing");
                                            }
                                            boolean z10 = this$1.f31678n;
                                            int i16 = aVar2.f44412a;
                                            if (z10) {
                                                this$1.f31678n = false;
                                                ControlUnit controlUnit4 = this$1.f31668B;
                                                i.b(controlUnit4);
                                                controlUnit4.f29320b.updateAdaptation(this$1.f31670D, "KWP", i16, str3, "positive");
                                                ControlUnit controlUnit5 = this$1.f31668B;
                                                i.b(controlUnit5);
                                                controlUnit5.f29320b.saveInBackgroundEventually();
                                                UserTrackingUtils.c(UserTrackingUtils.Key.f34281z, 1);
                                            }
                                            if (i16 == 0) {
                                                this$1.b0().setText(R.string.view_adaptation_perform_factory_reset);
                                                this$1.Y().setText("0");
                                            } else {
                                                this$1.d0(str3);
                                            }
                                            this$1.Y().setEnabled(aVar2.f44412a != 0);
                                            this$1.W().setEnabled(true);
                                            this$1.X().setEnabled(true);
                                            j result3 = aVar2.e().getResult();
                                            String string3 = this$1.getString(R.string.common_not_available);
                                            i.d(string3, "getString(...)");
                                            ArrayList arrayListA = result3.a(this$1.f31673G);
                                            while (i13 < this$1.a0().length) {
                                                View childAt3 = this$1.a0()[i13].getChildAt(1);
                                                i.c(childAt3, "null cannot be cast to non-null type android.widget.TextView");
                                                TextView textView4 = (TextView) childAt3;
                                                if (i13 < arrayListA.size()) {
                                                    T1 t8 = (T1) arrayListA.get(i13);
                                                    if (t8.f42679b != null) {
                                                        string2 = t8.toString();
                                                        i.d(string2, "toString(...)");
                                                    } else {
                                                        string2 = string3;
                                                    }
                                                } else {
                                                    string2 = string3;
                                                }
                                                textView4.setText(string2);
                                                i13++;
                                            }
                                        }
                                    } else {
                                        this$1.f31678n = true;
                                        aVar2.a().continueWith(new c(this$1));
                                    }
                                    return null;
                                default:
                                    f fVar2 = (f) fVar;
                                    fVar2.getClass();
                                    if (task2.isFaulted()) {
                                        O.e.m(task2.getError());
                                    }
                                    return fVar2.f29335r.d("2E04A3" + ((String) str));
                            }
                        }
                    }).continueWithTask(new C2088c(i10, fVar));
                }
                O.e.j("GatewayControlUnit", "writeGatewayCoding1A(" + str + ")");
                try {
                    O.e.j(fVar.f0(), "getSWVersion()");
                    String sWVersion = fVar.f29320b.getSWVersion();
                    if (sWVersion == null) {
                        throw new ControlUnitException(0);
                    }
                    String strC = com.obdeleven.service.util.b.c(sWVersion);
                    return kVar.d("3B9A0181C8F6" + I.b.j() + strC + fVar.f29332o + str + "FF").continueWith(new com.voltasit.obdeleven.presentation.oca.b(4, fVar));
                } catch (ControlUnitException unused) {
                    return Task.forResult(-1);
                }
            case 4:
                p194p8.n nVar = (p194p8.n) obj2;
                nVar.getClass();
                UDSResult uDSResult = (UDSResult) task.getResult();
                if (uDSResult == null) {
                    throw new MeasurementException(2);
                }
                ArrayList arrayList = nVar.f45928d;
                arrayList.clear();
                UDSResult.Type type = UDSResult.Type.f29416b;
                UDSResult.Type type2 = uDSResult.f29412a;
                Param param = uDSResult.f29414c;
                if (type2 == type) {
                    arrayListC = param.c(true);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(param);
                    arrayListC = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Param param2 : arrayListC) {
                    String strD = param2.d();
                    if (strD == null || strD.isEmpty()) {
                        String strC2 = Texttabe.c("MAS02985");
                        String str2 = strC2.substring(0, 1).toUpperCase() + strC2.substring(1);
                        Locale locale = Locale.US;
                        strD = str2 + ": " + (arrayList3.size() + 1);
                    }
                    String strF = param2.f();
                    String strE = param2.e();
                    if (param2.f29453a == Param.Type.f29473h) {
                        arrayList3.add(new T1(strD, null, null));
                    } else {
                        arrayList3.add(new T1(strD, strF, strE));
                    }
                }
                arrayList.addAll(arrayList3);
                return nVar.a((ValueUnit) obj);
            default:
                p220r9.E e10 = (p220r9.E) obj2;
                e10.getClass();
                P8.c.a(3, "ControlUnitBackupUtil", "Backups finished", new Object[0]);
                if (task.isFaulted()) {
                    Exception error = task.getError();
                    p279w9.b bVar = Application.f29634b;
                    P8.c.b(error);
                }
                com.voltasit.obdeleven.presentation.dialogs.backup.e eVar = (com.voltasit.obdeleven.presentation.dialogs.backup.e) obj;
                if (e10.f34220l == null) {
                    e10.f34220l = new Timer();
                }
                e10.f34220l.scheduleAtFixedRate(new C2778j(e10, eVar), 0L, 1000L);
                boolean z10 = e10.f34210a;
                MultiBackupDialog multiBackupDialog = eVar.f32186a;
                if (z10) {
                    if (multiBackupDialog.isAdded()) {
                        multiBackupDialog.E(0);
                    }
                    p220r9.E e11 = multiBackupDialog.f32172B;
                    kotlin.jvm.internal.i.b(e11);
                    e11.r();
                }
                if (task.isFaulted() || task.getResult() == null || task.getResult() == null) {
                    eVar.c();
                } else {
                    final List backup = (List) task.getResult();
                    kotlin.jvm.internal.i.e(backup, "backup");
                    ((com.voltasit.obdeleven.presentation.dialogs.backup.h) multiBackupDialog.f32175E.getValue()).f32190o.W("FULL_BACKUP");
                    if (multiBackupDialog.isAdded()) {
                        multiBackupDialog.E(3);
                    }
                    List<? extends ControlUnit> list = multiBackupDialog.f32177z;
                    kotlin.jvm.internal.i.b(list);
                    final p255u9.E e12 = list.get(0).f29321c.f42726c;
                    final com.voltasit.obdeleven.presentation.dialogs.backup.d dVar = new com.voltasit.obdeleven.presentation.dialogs.backup.d(multiBackupDialog);
                    final String str3 = eVar.f32187b;
                    Task.callInBackground(new Callable() { // from class: r9.w
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            E e13 = e12;
                            List<c> list2 = backup;
                            String str4 = str3;
                            MultiBackupDialog this$1 = (MultiBackupDialog) dVar.f32185b;
                            try {
                                HistoryDB historyDB = new HistoryDB();
                                int i13 = z.f47484b;
                                historyDB.o((z) ParseUser.getCurrentUser());
                                historyDB.setVehicle(e13);
                                historyDB.put("type", HistoryDB.HistoryTypeValue.BACKUP_ALL.a());
                                historyDB.m(e13.getInt("mileage"));
                                int size = list2.size();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("backupCount", size);
                                    jSONObject.put("name", str4);
                                } catch (JSONException e14) {
                                    e14.printStackTrace();
                                }
                                historyDB.put("data", jSONObject);
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(BackupFunctionType.LIVE_DATA.a());
                                arrayList4.add(BackupFunctionType.ADVANCED_INFO.a());
                                arrayList4.add(BackupFunctionType.ADAPTATION.a());
                                arrayList4.add(BackupFunctionType.CODING.a());
                                historyDB.put("backupFunctions", arrayList4);
                                historyDB.a();
                                historyDB.save();
                                for (c cVar : list2) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Backing: ");
                                    ControlUnit controlUnit = cVar.f5133a;
                                    ControlUnitDB controlUnitDB = controlUnit.f29320b;
                                    sb2.append(controlUnitDB.getName());
                                    String string = sb2.toString();
                                    b bVar2 = Application.f29634b;
                                    P8.c.a(3, "HistoryUtils", string, Arrays.copyOf(new Object[0], 0));
                                    HistoryDB historyDB2 = new HistoryDB();
                                    historyDB2.o((z) ParseUser.getCurrentUser());
                                    historyDB2.setVehicle(e13);
                                    historyDB2.put("type", HistoryDB.HistoryTypeValue.BACKUP.a());
                                    historyDB2.i(controlUnitDB);
                                    if (controlUnit.p() != null) {
                                        historyDB2.k(controlUnit.p().f29363c);
                                    }
                                    historyDB2.m(e13.getInt("mileage"));
                                    C0701c c0701c = cVar.f5134b;
                                    JSONObject jSONObject2 = c0701c.f3446a;
                                    historyDB2.put("odxFileName", c0701c.f3447b);
                                    jSONObject2.put("name", controlUnitDB.getName());
                                    historyDB2.j(jSONObject2);
                                    historyDB2.put("parent", historyDB);
                                    historyDB2.a();
                                    historyDB2.save();
                                }
                                i.e(this$1, "this$0");
                                this$1.D(null);
                                return null;
                            } catch (Exception e15) {
                                i.e(this$1, "this$0");
                                this$1.D(e15);
                                return null;
                            }
                        }
                    });
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34259c, 1);
                }
                return null;
        }
    }

    public /* synthetic */ C2086b(p146l8.a aVar, OnlineControlUnitAdaptationFragment onlineControlUnitAdaptationFragment) {
        this.f30077a = 2;
        this.f30079c = aVar;
        this.f30078b = onlineControlUnitAdaptationFragment;
    }
}
