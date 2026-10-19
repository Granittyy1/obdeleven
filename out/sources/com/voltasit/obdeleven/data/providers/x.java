package com.voltasit.obdeleven.data.providers;

/* JADX INFO: compiled from: RemoteConfigProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements J8.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.t f30295a;

    public x(J8.t tVar) {
        this.f30295a = tVar;
    }

    @Override // J8.u
    public final boolean a() {
        return this.f30295a.a("encrypt_bootloader_commands");
    }

    @Override // J8.u
    public final String b() {
        return this.f30295a.b("buy_obdeleven_url_onboarding");
    }

    @Override // J8.u
    public final String c() {
        return this.f30295a.b("firmware_third_gen");
    }

    @Override // J8.u
    public final String d() {
        return this.f30295a.b("firmware_first_gen");
    }

    @Override // J8.u
    public final boolean e() {
        return this.f30295a.a("save_instance_state");
    }

    @Override // J8.u
    public final boolean f() {
        return this.f30295a.a("is_vag_v3_firmware_redirect_enabled");
    }

    @Override // J8.u
    public final String g() {
        return this.f30295a.b("firmware");
    }

    @Override // J8.u
    public final boolean h() {
        return this.f30295a.a("is_vag_pro_redirect_promo_enabled");
    }

    @Override // J8.u
    public final boolean i() {
        return this.f30295a.a("skip_change_password");
    }

    @Override // J8.u
    public final boolean j() {
        return this.f30295a.a("redirect_alert_after_login_vag_to_main");
    }

    @Override // J8.u
    public final boolean k() {
        return this.f30295a.a("redirect_alert_from_vag_to_main");
    }

    @Override // J8.u
    public final boolean l() {
        return this.f30295a.a("custom_paywall");
    }

    @Override // J8.u
    public final boolean m() {
        return this.f30295a.a("is_fw_version_validation_enabled");
    }
}
