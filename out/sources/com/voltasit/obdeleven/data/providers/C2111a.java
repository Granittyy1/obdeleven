package com.voltasit.obdeleven.data.providers;

import android.os.Bundle;
import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.C1912u0;
import com.google.android.gms.internal.measurement.C1926w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagFirmwareRedirect;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirect;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirectPromo;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VinResult;
import io.intercom.android.sdk.models.Participant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: com.voltasit.obdeleven.data.providers.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnalyticsProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2111a implements J8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f30253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseAnalytics f30254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p193p7.b f30255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f30256e;

    public C2111a(J8.d dVar, J8.p pVar, q qVar) {
        this.f30252a = pVar;
        this.f30253b = qVar;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(dVar.getContext());
        kotlin.jvm.internal.i.d(firebaseAnalytics, "getInstance(...)");
        this.f30254c = firebaseAnalytics;
        p241t7.a aVar = p193p7.b.f45875e;
        p193p7.b bVar = (p193p7.b) p144l6.e.c().b(p193p7.b.class);
        kotlin.jvm.internal.i.d(bVar, "getInstance(...)");
        this.f30255d = bVar;
        this.f30256e = new LinkedHashMap();
    }

    public static String h0(String str) {
        if (str.length() <= 100) {
            return str;
        }
        String strSubstring = str.substring(0, 100);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Bundle i0(G8.x xVar) {
        Bundle bundle = new Bundle();
        String str = xVar.f3556a;
        if (str != null) {
            bundle.putString("vehicleBaseId", str);
        }
        String str2 = xVar.f3557b;
        if (str2 != null) {
            bundle.putString("model", str2);
        }
        String str3 = xVar.f3559d;
        if (str3 != null) {
            bundle.putString("vin", str3);
        }
        Integer num = xVar.f3560e;
        if (num != null) {
            bundle.putInt("year", num.intValue());
        }
        String str4 = xVar.f3561f;
        if (str4 != null) {
            bundle.putString("klineId", str4);
        }
        return bundle;
    }

    @Override // J8.a
    public final void A() {
        this.f30254c.a(C4.v.d("bug_id", "BB2-336"), "bug_fix");
    }

    @Override // J8.a
    public final void B(String str, String odxVersion) {
        kotlin.jvm.internal.i.e(odxVersion, "odxVersion");
        Bundle bundle = new Bundle();
        bundle.putString("control_unit_base_id", str);
        bundle.putString("odx_version", odxVersion);
        this.f30254c.a(bundle, "odx_version_selected");
    }

    @Override // J8.a
    public final void C(AnalyticsProvider$EventParamValue$VagFirmwareRedirect analyticsProvider$EventParamValue$VagFirmwareRedirect) {
        this.f30254c.a(null, analyticsProvider$EventParamValue$VagFirmwareRedirect.a());
    }

    @Override // J8.a
    public final void D() {
        this.f30254c.a(p271w0.c.a(), "trouble_code_toggle_clicked");
    }

    @Override // J8.a
    public final void E(String str) {
        W(str);
        this.f30255d.getClass();
        Trace trace = new Trace(str, p314z7.f.f48930t, new O.e(), p206q7.a.a(), GaugeManager.getInstance());
        this.f30256e.put(str, trace);
        trace.start();
    }

    @Override // J8.a
    public final void F(AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult, String vin) {
        kotlin.jvm.internal.i.e(vin, "vin");
        Bundle bundle = new Bundle();
        bundle.putString("result", analyticsProvider$EventParamValue$VinResult.a());
        bundle.putString("vin", vin);
        this.f30254c.a(bundle, "vin");
    }

    @Override // J8.a
    public final void G() {
        this.f30254c.a(p271w0.c.a(), "history_clicked");
    }

    @Override // J8.a
    public final void H() {
        this.f30254c.a(p271w0.c.a(), "force_update");
    }

    @Override // J8.a
    public final void I() {
        this.f30254c.a(p271w0.c.a(), "long_kwp_adaptation_slided_to_right");
    }

    @Override // J8.a
    public final void J(String feature, String str) {
        kotlin.jvm.internal.i.e(feature, "feature");
        Bundle bundle = new Bundle();
        bundle.putString("feature", feature);
        bundle.putString("texttable_id", str);
        this.f30254c.a(bundle, "feature_used");
        Map mapO = kotlin.collections.x.o(new Pair("feature", feature));
        Braze.Companion.getInstance(this.f30253b.f30274a).logCustomEvent("feature_used", new BrazeProperties((Map<String, ?>) mapO));
    }

    @Override // J8.a
    public final void K() {
        this.f30254c.a(p271w0.c.a(), "output_test_uds_slided_to_right");
    }

    @Override // J8.a
    public final void L() {
        this.f30254c.a(C4.v.d("source", "play_store"), "app_update_source");
    }

    @Override // J8.a
    public final void M(String platform, String odxName, String odxVersion) {
        kotlin.jvm.internal.i.e(platform, "platform");
        kotlin.jvm.internal.i.e(odxName, "odxName");
        kotlin.jvm.internal.i.e(odxVersion, "odxVersion");
        Bundle bundle = new Bundle();
        bundle.putString("platform", platform);
        bundle.putString("odx_name", odxName);
        bundle.putString("odx_version", odxVersion);
        this.f30254c.a(bundle, "odx_missing");
    }

    @Override // J8.a
    public final void N() {
        this.f30254c.a(p271w0.c.a(), "basic_settings_kwp_slided_to_right");
    }

    @Override // J8.a
    public final void O(String str, String odxUniqueId) {
        kotlin.jvm.internal.i.e(odxUniqueId, "odxUniqueId");
        Bundle bundle = new Bundle();
        bundle.putString("shortname", str);
        bundle.putString("odx_id", odxUniqueId);
        this.f30254c.a(bundle, "invalid_odx_param");
    }

    @Override // J8.a
    public final void P(G8.x xVar) {
        this.f30254c.a(i0(xVar), "sfd_wizard_2fa_started");
    }

    @Override // J8.a
    public final void Q() {
        this.f30254c.a(p271w0.c.a(), "basic_settings_uds_slided_to_right");
    }

    @Override // J8.a
    public final void R(String str, String productId, String price, String result) {
        kotlin.jvm.internal.i.e(productId, "productId");
        kotlin.jvm.internal.i.e(price, "price");
        kotlin.jvm.internal.i.e(result, "result");
        this.f30252a.e("AnalyticsProviderImpl", "event: " + str + " productId:" + productId + " price:" + price + " result: " + result);
        Bundle bundle = new Bundle();
        bundle.putString("product_id", productId);
        bundle.putString("price", price);
        if (result.length() > 0) {
            bundle.putString("result", result);
        }
        this.f30254c.a(bundle, str);
        Braze.Companion.getInstance(this.f30253b.f30274a).logCustomEvent(str, new BrazeProperties((Map<String, ?>) kotlin.collections.y.s(new Pair("product_id", productId), new Pair("price", price), new Pair("result", result))));
    }

    @Override // J8.a
    public final void S(String str, String str2, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        Trace trace = (Trace) this.f30256e.get(str);
        if (trace == null) {
            return;
        }
        trace.putAttribute(str2, value);
    }

    @Override // J8.a
    public final void T(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_app_already_opened", z10);
        this.f30254c.a(bundle, "offer_clicked");
    }

    @Override // J8.a
    public final void U(String str) {
        this.f30254c.a(p271w0.c.b(new Pair("type", str)), "output_test_kwp_slided_to_right");
    }

    @Override // J8.a
    public final void V(int i10, String str, String str2, String str3, String str4, Integer num, String str5, String feature) {
        kotlin.jvm.internal.i.e(feature, "feature");
        Bundle bundleB = p271w0.c.b(new Pair("status", Integer.valueOf(i10)), new Pair("vehicleBaseId", str), new Pair("model", str2), new Pair("platform", str3), new Pair("vin", str4), new Pair("klineId", str5), new Pair("feature", feature));
        if (num != null) {
            bundleB.putInt("year", num.intValue());
        }
        this.f30254c.a(bundleB, "sfd_write_token");
    }

    @Override // J8.a
    public final void W(String str) {
        LinkedHashMap linkedHashMap = this.f30256e;
        Trace trace = (Trace) linkedHashMap.get(str);
        if (trace != null) {
            trace.stop();
        }
        linkedHashMap.remove(str);
    }

    @Override // J8.a
    public final void X(AnalyticsProvider$EventParamValue$VagRedirect analyticsProvider$EventParamValue$VagRedirect) {
        this.f30254c.a(null, analyticsProvider$EventParamValue$VagRedirect.a());
    }

    @Override // J8.a
    public final void Y() {
        this.f30254c.a(p271w0.c.a(), "kwp_adaptation_slided_to_right");
    }

    @Override // J8.a
    public final void Z() {
        this.f30254c.a(p271w0.c.a(), "security_access_entered");
    }

    @Override // J8.a
    public final void a(String str) {
        FirebaseAnalytics firebaseAnalytics = this.f30254c;
        C1912u0 c1912u0 = firebaseAnalytics.f28049a;
        c1912u0.getClass();
        c1912u0.e(new A0(c1912u0, str));
        C1912u0 c1912u1 = firebaseAnalytics.f28049a;
        c1912u1.getClass();
        c1912u1.e(new C1926w0(c1912u1, null, Participant.USER_TYPE, str, false));
        Braze.Companion.getInstance(this.f30253b.f30274a).changeUser(str);
    }

    @Override // J8.a
    public final void a0() {
        this.f30254c.a(p271w0.c.a(), "kwp_long_coding_activated");
    }

    @Override // J8.a
    public final void b() {
        this.f30254c.a(p271w0.c.a(), "live_data_kwp_done_clicked");
    }

    @Override // J8.a
    public final void b0() {
        this.f30254c.a(p271w0.c.a(), "kwp_coding_activated");
    }

    @Override // J8.a
    public final void c() {
        this.f30254c.a(p271w0.c.a(), "uds_adaptation_slided_to_right");
    }

    @Override // J8.a
    public final void c0(String vehicleId, String str) {
        kotlin.jvm.internal.i.e(vehicleId, "vehicleId");
        Bundle bundle = new Bundle();
        bundle.putString("vehicleBaseId", vehicleId);
        bundle.putString("odx_name", str);
        this.f30254c.a(bundle, "odx_invalid_format");
    }

    @Override // J8.a
    public final void d(G8.x xVar) {
        this.f30254c.a(i0(xVar), "sfd_wizard_started");
    }

    @Override // J8.a
    public final void d0(boolean z10) {
        this.f30254c.a(p271w0.c.b(new Pair("sfd_auto_unlock_enabled", String.valueOf(z10))), "sfd_unclock_clicked");
    }

    @Override // J8.a
    public final void e(String str, String str2, String str3, String str4, Integer num, String str5, String feature) {
        kotlin.jvm.internal.i.e(feature, "feature");
        Bundle bundleB = p271w0.c.b(new Pair("vehicleBaseId", str), new Pair("model", str2), new Pair("platform", str3), new Pair("vin", str4), new Pair("klineId", str5), new Pair("feature", feature));
        if (num != null) {
            bundleB.putInt("year", num.intValue());
        }
        this.f30254c.a(bundleB, "sfd_triggered");
    }

    @Override // J8.a
    public final void e0(J8.r rVar) {
        q qVar = this.f30253b;
        String key = rVar.f4047a;
        kotlin.jvm.internal.i.e(key, "key");
        Map<String, Object> properties = rVar.f4048b;
        kotlin.jvm.internal.i.e(properties, "properties");
        Braze.Companion.getInstance(qVar.f30274a).logCustomEvent(key, new BrazeProperties((Map<String, ?>) properties));
    }

    @Override // J8.a
    public final void f(AnalyticsProvider$EventParamValue$VagRedirectPromo analyticsProvider$EventParamValue$VagRedirectPromo) {
        this.f30254c.a(null, analyticsProvider$EventParamValue$VagRedirectPromo.a());
    }

    @Override // J8.a
    public final void f0() {
        this.f30254c.a(p271w0.c.a(), "checksum_incorrect");
    }

    @Override // J8.a
    public final void g(String str, String str2) {
        Trace trace = (Trace) this.f30256e.get(str);
        if (trace == null) {
            return;
        }
        trace.incrementMetric(str2, 1L);
    }

    @Override // J8.a
    public final void g0(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString("result", z10 ? "success" : "failure");
        bundle.putString("vin", str);
        this.f30254c.a(bundle, "sfd2_unlock");
    }

    @Override // J8.a
    public final void h(G8.x xVar) {
        this.f30254c.a(i0(xVar), "sfd_wizard_personal_info_started");
    }

    @Override // J8.a
    public final void i() {
        this.f30254c.a(p271w0.c.a(), "live_data_udc_done_clicked");
    }

    @Override // J8.a
    public final void j(String str, String str2, String deviceResponse, String str3, String str4) {
        kotlin.jvm.internal.i.e(deviceResponse, "deviceResponse");
        this.f30254c.a(p271w0.c.b(new Pair("user_id", str), new Pair("serial_number", str2), new Pair("device_response", deviceResponse), new Pair("old_version", str3), new Pair("new_version", str4)), "firmware_update");
    }

    @Override // J8.a
    public final void k(String str, String odxUniqueId) {
        kotlin.jvm.internal.i.e(odxUniqueId, "odxUniqueId");
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("odx_id", odxUniqueId);
        this.f30254c.a(bundle, "unknown_odx_param");
    }

    @Override // J8.a
    public final void l(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_app_already_opened", z10);
        this.f30254c.a(bundle, "offer_closed");
    }

    @Override // J8.a
    public final void m(String str, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", z10);
        bundle.putString("mac", h0(str));
        this.f30254c.a(bundle, "next_gen_first_write_result");
    }

    @Override // J8.a
    public final void n(boolean z10) {
        this.f30254c.a(p271w0.c.b(new Pair("result", z10 ? "success" : "failure")), "bt_update");
    }

    @Override // J8.a
    public final void o(G8.x xVar) {
        this.f30254c.a(i0(xVar), "sfd_wizard_2fa_finished");
    }

    @Override // J8.a
    public final void p() {
        this.f30254c.a(p271w0.c.a(), "vehicle_backup_clicked");
    }

    @Override // J8.a
    public final void q(String gaugePid, boolean z10, boolean z11) {
        kotlin.jvm.internal.i.e(gaugePid, "gaugePid");
        this.f30254c.a(p271w0.c.b(new Pair("gauge_pid", gaugePid), new Pair("vehicle_supported", z10 ? "true" : "false"), new Pair("obd2_gauge", z11 ? "true" : "false")), "gauge_used");
    }

    @Override // J8.a
    public final void r(G8.x xVar) {
        this.f30254c.a(i0(xVar), "sfd_wizard_personal_info_finished");
    }

    @Override // J8.a
    public final void s(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_app_already_opened", z10);
        this.f30254c.a(bundle, "offer_opened");
    }

    @Override // J8.a
    public final void t(String str, String str2, String str3, String str4, Integer num, String str5, String feature) {
        kotlin.jvm.internal.i.e(feature, "feature");
        Bundle bundleB = p271w0.c.b(new Pair("vehicleBaseId", str), new Pair("model", str2), new Pair("platform", str3), new Pair("vin", str4), new Pair("klineId", str5), new Pair("feature", feature));
        if (num != null) {
            bundleB.putInt("year", num.intValue());
        }
        this.f30254c.a(bundleB, "sfd_already_unlocked");
    }

    @Override // J8.a
    public final void u() {
        this.f30254c.a(p271w0.c.a(), "gateway_coding_clicked");
    }

    @Override // J8.a
    public final void v() {
        this.f30254c.a(p271w0.c.a(), "service_change_clicked");
    }

    @Override // J8.a
    public final void w(String str, String str2, String str3, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", z10);
        bundle.putString("device_name", h0(str));
        bundle.putString("mac", h0(str2));
        bundle.putString("exception", h0(str3));
        this.f30254c.a(bundle, "first_gen_connection_result");
    }

    @Override // J8.a
    public final void x() {
        this.f30254c.a(p271w0.c.a(), "uds_long_coding_activated");
    }

    @Override // J8.a
    public final void y() {
        this.f30254c.a(C4.v.d("method", "scan()"), "bluetooth_not_connected");
    }

    @Override // J8.a
    public final void z(String str) {
        this.f30254c.a(C4.v.d("result", str), "login");
    }
}
