package io.intercom.android.sdk.api;

import com.google.gson.e;
import com.google.gson.g;
import com.google.gson.internal.LinkedTreeMap;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p011ab.k;

/* JADX INFO: compiled from: ErrorStringExtractor.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorStringExtractorKt {
    public static final String extractErrorString(ErrorObject errorObject) {
        i.e(errorObject, "errorObject");
        Twig logger = LumberMill.getLogger();
        if (!errorObject.hasErrorBody() || errorObject.getErrorBody() == null) {
            return "Something went wrong";
        }
        try {
            com.google.gson.i iVar = (com.google.gson.i) Injector.get().getGson().d(com.google.gson.i.class, errorObject.getErrorBody());
            if (iVar == null) {
                return "Something went wrong";
            }
            LinkedTreeMap<String, g> linkedTreeMap = iVar.f28826b;
            if (linkedTreeMap.containsKey("error")) {
                String strE = linkedTreeMap.get("error").e();
                i.b(strE);
                return strE;
            }
            if (!linkedTreeMap.containsKey("errors")) {
                return "Something went wrong";
            }
            e eVar = (e) linkedTreeMap.get("errors");
            i.d(eVar, "getAsJsonArray(...)");
            return q.U(eVar, " - ", null, null, new k(1), 30);
        } catch (Exception e10) {
            logger.e(e10);
            String message = errorObject.getThrowable().getMessage();
            return message == null ? "Something went wrong" : message;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence extractErrorString$lambda$0(g gVar) {
        gVar.getClass();
        if (!(gVar instanceof com.google.gson.i) || !gVar.d().f28826b.containsKey("message")) {
            return "Something went wrong";
        }
        String strE = gVar.d().f28826b.get("message").e();
        i.b(strE);
        return strE;
    }
}
