package com.obdeleven.service.util;

import O.e;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.y;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlinx.coroutines.C2680e;
import p255u9.v;

/* JADX INFO: compiled from: FaultsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FaultsUtils implements Jb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f29548b;

    /* JADX INFO: compiled from: FaultsUtils.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29549a;

        static {
            int[] iArr = new int[ApplicationProtocol.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29549a = iArr;
        }
    }

    static {
        final FaultsUtils faultsUtils = new FaultsUtils();
        f29548b = kotlin.a.b(LazyThreadSafetyMode.f42971b, new Ia.a<p084g8.a>(faultsUtils) { // from class: com.obdeleven.service.util.FaultsUtils$special$$inlined$inject$default$1
            final /* synthetic */ Jb.a $this_inject;
            final /* synthetic */ Pb.a $qualifier = null;
            final /* synthetic */ Ia.a $parameters = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_inject = faultsUtils;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [g8.a, java.lang.Object] */
            @Override // Ia.a
            public final p084g8.a invoke() {
                Jb.a aVar = this.$this_inject;
                Pb.a aVar2 = this.$qualifier;
                return (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : aVar.i().f3935a.f5143b).a(this.$parameters, aVar2, l.a(p084g8.a.class));
            }
        });
    }

    public static final void a(ArrayList arrayList) {
        HashMap map = new HashMap();
        for (ApplicationProtocol applicationProtocol : ApplicationProtocol.values()) {
            map.put(applicationProtocol, new ArrayList());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Fault fault = (Fault) it.next();
            List list = (List) map.get(fault.b());
            if (list != null) {
                list.add(fault);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            ApplicationProtocol applicationProtocol2 = (ApplicationProtocol) entry.getKey();
            List<Fault> list2 = (List) entry.getValue();
            if (!list2.isEmpty()) {
                e.j("FaultsUtils", "Updating description for " + applicationProtocol2.name() + " faults");
                int iOrdinal = applicationProtocol2.ordinal();
                if (iOrdinal == 0) {
                    e(list2, true);
                } else if (iOrdinal != 2) {
                    e(list2, false);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String str = ((Fault) it2.next()).f29433d;
                        i.d(str, "getFaultCode(...)");
                        arrayList2.add(str);
                    }
                    int i10 = v.f47482b;
                    ParseQuery query = ParseQuery.getQuery(v.class);
                    query.whereContainedIn("objectId", arrayList2);
                    w9.d.a aVarD = p279w9.d.d(query, new p279w9.a(B7.b.c("TEXT_TABLE", arrayList2.toString()), 86400000L));
                    ParseException parseException = aVarD.f47830a;
                    if (parseException != null) {
                        e.m(parseException);
                    } else {
                        HashMap map2 = new HashMap();
                        for (T t8 : aVarD.f47831b) {
                            String objectId = t8.getObjectId();
                            i.d(objectId, "getObjectId(...)");
                            map2.put(objectId, t8);
                        }
                        for (Fault fault2 : list2) {
                            v vVar = (v) map2.get(fault2.f29433d);
                            if (vVar != null) {
                                fault2.f29434e = vVar;
                            }
                        }
                        c(list2, false);
                    }
                }
            }
        }
    }

    public static void c(List list, boolean z10) {
        String str = z10 ? "KFST" : "FST";
        int i10 = v.f47482b;
        ParseQuery query = ParseQuery.getQuery(v.class);
        query.whereStartsWith("objectId", str);
        w9.d.a aVarD = p279w9.d.d(query, new p279w9.a("TEXT_TABLE".concat(str), 86400000L));
        ParseException parseException = aVarD.f47830a;
        if (parseException != null) {
            e.m(parseException);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fault fault = (Fault) it.next();
            for (T t8 : aVarD.f47831b) {
                if (i.a(t8.getObjectId(), fault.e())) {
                    fault.f29437h = t8;
                    break;
                }
            }
        }
        ParseQuery query2 = ParseQuery.getQuery(v.class);
        query2.whereStartsWith("objectId", "SST");
        w9.d.a aVarD2 = p279w9.d.d(query2, new p279w9.a("TEXT_TABLESST", 86400000L));
        ParseException parseException2 = aVarD2.f47830a;
        if (parseException2 != null) {
            e.m(parseException2);
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Fault fault2 = (Fault) it2.next();
            for (T t10 : aVarD2.f47831b) {
                if (i.a(t10.getObjectId(), fault2.h())) {
                    fault2.f29440l = t10;
                    break;
                }
            }
        }
    }

    public static void d(ControlUnit controlUnit, List list) {
        ApplicationProtocol applicationProtocol = controlUnit.f29327i;
        int i10 = applicationProtocol == null ? -1 : a.f29549a[applicationProtocol.ordinal()];
        if (i10 == 1) {
            String oDXName = controlUnit.f29320b.getODXName();
            i.b(oDXName);
            g(oDXName, list);
        } else if (i10 != 2) {
            e(list, false);
        } else {
            e(list, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[SYNTHETIC] */
    public static final void e(List<? extends Fault> faultList, boolean z10) {
        String strSubstring;
        String str;
        StringBuilder sb2;
        i.e(faultList, "faultList");
        e.s("FaultsUtils", "requestKWPFaultsDescription(faultList=" + faultList.size() + ", kwp1281=" + z10 + ")");
        Pattern patternCompile = Pattern.compile("^[BCPU]");
        ArrayList arrayList = new ArrayList();
        for (Fault fault : faultList) {
            if (patternCompile.matcher(fault.f29433d).find()) {
                String str2 = fault.f29433d;
                sb2 = new StringBuilder();
                sb2.append(str2);
                str = "00";
            } else {
                str = fault.f29433d;
                sb2 = new StringBuilder("VAG");
            }
            sb2.append(str);
            arrayList.add(sb2.toString());
        }
        int i10 = v.f47482b;
        ParseQuery query = ParseQuery.getQuery(v.class);
        query.whereContainedIn("objectId", arrayList);
        w9.d.a aVarD = p279w9.d.d(query, new p279w9.a(B7.b.c("TEXT_TABLE", arrayList.toString()), 86400000L));
        ParseException parseException = aVarD.f47830a;
        if (parseException != null) {
            e.m(parseException);
            return;
        }
        for (T t8 : aVarD.f47831b) {
            for (Fault fault2 : faultList) {
                if (patternCompile.matcher(fault2.f29433d).find()) {
                    String objectId = t8.getObjectId();
                    i.d(objectId, "getObjectId(...)");
                    String str3 = fault2.f29433d;
                    i.d(str3, "getFaultCode(...)");
                    if (!m.I(objectId, str3, false)) {
                        String objectId2 = t8.getObjectId();
                        i.d(objectId2, "getObjectId(...)");
                        strSubstring = objectId2.substring(3);
                        i.d(strSubstring, "substring(...)");
                        if (strSubstring.equalsIgnoreCase(fault2.f29433d)) {
                        }
                    }
                    fault2.f29434e = t8;
                } else {
                    String objectId3 = t8.getObjectId();
                    i.d(objectId3, "getObjectId(...)");
                    strSubstring = objectId3.substring(3);
                    i.d(strSubstring, "substring(...)");
                    if (strSubstring.equalsIgnoreCase(fault2.f29433d)) {
                        fault2.f29434e = t8;
                    }
                }
            }
        }
        c(faultList, z10);
    }

    public static final void f(final ControlUnit controlUnit, final List<? extends Fault> faults, Runnable runnable) {
        i.e(controlUnit, "controlUnit");
        i.e(faults, "faults");
        Task.callInBackground(new Callable() { // from class: com.obdeleven.service.util.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ControlUnit controlUnit2 = controlUnit;
                i.e(controlUnit2, "$controlUnit");
                List faults2 = faults;
                i.e(faults2, "$faults");
                Object obj = FaultsUtils.f29548b;
                FaultsUtils.d(controlUnit2, faults2);
                return null;
            }
        }).continueWithTask(new V8.l(2, runnable), Task.UI_THREAD_EXECUTOR);
    }

    public static final void g(String str, List faultList) {
        i.e(faultList, "faultList");
        e.s("FaultsUtils", "requestUDSFaultsDescription(faultList=" + faultList.size() + ", odxName=" + str + ")");
        String strF = new Regex("[^\\w]").f("", str);
        List<Fault> list = faultList;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Fault) it.next()).f29432c);
        }
        e.s("FaultsUtils", "Querying UDSDTCs by odxName and codes: " + strF + " " + arrayList);
        C8.a aVar = (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1(arrayList, strF, null));
        if (aVar instanceof C8.a.b) {
            Object objP = ((C8.a.b) aVar).f2463a;
            if (((Map) objP).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = ((Fault) it2.next()).f29432c;
                    char[] cArr = b.f29554a;
                    arrayList2.add(Integer.toString(Integer.parseInt(str2, 16)));
                }
                C8.a aVar2 = (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new FaultsUtils$getDescriptionFromRawCodes$udsDtcsOutput$1(arrayList2, strF, null));
                objP = aVar2 instanceof C8.a.b ? (Map) ((C8.a.b) aVar2).f2463a : y.p();
            }
            for (Fault fault : list) {
                Map map = (Map) objP;
                String str3 = fault.f29432c;
                char[] cArr2 = b.f29554a;
                String string = Integer.toString(Integer.parseInt(str3, 16));
                p072f8.a aVar3 = (p072f8.a) map.get(fault.f29432c);
                if (aVar3 == null && (aVar3 = (p072f8.a) map.get(string)) == null) {
                    e.l("FaultsUtils", "Uds Diagnostic Trouble Code (DTC) not found in database: " + string);
                } else {
                    v vVar = aVar3.f34998b;
                    fault.f29433d = vVar.getObjectId();
                    fault.f29434e = vVar;
                }
            }
        }
        c(faultList, false);
    }

    @Override // Jb.a
    public final Ib.a i() {
        return Jb.a.C0058a.a();
    }
}
