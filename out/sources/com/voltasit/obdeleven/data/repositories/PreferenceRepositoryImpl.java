package com.voltasit.obdeleven.data.repositories;

import G8.C0702d;
import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.obdeleven.service.enums.ValueUnit;
import com.parse.ParseConfig;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.ApplicationLanguage;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.parse.util.VehicleComparator$By;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p114j1.C2479a;

/* JADX INFO: compiled from: PreferenceRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceRepositoryImpl implements K8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.b f30304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.a f30305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f30306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StateFlowImpl f30307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateFlowImpl f30308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlowImpl f30309g;

    public PreferenceRepositoryImpl(Context context, K8.b bVar) {
        this.f30303a = context;
        this.f30304b = bVar;
        List<String> list = com.voltasit.obdeleven.a.f29638c;
        com.voltasit.obdeleven.a aVarA = com.voltasit.obdeleven.a.C0320a.a(context);
        this.f30305c = aVarA;
        this.f30306d = context.getSharedPreferences(Constants.BRAZE_PUSH_CONTENT_KEY, 0);
        this.f30307e = B.a(Boolean.valueOf(aVarA.b("showFaultyList", false)));
        StateFlowImpl stateFlowImplA = B.a(0);
        this.f30308f = stateFlowImplA;
        this.f30309g = stateFlowImplA;
    }

    @Override // K8.o
    public final boolean A() {
        return this.f30305c.b("isBoomboardingShown", false);
    }

    @Override // K8.o
    public final boolean B() {
        return this.f30306d.getBoolean("isPersonalInfoUpdateSoon", false);
    }

    @Override // K8.o
    public final boolean C() {
        return this.f30306d.getBoolean("isSfdAutoUnlockEnabled", true);
    }

    @Override // K8.o
    public final void D(boolean z10) {
        this.f30305c.j("showRawData", z10);
    }

    @Override // K8.o
    public final void E(boolean z10) {
        this.f30305c.j("includeFreezeFrame", z10);
    }

    @Override // K8.o
    public final StateFlowImpl F() {
        return this.f30307e;
    }

    @Override // K8.o
    public final String G() {
        return this.f30305c.a("lastPurchaseProductPrice", "");
    }

    @Override // K8.o
    public final boolean H() {
        return this.f30305c.b("is_landscape", this.f30303a.getResources().getBoolean(R.bool.is_tablet));
    }

    @Override // K8.o
    public final boolean I() {
        return this.f30305c.b("showRawData", false);
    }

    @Override // K8.o
    public final String J() {
        return this.f30305c.a("device_list", "");
    }

    @Override // K8.o
    public final void K() {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.k(aVar.d("rate_us_new", 0) + 1, "rate_us_new");
        Integer numValueOf = Integer.valueOf(aVar.d("rate_us_new", 0));
        StateFlowImpl stateFlowImpl = this.f30308f;
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, numValueOf);
    }

    @Override // K8.o
    public final void L(boolean z10) {
        this.f30305c.j("voltage", z10);
    }

    @Override // K8.o
    public final void M(String str) {
        this.f30305c.o("selected_car", str);
    }

    @Override // K8.o
    public final VehicleComparator$By N() {
        int iD = this.f30305c.d("vehicle_list_sort_option", 3);
        for (VehicleComparator$By vehicleComparator$By : VehicleComparator$By.values()) {
            if (vehicleComparator$By.ordinal() == iD) {
                return vehicleComparator$By;
            }
        }
        return VehicleComparator$By.DATE_UPDATED;
    }

    @Override // K8.o
    public final void O(StartView startView) {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        aVar.k(startView.a(), "start_view");
    }

    @Override // K8.o
    public final void P(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f30306d.edit();
        editorEdit.putBoolean("isPersonalInfoUpdateSoon", z10);
        editorEdit.apply();
    }

    @Override // K8.o
    public final DatabaseLanguage Q() {
        return DatabaseLanguage.valueOf(this.f30305c.c());
    }

    @Override // K8.o
    public final void R() {
        SharedPreferences.Editor editorEdit = this.f30306d.edit();
        editorEdit.putBoolean("isSfdDialogShown", true);
        editorEdit.apply();
    }

    @Override // K8.o
    public final String S() {
        return this.f30305c.a("lastPurchaseProductId", "");
    }

    @Override // K8.o
    public final void T(VehicleComparator$By vehicleComparator$By) {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        aVar.k(vehicleComparator$By.ordinal(), "vehicle_list_sort_option");
    }

    @Override // K8.o
    public final StateFlowImpl U() {
        return this.f30309g;
    }

    @Override // K8.o
    public final boolean V() {
        return this.f30305c.b("voltage", false);
    }

    @Override // K8.o
    public final G8.v W() throws JSONException {
        String strOptString;
        String strOptString2;
        String strOptString3;
        Object objC = this.f30304b.c(p279w9.a.f47816n, false);
        if (objC instanceof G8.v) {
            return (G8.v) objC;
        }
        ParseConfig currentConfig = ParseConfig.getCurrentConfig();
        kotlin.jvm.internal.i.b(currentConfig);
        JSONArray jSONArray = currentConfig.getJSONArray("bt_firmware_update");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null && (strOptString = jSONObject.optString("prefix")) != null && (strOptString2 = jSONObject.optString("version")) != null && (strOptString3 = jSONObject.optString("firmwareObjectId")) != null) {
                    arrayList.add(new C0702d(strOptString, strOptString2, strOptString3));
                }
            }
        }
        int i11 = currentConfig.getInt("min_supported_android_version");
        int i12 = currentConfig.getInt("app_version");
        boolean z10 = currentConfig.getBoolean("is_rating_dialog_enabled", true);
        int i13 = currentConfig.getInt("rating_dialog_count", 3);
        JSONObject jSONObject2 = currentConfig.getJSONObject("app_rating_settings");
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("VAG") : null;
        boolean z11 = jSONObject3 != null ? jSONObject3.getBoolean("afterPurchaseEnabled") : false;
        JSONArray jSONArray2 = currentConfig.getJSONArray("unsupported_countries");
        List listV = jSONArray2 != null ? D9.o.v(jSONArray2) : EmptyList.f42983b;
        String string = currentConfig.getString("admob_android_ad", "");
        kotlin.jvm.internal.i.b(string);
        return new G8.v(i11, i12, listV, arrayList, z10, i13, z11, string);
    }

    @Override // K8.o
    public final int X(boolean z10) {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        return aVar.d(z10 ? "cu_list_sort_offline_option" : "cu_list_sort_option", 0);
    }

    @Override // K8.o
    public final ApplicationLanguage Y() {
        String strA = this.f30305c.a("applicationLanguage", "");
        if (strA.length() != 0) {
            return ApplicationLanguage.valueOf(strA);
        }
        Locale locale = Locale.getDefault();
        return ApplicationLanguage.a(locale.getLanguage(), locale.getCountry());
    }

    @Override // K8.o
    public final void Z(boolean z10) {
        this.f30305c.j("showVehicleName", z10);
    }

    @Override // K8.o
    public final void a(int i10) {
        this.f30305c.k(i10, "workshopNumber");
    }

    @Override // K8.o
    public final StartView a0() {
        return this.f30305c.h();
    }

    @Override // K8.o
    public final p293xa.r b(boolean z10) {
        this.f30305c.j("showFaultyList", z10);
        Boolean boolValueOf = Boolean.valueOf(z10);
        StateFlowImpl stateFlowImpl = this.f30307e;
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, boolValueOf);
        return p293xa.r.f47939a;
    }

    @Override // K8.o
    public final Object b0(DatabaseLanguage databaseLanguage, kotlin.coroutines.c<? super p293xa.r> cVar) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        String lang = databaseLanguage.name();
        Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.data.repositories.PreferenceRepositoryImpl$setDatabaseLanguage$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                InterfaceC2691h<p293xa.r> interfaceC2691h = c2693i;
                p293xa.r rVar = p293xa.r.f47939a;
                interfaceC2691h.resumeWith(rVar);
                return rVar;
            }
        };
        com.voltasit.obdeleven.a aVar2 = this.f30305c;
        aVar2.getClass();
        kotlin.jvm.internal.i.e(lang, "lang");
        SharedPreferences.Editor editorF = aVar2.f();
        if (editorF != null) {
            editorF.putString("databaseLanguage", lang);
            editorF.apply();
            C2479a.m("databaseLanguage", lang, aVar);
        }
        Object objP = c2693i.p();
        return objP == CoroutineSingletons.f43038b ? objP : p293xa.r.f47939a;
    }

    @Override // K8.o
    public final void c() {
        this.f30305c.k(0, "menuBackgroundBlurRadius");
    }

    @Override // K8.o
    public final boolean c0() {
        return this.f30306d.getBoolean("isSfdDialogShown", false);
    }

    @Override // K8.o
    public final boolean d() {
        return this.f30305c.b("showVehicleEngine", false);
    }

    @Override // K8.o
    public final void d0(boolean z10) {
        this.f30305c.j("isPaymentPending", z10);
    }

    @Override // K8.o
    public final int e() {
        return this.f30305c.d("workshopNumber", 12345);
    }

    @Override // K8.o
    public final void e0(boolean z10) {
        this.f30305c.j("showVehicleEngine", z10);
    }

    @Override // K8.o
    public final void f(int i10, boolean z10) {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        aVar.k(i10, z10 ? "cu_list_sort_offline_option" : "cu_list_sort_option");
    }

    @Override // K8.o
    public final void f0(boolean z10) {
        this.f30305c.j("showVehicleYear", z10);
    }

    @Override // K8.o
    public final boolean g() {
        return this.f30305c.b("includeFreezeFrame", false);
    }

    @Override // K8.o
    public final void g0(boolean z10) {
        ValueUnit valueUnit = z10 ? ValueUnit.f29310b : ValueUnit.f29311c;
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        aVar.o("valueUnit", valueUnit.name());
    }

    @Override // K8.o
    public final boolean h() {
        return this.f30305c.b("isPaymentPending", false);
    }

    @Override // K8.o
    public final String h0() {
        return this.f30305c.g();
    }

    @Override // K8.o
    public final void i(boolean z10) {
        this.f30305c.j("key_is_buying_process_started", z10);
    }

    @Override // K8.o
    public final boolean i0() {
        return this.f30306d.getBoolean("isPersonalInfoUpdateRequired", false);
    }

    @Override // K8.o
    public final int j() {
        return this.f30305c.d("rate_us_new", 0);
    }

    @Override // K8.o
    public final void j0(String str) {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        SharedPreferences.Editor editorF = aVar.f();
        if (editorF != null) {
            editorF.remove(str);
            editorF.apply();
        }
    }

    @Override // K8.o
    public final Object k(ApplicationLanguage applicationLanguage, kotlin.coroutines.c<? super p293xa.r> cVar) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        String lang = applicationLanguage.name();
        Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: com.voltasit.obdeleven.data.repositories.PreferenceRepositoryImpl$setApplicationLanguage$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                InterfaceC2691h<p293xa.r> interfaceC2691h = c2693i;
                p293xa.r rVar = p293xa.r.f47939a;
                interfaceC2691h.resumeWith(rVar);
                return rVar;
            }
        };
        com.voltasit.obdeleven.a aVar2 = this.f30305c;
        aVar2.getClass();
        kotlin.jvm.internal.i.e(lang, "lang");
        SharedPreferences.Editor editorF = aVar2.f();
        if (editorF != null) {
            editorF.putString("applicationLanguage", lang);
            editorF.apply();
            C2479a.m("applicationLanguage", lang, aVar);
        }
        Object objP = c2693i.p();
        return objP == CoroutineSingletons.f43038b ? objP : p293xa.r.f47939a;
    }

    @Override // K8.o
    public final void k0() {
        this.f30305c.k(0, "backgroundBlurRadius");
    }

    @Override // K8.o
    public final void l() {
        this.f30305c.j("askedFreezeFrame", true);
    }

    @Override // K8.o
    public final void l0(String str) {
        this.f30305c.o("sharingEmail", str);
    }

    @Override // K8.o
    public final void m(String str) {
        this.f30305c.o("device_list", str);
    }

    @Override // K8.o
    public final boolean m0() {
        return this.f30305c.b("askedFreezeFrame", false);
    }

    @Override // K8.o
    public final void n(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f30306d.edit();
        editorEdit.putBoolean("isPersonalInfoUpdateRequired", z10);
        editorEdit.apply();
    }

    @Override // K8.o
    public final void n0(boolean z10) {
        this.f30305c.j("showDeviceAlert", z10);
    }

    @Override // K8.o
    public final boolean o() {
        return this.f30305c.b("showDeviceAlert", true);
    }

    @Override // K8.o
    public final String o0() {
        return this.f30305c.a("selected_car", "");
    }

    @Override // K8.o
    public final void p(boolean z10) {
        this.f30305c.j("key_autocode_dialog", z10);
    }

    @Override // K8.o
    public final void p0(String str) {
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        aVar.o("lastPurchaseProductPrice", str);
    }

    @Override // K8.o
    public final void q(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f30306d.edit();
        editorEdit.putBoolean("isSfdAutoUnlockEnabled", z10);
        editorEdit.apply();
    }

    @Override // K8.o
    public final boolean r() {
        return this.f30305c.b("key_autocode_dialog", true);
    }

    @Override // K8.o
    public final boolean s() {
        return this.f30305c.b("showVehicleEngine", false);
    }

    @Override // K8.o
    public final void t() {
        this.f30305c.j("isBoomboardingShown", true);
    }

    @Override // K8.o
    public final boolean u() {
        return this.f30305c.b("showVehicleYear", false);
    }

    @Override // K8.o
    public final boolean v() {
        return this.f30305c.b("voltage", false);
    }

    @Override // K8.o
    public final boolean w() {
        return this.f30305c.i() == ValueUnit.f29310b;
    }

    @Override // K8.o
    public final boolean x() {
        return this.f30305c.b("key_ask_which_device_to_choose", true);
    }

    @Override // K8.o
    public final boolean y() {
        return this.f30305c.b("showVehicleName", false);
    }

    @Override // K8.o
    public final void z(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        com.voltasit.obdeleven.a aVar = this.f30305c;
        aVar.getClass();
        aVar.o("lastPurchaseProductId", value);
    }
}
