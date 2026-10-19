package com.obdeleven.service.model;

import O.e;
import P8.b;
import V8.n;
import V8.x;
import android.os.Handler;
import android.text.TextUtils;
import androidx.compose.foundation.C0936h;
import androidx.compose.foundation.gestures.d;
import androidx.compose.ui.text.font.s;
import androidx.media3.exoplayer.c0;
import com.obdeleven.service.core.c;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.enums.RequestType;
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.exception.VehicleException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.DiagnosticSession;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.model.fault.Fault;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.protocol.Protocol;
import com.obdeleven.service.util.FaultsUtils;
import com.parse.ControlUnitDB;
import com.parse.ControlUnitParseUtils;
import com.parse.ParseConfig;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.boltsinternal.CancellationTokenSource;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C;
import com.voltasit.obdeleven.core.app.C2104t;
import com.voltasit.obdeleven.core.app.M;
import com.voltasit.obdeleven.core.app.P;
import com.voltasit.obdeleven.core.app.U;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.q;
import com.voltasit.obdeleven.domain.usecases.vehicle.p;
import com.voltasit.obdeleven.presentation.controlUnit.E;
import com.voltasit.obdeleven.presentation.controlUnit.v;
import com.voltasit.parse.Parse;
import com.voltasit.parse.model.CodingType;
import com.voltasit.parse.model.ControlUnitLabelDB;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.models.Participant;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p109i8.k;
import p109i8.l;
import p134k8.A0;
import p134k8.C0;
import p134k8.C2593a0;
import p134k8.C2599c0;
import p134k8.C2605e0;
import p134k8.C2607f;
import p134k8.C2611g0;
import p134k8.C2617i0;
import p134k8.C2619j;
import p134k8.C2623k0;
import p134k8.C2625l;
import p134k8.C2628m;
import p134k8.C2631n;
import p134k8.C2634o;
import p134k8.C2635o0;
import p134k8.C2641q0;
import p134k8.C2642q1;
import p134k8.C2646s0;
import p134k8.C2648t;
import p134k8.C2652u0;
import p134k8.C2654v;
import p134k8.C2658w0;
import p134k8.C2663y;
import p134k8.C2664y0;
import p134k8.D1;
import p134k8.F0;
import p134k8.H0;
import p134k8.L;
import p134k8.L0;
import p134k8.N;
import p134k8.O;
import p134k8.W;
import p134k8.Y;
import p134k8.a2;
import p134k8.r;
import p146l8.w;
import p194p8.i;
import p194p8.j;
import p194p8.o;
import p255u9.C2801d;
import p255u9.D;
import p255u9.z;
import p267v9.a;

/* JADX INFO: loaded from: classes3.dex */
public class ControlUnit implements p109i8.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static Task<Boolean> f29318A = Task.forResult(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DiagnosticSession f29319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnitDB f29320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a2 f29321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.obdeleven.service.odx.e f29322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ParseObject f29323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Protocol f29324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29325g;
    public h j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f29329l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f29331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f29332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p121j8.c f29333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p121j8.e f29334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f29335r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f29338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p109i8.d f29339v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TransportProtocol f29326h = TransportProtocol.f29303b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ApplicationProtocol f29327i = ApplicationProtocol.f29266f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RequestSID f29328k = RequestSID.f29344b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f29330m = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CancellationTokenSource f29340w = new CancellationTokenSource();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f29341x = KoinJavaComponent.b(p084g8.c.class, null, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f29342y = KoinJavaComponent.b(p084g8.b.class, null, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f29343z = KoinJavaComponent.b(J8.a.class, null, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f29336s = new HashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RequestSID {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RequestSID f29344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RequestSID f29345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final RequestSID f29346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ RequestSID[] f29347e;

        static {
            RequestSID requestSID = new RequestSID("SID_UNKNOWN", 0);
            f29344b = requestSID;
            RequestSID requestSID2 = new RequestSID("SID_1A", 1);
            f29345c = requestSID2;
            RequestSID requestSID3 = new RequestSID("SID_22", 2);
            f29346d = requestSID3;
            f29347e = new RequestSID[]{requestSID, requestSID2, requestSID3};
        }

        public RequestSID() {
            throw null;
        }

        public static RequestSID valueOf(String str) {
            return (RequestSID) Enum.valueOf(RequestSID.class, str);
        }

        public static RequestSID[] values() {
            return (RequestSID[]) f29347e.clone();
        }
    }

    public class a implements Continuation<Boolean, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29348a;

        public a(String str) {
            this.f29348a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                return Task.forResult(-1);
            }
            ControlUnit controlUnit = ControlUnit.this;
            if (controlUnit.f29327i != ApplicationProtocol.f29264d) {
                ControlUnitDB controlUnitDB = controlUnit.f29320b;
                if (controlUnitDB.getCodingType() == CodingType.f34405e || controlUnit.f29329l.contains(SupportedFunction.f29291m)) {
                    ApplicationProtocol applicationProtocol = controlUnit.f29327i;
                    ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29262b;
                    k kVar = controlUnit.f29335r;
                    String str = this.f29348a;
                    if (applicationProtocol == applicationProtocol2) {
                        return kVar.d("10" + String.format(Locale.US, "%04X", Integer.valueOf(Integer.parseInt(str) << 1)) + I.b.j()).continueWithTask(new p(this, 2, str));
                    }
                    return kVar.d("3B9A059738DE" + I.b.j() + com.obdeleven.service.util.b.c(controlUnitDB.getSWVersion()) + "03" + String.format(Locale.US, "%06X", Integer.valueOf(Integer.parseInt(str)))).continueWith(new com.obdeleven.service.model.c());
                }
            }
            return Task.forResult(-1);
        }
    }

    public class b implements Continuation<String, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f29350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29351b;

        public b(String str, String str2) {
            this.f29350a = str;
            this.f29351b = str2;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<String> task) throws Exception {
            return ControlUnit.this.f29335r.d("2E" + this.f29350a + this.f29351b).continueWith(new com.obdeleven.service.model.e(this));
        }
    }

    public class c implements Continuation<String, Task<String>> {
        public c() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<String> then(Task<String> task) throws Exception {
            return ControlUnit.this.f29335r.d(RequestType.WorkshopNumber.a() + I.b.j());
        }
    }

    public class d implements Continuation<String, Integer> {
        @Override // com.parse.boltsinternal.Continuation
        public final Integer then(Task<String> task) throws Exception {
            String result = task.getResult();
            if (result.startsWith("6F")) {
                return 0;
            }
            if (result.startsWith("7F")) {
                return androidx.compose.foundation.gestures.d.a(result, 4, 16);
            }
            return -1;
        }
    }

    public class e implements Continuation<Boolean, Task<Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f29354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ControlUnit f29355b;

        public e(int i10, ControlUnit controlUnit) {
            this.f29355b = controlUnit;
            this.f29354a = i10;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Boolean> task) throws Exception {
            return task.getResult().booleanValue() ? this.f29355b.f29335r.d(String.format(Locale.US, "10%02X", Integer.valueOf(this.f29354a))).continueWith(new com.obdeleven.service.model.b()) : Task.forResult(-1);
        }
    }

    public class f implements Continuation<String, Task<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f29356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f29357b;

        public f(ArrayList arrayList, boolean z10) {
            this.f29356a = arrayList;
            this.f29357b = z10;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Boolean> then(Task<String> task) throws Exception {
            String result = task.getResult();
            if (!result.startsWith("09")) {
                this.f29356a.add(result);
                return ControlUnit.this.f29324f.g("09").onSuccessTask(this);
            }
            String string = "";
            for (String str : this.f29356a) {
                StringBuilder sbE = C4.b.e(string);
                sbE.append(str.substring(2));
                string = sbE.toString();
            }
            ControlUnit controlUnit = ControlUnit.this;
            boolean z10 = this.f29357b;
            controlUnit.getClass();
            O.e.j("ControlUnitBaseDB", "parseKW1281Info(" + string + ")");
            String str2 = String.format("%02X%s", Integer.valueOf(Integer.parseInt(string.substring(0, 2), 16) & 127), string.substring(2));
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            while (i10 < str2.length()) {
                int i11 = i10 + 2;
                String strSubstring = str2.substring(i10, i11);
                if (strSubstring.equals("00")) {
                    i10 = i11;
                    break;
                }
                sb2.append(strSubstring);
                i10 = i11;
            }
            String strB = com.obdeleven.service.util.b.b(sb2.toString());
            String strTrim = strB.substring(0, 12).trim();
            String strTrim2 = strB.substring(12).trim();
            ControlUnitDB controlUnitDB = controlUnit.f29320b;
            controlUnitDB.setSWNumber(strTrim);
            controlUnitDB.setSystemDescription(strTrim2);
            if (str2.length() > i10) {
                String strSubstring2 = str2.substring(i10);
                int length = strSubstring2.length();
                if (length < 6 || length > 8) {
                    int i12 = length - 24;
                    if (i12 < 6 || i12 > 8) {
                        int i13 = length - 40;
                        if (i13 < 6 || i13 > 8) {
                            controlUnit.y0("", z10);
                        } else {
                            controlUnit.y0(String.format(Locale.US, "%05d", Integer.valueOf(Integer.parseInt(strSubstring2.substring(0, length - 44), 16) >> 1)), z10);
                        }
                    } else {
                        controlUnit.y0(String.format(Locale.US, "%05d", Integer.valueOf(Integer.parseInt(strSubstring2.substring(0, length - 28), 16) >> 1)), z10);
                    }
                } else {
                    controlUnit.y0(String.format(Locale.US, "%05d", Integer.valueOf(Integer.parseInt(strSubstring2.substring(0, length - 4), 16) >> 1)), z10);
                }
            } else {
                controlUnit.y0("", z10);
            }
            controlUnit.C0("");
            controlUnitDB.setHWVersion("");
            controlUnitDB.setSWVersion("");
            controlUnit.F0("");
            controlUnitDB.setODXVersion("");
            controlUnitDB.setSystemIdentifier("");
            controlUnitDB.setSerialNumber("");
            controlUnit.f29331n = new ArrayList();
            return Task.forResult(Boolean.TRUE);
        }
    }

    public interface g {
        void b(List<j> list);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29360b;

        public h(int i10, String str) {
            this.f29359a = i10;
            this.f29360b = str;
        }

        public final String toString() {
            return this.f29359a + " " + this.f29360b;
        }
    }

    public ControlUnit(ControlUnitDB controlUnitDB, a2 a2Var, k kVar, p109i8.d dVar) {
        this.f29321c = a2Var;
        this.f29335r = kVar;
        this.f29339v = dVar;
        this.f29320b = controlUnitDB;
        if (a2Var.h()) {
            D3.l lVar = new D3.l(5);
            lVar.f2765c = this;
            this.f29338u = lVar;
        } else {
            this.f29338u = new p266v8.a();
        }
        if (controlUnitDB.getODXName() == null || controlUnitDB.getODXName().isEmpty()) {
            return;
        }
        w0(ApplicationProtocol.f29264d);
    }

    public static List P(ControlUnitLabelDB.Type type, ParseObject parseObject) {
        int i10 = ControlUnitLabelDB.f34408b;
        ParseQuery query = ParseQuery.getQuery(ControlUnitLabelDB.class);
        query.whereEqualTo("relationId", parseObject.getString("relationId"));
        query.whereEqualTo("type", type.name());
        query.addAscendingOrder("channel");
        return p279w9.d.d(query, new p279w9.a(B7.b.c("CONTROL_UNIT_LABELS_AND_VALUES", type.name() + parseObject.getObjectId()), 86400000L)).f47831b;
    }

    public final Task<Integer> A(int i10) {
        Task<Boolean> taskH;
        O.e.j(f0(), "changeService(" + i10 + ")");
        if (this.f29327i == ApplicationProtocol.f29262b) {
            return Task.forResult(-1);
        }
        O.e.j(f0(), "connectDefaultService()");
        if (this.f29324f == null || !this.f29324f.d()) {
            O.e.j("ControlUnit", "Starting connect Task");
            taskH = H();
        } else {
            O.e.j("ControlUnit", "Connected");
            taskH = Task.forResult(Boolean.TRUE);
        }
        return taskH.continueWithTask(new e(i10, this));
    }

    public final void A0() {
        O.e.j(f0(), "setDefaultDiagnosticSession()");
        ApplicationProtocol applicationProtocol = this.f29327i;
        if (applicationProtocol == ApplicationProtocol.f29263c) {
            DiagnosticSession.KWP2000 kwp2000 = DiagnosticSession.KWP2000.STANDARD;
            B0(new DiagnosticSession(kwp2000.id, kwp2000.name, kwp2000.texttable));
        } else if (applicationProtocol == ApplicationProtocol.f29264d) {
            DiagnosticSession.UDS uds = DiagnosticSession.UDS.DEFAULT;
            B0(new DiagnosticSession(uds.id, uds.name, uds.texttable));
        }
    }

    public final Task<Boolean> B(int i10) {
        O.e.j(f0(), "changeServiceBool(" + i10 + ")");
        if (this.f29327i == ApplicationProtocol.f29262b) {
            return Task.forResult(Boolean.FALSE);
        }
        return this.f29335r.d(String.format(Locale.US, "10%02X", Integer.valueOf(i10))).continueWith(new M(3));
    }

    public final void B0(DiagnosticSession diagnosticSession) {
        O.e.j(f0(), "setDiagnosticSession(" + diagnosticSession.f29361a + ")");
        this.f29319a = diagnosticSession;
    }

    public final void C(String str, String str2, String str3, String str4) {
        String str5;
        StringBuilder sbC = B6.a.c("checkCUChanged(", str, ", ", str2, ", ");
        sbC.append(str3);
        sbC.append(", ");
        sbC.append(str4);
        sbC.append(")");
        O.e.j("ControlUnit", sbC.toString());
        ControlUnitDB controlUnitDB = this.f29320b;
        try {
            if (str != null) {
                str5 = "odxVersion";
                if (str.trim().equals(controlUnitDB.getHWNumberTrimmed())) {
                }
                String hWNumberTrimmed = controlUnitDB.getHWNumberTrimmed();
                String hWVersionTrimmed = controlUnitDB.getHWVersionTrimmed();
                String sWNumberTrimmed = controlUnitDB.getSWNumberTrimmed();
                String sWVersionTrimmed = controlUnitDB.getSWVersionTrimmed();
                StringBuilder sbC2 = B6.a.c("ControlUnit changed(", hWNumberTrimmed, ", ", hWVersionTrimmed, ", ");
                sbC2.append(sWNumberTrimmed);
                sbC2.append(", ");
                sbC2.append(sWVersionTrimmed);
                sbC2.append(")");
                O.e.j("ControlUnit", sbC2.toString());
                HistoryDB historyDB = new HistoryDB();
                int i10 = z.f47484b;
                historyDB.o((z) ParseUser.getCurrentUser());
                historyDB.setVehicle(this.f29321c.f42726c);
                historyDB.i(controlUnitDB);
                historyDB.put("type", HistoryDB.HistoryTypeValue.CU_CHANGED.a());
                historyDB.a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adaptations", controlUnitDB.get("adaptations"));
                jSONObject.put("securityAccess", controlUnitDB.get("securityAccess"));
                jSONObject.put("hwVersion", str2);
                jSONObject.put("coding", controlUnitDB.get("coding"));
                jSONObject.put("systemDescription", controlUnitDB.get("systemDescription"));
                jSONObject.put("swNumber", str3);
                jSONObject.put("odxName", controlUnitDB.get("odxName"));
                jSONObject.put("faults", controlUnitDB.get("faults"));
                jSONObject.put("swVersion", str4);
                String str6 = str5;
                jSONObject.put(str6, controlUnitDB.get(str6));
                jSONObject.put("systemIdentifier", controlUnitDB.get("systemIdentifier"));
                jSONObject.put("hwNumber", str);
                jSONObject.put("protocol", controlUnitDB.get("protocol"));
                jSONObject.put("scannedLogins", controlUnitDB.get("scannedLogins"));
                jSONObject.put("serialNumber", controlUnitDB.get("serialNumber"));
                jSONObject.put("advanced_info", controlUnitDB.get("advancedInfo"));
                jSONObject.put("dataById", controlUnitDB.get("dataById"));
                jSONObject.put("readDataByLocalIden", controlUnitDB.get("readDataByLocalIden"));
                jSONObject.put("hasSubsystems", controlUnitDB.get("hasSubsystems"));
                jSONObject.put("liveData", controlUnitDB.get("liveData"));
                historyDB.j(jSONObject);
                historyDB.save();
                return;
            }
            str5 = "odxVersion";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adaptations", controlUnitDB.get("adaptations"));
            jSONObject2.put("securityAccess", controlUnitDB.get("securityAccess"));
            jSONObject2.put("hwVersion", str2);
            jSONObject2.put("coding", controlUnitDB.get("coding"));
            jSONObject2.put("systemDescription", controlUnitDB.get("systemDescription"));
            jSONObject2.put("swNumber", str3);
            jSONObject2.put("odxName", controlUnitDB.get("odxName"));
            jSONObject2.put("faults", controlUnitDB.get("faults"));
            jSONObject2.put("swVersion", str4);
            String str7 = str5;
            jSONObject2.put(str7, controlUnitDB.get(str7));
            jSONObject2.put("systemIdentifier", controlUnitDB.get("systemIdentifier"));
            jSONObject2.put("hwNumber", str);
            jSONObject2.put("protocol", controlUnitDB.get("protocol"));
            jSONObject2.put("scannedLogins", controlUnitDB.get("scannedLogins"));
            jSONObject2.put("serialNumber", controlUnitDB.get("serialNumber"));
            jSONObject2.put("advanced_info", controlUnitDB.get("advancedInfo"));
            jSONObject2.put("dataById", controlUnitDB.get("dataById"));
            jSONObject2.put("readDataByLocalIden", controlUnitDB.get("readDataByLocalIden"));
            jSONObject2.put("hasSubsystems", controlUnitDB.get("hasSubsystems"));
            jSONObject2.put("liveData", controlUnitDB.get("liveData"));
            historyDB.j(jSONObject2);
            historyDB.save();
            return;
        } catch (ParseException e10) {
            O.e.m(e10);
            return;
        } catch (JSONException e11) {
            O.e.m(e11);
            return;
        }
        if ((str2 == null || str2.trim().equals(controlUnitDB.getHWVersionTrimmed())) && ((str3 == null || str3.trim().equals(controlUnitDB.getSWNumberTrimmed())) && (str4 == null || str4.trim().equals(controlUnitDB.getSWVersionTrimmed())))) {
            return;
        }
        String hWNumberTrimmed2 = controlUnitDB.getHWNumberTrimmed();
        String hWVersionTrimmed2 = controlUnitDB.getHWVersionTrimmed();
        String sWNumberTrimmed2 = controlUnitDB.getSWNumberTrimmed();
        String sWVersionTrimmed2 = controlUnitDB.getSWVersionTrimmed();
        StringBuilder sbC3 = B6.a.c("ControlUnit changed(", hWNumberTrimmed2, ", ", hWVersionTrimmed2, ", ");
        sbC3.append(sWNumberTrimmed2);
        sbC3.append(", ");
        sbC3.append(sWVersionTrimmed2);
        sbC3.append(")");
        O.e.j("ControlUnit", sbC3.toString());
        HistoryDB historyDB2 = new HistoryDB();
        int i11 = z.f47484b;
        historyDB2.o((z) ParseUser.getCurrentUser());
        historyDB2.setVehicle(this.f29321c.f42726c);
        historyDB2.i(controlUnitDB);
        historyDB2.put("type", HistoryDB.HistoryTypeValue.CU_CHANGED.a());
        historyDB2.a();
    }

    public final void C0(String str) {
        ControlUnitDB controlUnitDB = this.f29320b;
        String hWNumber = controlUnitDB.getHWNumber();
        if (TextUtils.isEmpty(hWNumber)) {
            controlUnitDB.setHWNumber(str);
        } else {
            if (hWNumber.equals(str)) {
                return;
            }
            controlUnitDB.remove("adaptations");
            controlUnitDB.setHWNumber(str);
        }
    }

    public final Task<Boolean> D(final boolean z10) {
        O.e.j(f0(), "connect(" + z10 + ")");
        Task taskContinueWithTask = f29318A.continueWithTask(new Continuation() { // from class: k8.F
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                final ControlUnit controlUnit = this.f42588a;
                final boolean z11 = z10;
                if (controlUnit.f29324f == null || !controlUnit.f29324f.d()) {
                    return controlUnit.H().continueWithTask(new Continuation() { // from class: com.obdeleven.service.model.a
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            Task<Boolean> taskB;
                            ControlUnit controlUnit2 = controlUnit;
                            O.e.j(controlUnit2.f0(), "connectTask returned " + task2.getResult());
                            if (((Boolean) task2.getResult()).booleanValue()) {
                                if (!controlUnit2.l0()) {
                                    return Task.forResult(Boolean.TRUE);
                                }
                                O.e.j(controlUnit2.f0(), "Service change is supported");
                                if (z11) {
                                    ApplicationProtocol applicationProtocol = controlUnit2.f29327i;
                                    if (applicationProtocol == ApplicationProtocol.f29263c) {
                                        taskB = controlUnit2.B(DiagnosticSession.KWP2000.STANDARD.id);
                                    } else {
                                        taskB = applicationProtocol == ApplicationProtocol.f29264d ? controlUnit2.B(DiagnosticSession.UDS.DEFAULT.id) : Task.forResult(Boolean.FALSE);
                                    }
                                } else {
                                    taskB = controlUnit2.B(controlUnit2.p().f29361a);
                                }
                                return taskB.continueWith(new q(1));
                            }
                            if (controlUnit2.f29321c.h() && controlUnit2.k0() && controlUnit2.f29321c.f42726c.i() != null) {
                                O.e.D("ControlUnit", "Reporting ControlUnit");
                                String objectId = controlUnit2.f29321c.f42726c.i().getObjectId();
                                String objectId2 = controlUnit2.f29320b.getControlUnitBase().getObjectId();
                                p255u9.p.f47478b++;
                                if (ParseConfig.getCurrentConfig().getBoolean("report_cus")) {
                                    final StringWriter stringWriter = new StringWriter();
                                    new Throwable().printStackTrace(new PrintWriter(stringWriter));
                                    final String str = "CU_REPORT:" + objectId + ":" + objectId2;
                                    ParseQuery.getQuery(p255u9.p.class).whereEqualTo("description", str);
                                    Task.callInBackground(new Callable() { // from class: u9.o
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() throws ParseException, IOException {
                                            byte[] bArr;
                                            p pVar = new p();
                                            pVar.put("description", str);
                                            pVar.put("count", -1);
                                            int i10 = z.f47484b;
                                            pVar.put(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
                                            StringWriter stringWriter2 = new StringWriter();
                                            new Throwable().printStackTrace(new PrintWriter(stringWriter2));
                                            byte[] bytes = (stringWriter2.toString() + stringWriter.toString() + "Report count: " + p.f47478b).getBytes(StandardCharsets.UTF_8);
                                            b bVar = p.f47479c;
                                            if (bVar != null) {
                                                FileInputStream fileInputStream = new FileInputStream(bVar.f4958c);
                                                int iAvailable = fileInputStream.available();
                                                bArr = new byte[bytes.length + iAvailable];
                                                fileInputStream.read(bArr);
                                                fileInputStream.close();
                                                for (int i11 = 0; i11 < bytes.length; i11++) {
                                                    try {
                                                        bArr[iAvailable + i11] = bytes[i11];
                                                    } catch (Exception e10) {
                                                        e10.getMessage();
                                                    }
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            ParseFile parseFile = new ParseFile("stacktrace.txt", bArr);
                                            parseFile.save();
                                            pVar.put("log", parseFile);
                                            try {
                                                pVar.save();
                                            } catch (ParseException e11) {
                                                e11.getMessage();
                                                e11.getCode();
                                            }
                                            return null;
                                        }
                                    });
                                }
                            }
                            return Task.forResult(Boolean.FALSE);
                        }
                    }, controlUnit.f29340w.getToken());
                }
                e.j("ControlUnit", "Connected");
                return Task.forResult(Boolean.TRUE);
            }
        }, this.f29340w.getToken());
        f29318A = taskContinueWithTask;
        return taskContinueWithTask;
    }

    public void D0(boolean z10) {
        this.f29338u.a(z10);
    }

    public final Task<Boolean> E(String str, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return this.f29324f.g("09").onSuccessTask(new f(arrayList, z10));
    }

    public final void E0(String str, boolean z10) {
        O.e.j(f0(), "setLongCoding(longCoding=" + str + ", isReadOperation=" + z10 + ")");
        z0(str, CodingType.f34406f, z10);
    }

    public final Task<Boolean> F() {
        O.e.j(f0(), "connectKline()");
        if ((n().intValue() & 65535) > 127) {
            return Task.forError(new Exception());
        }
        int i10 = 0;
        return new SetProtocolCommand(SetProtocolCommand.Protocol.K_LINE).a().onSuccessTask(new r(i10, this)).onSuccessTask(new C2648t(i10, this));
    }

    public final void F0(String str) {
        ControlUnitDB controlUnitDB = this.f29320b;
        String oDXName = controlUnitDB.getODXName();
        if (TextUtils.isEmpty(oDXName)) {
            controlUnitDB.setODXName(str);
        } else {
            if (oDXName.equals(str)) {
                return;
            }
            controlUnitDB.remove("adaptations");
            controlUnitDB.setODXName(str);
        }
    }

    public final Task<Boolean> G() {
        Task<Boolean> taskD = D(false);
        try {
            taskD.waitForCompletion();
        } catch (InterruptedException e10) {
            O.e.m(e10);
        }
        return taskD;
    }

    public final void G0(Protocol protocol) {
        this.f29324f = protocol;
        this.f29335r.c(protocol);
    }

    public Task<Boolean> H() {
        Task<Boolean> taskF;
        int i10 = 4;
        final int i11 = 0;
        final int i12 = 1;
        O.e.j(f0(), "connectTask(" + this.f29326h.name() + ")");
        ArrayList arrayList = new ArrayList();
        TransportProtocol transportProtocol = TransportProtocol.f29307f;
        arrayList.add(transportProtocol);
        TransportProtocol transportProtocol2 = TransportProtocol.f29308g;
        arrayList.add(transportProtocol2);
        TransportProtocol transportProtocol3 = TransportProtocol.f29306e;
        arrayList.add(transportProtocol3);
        TransportProtocol transportProtocol4 = TransportProtocol.f29304c;
        arrayList.add(transportProtocol4);
        String protocol = this.f29320b.getProtocol();
        TransportProtocol transportProtocol5 = TransportProtocol.f29303b;
        if (protocol != null && !TextUtils.isEmpty(protocol)) {
            String str = protocol.split(": ")[0];
            str.getClass();
            switch (str) {
                case "K-Line":
                    transportProtocol = transportProtocol4;
                    break;
                case "CAN":
                    transportProtocol = transportProtocol2;
                    break;
                case "TP1.6":
                    transportProtocol = transportProtocol3;
                    break;
                case "TP2.0":
                    break;
                default:
                    transportProtocol = transportProtocol5;
                    break;
            }
        } else {
            transportProtocol = transportProtocol5;
        }
        if (transportProtocol != transportProtocol5) {
            arrayList.remove(transportProtocol);
            arrayList.add(0, transportProtocol);
        }
        int iOrdinal = this.f29326h.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            taskF = F();
        } else if (iOrdinal != 3) {
            p109i8.d dVar = this.f29339v;
            if (iOrdinal == 4) {
                O.e.j(f0(), "connectTp20()");
                if (O() == null || O().isEmpty() || (n().intValue() & 65535) > 255) {
                    taskF = Task.forError(new Exception());
                } else {
                    taskF = ((com.obdeleven.service.core.c) dVar).c(SetProtocolCommand.Protocol.TP20).onSuccessTask(new N(i11, this)).onSuccessTask(new O(i11, this)).onSuccess(new q(i12));
                }
            } else {
                if (iOrdinal != 5) {
                    this.f29326h = (TransportProtocol) arrayList.get(0);
                    return H().continueWithTask(new p(this, i12, arrayList)).continueWithTask(new v(this, arrayList, i12)).continueWithTask(new C2104t(this, arrayList)).continueWith(new p009a8.d(i10, this));
                }
                O.e.j(f0(), "connectUDS()");
                Task<Void> taskC = ((com.obdeleven.service.core.c) dVar).c(SetProtocolCommand.Protocol.ISO_TP);
                C c10 = new C(i12, this);
                CancellationTokenSource cancellationTokenSource = this.f29340w;
                taskF = taskC.onSuccessTask(c10, cancellationTokenSource.getToken()).continueWithTask(new V8.k(7, this), cancellationTokenSource.getToken()).continueWith(new C2619j(i12, this), cancellationTokenSource.getToken());
            }
        } else {
            O.e.j(f0(), "connectTp16()");
            taskF = (O() == null || O().isEmpty() || (n().intValue() & 65535) > 255) ? Task.forError(new Exception()) : new SetProtocolCommand(SetProtocolCommand.Protocol.TP16).a().onSuccessTask(new p009a8.e(i10, this)).onSuccessTask(new Continuation() { // from class: k8.B
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    switch (i12) {
                        case 0:
                            ControlUnit controlUnit = this;
                            controlUnit.getClass();
                            return Boolean.valueOf(controlUnit.z(!task.isFaulted() && ((Boolean) task.getResult()).booleanValue()));
                        default:
                            int iShortValue = this.n().shortValue();
                            if (Integer.bitCount(iShortValue) % 2 == 0) {
                                iShortValue |= 128;
                            }
                            return new N0(String.format("%02X", Integer.valueOf(iShortValue)), 1000L).a();
                    }
                }
            }).onSuccessTask(new C2607f(i12, this));
        }
        return taskF.continueWith(new Continuation() { // from class: k8.B
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                switch (i11) {
                    case 0:
                        ControlUnit controlUnit = this;
                        controlUnit.getClass();
                        return Boolean.valueOf(controlUnit.z(!task.isFaulted() && ((Boolean) task.getResult()).booleanValue()));
                    default:
                        int iShortValue = this.n().shortValue();
                        if (Integer.bitCount(iShortValue) % 2 == 0) {
                            iShortValue |= 128;
                        }
                        return new N0(String.format("%02X", Integer.valueOf(iShortValue)), 1000L).a();
                }
            }
        });
    }

    public final Task<Integer> H0(COMPUSCALE compuscale, String str, String str2) {
        LIMIT lowerlimit = compuscale.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = compuscale.getUPPERLIMIT();
        }
        if (lowerlimit == null) {
            return Task.forResult(null);
        }
        String str3 = String.format(Locale.US, "%04X", Integer.valueOf(Integer.parseInt(lowerlimit.getValue())));
        O.e.j(f0(), "udsWriteDataByIdent(" + str3 + ")");
        return this.f29335r.d("2F" + str3 + str + str2).continueWith(new d());
    }

    public final Task<Void> I(final int i10) {
        O.e.j(f0(), "connectUDSShort(" + i10 + ")");
        return ((com.obdeleven.service.core.c) this.f29339v).b("00" + com.obdeleven.service.util.b.g(Integer.parseInt(this.f29320b.getControlUnitBase().getString("udsRespId").split(":")[i10], 16))).onSuccessTask(new Continuation() { // from class: k8.T
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                ControlUnit controlUnit = this;
                return ((c) controlUnit.f29339v).b("01" + com.obdeleven.service.util.b.g(Integer.parseInt(controlUnit.f29320b.getControlUnitBase().getString("udsReqId").split(":")[i10], 16)));
            }
        }).onSuccessTask(new C2654v(1, this)).onSuccess(new Continuation() { // from class: k8.d
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                ControlUnit controlUnit = this;
                controlUnit.f29325g = controlUnit.f29320b.getControlUnitBase().getString("udsReqId").split(":")[i10];
                return null;
            }
        });
    }

    public final Task<UDSResult> I0(COMPUSCALE compuscale, final com.obdeleven.service.odx.e.g gVar, final boolean z10) {
        LIMIT lowerlimit = compuscale.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = compuscale.getUPPERLIMIT();
        }
        if (lowerlimit == null) {
            return Task.forResult(null);
        }
        final int i10 = Integer.parseInt(lowerlimit.getValue());
        final String str = String.format(Locale.US, "%04X", Integer.valueOf(i10));
        O.e.j(f0(), "udsReadDataByIdent(" + str + ")");
        return this.f29335r.d("22".concat(str)).continueWithTask(new Continuation() { // from class: k8.k
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                final ControlUnit controlUnit = this.f42776a;
                controlUnit.getClass();
                final String str2 = (String) task.getResult();
                if (task.isFaulted() || str2 == null) {
                    e.m(task.getError());
                    return Task.forResult(null);
                }
                boolean zStartsWith = str2.startsWith("62".concat(str));
                final int i11 = i10;
                boolean z11 = z10;
                ControlUnitDB controlUnitDB = controlUnit.f29320b;
                if (zStartsWith) {
                    controlUnit.v0(i11, str2);
                    if (z11) {
                        controlUnitDB.saveInBackgroundWithLogging();
                    }
                    final com.obdeleven.service.odx.e.g gVar2 = gVar;
                    return Task.callInBackground(new Callable() { // from class: k8.x
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ControlUnit controlUnit2 = controlUnit;
                            controlUnit2.getClass();
                            return UDSResult.b(i11, str2.substring(6), gVar2, controlUnit2.f29322d);
                        }
                    });
                }
                if (!str2.startsWith("7F")) {
                    e.D("ControlUnit", "Unknown response");
                    return Task.forResult(null);
                }
                controlUnit.v0(i11, str2);
                if (z11) {
                    controlUnitDB.saveInBackgroundWithLogging();
                }
                return Task.callInBackground(new p097h9.k(1, str2));
            }
        });
    }

    public final boolean J() throws InterruptedException {
        O.e.s(f0(), "disconnectSynchronous()");
        boolean z10 = true;
        if (this.f29324f != null && this.f29324f.d()) {
            O.e.j(f0(), "Waiting for other connection tasks to finish");
            f29318A.waitForCompletion();
            O.e.j(f0(), "Other connection task finish result: " + (true ^ f29318A.isFaulted()));
            O.e.j(f0(), "Executing disconnect with protocol: " + this.f29324f.f29527b);
            p109i8.d dVar = this.f29339v;
            Protocol protocol = this.f29324f;
            ((com.obdeleven.service.core.c) dVar).getClass();
            Task<Void> taskA = protocol.a();
            taskA.waitForCompletion();
            boolean zIsFaulted = taskA.isFaulted();
            z10 = !zIsFaulted;
            O.e.j(f0(), "Disconnect result: " + z10);
            if (!zIsFaulted) {
                G0(null);
            }
        }
        return z10;
    }

    public final Task<Integer> J0(COMPUSCALE compuscale, String str) {
        LIMIT lowerlimit = compuscale.getLOWERLIMIT();
        if (lowerlimit == null) {
            lowerlimit = compuscale.getUPPERLIMIT();
        }
        if (lowerlimit == null) {
            return Task.forResult(null);
        }
        Locale locale = Locale.US;
        String str2 = String.format(locale, "%04X", Integer.valueOf(Integer.parseInt(lowerlimit.getValue())));
        O.e.j(f0(), "udsWriteDataByIdent(" + str2 + ")");
        Calendar calendar = Calendar.getInstance();
        return this.f29335r.d(String.format(locale, RequestType.Date.a() + "%ty%tm%td", calendar, calendar, calendar)).continueWithTask(new c()).continueWithTask(new b(str2, str));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, xa.g] */
    public final Task<Integer> K(final String str, final boolean z10) {
        O.e.j(f0(), "enterSecurityAccess(" + str + ")");
        if (!z10 && this.f29320b.getSWNumber() == null) {
            ((J8.a) this.f29343z.getValue()).A();
        }
        ApplicationProtocol applicationProtocol = this.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29262b;
        k kVar = this.f29335r;
        if (applicationProtocol != applicationProtocol2) {
            return kVar.d("2703").onSuccessTask(new V8.g(this, 4, str)).continueWith(new Continuation() { // from class: k8.h
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    ControlUnit controlUnit = this.f42762a;
                    controlUnit.getClass();
                    if (task.isFaulted()) {
                        return -1;
                    }
                    String str2 = (String) task.getResult();
                    if (!str2.startsWith("67")) {
                        if (str2.startsWith("7F")) {
                            return d.a(str2, 4, 16);
                        }
                        return -1;
                    }
                    if (!z10) {
                        return 0;
                    }
                    DiagnosticSession diagnosticSessionP = controlUnit.p();
                    String str3 = str;
                    ControlUnitDB controlUnitDB = controlUnit.f29320b;
                    if (diagnosticSessionP == null) {
                        controlUnitDB.addSecurityAccessCode(Integer.valueOf(str3).intValue(), null);
                    } else {
                        controlUnitDB.addSecurityAccessCode(Integer.valueOf(str3).intValue(), Integer.valueOf(controlUnit.p().f29361a));
                    }
                    controlUnitDB.saveEventuallyWithLogging();
                    return 0;
                }
            });
        }
        StringBuilder sbA = C7.g.a("2B", com.obdeleven.service.util.b.d(4, str), "00");
        sbA.append(I.b.j());
        return kVar.d(sbA.toString()).continueWith(new Continuation() { // from class: k8.g
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                ControlUnit controlUnit = this.f42755a;
                controlUnit.getClass();
                if (task.isFaulted() || !((String) task.getResult()).startsWith("09")) {
                    return -1;
                }
                if (!z10) {
                    return 0;
                }
                DiagnosticSession diagnosticSessionP = controlUnit.p();
                String str2 = str;
                ControlUnitDB controlUnitDB = controlUnit.f29320b;
                if (diagnosticSessionP == null) {
                    controlUnitDB.addSecurityAccessCode(Integer.valueOf(str2).intValue(), null);
                } else {
                    controlUnitDB.addSecurityAccessCode(Integer.valueOf(str2).intValue(), Integer.valueOf(controlUnit.p().f29361a));
                }
                controlUnitDB.saveEventuallyWithLogging();
                return 0;
            }
        });
    }

    public final Task<Integer> K0(String str) {
        O.e.j(f0(), "writeCoding(" + str + ")");
        return D(false).continueWithTask(new a(str));
    }

    public final p146l8.a L(int i10) {
        int iOrdinal = this.f29327i.ordinal();
        if (iOrdinal == 0) {
            return new p146l8.d(i10, this);
        }
        if (iOrdinal != 1) {
            return null;
        }
        return new w(i10, this);
    }

    public final Task L0(String str, int i10, int i11) {
        int iOrdinal = this.f29327i.ordinal();
        k kVar = this.f29335r;
        if (iOrdinal == 1) {
            HashMap map = new HashMap();
            Task taskContinueWithTask = kVar.d("22F1A0").continueWith(new C2658w0(map)).continueWithTask(new C2652u0(this, map)).continueWithTask(new C2646s0(this, map)).continueWithTask(new C2641q0(this, map)).continueWithTask(new C2635o0(this, i10, i11, str));
            int i12 = 0;
            return taskContinueWithTask.continueWithTask(new C2623k0(i12, this)).continueWithTask(new C2617i0(i12, this)).continueWithTask(new C2611g0(this, map, i12)).continueWithTask(new C2605e0(this, map, i12)).continueWithTask(new C2599c0(this, map)).continueWithTask(new C2593a0(this, map, i12)).continueWithTask(new Y(i12, this));
        }
        if (iOrdinal != 2) {
            return Task.forResult(-1);
        }
        HashMap map2 = new HashMap();
        int i13 = 1;
        Task taskContinueWithTask2 = kVar.d("22F1A0").continueWith(new L0(map2)).continueWithTask(new C2611g0(this, map2, i13)).continueWithTask(new C2605e0(this, map2, i13)).continueWithTask(new H0(this, i10, i11, str));
        int i14 = 1;
        return taskContinueWithTask2.continueWithTask(new Y(i14, this)).continueWithTask(new F0(this)).continueWithTask(new W(i14, this)).continueWithTask(new C0(this, map2)).continueWithTask(new A0(this, map2)).continueWithTask(new C2664y0(this, map2));
    }

    public ArrayList M() {
        if (this.f29329l == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(SupportedFunction.f29281b);
        arrayList.add(SupportedFunction.f29282c);
        arrayList.add(SupportedFunction.f29285f);
        arrayList.add(SupportedFunction.f29289k);
        arrayList.add(SupportedFunction.f29292n);
        arrayList.add(SupportedFunction.f29296r);
        arrayList.add(SupportedFunction.f29297s);
        try {
            if (!c0(true).isEmpty()) {
                arrayList.add(SupportedFunction.f29284e);
            }
        } catch (ControlUnitException e10) {
            O.e.m(e10);
        }
        ControlUnitDB controlUnitDB = this.f29320b;
        if (controlUnitDB.getCodingType() == CodingType.f34405e) {
            arrayList.add(SupportedFunction.f29286g);
        }
        if (controlUnitDB.getCodingType() == CodingType.f34406f) {
            arrayList.add(SupportedFunction.f29287h);
        }
        ApplicationProtocol applicationProtocol = this.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29263c;
        SupportedFunction supportedFunction = SupportedFunction.f29288i;
        if (applicationProtocol != applicationProtocol2 || this.f29329l.contains(supportedFunction)) {
            arrayList.add(supportedFunction);
        }
        if (this.f29327i == applicationProtocol2) {
            ArrayList arrayList2 = this.f29329l;
            SupportedFunction supportedFunction2 = SupportedFunction.j;
            if (arrayList2.contains(supportedFunction2)) {
                arrayList.add(supportedFunction2);
            }
        }
        ApplicationProtocol applicationProtocol3 = this.f29327i;
        SupportedFunction supportedFunction3 = SupportedFunction.f29290l;
        if (applicationProtocol3 != applicationProtocol2 || this.f29329l.contains(supportedFunction3)) {
            arrayList.add(supportedFunction3);
        }
        if (this.f29327i == applicationProtocol2) {
            ArrayList arrayList3 = this.f29329l;
            SupportedFunction supportedFunction4 = SupportedFunction.f29291m;
            if (arrayList3.contains(supportedFunction4)) {
                arrayList.add(supportedFunction4);
            }
        }
        if (this.f29327i != ApplicationProtocol.f29262b) {
            arrayList.add(SupportedFunction.f29293o);
        }
        ApplicationProtocol applicationProtocol4 = this.f29327i;
        ApplicationProtocol applicationProtocol5 = ApplicationProtocol.f29264d;
        if (applicationProtocol4 == applicationProtocol5) {
            arrayList.add(SupportedFunction.f29283d);
            arrayList.add(SupportedFunction.f29294p);
        }
        ArrayList arrayList4 = this.f29329l;
        SupportedFunction supportedFunction5 = SupportedFunction.f29299u;
        if (arrayList4.contains(supportedFunction5)) {
            arrayList.add(supportedFunction5);
        }
        ArrayList arrayList5 = this.f29329l;
        SupportedFunction supportedFunction6 = SupportedFunction.f29300v;
        if (arrayList5.contains(supportedFunction6)) {
            arrayList.add(supportedFunction6);
        }
        if (n().shortValue() == 1 || n().shortValue() == 17) {
            arrayList.add(SupportedFunction.f29295q);
        }
        ApplicationProtocol applicationProtocol6 = this.f29327i;
        if (applicationProtocol6 == applicationProtocol2 || applicationProtocol6 == applicationProtocol5) {
            arrayList.add(SupportedFunction.f29298t);
        }
        D dI = this.f29321c.f42726c.i();
        if (dI != null && dI.getBoolean("isSfdProtected")) {
            arrayList.add(SupportedFunction.f29301w);
        }
        return arrayList;
    }

    public final Integer M0(String str) throws InterruptedException {
        O.e.s(f0(), "writeLongCodingSync()");
        int i10 = 0;
        Task<Boolean> taskD = D(false);
        taskD.waitForCompletion();
        if (taskD.isFaulted()) {
            O.e.m(taskD.getError());
            return -1;
        }
        ControlUnitDB controlUnitDB = this.f29320b;
        if (controlUnitDB.getCodingType() != CodingType.f34406f || this.f29327i == ApplicationProtocol.f29262b) {
            O.e.j(f0(), "Bad coding type or wrong protocol");
            return -1;
        }
        int iOrdinal = this.f29328k.ordinal();
        k kVar = this.f29335r;
        if (iOrdinal == 1) {
            O.e.s(f0(), "writeSid1ALongCodingSync()");
            String sWVersion = controlUnitDB.getSWVersion();
            if (sWVersion == null) {
                O.e.D(f0(), "SW version is null");
            } else {
                Task<String> taskD2 = kVar.d("3B9A0594E8DE" + I.b.j() + com.obdeleven.service.util.b.c(sWVersion) + this.f29332o + str + "FF");
                taskD2.waitForCompletion();
                if (!taskD2.isFaulted()) {
                    String result = taskD2.getResult();
                    if (!result.startsWith("7B")) {
                        if (result.startsWith("7F")) {
                            i10 = Integer.parseInt(result.substring(4), 16);
                        }
                    }
                    return Integer.valueOf(i10);
                }
                O.e.m(taskD2.getError());
            }
            i10 = -1;
            return Integer.valueOf(i10);
        }
        if (iOrdinal != 2) {
            return -1;
        }
        O.e.s(f0(), "writeSid22LongCodingSync()");
        Calendar calendar = Calendar.getInstance();
        Task<String> taskD3 = kVar.d(String.format(Locale.US, RequestType.Date.a() + "%ty%tm%td", calendar, calendar, calendar));
        taskD3.waitForCompletion();
        if (taskD3.isFaulted()) {
            O.e.m(taskD3.getError());
        }
        Task<String> taskD4 = kVar.d(RequestType.WorkshopNumber.a() + I.b.j());
        taskD4.waitForCompletion();
        if (taskD4.isFaulted()) {
            O.e.m(taskD4.getError());
        }
        Task<String> taskD5 = kVar.d(RequestType.LongCoding.a() + str);
        taskD5.waitForCompletion();
        if (!taskD5.isFaulted()) {
            String result2 = taskD5.getResult();
            if (!result2.startsWith("6E")) {
                if (result2.startsWith("7F")) {
                    i10 = Integer.parseInt(result2.substring(4), 16);
                }
            }
            return Integer.valueOf(i10);
        }
        O.e.m(taskD5.getError());
        i10 = -1;
        return Integer.valueOf(i10);
    }

    public final m8.g N(int i10) {
        int iOrdinal = this.f29327i.ordinal();
        if (iOrdinal == 0) {
            return new m8.h(i10, this);
        }
        if (iOrdinal != 1) {
            return null;
        }
        return new m8.k(i10, this);
    }

    public final String O() {
        return this.f29320b.getControlUnitBase().getString("canKWP2000Id");
    }

    public final androidx.compose.foundation.gestures.snapping.f Q() throws ControlUnitException {
        O.e.j(f0(), "getCoding()");
        ControlUnitDB controlUnitDB = this.f29320b;
        if (controlUnitDB.getCodingType() == CodingType.f34405e) {
            return new androidx.compose.foundation.gestures.snapping.f(controlUnitDB.getCoding().optString("value"), this.f29333p);
        }
        throw new ControlUnitException(2);
    }

    public final p194p8.h R(int i10) {
        int iOrdinal = this.f29327i.ordinal();
        if (iOrdinal == 0) {
            return new p194p8.b(i10, this);
        }
        if (iOrdinal != 1) {
            return null;
        }
        return new p194p8.f(i10, this);
    }

    public final p194p8.h S(int i10, ApplicationProtocol applicationProtocol) {
        int iOrdinal = applicationProtocol.ordinal();
        if (iOrdinal == 0) {
            return new p194p8.b(i10, this);
        }
        if (iOrdinal != 1) {
            return null;
        }
        return new p194p8.f(i10, this);
    }

    public final String T() {
        return this.f29320b.getControlUnitBase().getString("klineKWP2000Id");
    }

    public final ParseObject U() throws ControlUnitException, ParseException {
        ParseObject parseObject = this.f29323e;
        if (parseObject != null) {
            return parseObject;
        }
        O.e.j(f0(), "getSWNumber()");
        ControlUnitDB controlUnitDB = this.f29320b;
        String sWNumber = controlUnitDB.getSWNumber();
        if (sWNumber == null) {
            throw new ControlUnitException(0);
        }
        this.f29323e = ControlUnitParseUtils.getLabelRelation(sWNumber.trim(), t());
        O.e.j(f0(), "getHWNumber()");
        String hWNumber = controlUnitDB.getHWNumber();
        if (hWNumber == null) {
            throw new ControlUnitException(0);
        }
        String strTrim = hWNumber.trim();
        if (this.f29323e == null && !strTrim.isEmpty()) {
            this.f29323e = ControlUnitParseUtils.getLabelRelation(strTrim, t());
        }
        if (this.f29323e == null) {
            O.e.j(f0(), "getSWNumber()");
            String sWNumber2 = controlUnitDB.getSWNumber();
            if (sWNumber2 == null) {
                throw new ControlUnitException(0);
            }
            String strTrim2 = sWNumber2.trim();
            if (strTrim2.isEmpty()) {
                O.e.j(f0(), "getHWNumber()");
                String hWNumber2 = controlUnitDB.getHWNumber();
                if (hWNumber2 == null) {
                    throw new ControlUnitException(0);
                }
                strTrim2 = hWNumber2.trim();
            }
            if (!strTrim2.isEmpty()) {
                ParseObject parseObjectCreate = ParseObject.create("ControlUnitRelation");
                this.f29323e = parseObjectCreate;
                parseObjectCreate.put("cuId", t() + "-" + strTrim2.substring(0, 2));
                this.f29323e.put("relationId", strTrim2);
                this.f29323e.put("relation", Collections.singletonList(strTrim2));
                this.f29323e.save();
            }
        }
        return this.f29323e;
    }

    public final p146l8.v V(int i10) {
        if (this.f29327i.ordinal() != 1) {
            return null;
        }
        return new p146l8.v(i10, this);
    }

    public final C2642q1 W() throws ControlUnitException {
        O.e.j(f0(), "getLongCoding()");
        ControlUnitDB controlUnitDB = this.f29320b;
        if (controlUnitDB.getCodingType() == CodingType.f34406f) {
            return new C2642q1(controlUnitDB.getCoding().optString("value"), this.f29334q);
        }
        throw new ControlUnitException(2);
    }

    public final Task<com.obdeleven.service.odx.e> X() {
        O.e.j(f0(), "getODX()");
        com.obdeleven.service.odx.e eVar = this.f29322d;
        return eVar != null ? Task.forResult(eVar) : Task.callInBackground(new p079g3.g(1, this));
    }

    @Deprecated
    public final String Y() throws ControlUnitException {
        O.e.j(f0(), "getOdxName()");
        String oDXName = this.f29320b.getODXName();
        if (oDXName != null) {
            return oDXName;
        }
        throw new ControlUnitException(0);
    }

    public final com.obdeleven.service.odx.e Z() throws ControlUnitException, OdxFactory$Exception {
        O.e.j(f0(), "getODX()");
        com.obdeleven.service.odx.e eVar = this.f29322d;
        if (eVar != null) {
            return eVar;
        }
        if (this.f29327i != ApplicationProtocol.f29264d) {
            return null;
        }
        p242t9.a aVar = Parse.f34395b;
        short sShortValue = n().shortValue();
        String strY = Y();
        O.e.j(f0(), "getOdxVersion()");
        String oDXVersion = this.f29320b.getODXVersion();
        if (oDXVersion == null) {
            throw new ControlUnitException(0);
        }
        com.obdeleven.service.odx.e eVarA = com.obdeleven.service.odx.e.a(aVar.c(sShortValue, strY, oDXVersion, this.f29321c.f42726c.i().getString("platform"), false));
        this.f29322d = eVarA;
        return eVarA;
    }

    @Override // p109i8.e
    public Task<Boolean> a() {
        O.e.j(f0(), "disconnect()");
        Task taskContinueWithTask = f29318A.continueWithTask(new C2628m(0, this));
        f29318A = taskContinueWithTask;
        return taskContinueWithTask;
    }

    public final String a0() {
        ParseFile parseFile = this.f29320b.getControlUnitBase().getParseFile("picture");
        return parseFile != null ? parseFile.getUrl() : "";
    }

    @Override // p109i8.f
    public boolean b() {
        return this.f29338u.b();
    }

    public final String b0() {
        String str;
        int iOrdinal = this.f29326h.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            str = "K-Line";
        } else if (iOrdinal == 3) {
            str = "TP1.6";
        } else if (iOrdinal != 4) {
            str = iOrdinal != 5 ? null : "CAN";
        } else {
            str = "TP2.0";
        }
        if (str == null) {
            return str;
        }
        String strConcat = str.concat(": ");
        int iOrdinal2 = this.f29327i.ordinal();
        if (iOrdinal2 == 0) {
            return s.b(strConcat, "KWP1281");
        }
        if (iOrdinal2 != 1) {
            return iOrdinal2 != 2 ? strConcat : s.b(strConcat, "UDS");
        }
        return s.b(strConcat, "KWP2000");
    }

    @Override // p109i8.e
    public Task<Boolean> c() {
        return D(false).continueWithTask(new n(7, this), this.f29340w.getToken());
    }

    @Deprecated
    public List<D1> c0(boolean z10) throws ControlUnitException {
        O.e.j(f0(), "getSubSystems()");
        ArrayList arrayList = this.f29331n;
        if (arrayList == null) {
            throw new ControlUnitException(0);
        }
        if (!z10) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (D1 d10 : this.f29331n) {
            try {
                if (!d10.u().isEmpty()) {
                    arrayList2.add(d10);
                }
            } catch (ControlUnitException unused) {
            }
        }
        return arrayList2;
    }

    @Override // p109i8.e
    public final ControlUnitDB d() {
        return this.f29320b;
    }

    public final List<D1> d0(boolean z10) {
        O.e.j(f0(), "getSubSystems()");
        ArrayList arrayList = this.f29331n;
        if (arrayList == null) {
            return new ArrayList();
        }
        if (!z10) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (D1 d10 : this.f29331n) {
            try {
                if (!d10.u().isEmpty()) {
                    arrayList2.add(d10);
                }
            } catch (ControlUnitException unused) {
            }
        }
        return arrayList2;
    }

    @Override // p109i8.e
    public final Task<Boolean> e() {
        O.e.j(f0(), "readLongCoding()");
        return D(false).continueWithTask(new C2634o(0, this));
    }

    @Deprecated
    public final List<SupportedFunction> e0() throws ControlUnitException {
        O.e.j(f0(), "getSupportedFunctions()");
        ArrayList arrayList = this.f29329l;
        if (arrayList != null) {
            return arrayList;
        }
        throw new ControlUnitException(1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Short) {
            return obj.equals(n());
        }
        return obj instanceof ControlUnit ? equals(((ControlUnit) obj).n()) : super.equals(obj);
    }

    @Override // p109i8.e
    public final void f() {
        try {
            if (this.f29322d == null) {
                Task.callInBackground(new p079g3.g(1, this)).waitForCompletion();
            }
            this.f29322d.f29490c.getClass();
            com.obdeleven.service.odx.b.f29477d.clear();
            this.f29322d = null;
        } catch (InterruptedException e10) {
            O.e.m(e10);
        }
    }

    public final String f0() {
        return t() + "_" + getName();
    }

    public final Task<Boolean> g0() {
        if (this.f29328k == RequestSID.f29346d) {
            return Task.forResult(Boolean.FALSE);
        }
        O.e.j(f0(), "identifyInfo1A()");
        ControlUnitDB controlUnitDB = this.f29320b;
        final String hWNumber = controlUnitDB.getHWNumber();
        final String hWVersion = controlUnitDB.getHWVersion();
        final String sWNumber = controlUnitDB.getSWNumber();
        final String sWVersion = controlUnitDB.getSWVersion();
        return this.f29335r.d("1A9B").continueWithTask(new Continuation() { // from class: k8.D
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                String strTrim;
                final ControlUnit controlUnit = this.f42580a;
                controlUnit.getClass();
                String str = (String) task.getResult();
                if (!str.startsWith("5A9B")) {
                    if (str.startsWith("7F1A11")) {
                        controlUnit.f29328k = ControlUnit.RequestSID.f29346d;
                    } else {
                        controlUnit.f29328k = ControlUnit.RequestSID.f29344b;
                    }
                    return Task.forResult(Boolean.FALSE);
                }
                controlUnit.f29328k = ControlUnit.RequestSID.f29345c;
                String strSubstring = str.substring(4);
                int i10 = Integer.parseInt(strSubstring.substring(0, 2), 16) & 127;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.US;
                sb2.append(String.format(locale, "%02X", Integer.valueOf(i10)));
                sb2.append(strSubstring.substring(2, 24));
                String strTrim2 = com.obdeleven.service.util.b.b(sb2.toString()).trim();
                ControlUnitDB controlUnitDB2 = controlUnit.f29320b;
                controlUnitDB2.setSWNumber(strTrim2);
                controlUnitDB2.setSWVersion(com.obdeleven.service.util.b.b(String.format(locale, "%02X", Integer.valueOf(Integer.parseInt(strSubstring.substring(24, 26), 16) & 127)) + strSubstring.substring(26, 32)).trim());
                if (strSubstring.length() < 92) {
                    e.D("ControlUnit", "Response is too short. Possibly aftermarket CU.");
                    strTrim = "";
                } else {
                    strTrim = com.obdeleven.service.util.b.b(strSubstring.substring(52, 92)).trim();
                }
                controlUnitDB2.setSystemDescription(strTrim);
                controlUnit.C0("");
                controlUnitDB2.setHWVersion("");
                controlUnitDB2.setSystemIdentifier("");
                controlUnitDB2.setSerialNumber("");
                controlUnit.F0("");
                controlUnitDB2.setODXVersion("");
                controlUnit.f29331n = new ArrayList();
                if (strSubstring.length() >= 93) {
                    String strSubstring2 = strSubstring.substring(92);
                    while (strSubstring2.length() >= 94) {
                        String strSubstring3 = strSubstring2.substring(0, 94);
                        strSubstring2 = strSubstring2.substring(94);
                        controlUnit.f29331n.add(new X0(controlUnit, strSubstring3));
                    }
                }
                final int i11 = Integer.parseInt(strSubstring.substring(32, 34), 16);
                final String strSubstring4 = strSubstring.substring(34);
                Task<TContinuationResult> taskContinueWithTask = controlUnit.f29335r.d("1A91").continueWithTask(new C2657w(1, controlUnit));
                final String str2 = sWNumber;
                final String str3 = sWVersion;
                final String str4 = hWNumber;
                final String str5 = hWVersion;
                return taskContinueWithTask.continueWithTask(new Continuation() { // from class: k8.P
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        ControlUnit controlUnit2 = controlUnit;
                        controlUnit2.C(str4, str5, str2, str3);
                        byte[] bArrE = com.obdeleven.service.util.b.e((String) task2.getResult());
                        if ((bArrE[0] & 255) == 90 && (bArrE[1] & 255) == 134) {
                            int i12 = 2 > bArrE.length ? 0 : bArrE[2] & 255;
                            if (i12 != 255 && i12 != 0) {
                                controlUnit2.f29320b.setSerialNumber(new String(Arrays.copyOfRange(bArrE, 3, 2 + i12)).trim());
                            }
                        }
                        int i13 = i11;
                        if (i13 == 0) {
                            controlUnit2.y0("", true);
                        } else if (i13 == 3) {
                            controlUnit2.y0(String.format(Locale.US, "%07d", Integer.valueOf(Integer.parseInt(strSubstring4.substring(0, 6), 16) & 8388607)), true);
                        } else if (i13 == 16) {
                            return controlUnit2.f29335r.d("1A9A").continueWith(new C2634o(1, controlUnit2));
                        }
                        return Task.forResult(Boolean.TRUE);
                    }
                });
            }
        });
    }

    @Override // p109i8.f
    public final String getName() {
        return this.f29320b.getControlUnitBase().getString("name");
    }

    @Override // p109i8.f
    public final boolean h() {
        return this.f29337t;
    }

    public Task<Void> h0(List<D1> list) {
        if (list.isEmpty()) {
            return Task.forResult(null);
        }
        Task<Void> taskForResult = Task.forResult(null);
        Iterator<D1> it = list.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.continueWithTask(new P(this, it.next()));
        }
        return taskForResult;
    }

    @Override // p109i8.e
    public final ApplicationProtocol i() {
        return this.f29327i;
    }

    public Task<Boolean> i0() {
        O.e.j(f0(), "identifySupportedFunctions()");
        return D(false).continueWithTask(new C2628m(1, this), this.f29340w.getToken());
    }

    public boolean j0() {
        return this.f29338u.d();
    }

    @Override // p109i8.e
    public final Task<Boolean> k() {
        O.e.j(f0(), "clearFaults()");
        return D(false).continueWithTask(new L(0, this)).continueWithTask(new C2663y(1, this));
    }

    public boolean k0() {
        return this.f29338u.c();
    }

    @Override // p109i8.e
    public final Task<Void> l() {
        return h0(d0(false));
    }

    public boolean l0() {
        ApplicationProtocol applicationProtocol = this.f29327i;
        return applicationProtocol == ApplicationProtocol.f29264d || applicationProtocol == ApplicationProtocol.f29263c;
    }

    public final void m0(final ControlUnitLabelDB.Type type, final g gVar) {
        final Handler handler = new Handler();
        (this.f29327i == ApplicationProtocol.f29264d ? new o(this) : new i(this)).Q().continueWith(new Continuation() { // from class: k8.A
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                ControlUnitLabelDB.Type type2 = type;
                Handler handler2 = handler;
                ControlUnit.g gVar2 = gVar;
                ControlUnit controlUnit = this.f42562a;
                controlUnit.getClass();
                if (task.isFaulted()) {
                    return new ArrayList();
                }
                int[] iArr = {0};
                List<j> list = (List) task.getResult();
                try {
                    ParseObject parseObjectU = controlUnit.U();
                    if (parseObjectU == null) {
                        return null;
                    }
                    List<ControlUnitLabelDB> listP = ControlUnit.P(type2, parseObjectU);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listP.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ControlUnitLabelDB) it.next()).getString("description"));
                    }
                    HashMap map = new HashMap();
                    if (!arrayList.isEmpty()) {
                        map = a.a(arrayList);
                    }
                    HashMap map2 = map;
                    for (j jVar : list) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<String> arrayList3 = new ArrayList();
                        for (ControlUnitLabelDB controlUnitLabelDB : listP) {
                            List list2 = listP;
                            if (controlUnitLabelDB.getInt("channel") == jVar.getChannel()) {
                                arrayList2.add(controlUnitLabelDB);
                                arrayList3.add(controlUnitLabelDB.getString("description"));
                            }
                            listP = list2;
                        }
                        List list3 = listP;
                        HashMap map3 = new HashMap();
                        for (String str : arrayList3) {
                            map3.put(str, (HashMap) map2.get(str));
                        }
                        ParseObject parseObject = parseObjectU;
                        jVar.c(new p121j8.c(ControlUnitLabelDB.Type.f34409b, parseObjectU, jVar.getChannel(), arrayList2, map3));
                        handler2.post(new c0(gVar2, iArr, list, 1));
                        listP = list3;
                        parseObjectU = parseObject;
                    }
                    return list;
                } catch (ControlUnitException e10) {
                    e = e10;
                    e.m(e);
                    return new ArrayList();
                } catch (ParseException e11) {
                    e = e11;
                    e.m(e);
                    return new ArrayList();
                }
            }
        }, Task.BACKGROUND_EXECUTOR).continueWith(new p009a8.e(3, gVar), Task.UI_THREAD_EXECUTOR);
    }

    @Override // p109i8.f
    public final Short n() {
        return this.f29320b.getControlUnitBase().a();
    }

    public Task<Boolean> n0() {
        O.e.j(f0(), "readCoding()");
        return D(false).continueWithTask(new C2607f(0, this));
    }

    @Override // p109i8.e
    public final Task<List<Fault>> o(final boolean z10, final boolean z11) {
        O.e.s(f0(), "readFaults()");
        return D(false).continueWithTask(new Continuation() { // from class: k8.i
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                final ControlUnit controlUnit = this.f42767a;
                controlUnit.getClass();
                if (!Boolean.TRUE.equals(task.getResult())) {
                    return Task.forResult(Boolean.FALSE);
                }
                controlUnit.f29330m.clear();
                int iOrdinal = controlUnit.f29327i.ordinal();
                final boolean z12 = z10;
                if (iOrdinal == 0) {
                    e.j(controlUnit.f0(), "readFaultsKline()");
                    return controlUnit.f29335r.d("07").onSuccess(new C2655v0(controlUnit, z12));
                }
                final boolean z13 = z11;
                if (iOrdinal != 1) {
                    e.s(controlUnit.f0(), "readFaultsUDS(requireDescription=" + z12 + ", readFreezeFrame=" + z13 + ")");
                    return Task.callInBackground(new Callable() { // from class: k8.p
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws InterruptedException, ControlUnitException, OdxFactory$Exception {
                            boolean z14 = true;
                            ControlUnit controlUnit2 = controlUnit;
                            Task<String> taskD = controlUnit2.f29335r.d("1902AE");
                            taskD.waitForCompletion();
                            String result = taskD.getResult();
                            boolean zStartsWith = result.startsWith("59");
                            ArrayList arrayList = controlUnit2.f29330m;
                            boolean z15 = false;
                            if (zStartsWith) {
                                String strSubstring = result.substring(6);
                                int length = strSubstring.length() / 8;
                                if (length == 0) {
                                    controlUnit2.f29337t = false;
                                } else {
                                    controlUnit2.f29337t = true;
                                    for (int i10 = 0; i10 < length; i10++) {
                                        int i11 = i10 * 8;
                                        String strSubstring2 = strSubstring.substring(i11, i11 + 8);
                                        p169n8.d dVar = new p169n8.d();
                                        dVar.f29431b = controlUnit2;
                                        String strSubstring3 = strSubstring2.substring(0, 6);
                                        char[] cArr = com.obdeleven.service.util.b.f29554a;
                                        dVar.f29432c = Integer.toString(Integer.parseInt(strSubstring3, 16));
                                        String strSubstring4 = strSubstring2.substring(6);
                                        dVar.f29435f = strSubstring4;
                                        int i12 = Integer.parseInt(strSubstring4, 16);
                                        dVar.f29436g = 0;
                                        dVar.f29438i = (i12 & 1) != 0 ? 3 : 1;
                                        arrayList.add(dVar);
                                    }
                                }
                                if (z12) {
                                    try {
                                        FaultsUtils.g(controlUnit2.Y(), arrayList);
                                    } catch (Exception e10) {
                                        e.m(e10);
                                    }
                                }
                                z15 = true;
                            } else {
                                e.D(controlUnit2.f0(), "Bad response: ".concat(result));
                            }
                            if (z13) {
                                controlUnit2.r0(arrayList, controlUnit2.f29327i);
                            } else {
                                z14 = z15;
                            }
                            return Boolean.valueOf(z14);
                        }
                    });
                }
                e.s(controlUnit.f0(), "readFaultsKWP(requireDescription=" + z12 + ", readFreezeFrame=" + z13 + ")");
                return Task.callInBackground(new Callable() { // from class: k8.u
                    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws InterruptedException, ControlUnitException, OdxFactory$Exception {
                        boolean z14;
                        boolean z15;
                        ControlUnit controlUnit2 = controlUnit;
                        if (controlUnit2.f29329l == null) {
                            Task<Boolean> taskI0 = controlUnit2.i0();
                            taskI0.waitForCompletion();
                            if (taskI0.isFaulted() || !taskI0.getResult().booleanValue()) {
                                return Boolean.FALSE;
                            }
                        }
                        boolean zContains = controlUnit2.f29329l.contains(SupportedFunction.f29300v);
                        Task<String> taskD = controlUnit2.f29335r.d(Q8.d.a(new StringBuilder("18"), zContains ? "00" : "02", "FF00"));
                        taskD.waitForCompletion();
                        String result = taskD.getResult();
                        boolean zIsEmpty = result.isEmpty();
                        ArrayList arrayList = controlUnit2.f29330m;
                        boolean z16 = true;
                        int i10 = 0;
                        if (zIsEmpty || result.startsWith("7F")) {
                            e.D(controlUnit2.f0(), "Bad response: ".concat(result));
                            z14 = false;
                        } else {
                            if ("58".equals(result)) {
                                z15 = 0;
                                controlUnit2.f29337t = false;
                            } else {
                                int i11 = 4;
                                if (result.substring(4).length() / 6 == 0) {
                                    z15 = 0;
                                    controlUnit2.f29337t = false;
                                } else {
                                    int length = result.substring(4).length() / 6;
                                    controlUnit2.f29337t = true;
                                    String strSubstring = result.substring(4);
                                    int i12 = 0;
                                    while (i12 < length) {
                                        int i13 = i12 * 6;
                                        String strSubstring2 = strSubstring.substring(i13, i13 + 6);
                                        p169n8.c cVar = new p169n8.c();
                                        cVar.f29431b = controlUnit2;
                                        cVar.f29432c = strSubstring2.substring(i10, i11);
                                        cVar.f29435f = strSubstring2.substring(i11);
                                        int i14 = Integer.parseInt(cVar.f29432c, 16);
                                        int i15 = Integer.parseInt(cVar.f29435f, 16);
                                        cVar.f29436g = i15 & 15;
                                        cVar.f29438i = (i15 >> 5) & 3;
                                        if (zContains) {
                                            int i16 = i14 >> 14;
                                            if (i16 == 0) {
                                                cVar.f29433d = "P";
                                            } else if (i16 == 1) {
                                                cVar.f29433d = "C";
                                            } else if (i16 == 2) {
                                                cVar.f29433d = "B";
                                            } else if (i16 == 3) {
                                                cVar.f29433d = "U";
                                            }
                                            cVar.f29433d += ((i14 >> 12) & 3);
                                            cVar.f29433d += cVar.f29432c.substring(1);
                                        } else if ((i14 >> 14) == 1) {
                                            int i17 = (i14 >> 12) & 3;
                                            if (i17 == 0) {
                                                cVar.f29433d = "P";
                                            } else if (i17 == 1) {
                                                cVar.f29433d = "C";
                                            } else if (i17 == 2) {
                                                cVar.f29433d = "B";
                                            } else if (i17 == 3) {
                                                cVar.f29433d = "U";
                                            }
                                            cVar.f29433d += ((i14 >> 10) & 3);
                                            cVar.f29433d += String.format(Locale.US, "%03d", Integer.valueOf(i14 & 1023));
                                        } else {
                                            cVar.f29433d = String.format(Locale.US, "%05d", Integer.valueOf(i14));
                                        }
                                        arrayList.add(cVar);
                                        i12++;
                                        i11 = 4;
                                        i10 = 0;
                                    }
                                    z15 = i10;
                                }
                            }
                            if (z12) {
                                FaultsUtils.e(arrayList, z15);
                            }
                            z14 = true;
                        }
                        if (z13) {
                            controlUnit2.r0(arrayList, controlUnit2.f29327i);
                        } else {
                            z16 = z14;
                        }
                        return Boolean.valueOf(z16);
                    }
                });
            }
        }).continueWith(new C2619j(0, this));
    }

    public final Task<String> o0(int i10, int i11, int i12) {
        int iOrdinal = this.f29327i.ordinal();
        k kVar = this.f29335r;
        if (iOrdinal == 1) {
            Capture capture = new Capture();
            return kVar.d(String.format("35%06X00%06X", Integer.valueOf(i11), Integer.valueOf(i12))).onSuccessTask(new C2625l(0, this)).onSuccessTask(new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.d(this, 1, capture)).onSuccess(new E(3, capture));
        }
        if (iOrdinal != 2) {
            return Task.forResult(null);
        }
        Capture capture2 = new Capture();
        return kVar.d(String.format(Locale.US, "3500%d%06X%06X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12))).onSuccessTask(new C2631n(0, this)).onSuccessTask(new U(this, 1, capture2)).onSuccess(new x(5, capture2));
    }

    public final DiagnosticSession p() {
        if (this.f29319a == null) {
            A0();
        }
        return this.f29319a;
    }

    public Task<Boolean> p0(boolean z10, boolean z11) {
        O.e.s(f0(), "readFaults()");
        return o(z10, z11).continueWith(new p009a8.c(6, this));
    }

    @Override // p109i8.e
    public final ArrayList q() {
        O.e.j(f0(), "getFaults()");
        return this.f29330m;
    }

    public final p181o8.a q0(Fault fault, ApplicationProtocol applicationProtocol) throws Exception {
        String strF0 = f0();
        Locale locale = Locale.US;
        O.e.s(strF0, C0936h.d("readFreezeFrame(rawCode=", fault.f29432c, ", faultCode=", fault.f29433d, ")"));
        if (applicationProtocol == ApplicationProtocol.f29262b) {
            return null;
        }
        Task<Boolean> taskD = D(false);
        taskD.waitForCompletion();
        if (!taskD.getResult().booleanValue()) {
            return null;
        }
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29263c;
        k kVar = this.f29335r;
        if (applicationProtocol == applicationProtocol2) {
            O.e.s(f0(), "readFreezeFrameKWPSync(fault=" + fault.f29432c + ")");
            StringBuilder sb2 = new StringBuilder("120004");
            sb2.append(fault.f29432c);
            Task<String> taskD2 = kVar.d(sb2.toString());
            taskD2.waitForCompletion();
            String result = taskD2.getResult();
            if (result.startsWith("52")) {
                O.e.j(f0(), "Result from kwp: ".concat(result));
                return new p181o8.b(result.substring(2));
            }
            O.e.D(f0(), "Bad response: ".concat(result));
            return null;
        }
        O.e.s(f0(), "readFreezeFrameUDSSync(fault=" + fault.f29432c + ")");
        Task<String> taskD3 = kVar.d("1906" + com.obdeleven.service.util.b.d(6, fault.f29432c) + "FF");
        taskD3.waitForCompletion();
        String result2 = taskD3.getResult();
        if (!result2.startsWith("59")) {
            O.e.D(f0(), "Bad response: ".concat(result2));
            return null;
        }
        String strSubstring = result2.substring(12);
        if (!strSubstring.isEmpty()) {
            return new p181o8.c(this.f29322d, strSubstring);
        }
        O.e.j(f0(), "Fault has no freeze frame!");
        return null;
    }

    public final void r0(ArrayList arrayList, ApplicationProtocol applicationProtocol) throws InterruptedException, ControlUnitException, OdxFactory$Exception {
        O.e.s(f0(), "readFreezeFramesForFaults(faults=" + arrayList.size() + ")");
        if (applicationProtocol == ApplicationProtocol.f29264d && this.f29322d == null) {
            Z();
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Fault fault = (Fault) it.next();
            try {
                p181o8.a aVarQ0 = q0(fault, applicationProtocol);
                fault.f29430a = aVarQ0 != null;
                fault.f29441m = aVarQ0;
                if (aVarQ0 == null) {
                    O.e.D("ControlUnit", "Freeze frame is null");
                } else {
                    i10++;
                }
            } catch (Exception unused) {
                O.e.D(f0(), "Attempts to get freeze frame for fault: " + fault.f29432c + " failed");
            }
        }
        if (i10 > 0) {
            Parse.f34395b.e();
        }
        String strF0 = f0();
        StringBuilder sbE = A8.f.e(i10, "Read freeze frames: ", "/");
        sbE.append(arrayList.size());
        O.e.j(strF0, sbE.toString());
    }

    @Override // p109i8.e
    public final RequestSID s() {
        return this.f29328k;
    }

    public final Task<String> s0(String str) {
        O.e.j(f0(), "requestReadDataById(" + str + ")");
        if (this.f29327i == ApplicationProtocol.f29262b) {
            return Task.forResult(null);
        }
        return this.f29335r.d(B7.b.c("22", str));
    }

    @Override // p109i8.f
    public final String t() {
        return this.f29320b.getControlUnitBase().b();
    }

    public final Task<String> t0(String str, String str2) {
        O.e.j(f0(), C0936h.d("requestWriteDataById(", str, ", ", str2, ")"));
        if (this.f29327i == ApplicationProtocol.f29262b) {
            return Task.forResult(null);
        }
        return this.f29335r.d(androidx.compose.foundation.gestures.d.b("2E", str, str2));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xa.g] */
    @Override // p109i8.e
    public final HistoryDB u(List<Fault> list) {
        O.e.s(f0(), "createFaultHistoryItem(faults=" + list.size() + ")");
        ControlUnitDB controlUnitDB = this.f29320b;
        String oDXName = controlUnitDB.getODXName();
        ApplicationProtocol applicationProtocol = this.f29327i;
        ApplicationProtocol applicationProtocol2 = ApplicationProtocol.f29264d;
        ?? r10 = this.f29342y;
        if (applicationProtocol != applicationProtocol2 || oDXName == null) {
            return ((p084g8.b) r10.getValue()).b(Fault.j(list), this.f29321c.f42726c, controlUnitDB);
        }
        String str = null;
        try {
            if (Z() != null) {
                com.obdeleven.service.odx.c cVar = this.f29322d.f29491d;
                str = cVar.f29482b + "_" + cVar.f29483c;
            }
        } catch (ControlUnitException | OdxFactory$Exception e10) {
            O.e.m(e10);
        }
        return ((p084g8.b) r10.getValue()).f(Fault.j(list), this.f29321c.f42726c, this.f29320b, str, oDXName);
    }

    public final void u0(HistoryDB historyDB) {
        boolean zIsEmpty;
        O.e.s(f0(), "saveFaultsToDb()");
        ControlUnitDB controlUnitDB = this.f29320b;
        JSONArray faults = controlUnitDB.getFaults();
        ArrayList arrayList = this.f29330m;
        if (faults.length() == 0 && arrayList.isEmpty()) {
            zIsEmpty = true;
        } else {
            int i10 = 0;
            if (faults.length() != arrayList.size()) {
                zIsEmpty = false;
            } else if (arrayList.isEmpty() || !(arrayList.get(0) instanceof p169n8.d)) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < faults.length(); i11++) {
                    arrayList2.add(faults.optJSONObject(i11).toString());
                }
                JSONArray jSONArrayJ = Fault.j(arrayList);
                while (i10 < jSONArrayJ.length()) {
                    arrayList2.remove(jSONArrayJ.optJSONObject(i10).toString());
                    i10++;
                }
                zIsEmpty = arrayList2.isEmpty();
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < faults.length(); i12++) {
                    JSONObject jSONObjectOptJSONObject = faults.optJSONObject(i12);
                    arrayList3.add(jSONObjectOptJSONObject.optString("rawFaultCode") + jSONObjectOptJSONObject.optString("freezeFrame"));
                }
                while (i10 < arrayList.size()) {
                    Fault fault = (Fault) arrayList.get(i10);
                    String string = fault.f29432c;
                    if (fault.f29441m != null) {
                        StringBuilder sbE = C4.b.e(string);
                        sbE.append(fault.f29441m.b());
                        string = sbE.toString();
                    }
                    arrayList3.remove(string);
                    i10++;
                }
                zIsEmpty = arrayList3.isEmpty();
            }
        }
        if (zIsEmpty) {
            O.e.j(f0(), "Skipping because faults are the same");
            return;
        }
        JSONArray jSONArrayE = historyDB.e();
        controlUnitDB.setFaults(jSONArrayE);
        O.e.j(f0(), "Updating faults. Fault count for cu(" + controlUnitDB.getObjectId() + "): " + jSONArrayE.length());
        try {
            controlUnitDB.saveWithLogging();
        } catch (ParseException e10) {
            O.e.m(e10);
        }
    }

    public final void v0(int i10, String str) {
        boolean zStartsWith = str.startsWith("62");
        ControlUnitDB controlUnitDB = this.f29320b;
        if (zStartsWith) {
            controlUnitDB.saveUdsData(i10, str);
            return;
        }
        if (str.startsWith("7F")) {
            String dataById = controlUnitDB.getDataById(i10);
            if (dataById.isEmpty() || !dataById.startsWith("62")) {
                controlUnitDB.saveUdsData(i10, str);
            }
        }
    }

    public final void w0(ApplicationProtocol applicationProtocol) {
        O.e.j(f0(), "setApplicationProtocol(" + applicationProtocol.name() + ")");
        ApplicationProtocol applicationProtocol2 = this.f29327i;
        this.f29327i = applicationProtocol;
        k kVar = this.f29335r;
        if (kVar != null) {
            kVar.a(applicationProtocol);
        }
        if (applicationProtocol2 == ApplicationProtocol.f29266f) {
            A0();
        }
    }

    @Override // p109i8.f
    public final String x(String str) {
        p255u9.v vVar;
        String string;
        C2801d controlUnitBase = this.f29320b.getControlUnitBase();
        String string2 = controlUnitBase.getString("name");
        return (str == null || str.isEmpty() || (vVar = (p255u9.v) controlUnitBase.getParseObject("texttable")) == null || !vVar.isDataAvailable() || (string = vVar.getString(str)) == null || string.isEmpty()) ? string2 : string;
    }

    public final void x0(CodingType codingType, String str) {
        ControlUnitDB controlUnitDB = this.f29320b;
        String strC = str.isEmpty() ? "NO_CODING" : codingType.c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", strC);
            jSONObject.put("value", str);
            controlUnitDB.setCoding(jSONObject);
            controlUnitDB.saveEventuallyWithLogging();
            if (controlUnitDB.getCodingType() != CodingType.f34405e) {
                this.f29334q = p121j8.e.a(this);
                return;
            }
            Task taskA = p121j8.c.a(0, this, ControlUnitLabelDB.Type.f34410c);
            taskA.waitForCompletion();
            this.f29333p = (p121j8.c) taskA.getResult();
        } catch (ControlUnitException e10) {
            e = e10;
            O.e.m(e);
        } catch (ParseException e11) {
            e = e11;
            O.e.m(e);
        } catch (InterruptedException e12) {
            e = e12;
            O.e.m(e);
        } catch (JSONException e13) {
            e = e13;
            O.e.m(e);
        }
    }

    public final void y(com.obdeleven.service.model.f fVar) {
        HashMap map = this.f29336s;
        if (map.containsKey(fVar.n())) {
            return;
        }
        map.put(fVar.n(), fVar);
    }

    public final void y0(String str, boolean z10) {
        O.e.j(f0(), "setCoding(coding=" + str + ", isReadOperation=" + z10 + ")");
        z0(str, CodingType.f34405e, z10);
    }

    public boolean z(boolean z10) {
        this.f29338u.g(z10);
        if (z10) {
            this.f29320b.setProtocol(b0());
        }
        return z10;
    }

    public final void z0(String str, CodingType codingType, boolean z10) {
        ControlUnitDB controlUnitDB = this.f29320b;
        p109i8.c cVarQ = null;
        try {
            int iOrdinal = controlUnitDB.getCodingType().ordinal();
            if (iOrdinal == 3) {
                cVarQ = Q();
            } else if (iOrdinal == 4) {
                cVarQ = W();
            }
        } catch (ControlUnitException unused) {
        }
        if (cVarQ != null && !cVarQ.getValue().equals(str)) {
            O.e.s("ControlUnit", "Coding changed. Old: " + cVarQ + " New: " + str);
            HistoryDB historyDB = new HistoryDB();
            historyDB.put("dbDataMismatch", Boolean.valueOf(z10));
            int i10 = z.f47484b;
            historyDB.o((z) ParseUser.getCurrentUser());
            historyDB.setVehicle(this.f29321c.f42726c);
            historyDB.i(controlUnitDB);
            if (l0() && p() != null) {
                historyDB.k(p().f29363c);
            }
            historyDB.put("type", controlUnitDB.getCodingType().b().a());
            try {
                int i11 = this.f29321c.f42726c.getInt("mileage");
                Integer numValueOf = Integer.valueOf(i11);
                if (i11 == 0) {
                    throw new VehicleException(2);
                }
                historyDB.put("mileage", numValueOf);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("oldValue", cVarQ.getValue());
                    jSONObject.put("newValue", str);
                    historyDB.j(jSONObject);
                    historyDB.a();
                    historyDB.saveInBackground();
                } catch (JSONException unused2) {
                }
            } catch (VehicleException unused3) {
            }
        }
        x0(codingType, str);
    }
}
