package com.google.firebase.sessions.settings;

import Ia.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {R.styleable.AppCompatTheme_editTextBackground, R.styleable.AppCompatTheme_editTextStyle, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend")
final class RemoteSettingsFetcher$doConfigFetch$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ p<String, kotlin.coroutines.c<? super r>, Object> $onFailure;
    final /* synthetic */ p<JSONObject, kotlin.coroutines.c<? super r>, Object> $onSuccess;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsFetcher$doConfigFetch$2(b bVar, Map<String, String> map, p<? super JSONObject, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar, p<? super String, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar2, kotlin.coroutines.c<? super RemoteSettingsFetcher$doConfigFetch$2> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$headerOptions = map;
        this.$onSuccess = pVar;
        this.$onFailure = pVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                URLConnection uRLConnectionOpenConnection = b.a(this.this$0).openConnection();
                i.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        ref$ObjectRef.element = line;
                        if (line == 0) {
                            break;
                        }
                        sb2.append((String) line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    p<JSONObject, kotlin.coroutines.c<? super r>, Object> pVar = this.$onSuccess;
                    this.label = 1;
                    if (pVar.invoke(jSONObject, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    p<String, kotlin.coroutines.c<? super r>, Object> pVar2 = this.$onFailure;
                    String str = "Bad response code: " + responseCode;
                    this.label = 2;
                    if (pVar2.invoke(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
        } catch (Exception e10) {
            p<String, kotlin.coroutines.c<? super r>, Object> pVar3 = this.$onFailure;
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            this.label = 3;
            if (pVar3.invoke(message, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return r.f47939a;
    }
}
