package p005a4;

import A1.C0575j;
import A1.C0576k;
import B1.a;
import C7.g;
import H6.c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;

/* JADX INFO: compiled from: AppEventsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r implements FetchedAppSettingsManager.a {
    @Override // com.facebook.internal.FetchedAppSettingsManager.a
    public final void onSuccess() {
        FeatureManager featureManager = FeatureManager.f24975a;
        FeatureManager.a(new a(1), FeatureManager.Feature.AAM);
        FeatureManager.a(new o(), FeatureManager.Feature.RestrictiveDataFiltering);
        FeatureManager.a(new p(0), FeatureManager.Feature.PrivacyProtection);
        FeatureManager.a(new C0575j(2), FeatureManager.Feature.EventDeactivation);
        FeatureManager.a(new C0576k(4), FeatureManager.Feature.IapLogging);
        FeatureManager.a(new c(2), FeatureManager.Feature.ProtectedMode);
        FeatureManager.a(new g(), FeatureManager.Feature.MACARuleMatching);
        FeatureManager.a(new q(), FeatureManager.Feature.CloudBridge);
    }
}
