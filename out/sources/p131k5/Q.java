package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.F5;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Q f41959b = new Q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Q f41960c = new Q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Q f41961d = new Q(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f41962e = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "gbraid", "session_number", "session_id"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f41963f = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_gbraid", "_sno", "_sid"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41964a;

    public /* synthetic */ Q(int i10) {
        this.f41964a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f41964a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).W());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).y());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((F5) G5.f25460c.get()).y());
        }
    }
}
