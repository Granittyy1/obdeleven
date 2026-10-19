package com.google.firebase.sessions.settings;

import Ia.p;
import android.util.Log;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONException;
import org.json.JSONObject;
import p293xa.r;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor, 128, 131, 133, 134, 136}, m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements p<JSONObject, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, kotlin.coroutines.c<? super RemoteSettings$updateSettings$2$1> cVar) {
        super(2, cVar);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, cVar);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // Ia.p
    public final Object invoke(JSONObject jSONObject, kotlin.coroutines.c<? super r> cVar) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v14, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Ref$ObjectRef ref$ObjectRef;
        Boolean bool;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        Object obj2;
        Object objC;
        Object obj3;
        Object objC2;
        Object obj4;
        r rVar;
        Object objC3;
        Object objC4;
        Object objC5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        androidx.datastore.preferences.core.c.a<Integer> aVar = SettingsCache.f28757f;
        switch (i10) {
            case 0:
                kotlin.b.b(obj);
                JSONObject jSONObject = (JSONObject) this.L$0;
                Objects.toString(jSONObject);
                Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
                if (jSONObject.has("app_quality")) {
                    Object obj5 = jSONObject.get("app_quality");
                    i.c(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj5;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                ref$ObjectRef6.element = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                ref$ObjectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                ref$ObjectRef7.element = (Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        bool = null;
                    }
                    break;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    SettingsCache settingsCache = this.this$0.f28746d;
                    this.L$0 = ref$ObjectRef6;
                    this.L$1 = ref$ObjectRef;
                    this.L$2 = ref$ObjectRef7;
                    this.label = 1;
                    Object objC6 = settingsCache.c(SettingsCache.f28754c, bool, this);
                    if (objC6 != CoroutineSingletons.f43038b) {
                        objC6 = r.f47939a;
                    }
                    if (objC6 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef4 = ref$ObjectRef6;
                    ref$ObjectRef5 = ref$ObjectRef;
                    ref$ObjectRef3 = ref$ObjectRef7;
                    ref$ObjectRef = ref$ObjectRef5;
                    ref$ObjectRef2 = ref$ObjectRef4;
                } else {
                    ref$ObjectRef2 = ref$ObjectRef6;
                    ref$ObjectRef3 = ref$ObjectRef7;
                }
                obj2 = ref$ObjectRef.element;
                if (((Integer) obj2) != null) {
                    this.L$0 = ref$ObjectRef2;
                    this.L$1 = ref$ObjectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    objC = this.this$0.f28746d.c(SettingsCache.f28756e, (Integer) obj2, this);
                    if (objC != CoroutineSingletons.f43038b) {
                        objC = r.f47939a;
                    }
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                obj3 = ref$ObjectRef2.element;
                if (((Double) obj3) != null) {
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objC2 = this.this$0.f28746d.c(SettingsCache.f28755d, (Double) obj3, this);
                    if (objC2 != CoroutineSingletons.f43038b) {
                        objC2 = r.f47939a;
                    }
                    if (objC2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                obj4 = ref$ObjectRef3.element;
                if (((Integer) obj4) != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    objC3 = this.this$0.f28746d.c(aVar, (Integer) obj4, this);
                    if (objC3 != CoroutineSingletons.f43038b) {
                        objC3 = r.f47939a;
                    }
                    if (objC3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = r.f47939a;
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    SettingsCache settingsCache2 = this.this$0.f28746d;
                    Integer num = new Integer(86400);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objC4 = settingsCache2.c(aVar, num, this);
                    if (objC4 != CoroutineSingletons.f43038b) {
                        objC4 = r.f47939a;
                    }
                    if (objC4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                SettingsCache settingsCache3 = this.this$0.f28746d;
                Long l10 = new Long(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                objC5 = settingsCache3.c(SettingsCache.f28758g, l10, this);
                if (objC5 != CoroutineSingletons.f43038b) {
                    objC5 = r.f47939a;
                }
                if (objC5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 1:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef5 = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$0;
                kotlin.b.b(obj);
                ref$ObjectRef = ref$ObjectRef5;
                ref$ObjectRef2 = ref$ObjectRef4;
                obj2 = ref$ObjectRef.element;
                if (((Integer) obj2) != null) {
                    this.L$0 = ref$ObjectRef2;
                    this.L$1 = ref$ObjectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    objC = this.this$0.f28746d.c(SettingsCache.f28756e, (Integer) obj2, this);
                    if (objC != CoroutineSingletons.f43038b) {
                        objC = r.f47939a;
                    }
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                obj3 = ref$ObjectRef2.element;
                if (((Double) obj3) != null) {
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objC2 = this.this$0.f28746d.c(SettingsCache.f28755d, (Double) obj3, this);
                    if (objC2 != CoroutineSingletons.f43038b) {
                        objC2 = r.f47939a;
                    }
                    if (objC2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                obj4 = ref$ObjectRef3.element;
                if (((Integer) obj4) != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    objC3 = this.this$0.f28746d.c(aVar, (Integer) obj4, this);
                    if (objC3 != CoroutineSingletons.f43038b) {
                        objC3 = r.f47939a;
                    }
                    if (objC3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = r.f47939a;
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    SettingsCache settingsCache4 = this.this$0.f28746d;
                    Integer num2 = new Integer(86400);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objC4 = settingsCache4.c(aVar, num2, this);
                    if (objC4 != CoroutineSingletons.f43038b) {
                        objC4 = r.f47939a;
                    }
                    if (objC4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                SettingsCache settingsCache5 = this.this$0.f28746d;
                Long l11 = new Long(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                objC5 = settingsCache5.c(SettingsCache.f28758g, l11, this);
                if (objC5 != CoroutineSingletons.f43038b) {
                    objC5 = r.f47939a;
                }
                if (objC5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 2:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                kotlin.b.b(obj);
                obj3 = ref$ObjectRef2.element;
                if (((Double) obj3) != null) {
                    this.L$0 = ref$ObjectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    objC2 = this.this$0.f28746d.c(SettingsCache.f28755d, (Double) obj3, this);
                    if (objC2 != CoroutineSingletons.f43038b) {
                        objC2 = r.f47939a;
                    }
                    if (objC2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                obj4 = ref$ObjectRef3.element;
                if (((Integer) obj4) != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    objC3 = this.this$0.f28746d.c(aVar, (Integer) obj4, this);
                    if (objC3 != CoroutineSingletons.f43038b) {
                        objC3 = r.f47939a;
                    }
                    if (objC3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = r.f47939a;
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    SettingsCache settingsCache6 = this.this$0.f28746d;
                    Integer num3 = new Integer(86400);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objC4 = settingsCache6.c(aVar, num3, this);
                    if (objC4 != CoroutineSingletons.f43038b) {
                        objC4 = r.f47939a;
                    }
                    if (objC4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                SettingsCache settingsCache7 = this.this$0.f28746d;
                Long l12 = new Long(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                objC5 = settingsCache7.c(SettingsCache.f28758g, l12, this);
                if (objC5 != CoroutineSingletons.f43038b) {
                    objC5 = r.f47939a;
                }
                if (objC5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 3:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$0;
                kotlin.b.b(obj);
                obj4 = ref$ObjectRef3.element;
                if (((Integer) obj4) != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    objC3 = this.this$0.f28746d.c(aVar, (Integer) obj4, this);
                    if (objC3 != CoroutineSingletons.f43038b) {
                        objC3 = r.f47939a;
                    }
                    if (objC3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar = r.f47939a;
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    SettingsCache settingsCache8 = this.this$0.f28746d;
                    Integer num4 = new Integer(86400);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objC4 = settingsCache8.c(aVar, num4, this);
                    if (objC4 != CoroutineSingletons.f43038b) {
                        objC4 = r.f47939a;
                    }
                    if (objC4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                SettingsCache settingsCache9 = this.this$0.f28746d;
                Long l13 = new Long(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                objC5 = settingsCache9.c(SettingsCache.f28758g, l13, this);
                if (objC5 != CoroutineSingletons.f43038b) {
                    objC5 = r.f47939a;
                }
                if (objC5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 4:
                kotlin.b.b(obj);
                rVar = r.f47939a;
                if (rVar == null) {
                    SettingsCache settingsCache10 = this.this$0.f28746d;
                    Integer num5 = new Integer(86400);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objC4 = settingsCache10.c(aVar, num5, this);
                    if (objC4 != CoroutineSingletons.f43038b) {
                        objC4 = r.f47939a;
                    }
                    if (objC4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                SettingsCache settingsCache11 = this.this$0.f28746d;
                Long l14 = new Long(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                objC5 = settingsCache11.c(SettingsCache.f28758g, l14, this);
                if (objC5 != CoroutineSingletons.f43038b) {
                    objC5 = r.f47939a;
                }
                if (objC5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 5:
                kotlin.b.b(obj);
                SettingsCache settingsCache12 = this.this$0.f28746d;
                Long l15 = new Long(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                objC5 = settingsCache12.c(SettingsCache.f28758g, l15, this);
                if (objC5 != CoroutineSingletons.f43038b) {
                    objC5 = r.f47939a;
                }
                if (objC5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            case 6:
                kotlin.b.b(obj);
                return r.f47939a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
