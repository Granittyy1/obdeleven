package com.voltasit.obdeleven.network;

import Ia.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import p037cb.L;
import p037cb.y0;
import p050db.d;
import p050db.r;
import p050db.s;

/* JADX INFO: compiled from: ServerApiImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ServerApiImpl implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f31181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f31182b = s.a(new l<d, p293xa.r>() { // from class: com.voltasit.obdeleven.network.ServerApiImpl$json$1
        @Override // Ia.l
        public final p293xa.r invoke(d dVar) {
            d Json = dVar;
            i.e(Json, "$this$Json");
            Json.f34653c = true;
            Json.f34651a = true;
            return p293xa.r.f47939a;
        }
    });

    public ServerApiImpl(b bVar) {
        this.f31181a = bVar;
    }

    @Override // com.voltasit.obdeleven.network.c
    public final Object a(String str, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objB = this.f31181a.b(B7.b.c("mobile/sfd-otp/validate-sfd-otp/", str), "", y.p(), y.p(), (ContinuationImpl) cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // com.voltasit.obdeleven.network.c
    public final Object b(String str, String str2, kotlin.coroutines.c<? super p293xa.r> cVar) {
        String strB;
        String strB2 = androidx.compose.foundation.gestures.d.b("mobile/devices/", str, "/authorize");
        if (str2 != null) {
            Map mapO = x.o(new Pair("pin", str2));
            y0 y0Var = y0.f22677a;
            strB = JsonExtensionsKt.f31179a.b(new L(y0Var, y0Var), mapO);
        } else {
            strB = "";
        }
        Object objB = this.f31181a.b(strB2, strB, y.p(), y.p(), (ContinuationImpl) cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // com.voltasit.obdeleven.network.c
    public final Object c(String str, String str2, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objC = this.f31181a.c("mobile/user-personal-info/phone-number", this.f31182b.b(R8.a.Companion.serializer(), new R8.a(str, str2)), y.p(), y.p(), (ContinuationImpl) cVar);
        return objC == CoroutineSingletons.f43038b ? objC : p293xa.r.f47939a;
    }

    @Override // com.voltasit.obdeleven.network.c
    public final Object d(String str, String str2, kotlin.coroutines.c<? super p293xa.r> cVar) {
        String strB = androidx.compose.foundation.gestures.d.b("mobile/devices/", str, "/pin");
        LinkedHashMap linkedHashMapT = y.t(new Pair("newPin", str2));
        y0 y0Var = y0.f22677a;
        Object objC = this.f31181a.c(strB, JsonExtensionsKt.f31179a.b(new L(y0Var, y0Var), linkedHashMapT), y.p(), y.p(), (ContinuationImpl) cVar);
        return objC == CoroutineSingletons.f43038b ? objC : p293xa.r.f47939a;
    }

    @Override // com.voltasit.obdeleven.network.c
    public final Object e(kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objB = this.f31181a.b("mobile/sfd-otp/send-otp-sms", "", y.p(), y.p(), (ContinuationImpl) cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // com.voltasit.obdeleven.network.c
    public final Object f(String str, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objB = this.f31181a.b(androidx.compose.foundation.gestures.d.b("mobile/devices/", str, "/remind-pin"), "", y.p(), y.p(), (ContinuationImpl) cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }
}
