package p131k5;

import com.braze.Constants;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ P f41942b = new P(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ P f41943c = new P(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ P f41944d = new P(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f41945e = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f41946f = {"ad_impression"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f41947g = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", Constants.BRAZE_PUSH_BRAZE_KEY, "_cmp"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f41948h = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41949a;

    public /* synthetic */ P(int i10) {
        this.f41949a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f41949a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).v());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).i());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).Q());
        }
    }
}
