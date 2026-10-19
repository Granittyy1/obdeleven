package com.voltasit.obdeleven.domain.providers;

import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirectPromo[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirectPromo[]) from 0x001e: INVOKE (r0v1 com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VagRedirectPromo[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:31)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: AnalyticsProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsProvider$EventParamValue$VagRedirectPromo {
    RedirectToMain("vag_redirect_promo_to_main"),
    Cancel("vag_cancel_redirect_promo_to_main");

    private final String value;

    static {
        a.a(analyticsProvider$EventParamValue$VagRedirectPromoArr);
    }

    public AnalyticsProvider$EventParamValue$VagRedirectPromo(String str) {
        super(str, i);
        this.value = str;
    }

    public static AnalyticsProvider$EventParamValue$VagRedirectPromo valueOf(String str) {
        return (AnalyticsProvider$EventParamValue$VagRedirectPromo) Enum.valueOf(AnalyticsProvider$EventParamValue$VagRedirectPromo.class, str);
    }

    public static AnalyticsProvider$EventParamValue$VagRedirectPromo[] values() {
        return (AnalyticsProvider$EventParamValue$VagRedirectPromo[]) f30580d.clone();
    }

    public final String a() {
        return this.value;
    }
}
