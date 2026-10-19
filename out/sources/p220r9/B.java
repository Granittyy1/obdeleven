package p220r9;

import B6.c;
import C4.b;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.model.fault.Fault;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.LIMIT;
import com.obdeleven.service.odx.model.SNREF;
import com.obdeleven.service.odx.model.VT;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.BodyType;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.models.HistoryTypeLegacy;
import com.voltasit.parse.model.HistoryDB;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p134k8.D1;
import p134k8.T1;
import p134k8.a2;
import p255u9.C2801d;
import p255u9.C2802e;
import p255u9.E;
import p255u9.z;
import p279w9.d;

/* JADX INFO: compiled from: LogUtilsLegacy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f46402a = KoinJavaComponent.b(p242t9.a.class, null, null);

    /* JADX INFO: compiled from: LogUtilsLegacy.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f46403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E f46404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<HistoryDB> f46405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f46406d;

        public a(Context context, E e10) {
            this.f46403a = context;
            this.f46404b = e10;
        }

        public final Intent a() {
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            Context context = this.f46403a;
            DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
            StringBuilder sb2 = new StringBuilder();
            String string = context.getString(R.string.common_history_log);
            E e10 = this.f46404b;
            B.c(context, e10, sb2, string);
            File fileA = x.a(context, sb2.toString(), false);
            for (HistoryDB historyDB : this.f46405c) {
                historyDB.setVehicle(e10);
                StringBuilder sb3 = new StringBuilder();
                B.a(context, historyDB, databaseLanguageValueOf.b(), sb3, this.f46406d);
                if (x.a(context, sb3.toString(), true) == null) {
                    fileA = null;
                }
            }
            List<String> list2 = com.voltasit.obdeleven.a.f29638c;
            String strG = com.voltasit.obdeleven.a.C0320a.a(context).g();
            z zVar = new z(context);
            zVar.f46510c = strG;
            zVar.f46515h = e10.k();
            zVar.f46513f = e10.d();
            zVar.f46514g = e10.e();
            zVar.b(sb2.toString());
            zVar.f46509b = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", fileA);
            zVar.c(R.string.common_send_history);
            return zVar.a();
        }
    }

    public static void a(Context context, HistoryDB historyDB, String str, StringBuilder sb2, ArrayList arrayList) {
        sb2.append("---------------------------------------------------------------\r\n");
        HistoryTypeLegacy historyTypeLegacyD = HistoryTypeLegacy.d(historyDB.getString("type"));
        if (historyTypeLegacyD == HistoryTypeLegacy.f31146g) {
            v vVar = new v();
            vVar.f46490d = historyDB.getVehicle();
            vVar.j = historyDB;
            vVar.f46496k = true;
            vVar.f46497l = true;
            vVar.f46498m = true;
            vVar.f46494h = true;
            Iterator it = d.d(vVar.a(), null).f47831b.iterator();
            while (it.hasNext()) {
                d(context, (HistoryDB) it.next(), str, sb2, arrayList);
            }
        } else if (historyTypeLegacyD == HistoryTypeLegacy.f31143d) {
            d(context, historyDB, str, sb2, arrayList);
        } else {
            sb2.append(historyTypeLegacyD.e(context, historyDB, str));
        }
        sb2.append("\r\n");
    }

    public static void b(Context context, ControlUnit controlUnit, StringBuilder sb2, String str, String str2) {
        if (!controlUnit.f29337t || controlUnit.q().isEmpty()) {
            sb2.append(str2);
            sb2.append("        ");
            sb2.append(context.getString(R.string.view_log_no_fault_codes));
            return;
        }
        for (Fault fault : controlUnit.q()) {
            sb2.append(str2);
            sb2.append("        ");
            sb2.append(fault.f29433d);
            sb2.append(" - ");
            sb2.append(fault.c(str).replaceAll("\n", " "));
            if (!fault.d(str).isEmpty()) {
                sb2.append(" ");
                sb2.append(fault.d(str));
            }
            c.f(sb2, "\r\n    ", str2, "        ");
            sb2.append(fault.g(str));
            sb2.append("\r\n");
            try {
                for (T1 t8 : fault.f().a()) {
                    sb2.append(str2);
                    sb2.append("        ");
                    sb2.append("        ");
                    sb2.append(t8.f42678a);
                    sb2.append(": ");
                    sb2.append(t8.f42679b);
                    String str3 = t8.f42680c;
                    if (str3 != null && !str3.isEmpty()) {
                        sb2.append(' ');
                        sb2.append(t8.f42680c);
                    }
                    sb2.append("\r\n");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void c(Context context, E e10, StringBuilder sb2, String str) {
        c.f(sb2, str, "\r\n\r\n", "");
        sb2.append(context.getString(R.string.common_date));
        sb2.append(": ");
        sb2.append(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(Calendar.getInstance().getTime()));
        sb2.append("\r\n\r\n");
        e10.k();
        sb2.append("");
        sb2.append("    ");
        sb2.append(context.getString(R.string.common_vin));
        sb2.append(": ");
        sb2.append(e10.k());
        sb2.append("\r\n");
        sb2.append("");
        Q8.d.f(sb2, "    ", context, R.string.common_car, ": ");
        sb2.append(e10.d());
        sb2.append(" ");
        sb2.append(e10.e());
        sb2.append("\r\n");
        sb2.append("");
        Q8.d.f(sb2, "    ", context, R.string.common_year, ": ");
        sb2.append(e10.getString("year"));
        sb2.append("\r\n");
        if (e10.j() != null) {
            sb2.append("");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_body_type));
            sb2.append(": ");
            sb2.append(BodyType.a(e10.j().getInt("body")).c(context));
            sb2.append("\r\n");
        }
        C2802e c2802eC = e10.c();
        if (c2802eC != null) {
            String strA = c2802eC.a();
            String string = c2802eC.getString("kw");
            if (string == null) {
                string = "";
            }
            String string2 = c2802eC.getString("hp");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = c2802eC.getString("ltr");
            if (string3 == null) {
                string3 = "";
            }
            sb2.append("");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_engine));
            sb2.append(": ");
            sb2.append(strA);
            if (!string.isEmpty()) {
                c.f(sb2, " ", string, " kW");
            }
            if (!string2.isEmpty()) {
                c.f(sb2, " (", string2, " HP)");
            }
            if (!string3.isEmpty()) {
                c.f(sb2, " ", string3, " l");
            }
            sb2.append("\r\n");
        }
        if (e10.getInt("mileage") > 0) {
            sb2.append("");
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_mileage));
            sb2.append(": ");
            sb2.append(e10.getInt("mileage"));
            sb2.append(" KM");
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
    }

    public static void d(Context context, HistoryDB historyDB, String str, StringBuilder sb2, ArrayList arrayList) {
        HistoryDB historyDB2;
        String str2;
        JSONObject jSONObjectD = historyDB.d();
        sb2.append(context.getString(R.string.common_backup));
        sb2.append("\r\n");
        g(context, sb2, historyDB.c(), str);
        f(context, sb2, historyDB.c(), "");
        sb2.append("    ");
        sb2.append(context.getString(R.string.dialog_backup_backup_name));
        sb2.append(": ");
        sb2.append(jSONObjectD.optString("name"));
        sb2.append("\r\n");
        JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject("coding");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectD.optJSONObject("adaptations");
        JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("subsystems");
        JSONObject jSONObjectOptJSONObject3 = jSONObjectD.optJSONObject("advanced_info");
        String str3 = "value";
        String str4 = "CODING";
        if (jSONObjectOptJSONObject != null) {
            Q8.d.f(sb2, "    ", context, jSONObjectOptJSONObject.optString("type").equals("CODING") ? R.string.common_coding : R.string.common_long_coding, ": ");
            sb2.append("\r\n");
            sb2.append("        ");
            sb2.append(jSONObjectOptJSONObject.optString("value"));
            sb2.append("\r\n");
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    if (next instanceof List) {
                        List list = (List) next;
                        int i10 = 0;
                        while (i10 < list.size()) {
                            String strD = ((Param) list.get(i10)).d();
                            if (TextUtils.isEmpty(strD)) {
                                str2 = str4;
                            } else {
                                int i11 = z.f47484b;
                                z zVar = (z) ParseUser.getCurrentUser();
                                if (zVar == null || zVar.getInt("role") != 3) {
                                    str2 = str4;
                                } else {
                                    List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                                    str2 = str4;
                                    if (com.voltasit.obdeleven.a.C0320a.a(context).b("showRawData", false)) {
                                        StringBuilder sbF = b.f(strD, " (");
                                        sbF.append(((Param) list.get(i10)).f29463l);
                                        sbF.append("/");
                                        sbF.append(((Param) list.get(i10)).f29464m);
                                        sbF.append("/");
                                        sbF.append(((Param) list.get(i10)).b());
                                        sbF.append(")");
                                        strD = sbF.toString();
                                    }
                                }
                                String strF = ((Param) list.get(i10)).f();
                                sb2.append("        ");
                                sb2.append(strD);
                                sb2.append(": ");
                                sb2.append("\r\n");
                                sb2.append("        ");
                                sb2.append("    ");
                                sb2.append(strF);
                                sb2.append("\r\n");
                            }
                            i10++;
                            str3 = str3;
                            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2;
                            str4 = str2;
                        }
                    }
                    it = it2;
                    str3 = str3;
                    jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2;
                    str4 = str4;
                }
            }
        }
        JSONObject jSONObject = jSONObjectOptJSONObject2;
        String str5 = str3;
        String str6 = str4;
        int i12 = 0;
        if (jSONArrayOptJSONArray != null) {
            Q8.d.f(sb2, "    ", context, R.string.common_subsystems, ":");
            sb2.append("\r\n");
            int i13 = 0;
            while (i13 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i13);
                String strOptString = jSONObjectOptJSONObject4.optString("name");
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("coding");
                Q8.d.f(sb2, "        ", context, R.string.common_subsystem, ": ");
                c.f(sb2, strOptString, "\r\n", "        ");
                String str7 = str6;
                sb2.append(jSONObjectOptJSONObject5.optString("type").equals(str7) ? context.getString(R.string.common_coding) : context.getString(R.string.common_long_coding));
                sb2.append(": ");
                sb2.append(jSONObjectOptJSONObject5.optString(str5));
                sb2.append("\r\n\r\n");
                i13++;
                str6 = str7;
            }
        }
        if (jSONObject != null) {
            Q8.d.f(sb2, "    ", context, R.string.common_adaptations, ":");
            sb2.append("\r\n");
            if (jSONObject.optString("type").startsWith("KWP")) {
                for (JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("values"); i12 < jSONArrayOptJSONArray2.length(); jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2) {
                    JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray2.optJSONObject(i12);
                    String strOptString2 = jSONObjectOptJSONObject6.optString("data");
                    String string = strOptString2.equals("SECURITY_ACCESS") ? context.getString(R.string.common_secured) : jSONObject.optString("type").equals("KWP") ? Integer.toString(Integer.parseInt(strOptString2, 16)) : n.d(strOptString2);
                    sb2.append("        ");
                    sb2.append(String.format(Locale.US, "%s %03d: ", context.getString(R.string.common_channel), Integer.valueOf(jSONObjectOptJSONObject6.optInt("channel"))));
                    sb2.append(string);
                    sb2.append("\r\n");
                    i12++;
                }
                historyDB2 = historyDB;
            } else {
                historyDB2 = historyDB;
                e(historyDB2, jSONObject, context, "TAB_RecorDataIdentCalibData", sb2);
            }
        } else {
            historyDB2 = historyDB;
        }
        if (jSONObjectOptJSONObject3 != null) {
            Q8.d.f(sb2, "    ", context, R.string.common_advanced_identification, ":");
            sb2.append("\r\n");
            e(historyDB2, jSONObjectOptJSONObject3, context, "TAB_RecorDataIdentECUIdent", sb2);
        }
        if (historyDB2.getInt("mileage") > 0) {
            Q8.d.f(sb2, "    ", context, R.string.common_mileage, ": ");
            sb2.append(historyDB2.getInt("mileage"));
            sb2.append(" km");
            sb2.append("\r\n");
        }
        Date createdAt = historyDB.getCreatedAt();
        sb2.append("    ");
        sb2.append(context.getString(R.string.common_date));
        sb2.append(": ");
        sb2.append(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(createdAt));
        sb2.append("\r\n");
    }

    /* JADX WARN: Code duplicated, block: B:86:0x027e A[Catch: OdxFactory$Exception -> 0x0024, TryCatch #0 {OdxFactory$Exception -> 0x0024, blocks: (B:3:0x000c, B:5:0x001a, B:10:0x0030, B:12:0x003e, B:15:0x0051, B:17:0x0057, B:20:0x0063, B:21:0x00aa, B:23:0x00b0, B:25:0x00cf, B:26:0x00e7, B:28:0x00ed, B:30:0x00f9, B:32:0x00ff, B:34:0x0109, B:36:0x0117, B:40:0x0124, B:42:0x012a, B:44:0x0136, B:48:0x0147, B:50:0x014d, B:52:0x015a, B:54:0x017a, B:57:0x0194, B:59:0x01b0, B:61:0x01b6, B:63:0x01c9, B:65:0x01ce, B:67:0x01d4, B:68:0x01dc, B:62:0x01c6, B:70:0x01e6, B:71:0x01f5, B:73:0x01fb, B:75:0x0219, B:77:0x0224, B:79:0x0231, B:83:0x0268, B:85:0x026e, B:87:0x0281, B:89:0x0286, B:91:0x028c, B:93:0x0297, B:86:0x027e, B:14:0x0048, B:9:0x0027), top: B:99:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0295  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, xa.g] */
    public static void e(HistoryDB historyDB, JSONObject jSONObject, Context context, String str, StringBuilder sb2) {
        JSONArray jSONArray;
        Iterator it;
        String str2;
        String strC;
        try {
            String oDXName = TextUtils.isEmpty(historyDB.d().optString("odxName")) ? historyDB.c().getODXName() : historyDB.d().optString("odxName");
            String oDXVersion = TextUtils.isEmpty(historyDB.d().optString("odxVersion")) ? historyDB.c().getODXVersion() : historyDB.d().optString("odxVersion");
            if (!TextUtils.isEmpty(oDXVersion) && historyDB.getVehicle().i() != null) {
                e eVarA = e.a(((p242t9.a) f46402a.getValue()).c(historyDB.c().getControlUnitBase().a().shortValue(), oDXName, oDXVersion, historyDB.getVehicle().i().getString("platform"), false));
                SNREF snref = new SNREF();
                snref.setSHORTNAME(str);
                e.g gVarH = eVarA.H(snref);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
                int i10 = 0;
                while (i10 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    int iOptInt = jSONObjectOptJSONObject.optInt("channel");
                    String strOptString = jSONObjectOptJSONObject.optString("data");
                    e.c cVarL = eVarA.l(gVarH.f29507a.getKEYDOPREF(), gVarH.f29508b);
                    String string = null;
                    if (cVarL != null) {
                        for (COMPUSCALE compuscale : ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE()) {
                            LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                            if (lowerlimit == null) {
                                lowerlimit = compuscale.getUPPERLIMIT();
                            }
                            if (lowerlimit != null && Integer.parseInt(lowerlimit.getValue()) == iOptInt) {
                                VT vt = compuscale.getCOMPUCONST().getVT();
                                if (vt.getTI() != null && (strC = Texttabe.c(vt.getTI())) != null) {
                                    string = strC;
                                }
                                if (string != null) {
                                    break;
                                }
                                string = vt.getValue();
                                break;
                            }
                        }
                    }
                    if (string == null) {
                        string = context.getString(R.string.common_unknown);
                    }
                    int i11 = z.f47484b;
                    z zVar = (z) ParseUser.getCurrentUser();
                    String str3 = "role";
                    if (zVar != null) {
                        jSONArray = jSONArrayOptJSONArray;
                        if (zVar.getInt("role") == 3) {
                            List<String> list = com.voltasit.obdeleven.a.f29638c;
                            if (com.voltasit.obdeleven.a.C0320a.a(context).b("showRawData", false)) {
                                string = string + String.format(" (%04X)", Integer.valueOf(iOptInt));
                            }
                        }
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                    }
                    sb2.append("        ");
                    sb2.append(string);
                    sb2.append(':');
                    sb2.append("\r\n");
                    if (strOptString.equals("SECURITY_ACCESS")) {
                        Param param = UDSResult.a("33").f29414c;
                        sb2.append("        ");
                        sb2.append("    ");
                        String strD = param.d();
                        String strF = param.f();
                        String strE = param.e();
                        if (strD == null || strD.isEmpty()) {
                            sb2.append("    ");
                        } else {
                            sb2.append(strD);
                            sb2.append(":");
                            sb2.append("\r\n");
                            sb2.append("        ");
                            sb2.append("        ");
                        }
                        sb2.append(strF);
                        if (strE != null && !strE.isEmpty()) {
                            sb2.append(' ');
                            sb2.append(strE);
                        }
                        sb2.append("\r\n");
                    } else {
                        Iterator it2 = UDSResult.b(iOptInt, strOptString, gVarH, eVarA).f29414c.c(false).iterator();
                        while (it2.hasNext()) {
                            Param param2 = (Param) it2.next();
                            sb2.append("        ");
                            sb2.append("    ");
                            String strD2 = param2.d();
                            e eVar = eVarA;
                            String strF2 = param2.f();
                            e.g gVar = gVarH;
                            String strE2 = param2.e();
                            if (zVar != null) {
                                it = it2;
                                str2 = str3;
                                if (zVar.getInt(str3) == 3) {
                                    List<String> list2 = com.voltasit.obdeleven.a.f29638c;
                                    if (com.voltasit.obdeleven.a.C0320a.a(context).b("showRawData", false)) {
                                        strD2 = strD2 + " (" + param2.f29463l + "/" + param2.f29464m + "/" + param2.b() + ")";
                                    }
                                }
                                if (strD2 != null || strD2.isEmpty()) {
                                    sb2.append("    ");
                                } else {
                                    sb2.append(strD2);
                                    sb2.append(":");
                                    sb2.append("\r\n");
                                    sb2.append("        ");
                                    sb2.append("        ");
                                }
                                sb2.append(strF2);
                                if (strE2 == null && !strE2.isEmpty()) {
                                    sb2.append(' ');
                                    sb2.append(strE2);
                                }
                                sb2.append("\r\n");
                                eVarA = eVar;
                                gVarH = gVar;
                                it2 = it;
                                str3 = str2;
                            } else {
                                it = it2;
                                str2 = str3;
                            }
                            if (strD2 != null) {
                                sb2.append("    ");
                            } else {
                                sb2.append("    ");
                            }
                            sb2.append(strF2);
                            if (strE2 == null) {
                            }
                            sb2.append("\r\n");
                            eVarA = eVar;
                            gVarH = gVar;
                            it2 = it;
                            str3 = str2;
                        }
                    }
                    i10++;
                    jSONArrayOptJSONArray = jSONArray;
                    eVarA = eVarA;
                    gVarH = gVarH;
                }
            }
        } catch (OdxFactory$Exception e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
        }
    }

    public static void f(Context context, StringBuilder sb2, ControlUnitDB controlUnitDB, String str) {
        if (controlUnitDB == null) {
            return;
        }
        String systemDescription = controlUnitDB.getSystemDescription();
        if (systemDescription != null && !systemDescription.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_system_description));
            c.f(sb2, ": ", systemDescription, "\r\n");
        }
        String sWNumber = controlUnitDB.getSWNumber();
        if (sWNumber != null && !sWNumber.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_software_number));
            c.f(sb2, ": ", sWNumber, "\r\n");
        }
        String sWVersion = controlUnitDB.getSWVersion();
        if (sWVersion != null && !sWVersion.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_software_version));
            c.f(sb2, ": ", sWVersion, "\r\n");
        }
        String hWNumber = controlUnitDB.getHWNumber();
        if (hWNumber != null && !hWNumber.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_hardware_number));
            c.f(sb2, ": ", hWNumber, "\r\n");
        }
        String hWVersion = controlUnitDB.getHWVersion();
        if (hWVersion != null && !hWVersion.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_hardware_version));
            c.f(sb2, ": ", hWVersion, "\r\n");
        }
        String serialNumber = controlUnitDB.getSerialNumber();
        if (serialNumber != null && !serialNumber.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_serial_number));
            c.f(sb2, ": ", serialNumber, "\r\n");
        }
        String oDXName = controlUnitDB.getODXName();
        if (oDXName != null && !oDXName.isEmpty()) {
            sb2.append(str);
            sb2.append("    ");
            sb2.append(context.getString(R.string.common_odx_name));
            c.f(sb2, ": ", oDXName, "\r\n");
        }
        String oDXVersion = controlUnitDB.getODXVersion();
        if (oDXName == null || oDXName.isEmpty()) {
            return;
        }
        sb2.append(str);
        sb2.append("    ");
        sb2.append(context.getString(R.string.common_odx_version));
        c.f(sb2, ": ", oDXVersion, "\r\n");
    }

    public static void g(Context context, StringBuilder sb2, ControlUnitDB controlUnitDB, String str) {
        C2801d controlUnitBase;
        if (controlUnitDB == null || (controlUnitBase = controlUnitDB.getControlUnitBase()) == null) {
            return;
        }
        ParseObject parseObject = controlUnitBase.getParseObject("texttable");
        String string = parseObject == null ? "" : parseObject.getString(str);
        Q8.d.f(sb2, "    ", context, R.string.common_control_unit, ": ");
        sb2.append(controlUnitBase.getString("klineId"));
        sb2.append(" ");
        sb2.append(string);
        sb2.append("\r\n");
    }

    public static String h(Context context, a2 a2Var, List<ControlUnit> list) {
        DatabaseLanguage databaseLanguage;
        char c10;
        List<String> list2 = com.voltasit.obdeleven.a.f29638c;
        DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(context).c());
        StringBuilder sb2 = new StringBuilder();
        c(context, a2Var.f42726c, sb2, context.getString(R.string.view_log));
        for (ControlUnit controlUnit : list) {
            if (controlUnit.n().shortValue() != 51) {
                String strB = databaseLanguageValueOf.b();
                sb2.append("");
                sb2.append("---------------------------------------------------------------\r\n");
                sb2.append("");
                sb2.append(controlUnit.t());
                sb2.append(" ");
                sb2.append(controlUnit.x(strB));
                sb2.append("\r\n\r\n");
                ControlUnitDB controlUnitDB = controlUnit.f29320b;
                f(context, sb2, controlUnitDB, "");
                try {
                    int iOrdinal = controlUnitDB.getCodingType().ordinal();
                    if (iOrdinal == 3) {
                        sb2.append("");
                        sb2.append("    ");
                        sb2.append(context.getString(R.string.common_coding));
                        sb2.append(": ");
                        sb2.append((String) controlUnit.Q().f10040b);
                        sb2.append("\r\n");
                    } else if (iOrdinal == 4) {
                        sb2.append("");
                        sb2.append("    ");
                        sb2.append(context.getString(R.string.common_long_coding));
                        sb2.append(": ");
                        sb2.append(controlUnit.W().f42831c);
                        sb2.append("\r\n");
                    }
                    ArrayList<D1> arrayList = (ArrayList) controlUnit.d0(true);
                    if (!arrayList.isEmpty()) {
                        sb2.append("");
                        sb2.append("\r\n");
                        sb2.append("    ");
                        sb2.append(context.getString(R.string.common_subsystems));
                        sb2.append(": ");
                        sb2.append("\r\n");
                        for (D1 d10 : arrayList) {
                            if (!d10.u().isEmpty()) {
                                sb2.append("");
                                sb2.append("        ");
                                sb2.append(context.getString(R.string.common_system_description));
                                sb2.append(": ");
                                sb2.append(d10.u());
                                sb2.append("\r\n");
                            }
                            if (!d10.l().isEmpty()) {
                                sb2.append("");
                                sb2.append("        ");
                                sb2.append(context.getString(R.string.common_software_number));
                                sb2.append(": ");
                                sb2.append(d10.l());
                                sb2.append("\r\n");
                            }
                            if (!d10.z().isEmpty()) {
                                sb2.append("");
                                sb2.append("        ");
                                sb2.append(context.getString(R.string.common_software_version));
                                sb2.append(": ");
                                sb2.append(d10.z());
                                sb2.append("\r\n");
                            }
                            if (!d10.n().isEmpty()) {
                                sb2.append("");
                                sb2.append("        ");
                                sb2.append(context.getString(R.string.common_hardware_version));
                                sb2.append(": ");
                                sb2.append(d10.n());
                                sb2.append("\r\n");
                            }
                            if (!d10.b().isEmpty()) {
                                sb2.append("");
                                sb2.append("        ");
                                sb2.append(context.getString(R.string.common_serial_number));
                                sb2.append(": ");
                                sb2.append(d10.b());
                                sb2.append("\r\n");
                            }
                            int iOrdinal2 = d10.v().ordinal();
                            databaseLanguage = databaseLanguageValueOf;
                            if (iOrdinal2 == 3) {
                                c10 = 814;
                                sb2.append("");
                                sb2.append("        ");
                                sb2.append(context.getString(R.string.common_coding));
                                sb2.append(": ");
                                sb2.append((String) d10.q().f10040b);
                                sb2.append("\r\n");
                            } else if (iOrdinal2 != 4) {
                                c10 = 814;
                            } else {
                                sb2.append("");
                                sb2.append("        ");
                                c10 = 814;
                                sb2.append(context.getString(R.string.common_long_coding));
                                sb2.append(": ");
                                sb2.append(d10.x().f42831c);
                                sb2.append("\r\n");
                            }
                            try {
                                if (arrayList.indexOf(d10) != arrayList.size() - 1) {
                                    sb2.append("\r\n");
                                }
                                databaseLanguageValueOf = databaseLanguage;
                            } catch (ControlUnitException e10) {
                                e = e10;
                                String str = "ControlUnitException: " + e.a();
                                p279w9.b bVar = Application.f29634b;
                                P8.c.a(3, "ControlUnitFaultsFragment", str, Arrays.copyOf(new Object[0], 0));
                                databaseLanguageValueOf = databaseLanguage;
                            }
                        }
                    }
                    databaseLanguage = databaseLanguageValueOf;
                    sb2.append("\r\n");
                    sb2.append("");
                    sb2.append("    ");
                    sb2.append(context.getString(R.string.common_trouble_codes));
                    sb2.append(": ");
                    sb2.append("\r\n");
                    b(context, controlUnit, sb2, strB, "");
                    sb2.append("\r\n\r\n");
                } catch (ControlUnitException e11) {
                    e = e11;
                    databaseLanguage = databaseLanguageValueOf;
                }
            } else {
                databaseLanguage = databaseLanguageValueOf;
            }
            databaseLanguageValueOf = databaseLanguage;
        }
        return sb2.toString();
    }
}
