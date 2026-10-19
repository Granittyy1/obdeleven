package com.voltasit.obdeleven.utils;

import G8.C0701c;
import P8.c;
import android.os.Handler;
import android.os.Looper;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.core.app.C2090e;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import com.voltasit.parse.model.AdaptationType;
import com.voltasit.parse.model.CodingType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p134k8.D1;
import p134k8.O;
import p220r9.C2774f;
import p220r9.C2775g;
import p220r9.C2783o;
import p279w9.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractControlUnitBackupUtil {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.g f34215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.g f34216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<COMPUSCALE> f34217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<COMPUSCALE> f34218i;
    public e.g j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f34220l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34210a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34211b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f34212c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f34213d = 0.0d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f34214e = 0.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f34219k = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UdsDataType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UdsDataType f34221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UdsDataType f34222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final UdsDataType f34223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ UdsDataType[] f34224e;

        static {
            UdsDataType udsDataType = new UdsDataType("LIVE_DATA", 0);
            f34221b = udsDataType;
            UdsDataType udsDataType2 = new UdsDataType("ADAPTATION", 1);
            f34222c = udsDataType2;
            UdsDataType udsDataType3 = new UdsDataType("ADVANCED_INFO", 2);
            f34223d = udsDataType3;
            f34224e = new UdsDataType[]{udsDataType, udsDataType2, udsDataType3};
        }

        public UdsDataType() {
            throw null;
        }

        public static UdsDataType valueOf(String str) {
            return (UdsDataType) Enum.valueOf(UdsDataType.class, str);
        }

        public static UdsDataType[] values() {
            return (UdsDataType[]) f34224e.clone();
        }
    }

    public static JSONObject i(D1 d10) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("name", d10.u());
            jSONObject.put("coding", jSONObject2);
            CodingType codingTypeV = d10.v();
            jSONObject2.put("type", codingTypeV.name());
            if (codingTypeV == CodingType.f34405e) {
                jSONObject2.put("value", (String) d10.q().f10040b);
                return jSONObject;
            }
            if (codingTypeV != CodingType.f34406f) {
                return null;
            }
            jSONObject2.put("value", d10.x().f42831c);
            return jSONObject;
        } catch (ControlUnitException e10) {
            e = e10;
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e);
            return null;
        } catch (JSONException e11) {
            e = e11;
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(e);
            return null;
        }
    }

    public static void s(C0701c c0701c, ControlUnit controlUnit) {
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        ControlUnitDB controlUnitDB = controlUnit.f29320b;
        if (applicationProtocol == ApplicationProtocol.f29264d) {
            Task<e> taskX = controlUnit.X();
            try {
                taskX.waitForCompletion();
                if (taskX.isFaulted()) {
                    O.e.j("ControlUnitBackupUtil", "failed to get odx");
                    return;
                }
                e result = taskX.getResult();
                String oDXName = controlUnitDB.getODXName();
                String oDXVersion = controlUnitDB.getODXVersion();
                JSONObject jSONObject = c0701c.f3446a;
                jSONObject.put("odxName", oDXName);
                jSONObject.put("odxVersion", oDXVersion);
                com.obdeleven.service.odx.c cVar = result.f29491d;
                c0701c.f3447b = cVar.f29482b + "_" + cVar.f29483c;
            } catch (InterruptedException e10) {
                e = e10;
                O.e.m(e);
            } catch (JSONException e11) {
                e = e11;
                O.e.m(e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028 A[Catch: ControlUnitException -> 0x000a, TRY_LEAVE, TryCatch #0 {ControlUnitException -> 0x000a, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x000c, B:9:0x001a, B:11:0x0028), top: B:16:0x0000 }] */
    public final void a(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit, List<String> list) {
        try {
            if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                k(jSONObject, aVar, controlUnit, list);
            } else {
                if (((ArrayList) controlUnit.e0()).contains(SupportedFunction.f29288i)) {
                    g(jSONObject, aVar, controlUnit, list);
                } else {
                    if (((ArrayList) controlUnit.e0()).contains(SupportedFunction.j)) {
                        g(jSONObject, aVar, controlUnit, list);
                    }
                }
            }
        } catch (ControlUnitException e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
        }
    }

    public final void b(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit, List<String> list) {
        JSONArray jSONArrayD = d(aVar, controlUnit, list, l(controlUnit), this.f34216g, UdsDataType.f34223d);
        try {
            if (jSONArrayD.length() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("values", jSONArrayD);
                jSONObject.put("advanced_info", jSONObject2);
            }
        } catch (JSONException e10) {
            O.e.m(e10);
        }
    }

    public final Task<JSONObject> c(final COMPUSCALE compuscale, final ControlUnit controlUnit, final List<String> list, final e.g gVar, final UdsDataType udsDataType) {
        return controlUnit.D(false).continueWithTask(new Continuation() { // from class: r9.e
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                ControlUnit controlUnit2 = controlUnit;
                controlUnit2.getClass();
                O.e.s("ControlUnit", "udsReadDataByIdentWithoutSaving");
                return controlUnit2.I0(compuscale, gVar, false);
            }
        }).continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation() { // from class: com.voltasit.obdeleven.utils.b
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                int i10;
                final AbstractControlUnitBackupUtil abstractControlUnitBackupUtil = this;
                abstractControlUnitBackupUtil.getClass();
                if (task.isFaulted()) {
                    O.e.m(task.getError());
                    return Task.forResult(null);
                }
                UDSResult uDSResult = (UDSResult) task.getResult();
                JSONObject jSONObject = new JSONObject();
                AbstractControlUnitBackupUtil.UdsDataType udsDataType2 = AbstractControlUnitBackupUtil.UdsDataType.f34222c;
                AdaptationType adaptationType = AdaptationType.ADAPTATION;
                final AbstractControlUnitBackupUtil.UdsDataType udsDataType3 = udsDataType;
                final ControlUnit controlUnit2 = controlUnit;
                if (udsDataType3 == udsDataType2 && (i10 = uDSResult.f29413b) != 51) {
                    controlUnit2.f29320b.updateAdaptation(adaptationType, "UDS", i10, Arrays.toString(uDSResult.f29414c.f29454b), uDSResult.f29412a.toString());
                }
                UDSResult.Type type = uDSResult.f29412a;
                UDSResult.Type type2 = UDSResult.Type.f29416b;
                int i11 = uDSResult.f29413b;
                if (type == type2) {
                    try {
                        jSONObject.put("channel", i11);
                        AbstractControlUnitBackupUtil.UdsDataType udsDataType4 = AbstractControlUnitBackupUtil.UdsDataType.f34221b;
                        String str = uDSResult.f29415d;
                        if (udsDataType3 == udsDataType4) {
                            str = "62" + String.format(Locale.US, "%04X", Integer.valueOf(i11)) + str;
                        }
                        jSONObject.put("data", str);
                    } catch (Exception e10) {
                        O.e.m(e10);
                    }
                    return Task.forResult(jSONObject);
                }
                final COMPUSCALE compuscale2 = compuscale;
                if (i11 != 51) {
                    LIMIT lowerlimit = compuscale2.getLOWERLIMIT();
                    if (lowerlimit == null) {
                        lowerlimit = compuscale2.getUPPERLIMIT();
                    }
                    controlUnit2.f29320b.updateAdaptation(adaptationType, "UDS", Integer.parseInt(lowerlimit.getValue()), Arrays.toString(uDSResult.f29414c.f29454b), "NEGATIVE");
                    return Task.forResult(null);
                }
                int i12 = abstractControlUnitBackupUtil.f34211b;
                final List list2 = list;
                if (i12 < list2.size()) {
                    int i13 = abstractControlUnitBackupUtil.f34211b;
                    abstractControlUnitBackupUtil.f34211b = i13 + 1;
                    Task<Integer> taskK = controlUnit2.K((String) list2.get(i13), true);
                    final e.g gVar2 = gVar;
                    return taskK.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.c
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            final AbstractControlUnitBackupUtil abstractControlUnitBackupUtil2 = abstractControlUnitBackupUtil;
                            abstractControlUnitBackupUtil2.getClass();
                            int iIntValue = ((Integer) task2.getResult()).intValue();
                            final ControlUnit controlUnit3 = controlUnit2;
                            final List<String> list3 = list2;
                            final COMPUSCALE compuscale3 = compuscale2;
                            final e.g gVar3 = gVar2;
                            final AbstractControlUnitBackupUtil.UdsDataType udsDataType5 = udsDataType3;
                            return iIntValue == 36 ? controlUnit3.a().continueWithTask(new O(1, controlUnit3)).continueWithTask(new Continuation() { // from class: r9.b
                                @Override // com.parse.boltsinternal.Continuation
                                public final Object then(Task task3) {
                                    return controlUnit3.K((String) list3.get(abstractControlUnitBackupUtil2.f34211b - 1), true);
                                }
                            }).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.a
                                @Override // com.parse.boltsinternal.Continuation
                                public final Object then(Task task3) {
                                    return abstractControlUnitBackupUtil2.c(compuscale3, controlUnit3, list3, gVar3, udsDataType5);
                                }
                            }) : abstractControlUnitBackupUtil2.c(compuscale3, controlUnit3, list3, gVar3, udsDataType5);
                        }
                    });
                }
                try {
                    LIMIT lowerlimit2 = compuscale2.getLOWERLIMIT();
                    if (lowerlimit2 == null) {
                        lowerlimit2 = compuscale2.getUPPERLIMIT();
                    }
                    jSONObject.put("channel", Integer.parseInt(lowerlimit2.getValue()));
                    jSONObject.put("data", "SECURITY_ACCESS");
                } catch (JSONException e11) {
                    O.e.m(e11);
                }
                return Task.forResult(jSONObject);
            }
        }, Task.UI_THREAD_EXECUTOR);
    }

    public final JSONArray d(O8.a aVar, ControlUnit controlUnit, List<String> list, List<COMPUSCALE> list2, e.g gVar, UdsDataType udsDataType) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (COMPUSCALE compuscale : list2) {
                if (this.f34210a) {
                    return new JSONArray();
                }
                this.f34211b = 0;
                Task<JSONObject> taskC = c(compuscale, controlUnit, list, gVar, udsDataType);
                taskC.waitForCompletion();
                JSONObject result = taskC.getResult();
                if (result != null) {
                    jSONArray.put(result);
                }
                o(aVar);
            }
            return jSONArray;
        } catch (InterruptedException e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
            Thread.currentThread().interrupt();
            return new JSONArray();
        }
    }

    public final void e(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit) {
        try {
            CodingType codingType = controlUnit.f29320b.getCodingType();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", codingType.name());
            int iOrdinal = codingType.ordinal();
            if (iOrdinal == 3) {
                jSONObject2.put("value", (String) controlUnit.Q().f10040b);
            } else if (iOrdinal != 4) {
                return;
            } else {
                jSONObject2.put("value", controlUnit.W().f42831c);
            }
            jSONObject.put("coding", jSONObject2);
            o(aVar);
        } catch (ControlUnitException e10) {
            e = e10;
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e);
        } catch (JSONException e11) {
            e = e11;
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(e);
        }
    }

    public final Task<JSONObject> f(final int i10, final boolean z10, final ControlUnit controlUnit, final List<String> list) {
        p279w9.b bVar = Application.f29634b;
        P8.c.a(3, "ControlUnitBackupUtil", "backupKwpAdaptation()", Arrays.copyOf(new Object[0], 0));
        final p146l8.a aVarV = z10 ? controlUnit.V(i10) : controlUnit.L(i10);
        return controlUnit.D(false).onSuccessTask(new C2090e(this, 2, aVarV)).continueWithTask(new Continuation() { // from class: r9.d
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(final Task task) {
                final AbstractControlUnitBackupUtil abstractControlUnitBackupUtil = this.f46453a;
                abstractControlUnitBackupUtil.getClass();
                b bVar2 = Application.f29634b;
                c.a(3, "ControlUnitBackupUtil", "read finished. Closing", Arrays.copyOf(new Object[0], 0));
                Task<Void> taskA = aVarV.a();
                final ControlUnit controlUnit2 = controlUnit;
                final List list2 = list;
                final int i11 = i10;
                final boolean z11 = z10;
                return taskA.continueWithTask(new Continuation() { // from class: r9.a
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) throws JSONException {
                        final AbstractControlUnitBackupUtil abstractControlUnitBackupUtil2 = abstractControlUnitBackupUtil;
                        abstractControlUnitBackupUtil2.getClass();
                        b bVar3 = Application.f29634b;
                        c.a(3, "ControlUnitBackupUtil", "Close finished", Arrays.copyOf(new Object[0], 0));
                        JSONObject jSONObject = new JSONObject();
                        final int i12 = i11;
                        jSONObject.put("channel", i12);
                        Task task3 = task;
                        boolean zIsFaulted = task3.isFaulted();
                        AdaptationType adaptationType = AdaptationType.ADAPTATION;
                        AdaptationType adaptationType2 = AdaptationType.LONG_ADAPTATION;
                        final boolean z12 = z11;
                        final ControlUnit controlUnit3 = controlUnit2;
                        if (!zIsFaulted) {
                            c.a(3, "ControlUnitBackupUtil", "adaptation read success", Arrays.copyOf(new Object[0], 0));
                            String str = (String) task3.getResult();
                            jSONObject.put("data", z12 ? n.e(str) : n.g(str));
                            ControlUnitDB controlUnitDB = controlUnit3.f29320b;
                            if (z12) {
                                adaptationType = adaptationType2;
                            }
                            controlUnitDB.updateAdaptation(adaptationType, "KWP", i12, str, "positive");
                            return Task.forResult(jSONObject);
                        }
                        CommandException commandException = (CommandException) task3.getError();
                        c.a(3, "ControlUnitBackupUtil", "adaptation read failed with code " + commandException.a(), Arrays.copyOf(new Object[0], 0));
                        if (commandException.a() == 51) {
                            int i13 = abstractControlUnitBackupUtil2.f34211b;
                            final List list3 = list2;
                            if (i13 >= list3.size()) {
                                jSONObject.put("data", "SECURITY_ACCESS");
                                return Task.forResult(jSONObject);
                            }
                            int i14 = abstractControlUnitBackupUtil2.f34211b;
                            abstractControlUnitBackupUtil2.f34211b = i14 + 1;
                            return controlUnit3.K((String) list3.get(i14), true).continueWithTask(new Continuation() { // from class: r9.c
                                @Override // com.parse.boltsinternal.Continuation
                                public final Object then(Task task4) {
                                    return abstractControlUnitBackupUtil2.f(i12, z12, controlUnit3, list3);
                                }
                            });
                        }
                        c.a(3, "ControlUnitBackupUtil", "Updating adaptation", Arrays.copyOf(new Object[0], 0));
                        ControlUnitDB controlUnitDB2 = controlUnit3.f29320b;
                        if (z12) {
                            adaptationType = adaptationType2;
                        }
                        controlUnitDB2.updateAdaptation(adaptationType, "KWP", i12, String.valueOf(commandException.a()), "negative");
                        c.a(3, "ControlUnitBackupUtil", "Adaptation update done", Arrays.copyOf(new Object[0], 0));
                        c.a(3, "ControlUnitBackupUtil", "backupKwpAdaptation() complete", Arrays.copyOf(new Object[0], 0));
                        return Task.forResult(null);
                    }
                });
            }
        });
    }

    public final void g(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit, List<String> list) {
        int i10 = controlUnit.f29327i == ApplicationProtocol.f29262b ? 99 : 255;
        try {
            JSONArray jSONArray = new JSONArray();
            boolean zContains = ((ArrayList) controlUnit.e0()).contains(SupportedFunction.j);
            for (int i11 = 0; i11 <= i10; i11++) {
                if (this.f34210a) {
                    return;
                }
                this.f34211b = 0;
                Task<JSONObject> taskF = f(i11, zContains, controlUnit, list);
                taskF.waitForCompletion();
                JSONObject result = taskF.getResult();
                if (result != null) {
                    jSONArray.put(result);
                }
                o(aVar);
            }
            if (jSONArray.length() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", zContains ? "KWP_LONG" : "KWP");
                jSONObject2.put("values", jSONArray);
                jSONObject.put("adaptations", jSONObject2);
            }
        } catch (ControlUnitException e10) {
            e = e10;
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e);
        } catch (InterruptedException e11) {
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(e11);
            Thread.currentThread().interrupt();
        } catch (JSONException e12) {
            e = e12;
            p279w9.b bVar3 = Application.f29634b;
            P8.c.b(e);
        }
    }

    public final void h(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit, List<String> list) {
        JSONArray jSONArray;
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        if (applicationProtocol == ApplicationProtocol.f29264d) {
            jSONArray = d(aVar, controlUnit, list, n(controlUnit), this.j, UdsDataType.f34221b);
        } else {
            ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29262b;
            int i10 = applicationProtocol == applicationProtocol2 ? 0 : 1;
            int i11 = applicationProtocol == applicationProtocol2 ? 255 : 254;
            try {
                JSONArray jSONArray2 = new JSONArray();
                while (true) {
                    if (i10 > i11) {
                        jSONArray = jSONArray2;
                        break;
                    }
                    if (this.f34210a) {
                        jSONArray = null;
                        break;
                    }
                    this.f34211b = 0;
                    Task taskContinueWithTask = controlUnit.D(false).continueWithTask(new C2774f(i10, controlUnit)).continueWithTask(new C2775g(i10, controlUnit, this, list));
                    taskContinueWithTask.waitForCompletion();
                    JSONObject jSONObject2 = (JSONObject) taskContinueWithTask.getResult();
                    if (jSONObject2 != null) {
                        jSONArray2.put(jSONObject2);
                    }
                    o(aVar);
                    i10++;
                }
            } catch (InterruptedException e10) {
                p279w9.b bVar = Application.f29634b;
                P8.c.b(e10);
                Thread.currentThread().interrupt();
                jSONArray = new JSONArray();
            }
        }
        try {
            if (jSONArray.length() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("values", jSONArray);
                jSONObject3.put("protocol", controlUnit.f29327i.toString());
                jSONObject.put("liveData", jSONObject3);
            }
        } catch (JSONException e11) {
            O.e.m(e11);
        }
    }

    public final void j(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (D1 d10 : controlUnit.c0(true)) {
                if (this.f34210a) {
                    return;
                }
                JSONObject jSONObjectI = i(d10);
                if (jSONObjectI != null) {
                    jSONArray.put(jSONObjectI);
                }
                o(aVar);
            }
            if (jSONArray.length() != 0) {
                jSONObject.put("subsystems", jSONArray);
            }
        } catch (ControlUnitException e10) {
            e = e10;
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e);
        } catch (JSONException e11) {
            e = e11;
            p279w9.b bVar2 = Application.f29634b;
            P8.c.b(e);
        }
    }

    public final void k(JSONObject jSONObject, O8.a aVar, ControlUnit controlUnit, List<String> list) {
        JSONArray jSONArrayD = d(aVar, controlUnit, list, m(controlUnit), this.f34215f, UdsDataType.f34222c);
        try {
            if (jSONArrayD.length() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "UDS");
                jSONObject2.put("values", jSONArrayD);
                jSONObject.put("adaptations", jSONObject2);
            }
        } catch (JSONException e10) {
            O.e.m(e10);
        }
    }

    public final List<COMPUSCALE> l(ControlUnit controlUnit) {
        List<COMPUSCALE> list = this.f34217h;
        if (list != null) {
            return list;
        }
        Task<e> taskX = controlUnit.X();
        try {
            taskX.waitForCompletion();
            if (taskX.isFaulted()) {
                O.e.j("ControlUnitBackupUtil", "failed to get odx");
                return Collections.emptyList();
            }
            e result = taskX.getResult();
            e.g gVarD = C2783o.d(result, "TAB_RecorDataIdentECUIdent");
            this.f34216g = gVarD;
            this.f34217h = C2783o.c(result, gVarD);
            return this.f34217h;
        } catch (InterruptedException e10) {
            O.e.m(e10);
        }
    }

    public final List<COMPUSCALE> m(ControlUnit controlUnit) {
        Task<e> taskX = controlUnit.X();
        try {
            taskX.waitForCompletion();
        } catch (InterruptedException e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
        }
        if (taskX.isFaulted()) {
            return Collections.emptyList();
        }
        e result = taskX.getResult();
        e.g gVarD = C2783o.d(result, "TAB_RecorDataIdentCalibData");
        this.f34215f = gVarD;
        return C2783o.c(result, gVarD);
    }

    public final List<COMPUSCALE> n(ControlUnit controlUnit) {
        List<COMPUSCALE> list = this.f34218i;
        if (list != null) {
            return list;
        }
        Task<e> taskX = controlUnit.X();
        try {
            taskX.waitForCompletion();
            if (taskX.isFaulted()) {
                O.e.j("ControlUnitBackupUtil", "failed to get odx");
                return Collections.emptyList();
            }
            e result = taskX.getResult();
            e.g gVarD = C2783o.d(result, "TAB_RecorDataIdentMeasuValue");
            this.j = gVarD;
            this.f34218i = C2783o.c(result, gVarD);
            return this.f34218i;
        } catch (InterruptedException e10) {
            O.e.m(e10);
        }
    }

    public final void o(final O8.a aVar) {
        if (this.f34219k + 1000 < System.currentTimeMillis()) {
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            final Float result = null;
            if (nVar != null) {
                Task<Float> taskG = nVar.g();
                try {
                    taskG.waitForCompletion();
                    result = taskG.getResult();
                } catch (InterruptedException e10) {
                    O.e.m(e10);
                }
            }
            if (result != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: r9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractControlUnitBackupUtil abstractControlUnitBackupUtil = this.f46468b;
                        abstractControlUnitBackupUtil.getClass();
                        abstractControlUnitBackupUtil.f34219k = System.currentTimeMillis();
                        aVar.b(result.floatValue());
                    }
                });
            }
        }
        new Handler(Looper.getMainLooper()).post(new p090h1.c(this, 2, aVar));
    }

    public final int p(ControlUnit controlUnit) {
        try {
            if (controlUnit.f29327i == ApplicationProtocol.f29264d) {
                return m(controlUnit).size();
            }
            if (!((ArrayList) controlUnit.e0()).contains(SupportedFunction.f29288i)) {
                if (!((ArrayList) controlUnit.e0()).contains(SupportedFunction.j)) {
                    return 0;
                }
            }
            return controlUnit.f29327i == ApplicationProtocol.f29262b ? 100 : 256;
        } catch (ControlUnitException e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
            return 0;
        }
    }

    public final double q(ControlUnit controlUnit) {
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        if (applicationProtocol != ApplicationProtocol.f29264d) {
            return applicationProtocol == ApplicationProtocol.f29262b ? 255.0d : 254.0d;
        }
        if (n(controlUnit) == null) {
            return 0.0d;
        }
        return n(controlUnit).size();
    }

    public final void r() {
        Timer timer = this.f34220l;
        if (timer != null) {
            timer.cancel();
            this.f34220l.purge();
            this.f34220l = null;
        }
    }
}
