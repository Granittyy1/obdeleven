package com.voltasit.obdeleven.data.providers;

import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.identity.Registration;

/* JADX INFO: compiled from: SupportProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements J8.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30297b;

    public y(J8.p pVar, K8.v vVar) {
        this.f30296a = vVar;
        this.f30297b = pVar;
    }

    @Override // J8.v
    public final void a() {
        Intercom.Companion.client().logout();
    }

    @Override // J8.v
    public final void b() {
        J8.p pVar = this.f30297b;
        pVar.f("SupportProvider", "registerRegisteredUser()");
        p255u9.z zVarL = this.f30296a.L();
        String string = zVarL.getString("intercomAndroidHash");
        if (string == null || kotlin.text.n.S(string)) {
            pVar.e("SupportProvider", "unable to get hash");
            Intercom.Companion.client().registerUnidentifiedUser();
            return;
        }
        pVar.e("SupportProvider", "user has hash");
        UserAttributes.Builder builderWithName = new UserAttributes.Builder().withName(zVarL.getString("name"));
        if (zVarL.getBoolean("emailVerified")) {
            builderWithName = builderWithName.withEmail(zVarL.getEmail());
        }
        Registration registrationWithUserAttributes = Registration.create().withUserId(zVarL.getObjectId()).withUserAttributes(builderWithName.build());
        Intercom.Companion companion = Intercom.Companion;
        companion.client().setUserHash(string);
        companion.client().registerIdentifiedUser(registrationWithUserAttributes);
    }

    @Override // J8.v
    public final void c() {
        this.f30297b.f("SupportProvider", "registerAnonymousUser()");
        Intercom.Companion.client().registerUnidentifiedUser();
    }
}
