package com.voltasit.obdeleven.models;

import B6.c;
import C4.b;
import Q8.d;
import android.content.Context;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.obdeleven.service.util.FaultsUtils;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.parse.Parse;
import com.voltasit.parse.model.HistoryDB;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p134k8.a2;
import p169n8.a;
import p220r9.B;
import p220r9.v;
import p255u9.C2801d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HistoryTypeLegacy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HistoryTypeLegacy f31141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HistoryTypeLegacy f31142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HistoryTypeLegacy f31143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HistoryTypeLegacy f31144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HistoryTypeLegacy f31145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HistoryTypeLegacy f31146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HistoryTypeLegacy f31147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ HistoryTypeLegacy[] f31148i;
    private final String name;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$1, reason: invalid class name */
    public final enum AnonymousClass1 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_coding));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_old_value, ": ");
            sb2.append(jSONObjectD.optString("oldValue"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_new_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("newValue"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$10, reason: invalid class name */
    public final enum AnonymousClass10 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_coding2));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_value, ": ");
            sb2.append(jSONObjectD.optString("value"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$11, reason: invalid class name */
    public final enum AnonymousClass11 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_diagnostic_session));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            String strC = Texttabe.c(jSONObjectD.optString("ti"));
            if (strC == null) {
                strC = jSONObjectD.optString("name");
            }
            d.f(sb2, "    ", context, R.string.common_value, ": ");
            sb2.append(strC);
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$12, reason: invalid class name */
    public final enum AnonymousClass12 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_app));
            sb2.append("\r\n    ");
            sb2.append(context.getString(R.string.common_name));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("appName"));
            sb2.append("\r\n    ");
            sb2.append(context.getString(R.string.common_old_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("oldValue"));
            sb2.append("\r\n    ");
            sb2.append(context.getString(R.string.common_new_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("newValue"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$13, reason: invalid class name */
    public final enum AnonymousClass13 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$14, reason: invalid class name */
    public final enum AnonymousClass14 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            LinkedHashMap linkedHashMapF = f(context, historyDB.d());
            sb2.append(context.getString(R.string.common_gateway_coding));
            sb2.append("\r\n");
            for (Map.Entry entry : linkedHashMapF.entrySet()) {
                sb2.append("    ");
                sb2.append((String) entry.getKey());
                sb2.append(": \r\n");
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    c.f(sb2, "        ", (String) it.next(), "\r\n");
                }
            }
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }

        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final LinkedHashMap f(Context context, JSONObject jSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("added");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("removed");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                String str = "04";
                if (i10 >= jSONArrayOptJSONArray.length()) {
                    break;
                }
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (!strOptString.equals("00")) {
                    str = strOptString;
                }
                arrayList.add("(" + strOptString + ") " + Texttabe.c("SFT000".concat(str)));
                i10++;
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put(context.getString(R.string.common_added), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                String strOptString2 = jSONArrayOptJSONArray2.optString(i11);
                arrayList2.add("(" + strOptString2 + ") " + Texttabe.c("SFT000".concat(strOptString2.equals("00") ? "04" : strOptString2)));
            }
            if (!arrayList2.isEmpty()) {
                linkedHashMap.put(context.getString(R.string.common_removed), arrayList2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$15, reason: invalid class name */
    public final enum AnonymousClass15 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            com.obdeleven.service.odx.c cVarC = null;
            ControlUnit controlUnit = new ControlUnit(historyDB.c(), new a2(historyDB.getVehicle()), null, null);
            if (controlUnit.n().shortValue() == 51) {
                return "";
            }
            sb2.append(context.getString(R.string.common_fault));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            JSONArray jSONArrayOptJSONArray = historyDB.d().optJSONArray("faults");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int iA = Fault.a(jSONArrayOptJSONArray);
            int length = jSONArrayOptJSONArray.length() - iA;
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_active_faults));
            sb2.append(": ");
            sb2.append(String.valueOf(iA));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_inactive_faults));
            sb2.append(": ");
            sb2.append(String.valueOf(length));
            sb2.append("\r\n");
            ApplicationProtocol applicationProtocolA = ApplicationProtocol.a(historyDB.c().getProtocol());
            boolean z10 = (historyDB.getVehicle() == null || historyDB.getVehicle().i() == null || !historyDB.getVehicle().i().getBoolean("supported")) ? false : true;
            com.obdeleven.service.odx.d dVarC = new Fa.d(new com.voltasit.obdeleven.domain.usecases.odx.c()).c(historyDB);
            if (dVarC != null) {
                cVarC = Parse.f34395b.c(controlUnit.n().shortValue(), dVarC.f29486a, dVarC.f29487b, new a2(historyDB.getVehicle()).f42726c.i().getString("platform"), true);
            }
            ArrayList arrayList = new ArrayList(a.k(applicationProtocolA, historyDB.e(), z10, controlUnit, cVarC));
            controlUnit.q().addAll(arrayList);
            controlUnit.f29337t = !controlUnit.q().isEmpty();
            FaultsUtils.a(arrayList);
            Object obj = B.f46402a;
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
            StringBuilder sb3 = new StringBuilder();
            databaseLanguageValueOf.getClass();
            B.f(context, sb3, controlUnit.f29320b, "");
            d.f(sb3, "    ", context, R.string.common_faults, ":");
            sb3.append("\r\n");
            B.b(context, controlUnit, sb3, databaseLanguageValueOf.b(), "");
            sb3.append("\r\n\r\n");
            sb2.append(sb3.toString());
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$16, reason: invalid class name */
    public final enum AnonymousClass16 extends HistoryTypeLegacy {
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [i8.d, i8.k] */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getString(R.string.common_full_scan));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            JSONObject jSONObjectD = historyDB.d();
            int iOptInt = jSONObjectD.optInt("controlUnitCount");
            int iOptInt2 = jSONObjectD.optInt("totalFaults");
            d.f(sb2, "    ", context, R.string.common_control_units, ": ");
            sb2.append(String.valueOf(iOptInt));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_fault_count));
            sb2.append(": ");
            sb2.append(String.valueOf(iOptInt2));
            sb2.append("\r\n");
            v vVar = new v();
            vVar.f46490d = historyDB.getVehicle();
            vVar.j = historyDB;
            boolean z10 = true;
            vVar.f46496k = true;
            vVar.f46497l = true;
            vVar.f46498m = true;
            vVar.f46494h = true;
            ?? r10 = 0;
            List<T> list = p279w9.d.d(vVar.a(), null).f47831b;
            if (!list.isEmpty()) {
                ArrayList<ControlUnit> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (T t8 : list) {
                    ControlUnit controlUnit = new ControlUnit(t8.c(), new a2(t8.getVehicle()), r10, r10);
                    ApplicationProtocol applicationProtocolA = ApplicationProtocol.a(t8.c().getProtocol());
                    boolean z11 = (t8.getVehicle() == null || t8.getVehicle().i() == null || !t8.getVehicle().i().getBoolean("supported")) ? false : z10;
                    com.obdeleven.service.odx.d dVarC = new Fa.d(new com.voltasit.obdeleven.domain.usecases.odx.c()).c(historyDB);
                    ArrayList arrayListK = a.k(applicationProtocolA, t8.e(), z11, controlUnit, dVarC != null ? Parse.f34395b.c(controlUnit.n().shortValue(), dVarC.f29486a, dVarC.f29487b, new a2(historyDB.getVehicle()).f42726c.i().getString("platform"), true) : null);
                    arrayList2.addAll(arrayListK);
                    controlUnit.q().addAll(arrayListK);
                    controlUnit.f29337t = !controlUnit.q().isEmpty();
                    arrayList.add(controlUnit);
                    z10 = true;
                    r10 = 0;
                }
                FaultsUtils.a(arrayList2);
                Object obj = B.f46402a;
                List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
                StringBuilder sbE = b.e("    ");
                sbE.append(context.getString(R.string.common_control_units));
                sbE.append(":");
                for (ControlUnit controlUnit2 : arrayList) {
                    if (controlUnit2.n().shortValue() != 51) {
                        sbE.append("        ");
                        sbE.append("\r\n");
                        sbE.append("        ");
                        sbE.append(controlUnit2.t());
                        sbE.append(" ");
                        sbE.append(controlUnit2.x(databaseLanguageValueOf.b()));
                        sbE.append("\r\n");
                        B.f(context, sbE, controlUnit2.f29320b, "    ");
                        sbE.append("    ");
                        sbE.append("    ");
                        sbE.append(context.getString(R.string.common_faults));
                        sbE.append(":");
                        sbE.append("\r\n");
                        B.b(context, controlUnit2, sbE, databaseLanguageValueOf.b(), "        ");
                        sbE.append("\r\n\r\n");
                    }
                }
                sb2.append(sbE.toString());
            }
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$17, reason: invalid class name */
    public final enum AnonymousClass17 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.view_eeprom_title));
            sb2.append("\r\n");
            String strOptString = jSONObjectD.optString("oldValue");
            String strOptString2 = jSONObjectD.optString("newValue");
            String strOptString3 = jSONObjectD.optString("address");
            String strOptString4 = jSONObjectD.optString("lenght");
            String strOptString5 = jSONObjectD.optString("lfid");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_address));
            sb2.append(":");
            sb2.append(strOptString3);
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.view_eeprom_byte_length));
            sb2.append(":");
            sb2.append(strOptString4);
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.view_epprom_input_alfid));
            sb2.append(":");
            sb2.append(strOptString5);
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_old_value));
            sb2.append(":");
            String strReplaceAll = strOptString.replaceAll("..", "$0 ").replaceAll("(.{24})", "$1\r\n        ");
            String strReplaceAll2 = strOptString2.replaceAll("..", "$0 ").replaceAll("(.{24})", "$1\r\n        ");
            sb2.append("\r\n");
            sb2.append("        ");
            sb2.append(strReplaceAll);
            sb2.append("\r\n");
            d.f(sb2, "    ", context, R.string.common_new_value, ":");
            sb2.append("\r\n");
            sb2.append("        ");
            sb2.append(strReplaceAll2);
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$18, reason: invalid class name */
    public final enum AnonymousClass18 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$19, reason: invalid class name */
    public final enum AnonymousClass19 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$2, reason: invalid class name */
    public final enum AnonymousClass2 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_long_coding));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_old_value, ":");
            sb2.append("\r\n");
            sb2.append("        ");
            sb2.append(jSONObjectD.optString("oldValue"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_new_value));
            c.f(sb2, ":", "\r\n", "        ");
            sb2.append(jSONObjectD.optString("newValue"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$20, reason: invalid class name */
    public final enum AnonymousClass20 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$21, reason: invalid class name */
    public final enum AnonymousClass21 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            int iOptInt = jSONObjectD.optInt("controlUnitCount");
            int iOptInt2 = jSONObjectD.optInt("faultsBefore");
            int iOptInt3 = jSONObjectD.optInt("faultsAfter");
            boolean zOptBoolean = jSONObjectD.optBoolean(MetricTracker.Action.COMPLETED);
            sb2.append(context.getString(R.string.common_clear));
            sb2.append("\r\n    ");
            sb2.append(context.getString(R.string.common_control_units));
            sb2.append(": ");
            sb2.append(iOptInt);
            sb2.append("\r\n    ");
            sb2.append(context.getString(R.string.faults_before));
            sb2.append(": ");
            sb2.append(iOptInt2);
            d.f(sb2, "\r\n    ", context, R.string.faults_after, ": ");
            sb2.append(iOptInt3);
            sb2.append("\r\n    ");
            sb2.append(context.getString(R.string.full_clear_comp));
            sb2.append(": ");
            sb2.append(zOptBoolean);
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$22, reason: invalid class name */
    public final enum AnonymousClass22 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$3, reason: invalid class name */
    public final enum AnonymousClass3 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_coding));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_subsystem, ": ");
            sb2.append(jSONObjectD.optString("subName"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_old_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("oldValue"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_new_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("newValue"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$4, reason: invalid class name */
    public final enum AnonymousClass4 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_long_coding));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_subsystem, ": ");
            sb2.append(jSONObjectD.optString("subName"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_old_value));
            sb2.append(":");
            sb2.append("\r\n");
            sb2.append("        ");
            sb2.append(jSONObjectD.optString("oldValue"));
            sb2.append("\r\n");
            d.f(sb2, "    ", context, R.string.common_new_value, ":");
            sb2.append("\r\n");
            sb2.append("        ");
            sb2.append(jSONObjectD.optString("newValue"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$5, reason: invalid class name */
    public final enum AnonymousClass5 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_adaptation));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_channel, ": ");
            sb2.append(jSONObjectD.optString("channel"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_old_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("oldValue"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_new_value));
            sb2.append(": ");
            sb2.append(jSONObjectD.optString("newValue"));
            sb2.append("\r\n");
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$6, reason: invalid class name */
    public final enum AnonymousClass6 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            String string;
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_basic_settings));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            d.f(sb2, "    ", context, R.string.common_channel, ": ");
            sb2.append(jSONObjectD.optString("channel"));
            sb2.append("\r\n");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_status));
            sb2.append(": ");
            sb2.append("\r\n");
            JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("statuses");
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                int iOptInt = jSONArrayOptJSONArray.optInt(i10);
                if (iOptInt == 4) {
                    string = context.getString(R.string.common_cancelled);
                } else if (iOptInt == 10) {
                    string = context.getString(R.string.common_running_advanced);
                } else if (iOptInt != 6) {
                    string = iOptInt != 7 ? null : context.getString(R.string.common_on);
                } else {
                    string = context.getString(R.string.common_off);
                }
                if (string != null) {
                    c.f(sb2, "        ", string, "\r\n");
                }
            }
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$7, reason: invalid class name */
    public final enum AnonymousClass7 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            return HistoryTypeLegacy.f31142c.e(context, historyDB, str);
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$8, reason: invalid class name */
    public final enum AnonymousClass8 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            if (historyDB.getString("type").equalsIgnoreCase("LONG_CODING-UDS")) {
                sb2.append(context.getString(R.string.common_long_coding));
                sb2.append("\r\n");
            } else {
                sb2.append(context.getString(R.string.common_adaptation));
                sb2.append("\r\n");
            }
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            if (historyDB.getString("type").equalsIgnoreCase("ADAPTATION-UDS")) {
                String strC = Texttabe.c(jSONObjectD.optString("ti"));
                if (strC == null) {
                    strC = jSONObjectD.optString("name");
                }
                d.f(sb2, "    ", context, R.string.common_name, ": ");
                sb2.append(strC);
                sb2.append("\r\n");
            }
            d.f(sb2, "    ", context, R.string.common_values, ": ");
            sb2.append("\r\n");
            JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("changes");
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                String strC2 = !jSONObjectOptJSONObject.optString("ti").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString("ti")) : null;
                if (strC2 == null) {
                    strC2 = jSONObjectOptJSONObject.optString("name");
                }
                if (!strC2.isEmpty()) {
                    sb2.append("        ");
                    sb2.append(strC2);
                    sb2.append(": ");
                    sb2.append("\r\n");
                }
                String strC3 = !jSONObjectOptJSONObject.optString("oldTi").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString("oldTi")) : null;
                if (strC3 == null) {
                    strC3 = jSONObjectOptJSONObject.optString("oldValue");
                }
                String strC4 = !jSONObjectOptJSONObject.optString("newTi").isEmpty() ? Texttabe.c(jSONObjectOptJSONObject.optString("newTi")) : null;
                if (strC4 == null) {
                    strC4 = jSONObjectOptJSONObject.optString("newValue");
                }
                String strC5 = jSONObjectOptJSONObject.optString("unitTi").isEmpty() ? null : Texttabe.c(jSONObjectOptJSONObject.optString("unitTi"));
                if (strC5 == null) {
                    strC5 = jSONObjectOptJSONObject.optString("unit");
                }
                if (!strC5.isEmpty()) {
                    strC3 = O.a.f(strC3, " ", strC5);
                    strC4 = O.a.f(strC4, " ", strC5);
                }
                sb2.append("        ");
                sb2.append("    ");
                sb2.append(context.getString(R.string.common_old_value));
                sb2.append(": ");
                sb2.append(strC3);
                sb2.append("\r\n");
                sb2.append("        ");
                d.f(sb2, "    ", context, R.string.common_new_value, ": ");
                sb2.append(strC4);
                sb2.append("\r\n");
            }
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeLegacy$9, reason: invalid class name */
    public final enum AnonymousClass9 extends HistoryTypeLegacy {
        @Override // com.voltasit.obdeleven.models.HistoryTypeLegacy
        public final String e(Context context, HistoryDB historyDB, String str) {
            StringBuilder sb2 = new StringBuilder();
            JSONObject jSONObjectD = historyDB.d();
            sb2.append(context.getString(R.string.common_basic_settings));
            sb2.append("\r\n");
            HistoryTypeLegacy.a(context, sb2, historyDB.c(), str);
            String strC = Texttabe.c(jSONObjectD.optString("ti"));
            if (strC == null) {
                strC = jSONObjectD.optString("name");
            }
            d.f(sb2, "    ", context, R.string.common_name, ": ");
            c.f(sb2, strC, "\r\n", "    ");
            sb2.append(context.getString(R.string.common_status));
            sb2.append(": ");
            sb2.append("\r\n");
            JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("statuses");
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                String strC2 = Texttabe.c(jSONObjectOptJSONObject.optString("ti"));
                if (strC2 == null) {
                    strC2 = jSONObjectOptJSONObject.optString("value");
                }
                sb2.append("        ");
                sb2.append(strC2);
                sb2.append("\r\n");
            }
            HistoryTypeLegacy.c(context, sb2, historyDB);
            HistoryTypeLegacy.b(context, sb2, historyDB);
            return sb2.toString();
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("CODING", 0, "CODING");
        f31141b = anonymousClass1;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("LONG_CODING", 1, "LONG_CODING");
        AnonymousClass3 anonymousClass3 = new AnonymousClass3("SUB_CODING", 2, "SUB_CODING");
        AnonymousClass4 anonymousClass4 = new AnonymousClass4("SUB_LONG_CODING", 3, "SUB_LONG_CODING");
        AnonymousClass5 anonymousClass5 = new AnonymousClass5("ADAPTATION", 4, "ADAPTATION");
        AnonymousClass6 anonymousClass6 = new AnonymousClass6("BASIC_SETTINGS", 5, "BASIC_SETTINGS");
        AnonymousClass7 anonymousClass7 = new AnonymousClass7("LONG_CODING_UDS", 6, "LONG_CODING-UDS");
        AnonymousClass8 anonymousClass8 = new AnonymousClass8("ADAPTATION_UDS", 7, "ADAPTATION-UDS");
        f31142c = anonymousClass8;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9("BASIC_SETTINGS_UDS", 8, "BASIC_SETTINGS-UDS");
        AnonymousClass10 anonymousClass10 = new AnonymousClass10("CODING_II", 9, "CODING_II");
        AnonymousClass11 anonymousClass11 = new AnonymousClass11("DIAGNOSTIC_SESSION", 10, "DIAGNOSTIC_SESSION");
        AnonymousClass12 anonymousClass12 = new AnonymousClass12("APP", 11, "APP");
        AnonymousClass13 anonymousClass13 = new AnonymousClass13("BACKUP", 12, "BACKUP");
        f31143d = anonymousClass13;
        AnonymousClass14 anonymousClass14 = new AnonymousClass14("GATEWAY_CODING", 13, "GATEWAY_CODING");
        f31144e = anonymousClass14;
        AnonymousClass15 anonymousClass15 = new AnonymousClass15("FAULT", 14, "FAULT");
        f31145f = anonymousClass15;
        AnonymousClass16 anonymousClass16 = new AnonymousClass16("SCAN", 15, "SCAN");
        AnonymousClass17 anonymousClass17 = new AnonymousClass17("EEPROM", 16, "EEPROM");
        AnonymousClass18 anonymousClass18 = new AnonymousClass18("BACKUP_ALL", 17, "BACKUP_ALL");
        f31146g = anonymousClass18;
        AnonymousClass19 anonymousClass19 = new AnonymousClass19("LIVE_DATA", 18, "LIVE_DATA");
        AnonymousClass20 anonymousClass20 = new AnonymousClass20("CU_CHANGED", 19, "CU_CHANGED");
        AnonymousClass21 anonymousClass21 = new AnonymousClass21("CLEAR", 20, "CLEAR");
        AnonymousClass22 anonymousClass22 = new AnonymousClass22("UNKNOWN", 21, "UNKNOWN");
        f31147h = anonymousClass22;
        f31148i = new HistoryTypeLegacy[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5, anonymousClass6, anonymousClass7, anonymousClass8, anonymousClass9, anonymousClass10, anonymousClass11, anonymousClass12, anonymousClass13, anonymousClass14, anonymousClass15, anonymousClass16, anonymousClass17, anonymousClass18, anonymousClass19, anonymousClass20, anonymousClass21, anonymousClass22};
    }

    public HistoryTypeLegacy() {
        throw null;
    }

    public HistoryTypeLegacy(String str, int i10, String str2) {
        super(str, i10);
        this.name = str2;
    }

    public static void a(Context context, StringBuilder sb2, ControlUnitDB controlUnitDB, String str) {
        if (controlUnitDB == null) {
            return;
        }
        C2801d controlUnitBase = controlUnitDB.getControlUnitBase();
        d.f(sb2, "    ", context, R.string.common_control_unit, ": ");
        sb2.append(controlUnitBase.getString("klineId"));
        sb2.append(" ");
        sb2.append(controlUnitBase.getParseObject("texttable").getString(str));
        sb2.append("\r\n");
    }

    public static void b(Context context, StringBuilder sb2, HistoryDB historyDB) {
        Date createdAt = historyDB.getCreatedAt();
        sb2.append("    ");
        sb2.append(context.getString(R.string.common_date));
        sb2.append(": ");
        sb2.append(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(createdAt));
        sb2.append("\r\n");
    }

    public static void c(Context context, StringBuilder sb2, HistoryDB historyDB) {
        if (historyDB.getInt("mileage") > 0) {
            d.f(sb2, "    ", context, R.string.common_mileage, ": ");
            sb2.append(historyDB.getInt("mileage"));
            sb2.append(" km");
            sb2.append("\r\n");
        }
    }

    public static HistoryTypeLegacy d(String str) {
        for (HistoryTypeLegacy historyTypeLegacy : values()) {
            if (historyTypeLegacy.name.equals(str)) {
                return historyTypeLegacy;
            }
        }
        return f31147h;
    }

    public static HistoryTypeLegacy valueOf(String str) {
        return (HistoryTypeLegacy) Enum.valueOf(HistoryTypeLegacy.class, str);
    }

    public static HistoryTypeLegacy[] values() {
        return (HistoryTypeLegacy[]) f31148i.clone();
    }

    public abstract String e(Context context, HistoryDB historyDB, String str);

    public abstract LinkedHashMap f(Context context, JSONObject jSONObject);
}
