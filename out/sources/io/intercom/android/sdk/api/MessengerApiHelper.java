package io.intercom.android.sdk.api;

import com.google.gson.Gson;
import io.intercom.android.sdk.Injector;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import okhttp3.r;
import okhttp3.y;

/* JADX INFO: compiled from: MessengerApi.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MessengerApiHelper {
    public static final int $stable = 0;
    public static final MessengerApiHelper INSTANCE = new MessengerApiHelper();

    private MessengerApiHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper messengerApiHelper, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = kotlin.collections.y.p();
        }
        return messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map);
    }

    public final y getDefaultRequestBody$intercom_sdk_base_release(Map<String, ? extends Object> bodyParams) {
        i.e(bodyParams, "bodyParams");
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map);
        map.putAll(bodyParams);
        return optionsMapToRequestBody(map);
    }

    public final y optionsMapToRequestBody(Map<String, ? extends Object> options) {
        i.e(options, "options");
        y.a aVar = y.Companion;
        String strH = new Gson().h(options);
        i.d(strH, "toJson(...)");
        Pattern pattern = r.f45588d;
        r rVarA = r.a.a("application/json; charset=utf-8");
        aVar.getClass();
        return y.a.a(strH, rVarA);
    }
}
