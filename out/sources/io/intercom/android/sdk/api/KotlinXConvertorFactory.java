package io.intercom.android.sdk.api;

import androidx.navigation.compose.y;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import p050db.d;
import p050db.s;
import p293xa.r;
import retrofit2.h;

/* JADX INFO: compiled from: KotlinXConvertorFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinXConvertorFactory {
    public static final int $stable = 0;
    public static final KotlinXConvertorFactory INSTANCE = new KotlinXConvertorFactory();

    private KotlinXConvertorFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r getConvertorFactory$lambda$0(d Json) {
        i.e(Json, "$this$Json");
        Json.f34654d = true;
        Json.f34653c = true;
        return r.f47939a;
    }

    public final h.a getConvertorFactory() {
        Pattern pattern = okhttp3.r.f45588d;
        return new V7.b(okhttp3.r.a.a("application/json"), new V7.d.a(s.a(new y(1))));
    }
}
